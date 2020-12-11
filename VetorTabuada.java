import java.util.Scanner;
public class VetorTabuada {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		final int TAM = 5;
		
		int a[], contador, indice, resultado=0;
		
		a = new int [TAM];
		
		for (contador = 0; contador < TAM; contador++) {
			System.out.println("Insira o "+(contador+1)+"° valor de A: ");
			a[contador] = in.nextInt();		
			System.out.println("\n Tabuada do "+a[contador]);
			for (indice = 0; indice <= 10; indice++) {
				resultado = a[contador] * indice;
				System.out.println(a[contador]+"X"+indice+"="+resultado);
				
			}
			System.out.println("\n");
		}
		in.close();		
	}

}
