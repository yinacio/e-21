/**
 * 
 */
/**
 * @author Yuri
 *
 */
package exercicio05;

import java.util.Scanner;

public class exercicio05{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu nome:");
		String nome = sc.next();
		
		System.out.println("Olá " + nome + "! Deseja calcular o seno, cosseno ou tangente de um ângulo? (S/N))");
		
		String resposta = sc.next();
		
		Boolean validacao = resposta.equalsIgnoreCase("S") ? true : false;
		
		while (validacao) {
			
			System.out.println("Informe o ângulo: ");
			double angulo = sc.nextDouble();
			
			System.out.println("Informe a opção: (1- Seno; 2- Cosseno; 3- Tangente;");
			int opcao = sc.nextInt();
			
			switch(opcao){
			case 1:
				double seno = Math.sin(angulo);
				System.out.println("O seno do ângulo informado é: " + seno);
				break;
			
			case 2:
				double cos = Math.cos(angulo);
				System.out.println("O cosseno do ângulo informado é: " + cos);
				break;
				
			case 3:
				double tg = Math.tan(angulo);
				System.out.println("A tangente do ângulo informado é: " + tg);
				break;
			default:
				System.out.println("Opção inválida");
			}
			
			System.out.println("Deseja efetuar mais algum cálculo? (S/N)");
			resposta = sc.next();
			
			if (resposta.equalsIgnoreCase("N")) {
				validacao = false;
			}else {
				validacao = true;
			}
			
		}
		
		System.out.println("Volte sempre!!!");
		sc.close();
		
		
	}
	
}