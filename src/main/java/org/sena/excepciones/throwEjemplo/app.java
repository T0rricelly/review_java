package org.sena.excepciones.throwEjemplo;

import java.util.Scanner;
import static org.sena.excepciones.throwEjemplo.ExcepcionEjemplo.*;


public class app {
    public static void main(String[] args) {
        // Excepcion personalizada
        try {
            System.out.println("Ingrese un numero");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            validateNumber(number);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
