import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		System.out.println("Digite uma palavra para descobrir quantas vogais possui no total: ");
		Scanner sc = new Scanner(System.in);
		String pl = sc.next();
		
		char[] vogais = {'a', 'e', 'i', 'o', 'u'};
		
		int cont = 0;
		for(int i = 0; i < pl.length(); i++) {
			if(pl.charAt(i) == 'a') {
				cont++;
			}
			if(pl.charAt(i)== 'e') {
				cont++;
			}
			if(pl.charAt(i)== 'i') {
				cont++;
			}
			if(pl.charAt(i)== 'o') {
				cont++;
			}
			if(pl.charAt(i)== 'u') {
				cont++;
			}
		}
		System.out.println(cont);
		
		System.out.println("Digite uma palavra para descobrir se é uma pálindrona: ");
		String pl2 = sc.next();
		String pl3 = pl2;
		boolean isPalindrona = true;
		
		for(int i = pl2.length() - 1; i >= 0; i-- ) {
			if(pl2.charAt(i) != pl3.charAt(pl3.length() - 1 - i)) {
				isPalindrona = false;
				break;
			}
		}
		if(isPalindrona) {
			System.out.println(pl2 + " É uma palavra palindrona.");
		}else {
			System.out.println(pl2 + " Não é uma palavra palindrona.");
		}
		
		
		int[] lista = {2,5,9,1,0,3,8,7,6,4};
		for (int i = 0; i < lista.length - 1; i++) {
			for (int j = i + 1; j < lista.length; j++) {
		        if (lista[j] < lista[i]) {
		        	
		        	//atribui o valor de lista[i] para uma variavel temporaria
		            int temp = lista[i];
		            //atribui o valor de lista[j] para o valor de lista[i]
		            lista[i] = lista[j];
		            //atribui o valor de lista[j] para o valor de lista[i]
		            lista[j] = temp;
		        }
		    }
		}
		
		/*for (int i = 0; i < lista.length; i++) {
			System.out.print("-" +lista[i]);
		}*/
		
		ArrayList<Integer> listaOrdenada = new ArrayList<>();
		ArrayList<Integer> listaPersonalizada = new ArrayList<>();
		ArrayList<Integer> par = new ArrayList<>();
		ArrayList<Integer> impar = new ArrayList<>(); 
		
		for(int i = 0; i < lista.length; i++) {
			listaOrdenada.add(lista[i]);
		}
		
		System.out.println("Lista ordenada:");
		for (int n : listaOrdenada) {
			System.out.print(n);
		}
		
		//separar impar e par
		for (int i = 0; i < lista.length; i++) {
		    if(lista[i] % 2 == 0) {
		    	par.add(lista[i]);
		    }else {
		    	impar.add(lista[i]);
		    }
		}
		
		listaPersonalizada.addAll(par);
		listaPersonalizada.addAll(impar);
		System.out.println("\nLista ordenada separando par de impar:");
		for(int n : listaPersonalizada) {
			System.out.print(n);
		}
	}
}
