package org.sena.strings;

public class Search {
    public static void main(String[] args) {
            String text = "Hola mundo";
            var search1 = text.indexOf("Hola");
            var search2 = text.lastIndexOf("Mundo");
            // Cuando encuentra el texto retorna el indice
            System.out.println("search1 = " + search1);
            // Devuelve -1 cuando no encuentra el texto
            System.out.println("search2 = " + search2);
    }
}
