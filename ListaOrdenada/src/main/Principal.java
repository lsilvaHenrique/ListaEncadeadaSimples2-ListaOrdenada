package main;

import sp.fateczl.lucas.listaInt.Lista;

public class Principal {
	
	public static void main(String[] args) throws Exception {
		Lista listaL = new Lista();
		listaL.addFirst(10);
		listaL.addLast(5);
		listaL.addLast(8);
		listaL.addLast(1);
		listaL.addLast(9);
		listaL.addLast(2);
		listaL.addLast(4);
		listaL.addLast(7);
		listaL.addLast(3);
		listaL.addLast(6);
		System.out.println(listaL);
		System.out.println("--------------------");
		Lista listaOrdenada = quicksort(listaL);
		System.out.println(listaOrdenada);
	}
		       
	public static Lista quicksort(Lista listaL) throws Exception {
		if (listaL.size() <= 1) {
			return listaL;
		}
		int pivo = listaL.get(0);
		Lista l_esquerda = new Lista();
		Lista l_direita = new Lista();
		for (int i = 1; i < listaL.size(); i++) {
            if (listaL.get(i) <= pivo) {
                l_esquerda.addLast(listaL.get(i));
            } else {
                l_direita.addLast(listaL.get(i));
            }   
		}
		l_esquerda = quicksort(l_esquerda);
        l_direita = quicksort(l_direita);
        Lista l_ordenada = new Lista();
        l_ordenada.addAll(l_esquerda);
        l_ordenada.addLast(pivo);
        l_ordenada.addAll(l_direita);
        return l_ordenada;
	}	
}
