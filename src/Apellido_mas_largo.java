import java.util.Scanner;

public class Apellido_mas_largo {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		
		String apellido1;
		String apellido2;
		
		System.out.println("Escribir apellido 1");
		apellido1 = lector.nextLine();
		System.out.println("Escribir apellido 2");
		apellido2 = lector.nextLine();
		
		if(apellido1.length() > apellido2.length()){
			System.out.println( apellido1 + "es más largo");
		}else{
			
			if(apellido1.length() < apellido2.length()){
				System.out.println( apellido2 + "es más largo");
			}else{
				System.out.println("Apellidos iguales");
				
			}
			
		}
			
		
			
			

	}

}
