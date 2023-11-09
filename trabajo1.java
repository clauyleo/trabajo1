package trabajo1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class trabajo1 {
	
    public static void main(String[] args) {

	 Random random = new Random();

     int resultado = random.nextInt(10); 

     
     int num_secreto= -1;
     
     Scanner entrada = new Scanner(System.in);
     
    try { for (int i = 0; i < 10; i++) {

		System.out.println("ingrese un numero del 1 al 100");
		num_secreto = entrada.nextInt();
		
		System.out.println("el numero de intento es: "+i);
		
		 if(resultado < num_secreto) {
			 System.out.println("el numero que ingresaste es menor");
		 }
		 if(resultado > num_secreto) {
			 System.out.println("el numero que ingresaste es mayor");
		 }
		 if( num_secreto == resultado) {
			 System.out.println("ganaste, tu numero de intento es: "+(i+1));
			 break;
		 }
		   if (num_secreto < 0) {
               throw new ArithmeticException();
             }
           if (num_secreto > 100) {
               throw new ArithmeticException();
           }
		 
     }
    }
    catch (ArithmeticException e) {
		System.out.println("Error: División por cero no permitida.");
	} catch (InputMismatchException e) {
		System.out.println("Error: Debes ingresar un dato valido.");
	}

    if( num_secreto != resultado) {
		 System.out.println("perdiste");
	 }
    
}
}
