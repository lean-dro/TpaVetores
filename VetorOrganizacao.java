import java.util.Scanner;
public class VetorOrganizacao {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		final int TAM = 10;
			
		int a[], contador, indice, gaveta = 0, contadorSup = 0;
		
		a = new int [TAM];
		
		for (contador = 0; contador < TAM; contador++) {
			System.out.println("Insira o "+(contador+1)+"° valor de A: ");
			a[contador] = in.nextInt();
		}
		System.out.println("\n Vetor A: ");
		for (contador = 0; contador < TAM; contador++) {
			System.out.println(a[contador]+" ");

		}
		
		System.out.println("\n Vetor A em ordem crescente");
		
		for (contador = 0; contador < TAM; contador++) {
			for (indice = 0; indice < TAM; indice++) {
				if (a[contador]<a[indice]) {
					gaveta = a[contador];
					a[contador] = a[indice];
					a[indice] = gaveta;
				}
			}
			
		}
		
		for (contador = 0; contador < TAM; contador++) {
			System.out.println(a[contador]+" ");

		}
		
		

		in.close();
	}

} 
//Profs, a única forma que eu consegui fazer esse, foi usando somente o vetor A, quando eu trocava os valores da linha 30 até a 34 por B, apresentava falhas :(

/*Ler um vetor A com dez elementos inteiros. 
Criar um vetor B que tenha os 10 elementos de A em ordem crescente.
*/