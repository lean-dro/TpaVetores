import java.util.Scanner;
public class VetorFatorial {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		final int TAM = 15;
		
		int a[], b[], contador, indice, fatorial;
		
		a = new int [TAM];
		b = new int [TAM];
		
		for (contador = 0; contador < TAM; contador++) {
			System.out.println("Insira o "+(contador+1)+"° valor de A: ");
			a[contador] = in.nextInt();
			fatorial = a[contador];
			for (indice = fatorial-1; indice >= 1; indice--) {
				fatorial = fatorial * indice;
				b[contador] = fatorial;
			}
			
		}
		
		System.out.println("\n");System.out.print("Vetor A: ");
		for (contador = 0; contador < TAM; contador++) {
			System.out.print(a[contador]+" ");
		}
		
		System.out.println("\n");System.out.print("Vetor B: ");System.out.println("\n");
		for (contador = 0; contador < TAM; contador++) {
			System.out.println(a[contador]+"!"+" = "+b[contador]);
		}
		in.close();
	}

}
