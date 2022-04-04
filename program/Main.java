package program;

import entity.List;

public class Main {

	public static void main(String[] args) {
		
	    List lista = new List();
	    
	    // exemplos de inserção por primeiro
	    // com verificação da lista vazia, e print
	    System.out.println("Is it empty? "+lista.isEmpty());
	    lista.print();
	    lista.insertInFirst(3);
	    lista.insertInFirst(2);
	    lista.insertInFirst(1);
	    System.out.println("Is it empty? "+lista.isEmpty());
	    lista.print();
	    System.out.println();
	    
	    // inserção no ultimo elemento
	    System.out.println("Inserir 4 no final da lista");
	    lista.insertInLast(4);
	    lista.print();
	    System.out.println();
	    
	    // inserção do 5 após o dado 4
	    // com print do inicio ao fim, e do fim ao inicio
	    System.out.println("Inserir 5 após o 4, e 6 após o 5");
	    lista.insertAfterElement(4, 5);
	    lista.insertAfterElement(5, 6);
	    lista.print();
	    lista.reversePrint();
	    System.out.println();
	    
	    // remoção do primeiro, e ultimo elemento
	    // além do elemento com dado 3
	    System.out.println("Remove o primeiro, ultimo, o dado 3 e o dado 5");
	    lista.removeFirstElement();
	    lista.removeLastElement();
	    lista.remove(3);
	    lista.remove(5);
	    
	    lista.print();

	    lista.clearList();
	    System.out.println();
	    lista.print();
	}

}