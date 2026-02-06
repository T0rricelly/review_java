package org.sena.strings;

public class Methods {
    public static void main(String[] args) {
        // Methods
        var string1 = "Hola mundo";
        var lenght1 = string1.length();
        System.out.println("lenght1 = " + lenght1);
        // Replace
        var newString = string1.replace('o','a');
        System.out.println("newString = " + newString);
        // Convert Uppercase
        var upperString = string1.toUpperCase();
        System.out.println("upperString = " + upperString);
        // Convert Lower
        var lowerString = string1.toLowerCase();
        System.out.println("lowerString = " + lowerString);
        // Delete spaces
        var string2 = "   Juan reyes   ";
        var deleteSpaces = string2.trim();
        System.out.println("deleteSpaces = " + deleteSpaces);
    }
}
