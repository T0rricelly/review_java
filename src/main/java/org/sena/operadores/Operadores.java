package org.sena.operadores;

public class Operadores {
    public static void main(String[] args) {
    // Operardores aritmeticos
        /*
        Suma = +
        Resta = -
        Multiplicacion = *
        Division /
        Modulo = %
        */
    // Operaciones Unarios

    int operando = 5;
        System.out.println(operando++);  // La operacion se ejecuta despues
        System.out.println(operando--);


        System.out.println(++operando);  // La operacion se ejecuta antes
        System.out.println(--operando);

    // Operadores lógicos
        int valor1 = 5;
        int valor2 = 10;

        boolean mayor = valor1 > valor2;
        boolean mayorIgual = valor1 >= valor2;
        boolean menor = valor1 < valor2;
        boolean menorIgual = valor1 <= valor2;
        boolean igual = valor1 == valor2;
        boolean distinto = valor1 != valor2;
        boolean inverso = !distinto;

    // Operadores Relacionales

        // || = or
        /*
            false || false = false
            true || false = true
            false || true = true
            true || true = true
         */

        // && = and
        /*
            false && false = false
            true && false = false
            false && true = false
            true && true = true
        */
        // En operaciones combinadas tiene mas prioridad el operador &&
    }
}
