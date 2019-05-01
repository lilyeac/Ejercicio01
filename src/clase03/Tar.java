package clase03;

import java.util.Scanner;
import java.util.regex.Pattern;



public class Tar {

	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);
	        int tarjeta;
	        System.out.println("Introduzca los 3 primeros digitos de su tarjeta: ");
	        tarjeta = entrada.nextInt();
	        if (tarjeta == 546) {
	            System.out.println("La tarjeta es de peru");
	        } else if (tarjeta ==123) {
	            System.out.println("La tarjeta es de Brasil ");
	        } else if (tarjeta==456) {
	            System.out.println("La tarjeta es de chile");
	            
	            
	        }
	              String numero= entrada.nextLine();
	           System.out.println("Ingrese los digitos de su tarjeta hasta el penultimo numero sin espacios ni guiones :" );
	                 numero = entrada.nextLine();
	                System.out.println(longtarjeta(numero));
	    }
	    
		private final static int MIN_PW_LENGTH = 1;
    	private final static int MAX_PW_LENGTH = 7;
    	
	    public static boolean longtarjeta(String numero){
	        
	    	if(numero.length()>=1 && numero.length()<=7);

			return  (numero.length() >= MIN_PW_LENGTH && numero.length()
					<= MAX_PW_LENGTH)&& Pattern.matches(".*\\p{Alnum}[1-7][0-8].*", numero);
	    }
	    
	    
	}
	    
	   
	    
	    
	
	


