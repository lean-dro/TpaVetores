import java.util.Scanner;
public class VetorPalindromo {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		final int TAM=10; 
		//Opcional 
		//System.out.println("Digite o tamanho do n�mero: "); 
		//TAM = in.nextInt(); 		
		
		int a[], contador,indice, palindromoNum=0;
		
		a = new int [TAM];
		
		for (contador = 0; contador < TAM; contador++) {
			System.out.println("Insira o "+(contador+1)+"� valor do n�mero: ");
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
			System.out.println("O n�mero � um pal�ndromo");
		}else {
			System.out.println("O n�mero n�o � um pal�ndromo");
		}
	in.close();
	}
}
/*
9.	N�meros pal�ndromos s�o aqueles que escritos da direita para a esquerda 
t�m o mesmo valor quando escritos da esquerda para a direita. 
Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um 
programa que verifique se um dado vetor A de 
10 elementos inteiros � um pal�ndromo, ou seja, 
se o primeiro elemento do vetor e igual ao �ltimo, 
se o segundo elemento do vetor � igual ao 
pen�ltimo e assim por diante at� verificar todos os 
elementos ou chegar a conclus�o que o vetor n�o � um pal�ndromo.
*/