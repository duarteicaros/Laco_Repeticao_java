//2-	Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

package LacoRepeticao;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num, x, somapar=0, somaimpar=0;
		
		for(x=1; x<=10; x++)
		{
			System.out.printf("Entre com um número: ");
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
		
		System.out.println("\nA quantidade de números pares é: "+somapar);
		System.out.println("A quantidade de números pares é: "+somaimpar);

	}

}
