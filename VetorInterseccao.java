import java.util.Scanner;
public class VetorInterseccao {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
			
		final int TAM = 10;
		
		int a[], b[],c[], indice, contador, intersecNum=0, indiceAux=0;
		
		a = new int [TAM];
		b = new int [TAM];
		
		for (contador = 0; contador < TAM; contador++) {
			System.out.println("Insira o "+(contador+1)+"° valor de A: ");
			a[contador] = in.nextInt();
		}
		System.out.println("\n");
		for (contador = 0; contador < TAM; contador++) {
			System.out.println("Insira o "+(contador+1)+"° valor de B: ");
			b[contador] = in.nextInt();
		}
		
		for (contador = 0; contador < TAM; contador++) {
			for (indice = 0; indice < TAM; indice++) {
				if (a[contador]==b[indice]) {
					intersecNum++;
				}
			}
		}
		if (intersecNum==0) {
			System.out.println("Não foi encontrado valores iguais nos dois vetores ಥ_ಥ");
		}else {
			System.out.println("Vetor C: ");
			c = new int [intersecNum];
			for (contador = 0; contador < TAM; contador++) {
				for (indice = 0; indice < TAM; indice++) {
					if (a[contador]==b[indice]) {
						c[indiceAux] = a[contador];
						System.out.println(c[indiceAux]);
						indiceAux++;
					}
				}
			
			}
		}
	in.close();
	}
}
/*6.Criar dois vetores A e B cada um com 10 elementos inteiros. 
  Desenvolver um programa que realize a intersecção  dos vetores A e B para produzir um vetor C. 
  Interseção de conjuntos = todos os elementos que existem em A e também existem em B.
*/