/*4-	Uma empresa desenvolveu uma pesquisa para
 * saber as caracter�sticas psicol�gicas dos indiv�duos 
 * de uma regi�o. Para tanto, a cada uma das pessoas era 
 * perguntado: idade, sexo (1-feminino / 2-masculino), 
 * e as op��es (1, se a pessoa era calma; 2, se a pessoa 
 * era nervosa e 3, se a pessoa era agressiva). Pede-se 
 * para elaborar um sistema que permita ler os dados de 
 * 150 pessoas, calcule e mostre: (WHILE)
�	o n�mero de pessoas calmas; 
�	o n�mero de mulheres nervosas; 
�	o n�mero de homens agressivos; 
�	o n�mero de pessoas nervosas com mais de 40 anos; 
�	o n�mero de pessoas calmas com menos de 18 anos.
*/

package LacoRepeticao;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String srgs[]) {
		Scanner dados = new Scanner(System.in);

		int idade, sexo, estado, qntd = 0, fnervo = 0, calmo = 0, hagressivo = 0, pnervoso = 0, pcalma = 0;

		while (qntd <= 150) {
			System.out.printf("Digite sua idade: ");
			idade = dados.nextInt();
			System.out.printf("Digite seu sexo se Feminino = 1 e Masculino = 2: ");
			sexo = dados.nextInt();
			System.out.printf("\n1 se voc� for calma \n2 se for nervosa \n3 se for agressiva \n\nDigite seu humor: ");
			estado = dados.nextInt();

			if (estado == 1) {
				calmo++;
			}
			if (sexo == 1 && estado == 2) {

				fnervo++;
			}
			if (sexo == 2 && estado == 3) {

				hagressivo++;
			}
			if (idade > 40 && estado == 2) {

				pnervoso++;
			}
			if (idade < 18 && estado == 1) {

				pcalma++;
			}
			qntd++;

		}

		System.out.println("\nO n�mero de pessoas calmas �:" + calmo);
		System.out.println("O n�mero de mulheres nervosas �:" + fnervo);
		System.out.println("O n�mero de homens agressivos �:" + hagressivo);
		System.out.println("O n�mero de pessoas nervosas com mais de 40 anos:" + pnervoso);
		System.out.println("O n�mero de pessoas calmas com menos de 18 anos:" + pcalma);
	}

}
