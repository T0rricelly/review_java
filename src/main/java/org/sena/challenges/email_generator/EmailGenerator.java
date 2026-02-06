package org.sena.challenges.email_generator;

public class EmailGenerator {
    public static void main(String[] args) {
        System.out.println("****** Generador de emails ******");
        String nameUser = "Ubaldo Acosta Soto";
        System.out.println("nombre de usuario " + nameUser);
        nameUser = nameUser.replace(' ', '.').toLowerCase();

        String userEnterprise = "Global Mentoring";
        userEnterprise = userEnterprise.replace(' ', '.').toLowerCase();

        String nameDomain = "com.mx";
        System.out.println("El email generado es: " + nameUser + "@" + userEnterprise + "." + nameDomain);
    }
}
