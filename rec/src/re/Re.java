package re;
import java.util.Scanner;

public class Re {
//Dadas dos cantidades en euros, calcular la diferencia entre ambas 
	//y expresarla en dólares (1€ = 1.04$).
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner s = new Scanner(System.in);
 
 double cantidad1;
 double cantidad2;
double diferenciaEuros;
double cambioDolar;
double dolar = 1.04;

 System.out.println("Introduce la primera cantidad en euro :");
 cantidad1 = s.nextDouble();

 System.out.println("Introduce la segunda cantidad en euro: ");
 cantidad2 = s.nextDouble();
 
 
diferenciaEuros = cantidad1 - cantidad2;

 cambioDolar = diferenciaEuros * dolar;
 
 System.out.println(" La diferencia entre las cantidades es " +diferenciaEuros+ "€"+ " y el cambio en dolar es " +cambioDolar);
 
 
	}

}
