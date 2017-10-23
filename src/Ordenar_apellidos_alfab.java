import java.util.Scanner;

public class Ordenar_apellidos_alfab {

	public static void main(String[] args) {
		
		//ordenar apellido alfabeticamente
		
		Scanner lector = new Scanner(System.in);
		
		String apellido1;
		String apellido2;
		
		System.out.println("Escribir apellido");
		apellido1 = lector.nextLine();
		System.out.println("Escribir otro apellido");
		apellido2 = lector.nextLine();
		
		if(apellido1.compareTo(apellido2) <0) // al final lo que nos dan es un número
			System.out.println(apellido1 + "va antes alfabéticamente");
		else{
			if(apellido2.compareTo(apellido1) <0){
				System.out.println(apellido2 + "va antes alfabéticamente");
			}else{
				System.out.println("Son iguales");
			}
				
		}
		
	}

}
