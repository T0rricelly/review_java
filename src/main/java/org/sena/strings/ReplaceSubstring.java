package org.sena.strings;

public class ReplaceSubstring {
    public static void main(String[] args) {
        var text = "Hola mundo";
        System.out.println("Cadena Original = " + text);

        // Replace "mundo" with "a todos"
        var newText = text.replace("mundo", "a todos");
        System.out.println("newText = " + newText);

        // Replace "Hola" with "Saludos"
        newText = text.replace("Hola", "Saludos");

    }
}
