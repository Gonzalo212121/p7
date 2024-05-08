package P5;

import java.util.ArrayList;
import java.util.Scanner;

public class index {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

        System.out.println("Introduzca su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduzca sus apellidos: ");
        String apellidos = sc.nextLine();
        System.out.println("Introduzca su fecha de nacimiento: ");
        String fecha = sc.nextLine();
        System.out.println("Introduzca su DNI: ");
        String dni = sc.nextLine();
        System.out.println("Introduzca sus estudios previos: ");
        String estudios = sc.nextLine();
		
        Estudiante nuevoEstudiante = new Estudiante(nombre, apellidos, fecha, dni, estudios);
        
        estudiantes.add(nuevoEstudiante);
		
	}

}

