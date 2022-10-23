package Projeto1;
import java.util.Scanner;

public class ConverteTemp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.printf("Escolha o tipo de temperatura:%n1 - °C%n2 - °F%n3 - K%n");
		int tipo = sc.nextInt();
		System.out.println("Digite a temperatura: ");
		double T = sc.nextDouble();
		double celsius, fahrenheit, kelvin;
		
		switch (tipo) {
		case 1:
			celsius = T;
			fahrenheit = (T * 9)/5 + 32;
			kelvin = T + 274.15;
			System.out.printf("A temperatura corresponde a:%n%.2f °C%n%.2f °F%n%.2f K%n",celsius,fahrenheit,kelvin);
			
		break;
		case 2:
			fahrenheit = T;
			celsius = ((T - 32)*5)/9;
			kelvin = celsius + 274.15;
			System.out.printf("A temperatura corresponde a:%n%.2f °C%n%.2f °F%n%.2f K%n",celsius,fahrenheit,kelvin);
		break;
		case 3:
			kelvin = T;
			celsius = T - 274.15;
			fahrenheit = (celsius * 9)/5 + 32;
			System.out.printf("A temperatura corresponde a:%n%.2f °C%n%.2f °F%n%.2f K%n",celsius,fahrenheit,kelvin);
		break;
		}
		
		sc.close();
			
	}
}
