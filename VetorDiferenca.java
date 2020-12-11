import java.util.Scanner;
public class VetorDiferenca {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
			
		final int TAM = 10;
		
		int a[], b[],c[];
		int contador, indice, x=0;
		
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for (contador = 0; contador < TAM; contador++) {
			System.out.println("Insira o "+(contador+1)+"° valor de A: ");
			a[contador] = in.nextInt();
		}
		System.out.println("\n");
		for (contador = 0; contador < TAM; contador++) {
			System.out.println("Insira o "+(contador+1)+"° valor de B: ");
			b[contador] = in.nextInt();
		}
		
		//Rotina de verificação de valores iguais
		
		contador = 0;
		indice = 0;
		boolean igual = false; 
		int diferentes = 0;
		
		for (contador = 0; contador < TAM; contador++) {
			for (indice = 0; indice < TAM; indice++) {
				if (a[contador]==b[indice]) {
					igual = true;
				}
			}
			if (igual==false) {
				c[x] = a[contador];
				x++;
				diferentes++;
			}
			igual = false;
		}
		
		//Exibição do vetor C = x
		if (diferentes==0) {
			System.out.println("Não foi encontrado valores diferentes nos dois vetores ಥ_ಥ");
			}else {
		System.out.println("\n Vetor C:");
		for (contador = 0; contador < x; contador++) {
			System.out.print(c[contador]+" ");
			}
		}
	in.close();
	}
}