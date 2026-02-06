package org.sena.strings;

public class sub_string {
    public static void main(String[] args) {
        String string1 = "Hola mundo";
        // Como parametros se deben pasar el indice inicial y final
        String string2 = string1.substring(0,5);
        System.out.println("string2 = " + string2);
        String string3 = string1.substring(5);
        System.out.println("string3 = " + string3);
    }
}
