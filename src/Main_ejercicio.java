import java.util.Scanner;

public class Main_ejercicio {

	public static void main(String[] args) {
		
		final int SALIR = 0;
		final int MAS_LARGO = 1;
		final int ORDENAR = 2;
		final int EXTRAER = 3;
		
		Scanner scan= new Scanner(System.in);
		int opcion;
		
		String apellido1;
		String apellido2;
		String nombre_apellido;
		
		do{
			System.out.println("----MENU----");
			System.out.println(MAS_LARGO + "Apellido más largo");
			System.out.println(ORDENAR + "Ordenar alfabéticamente los apellidos");
			System.out.println(EXTRAER + "Extraer apellido de nombre completo");
			System.out.println(SALIR + "Salir");
		
		
		//leer la opcion
		opcion = Integer.parseInt(scan.nextLine());
		
		
		switch(opcion){
		
		case MAS_LARGO:
			System.out.println("Introduce un apellido");
			apellido1 = scan.nextLine();
			System.out.println("Introduce otro apellido");
			apellido2 = scan.nextLine();
			
			if(apellido1.length() > apellido2.length()){
				
				System.out.println(apellido1 + "es más largo que" + apellido2);
			}else if(apellido1.length() < apellido2.length()){
				System.out.println(apellido2 + "es más largo que" + apellido1);
			} else{
				System.out.println(apellido1 + "y" + apellido2 + "son iguales");
			}
			
		break;	
		
		case ORDENAR:
			
			System.out.println("Escribir apellido");
			apellido1 = scan.nextLine();
			System.out.println("Escribir otro apellido");
			apellido2 = scan.nextLine();
			if(apellido1.compareTo(apellido2) <0) // al final lo que nos dan es un número
				System.out.println(apellido1 + "va antes alfabéticamente");
			else{
				if(apellido2.compareTo(apellido1) <0){
					System.out.println(apellido2 + "va antes alfabéticamente");
				}else{
					System.out.println("Son iguales");
				}
					
			}
			
		break;
		case EXTRAER:
			
			System.out.println("Escribir el nombre y el apellido");
			nombre_apellido = scan.nextLine();
			
			int beginIndex = nombre_apellido.indexOf(" ") + 1 ;
			System.out.println("tu apellido es " + nombre_apellido.substring(beginIndex));
			
		break;
		case SALIR:
			default:
				System.out.println("Opción mal");
		break;
		
		}
		
	} while (opcion != SALIR);
		
		
	}
}



		
	
	


