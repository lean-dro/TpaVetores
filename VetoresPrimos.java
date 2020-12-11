import java.util.Scanner;
public class VetoresPrimos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM = 10;
		
		int a[], contador, indice, contPrimo=0;
		
		a = new int [TAM];
		
		for (contador = 0; contador < TAM; contador++) {
			System.out.println("Insira o "+(contador+1)+"° valor de A");
			a[contador] = in.nextInt();
			
			for (indice = 1; indice <= a[contador]; indice++) {
				if (a[contador]%indice==0) {
					contPrimo++;
				}
			}
			
			if (a[contador]==1 || a[contador]==0) {
				System.out.println("Não é primo");
			}else if (contPrimo>2) {
					System.out.println("Não é primo");
			}else {
				System.out.println("É primo");
			}
			System.out.println("\n");
			
			contPrimo = 0;
		}
		in.close();
	}
}
