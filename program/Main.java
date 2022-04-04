package program;

import entity.List;

public class Main {

	public static void main(String[] args) {
		
	    List lista = new List();
	    
	    // exemplos de inser��o por primeiro
	    // com verifica��o da lista vazia, e print
	    System.out.println("Is it empty? "+lista.isEmpty());
	    lista.print();
	    lista.insertInFirst(3);
	    lista.insertInFirst(2);
	    lista.insertInFirst(1);
	    System.out.println("Is it empty? "+lista.isEmpty());
	    lista.print();
	    System.out.println();
	    
	    // inser��o no ultimo elemento
	    System.out.println("Inserir 4 no final da lista");
	    lista.insertInLast(4);
	    lista.print();
	    System.out.println();
	    
	    // inser��o do 5 ap�s o dado 4
	    // com print do inicio ao fim, e do fim ao inicio
	    System.out.println("Inserir 5 ap�s o 4, e 6 ap�s o 5");
	    lista.insertAfterElement(4, 5);
	    lista.insertAfterElement(5, 6);
	    lista.print();
	    lista.reversePrint();
	    System.out.println();
	    
	    // remo��o do primeiro, e ultimo elemento
	    // al�m do elemento com dado 3
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