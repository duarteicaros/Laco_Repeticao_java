//2-	Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

package LacoRepeticao;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num, x, somapar=0, somaimpar=0;
		
		for(x=1; x<=10; x++)
		{
			System.out.printf("Entre com um n�mero: ");
			num = leia.nextInt();
			
			if(num %2 ==0)
			{
				somapar++;
			}
			else
			{
				somaimpar++;
			}
		}
		
		System.out.println("\nA quantidade de n�meros pares �: "+somapar);
		System.out.println("A quantidade de n�meros pares �: "+somaimpar);

	}

}
