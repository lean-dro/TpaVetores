import java.util.Scanner;
public class VetorPalindromo {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		final int TAM=10; 
		//Opcional 
		//System.out.println("Digite o tamanho do número: "); 
		//TAM = in.nextInt(); 		
		
		int a[], contador,indice, palindromoNum=0;
		
		a = new int [TAM];
		
		for (contador = 0; contador < TAM; contador++) {
			System.out.println("Insira o "+(contador+1)+"° valor do número: ");
			a[contador] = in.nextInt();
		}
		for (contador = 0; contador < TAM; contador++) {
			for (indice = TAM-1; indice >= 0; indice--) {
				if (a[contador]==a[indice]) {
					palindromoNum++;
					contador++;
				}
			}	
		}
		
		if (palindromoNum==TAM) {
			System.out.println("O número é um palíndromo");
		}else {
			System.out.println("O número não é um palíndromo");
		}
	in.close();
	}
}
/*
9.	Números palíndromos são aqueles que escritos da direita para a esquerda 
têm o mesmo valor quando escritos da esquerda para a direita. 
Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um 
programa que verifique se um dado vetor A de 
10 elementos inteiros é um palíndromo, ou seja, 
se o primeiro elemento do vetor e igual ao último, 
se o segundo elemento do vetor é igual ao 
penúltimo e assim por diante até verificar todos os 
elementos ou chegar a conclusão que o vetor não é um palíndromo.
*/