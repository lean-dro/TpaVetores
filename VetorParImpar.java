import java.util.Scanner;
public class VetorParImpar {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		final int TAM = 20;
		
		int a[], b[], contador, pares = 0, impares = 0;
		
		a = new int [TAM];
		b = new int [TAM];
		
		for (contador = 0; contador < TAM; contador++) {
			System.out.println("Insira o "+(contador+1)+"° valor de A");
			a[contador] = in.nextInt();
			if (a[contador]%2==0) {
				pares++;
			}else {
				impares++;
			}
		}
		
		int indicePares = 0;
		int indiceImpares = pares; 
		
		for (contador = 0; contador < TAM; contador++) {
			if (a[contador]%2==0) {
				b[indicePares] = a[contador];
				indicePares++;
			}else {
				b[indiceImpares] = a[contador];
				indiceImpares++;
			}	
		}
		
		System.out.println("\n");System.out.print("Vetor A: ");
		for (contador = 0; contador < TAM; contador++) {
			System.out.print(a[contador]+" ");
		}
		
		System.out.println("\n");System.out.print("Vetor B: ");
		for (contador = 0; contador < TAM; contador++) {
			System.out.print(b[contador]+" ");
		}
		
		in.close();	
	}

}
