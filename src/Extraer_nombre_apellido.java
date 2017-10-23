import java.util.Scanner;

public class Extraer_nombre_apellido {

	public static void main(String[] args) {
		
		//extraer apellido despues de escribir nombre y apellido
		
		Scanner lector = new Scanner(System.in);
		
		String nombre_apellido = "Maitane Garbizu";
		
		
		System.out.println("Escribir el nombre y el apellido");
		nombre_apellido = lector.nextLine();
		
		System.out.println("tu apellido es" + nombre_apellido.substring(nombre_apellido.indexOf(" ")));
		
	
	}

}
