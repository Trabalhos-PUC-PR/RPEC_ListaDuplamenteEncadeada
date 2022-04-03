package program;

import entity.List;

public class Main {

	public static void main(String[] args) {
		
	    List lista = new List();
	    
	    // exemplos de inser��o por primeiro (no estilo pilha)
	    // com verifica��o da lista vazia, e print
	    System.out.println("Is it empty? "+lista.isEmpty());
	    lista.insertInFirst(3);
	    lista.insertInFirst(2);
	    lista.insertInFirst(1);
	    lista.print();
	    System.out.println("Is it empty? "+lista.isEmpty());
	    System.out.println();
	    
	    // inser��o no ultimo elemento
	    lista.insertInLast(4);
	    lista.print();
	    
	    // inser��o do 5 ap�s o dado 4
	    // com print do inicio ao fim, e do fim ao inicio
	    lista.insertAfterElement(4, 5);
	    lista.print();
	    lista.reversePrint();
	    
	    // remo��o do primeiro, e ultimo elemento
	    // al�m do elemento com dado 3
	    lista.removeFirstElement();
	    lista.removeLastElement();
	    lista.remove(3);
	    
	    lista.print();

	    lista.clearList();
	    
	    System.out.println();
	    lista.insertInFirst(1);
	    lista.insertInLast(2);
	    lista.print();
	    
	    // procura de elementos na lista, com retorno do elemento procurado
	    System.out.println("Elemento1: "+lista.find(1));
	    System.out.println("Elemento2: "+lista.find(2));

	}

}