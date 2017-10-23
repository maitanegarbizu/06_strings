
public class Main {

	public static void main(String[] args) {
		String cadena = "Hola mundo";
		
		String cadena1 = "zubiri";
		String cadena2 = "manteo";
		
		//System.out.println(cadena);
		//System.out.println("Hola mundo");
		
		System.out.println("La cadena \"" + cadena + "\" tiene " + cadena.length() + "caracteres");
		
		System.out.println("El séptimo caracter de \"" + cadena + "\" es " + cadena.charAt(6) + "'");
		
		System.out.println(cadena.substring(0, 4));
		System.out.println(cadena.substring(5, cadena.length()));
		
		if(cadena.equals(cadena.substring(0, 4))){
			System.out.println("Son iguales");
			
		}else{
			System.out.println("Son diferentes");
		}

		System.out.println("\n" + cadena.indexOf("a")); 
		
		System.out.println(cadena.toLowerCase()); //escribe en minusculas
		System.out.println(cadena.toUpperCase()); //mayusculas
		System.out.print(cadena);
		
		int comparacion = cadena2.compareTo("aaaa");
		
		System.out.println("Comparación de" + cadena2 + "con" + cadena1 + "es:" + comparacion);
		
		if(cadena2.equals(cadena1)){
			System.out.println("son iguales");
		}
		
		if(cadena2.compareTo(cadena1) == 0){
			System.out.println("son iguales");
		}
		
		//cadena = Hola mundo;
		System.out.println("La ultima aparición de o en" + cadena + " es: " + cadena.lastIndexOf("o"));
		
		System.out.println("La primera aparición de o en" + cadena + " es: " + cadena.indexOf("o"));
	}
}
