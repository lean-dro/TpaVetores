import java.util.Scanner;
public class VetorBusca {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		final int TAM = 10;
		
		int a[], numero, contador;
		boolean teste = false;
		a = new int [TAM];
		
		for (contador = 0; contador < TAM; contador++) {
			System.out.println("Insira o "+(contador+1)+"° valor de A: ");
			a[contador] = in.nextInt();
		}
		
		System.out.println("\n");
		
		System.out.println("Insira seu valor: ");
		numero = in.nextInt();
		
		System.out.println("\n");
		
		for (contador = 0; contador < TAM; contador++) {
			if (numero == a[contador]) {
				teste = true;
				System.out.println("O número "+numero+" foi encontrado na posição "+contador);
			}
		}
		
		if (teste == false) {
		System.out.println("Não encontramos seu valor ಥ_ಥ");
		}					
	in.close();
	}

}
