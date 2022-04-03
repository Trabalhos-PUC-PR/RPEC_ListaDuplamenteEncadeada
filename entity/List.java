package entity;

/**
 * List implementation, only accepts numeric values
 */
public class List {

	Element element;
	
	public List() {
		element = null;
	}
	
	/**
	 * Checks if list is empty
	 * @return True if first element is null, false if not
	 */
	public boolean isEmpty() {
		if(element == null) {
			return true;
		}
		return false;
	}
	
	/**
	 * Searches for a given value, and return in which element it exists
	 * @param data = value that will be searched for
	 * @return Element that contains such data
	 */
	public Element find(int data) {
		Element aux = element;
		while(data != aux.getData()) {
			aux = aux.getForwardElement();
			if(aux == null) {
				throw new RuntimeException("List does not contain such value: ("+data+')');
			}
		}
		return aux;
	}
	
	/**
	 * Inserts value into first of the list
	 * @param data = data that will be inserted in the first position of the list
	 */
	public void insertInFirst(int data) {
		if(element == null) {
			element = new Element(data);
			return;
		} else {
			Element aux = new Element(data);
			element.setBackwardElement(aux);
			aux.setForwardElement(element);
			element = aux;
		}
	}
	
	/**
	 * Inserts value into last position of the list
	 * @param data = data that will be inserted in the last position of the list
	 */
	public void insertInLast(int data) {
		if(element == null) {
			element = new Element(data);
			return;
		}
		
		Element aux = element;
		while(aux.getForwardElement() != null) {
			aux = aux.getForwardElement();
		}
		Element newData = new Element(data);
		newData.setBackwardElement(aux);
		aux.setForwardElement(newData);
	}

	/**
	 * Inserts newData after the first iteration of oldData in given list
	 * @param oldData = Specified value, newData will be inserted after this one
	 * @param newData = Data that will be inserted after the specified value
	 */
	public void insertAfterElement(int oldData, int newData) {
		if(element == null) {
			throw new RuntimeException("Cannot insert ("+newData+") after ("+oldData+"), the list is empty!");
		}
		Element aux = element;
		while(aux.getData() != oldData) {
			aux = aux.getForwardElement();
			if(aux == null) {
				throw new RuntimeException("List does not contain such value: ("+oldData+')');
			}
		}
		Element newAux = new Element(newData);
		newAux.setForwardElement(aux.getForwardElement());
		newAux.setBackwardElement(aux);
		aux.setForwardElement(newAux);
		if(newAux.getForwardElement() != null) {
			newAux.getForwardElement().setBackwardElement(newAux);
		}
	}

	/**
	 * Removes given value from list
	 * @param data = value that will be removed
	 */
	public void remove(int data) {
		Element aux = element;
		while(aux.getData() != data) {
			aux = aux.getForwardElement();
			if(aux == null) {
				throw new RuntimeException("List does not contain such value: ("+data+')');
			}
		}
		aux.getBackwardElement().setForwardElement(aux.getForwardElement());
		aux.getForwardElement().setBackwardElement(aux.getBackwardElement());
	}

	/**
	 * Removes last element from list
	 */
	public void removeLastElement() {
		Element aux = element;
		while(aux.getForwardElement() != null) {
			aux = aux.getForwardElement();
		}
		aux.getBackwardElement().setForwardElement(null);
		return;
	}

	/**
	 * Removes first element from list
	 */
	public void removeFirstElement() {
		element = element.getForwardElement();
	}
	
	/**
	 * Removes all elements from list
	 */
	public void clearList() {
		element = null;
	}

	/**
	 *  Prints all elements chained into {@link #element} parameter from beggining to end
	 */
	public void print() {
		Element aux = element;
		System.out.print('[');
		while(aux != null) {
			System.out.print(aux.getData());
			if(aux.getForwardElement() != null) {
				System.out.print(", ");
			}
			aux = aux.getForwardElement();
		}
		System.out.println(']');
	}
	
	/**
	 *  Prints all elements chained into {@link #element} parameter from end to beggining
	 */
	public void reversePrint() {
		Element aux = element;
		while(aux.getForwardElement() != null) {
			aux = aux.getForwardElement();
		}
		System.out.print('[');
		while(aux != null) {
			System.out.print(aux.getData());
			if(aux.getBackwardElement() != null) {
				System.out.print(", ");
			}
			aux = aux.getBackwardElement();
		}
		System.out.println(']');
	}
}