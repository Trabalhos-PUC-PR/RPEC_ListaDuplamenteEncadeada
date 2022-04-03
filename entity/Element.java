package entity;

public class Element {

	private Element forwardElement;
	private Integer data;
	private Element backwardElement;


	public Element getForwardElement() {
		return forwardElement;
	}

	public void setForwardElement(Element forwardElement) {
		this.forwardElement = forwardElement;
	}

	public Element getBackwardElement() {
		return backwardElement;
	}

	public void setBackwardElement(Element backwardElement) {
		this.backwardElement = backwardElement;
	}

	public void setData(Integer dado) {
		this.data = dado;
	}
	
	public Integer getData() {
		return data;
	}

	public Element(Element forwardElement, Integer dado, Element backwardElement) {
		this.forwardElement = forwardElement;
		this.data = dado;
		this.backwardElement = backwardElement;
	}

	public Element() {
		this.forwardElement = null;
		this.data = null;
		this.backwardElement = null;
	}
	
	public Element(int data) {
		this.forwardElement = null;
		this.data = data;
		this.backwardElement = null;
	}

	@Override
	public String toString() {
		String st = "";
				
		if(forwardElement != null) {
			st = "ForwardElement=["+forwardElement.getData()+"], ";
		}
		if(backwardElement != null) {
			st += "BackwardElement=["+backwardElement.getData()+"], ";
		}
		
		st += "Data=[" + data + "]";
		
		return st;
	}

}
