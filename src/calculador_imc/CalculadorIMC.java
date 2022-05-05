package calculador_imc;

import java.util.Scanner;

public class CalculadorIMC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua altura em cm: ");
		int altura = sc.nextInt();
		System.out.println(altura);
		System.out.println("Digite seu peso em kg: ");
		double peso = sc.nextDouble();
		System.out.println(peso);
		
		double imc = peso / (altura * altura) * 10000;
		
		System.out.println(Math.round(imc));
		
		if (imc >= 18.5 && imc <= 25) {
			System.out.println("Voc� est� com o peso ideal!");
		} else if (imc < 18.5) {
			System.out.println("Voc� est� abaixo do peso ideal.");
		} else if (imc > 25) {
			System.out.println("Voc� est� acima do peso ideal.");
		}
		

	}

}
