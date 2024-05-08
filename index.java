import java.util.ArrayList;
import java.util.Scanner;

public class index {
	
	public static Scanner sn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 0;
		int num2 = 0;
		
		ArrayList<Integer> numeros = new ArrayList<>();
		int nNumeros = 0;
		
		System.out.println("¿Con cuántos números vas a operar?");
		nNumeros = sn.nextInt();
		
		switch (menu()) {
		case 1:
			for (int i = 0; i < nNumeros; i++) {
				System.out.print("Introduce número: ");
				numeros.add(sn.nextInt());
			}
			System.out.println("La suma de todos los número introducidos es " + sumar2(numeros));
			break;
		case 2:
			for (int i = 0; i < nNumeros; i++) {
				System.out.print("Introduce número: ");
				numeros.add(sn.nextInt());
			}		
			System.out.println("La multiplicación de todos los número introducidos es " + multiplicar2(numeros));
			break;
		case 3:
			System.out.print("Introduce el minuendo: ");
			num1 = sn.nextInt();
			System.out.print("Introduce el sustraendo: ");
			num2 = sn.nextInt();
			
			System.out.println(num1 + " - " + num2 + " = " + restar2(num1, num2));
			
			break;
		case 4:
			System.out.print("Introduce el dividendo: ");
			num1 = sn.nextInt();
			System.out.print("Introduce el divisor: ");
			num2 = sn.nextInt();
			
			System.out.println(num1 + " / " + num2 + " = " + dividir2(num1, num2));
			
			break;
		default:
			System.out.println("Opción no válida");
			break;
		}
		
	}

	public static int menu () {
		int opc = 0;
		System.out.println("Elige una opción: ");
		System.out.println("1. Sumar.");
		System.out.println("2. Multiplicarr.");
		System.out.println("3. Restar.");
		System.out.println("4. Dividir.");
 
		opc = sn.nextInt();
		return opc;
	}
	
	public static int sumar2 (ArrayList<Integer> numeros) {
		int suma = 0;
		
		for (Integer n : numeros) {
			suma += n;
		}
		
		return suma;
	}
	
 
	public static int multiplicar2 (ArrayList<Integer> numeros) {
		int multi = 1;
		
		for (Integer n : numeros) {
			multi *= n;
		}
		
		return multi;
	}
	
	public static int restar2 (int num1, int num2) {
		int resta = 0;
		
		resta = num1 - num2;
		
		return resta;
	}
	
	public static int dividir2 (int num1, int num2) {
		int divi = 0;
		
		divi = num1 / num2;
		
		return divi;
	}
	
}
