package ejercicioV_pollyLucia;

import java.util.Scanner;

class Palabra {
	String termino;
	String deficion;
	

	public Palabra(String termino, String deficion) {
		this.termino = termino;
		this.deficion = deficion;
	}

	public String getTermino() {
		return termino;
	}

	public String getDeficion() {
		return deficion;
	}

	public void setTermino(String termino) {
		this.termino = termino;
	}

	public void setDeficion(String deficion) {
		this.deficion = deficion;
	}
}

public class EjercicioV_pollyLucia {
	
	static void mostrarMenu() {
		System.out.println("1. Introducir un nuevo término y su definición en el diccionario: ");
		System.out.println("2. Mostrar todos los términos (sin deficiones): ");
		System.out.println();
		System.out.println();
		System.out.println();
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Palabra [] diccionario = new Palabra[100];
		int opcion;
		String termino;
		String definicion;
		int contador = 0;
		String mostrar;
		
		do {
			System.out.println("----------------------------------------------");
			mostrarMenu();
			opcion = s.nextInt();
		
			switch (opcion){
				case 1:
					System.out.println("Introduzca un termino: ");
					termino = s.next();//para que me pille la palabra
					s.nextLine();// para consuma el intro 
					System.out.println("Introduzca una definicion: ");
					definicion = s.nextLine();//para que pille la definición
					diccionario[contador] = new Palabra(termino, definicion);
					contador++;
					break;	
					
				case 2:
					System.out.println("Mostrar todos los terminos: ");
					for(int i = 0; i<contador;i++) {
					System.out.println(diccionario[i].getTermino());
					}
					
					break;
				case 3:
					break;
					
				case 4:
						break;
			
			default:
				System.out.println("Opcion Invalida");
			}
		
		} while(opcion!=0);
		
	}
}


		
