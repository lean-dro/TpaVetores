import java.lang.Math;
public class VetorQuadrado {

	public static void main(String[] args) {
		
		final int TAM = 11; 
		
		int  contador; 
		double a[];

		a = new double[TAM];
		
		for (contador = 0; contador < TAM; contador++) {
			    a[contador] = Math.pow(2, contador);
		}
			
		System.out.print("Vetor A: ");System.out.println("\n");
		for (contador = 0; contador < TAM; contador++) {
			System.out.println(2+" elevado a "+contador+" = "+a[contador]);
		}	
	}		
}


