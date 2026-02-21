package org.sena.interface_example;

public class Test {
    public static void main(String[] args) {
        Translator english = new English();
        english.startTranslate();
        english.translate();   

        Translator french = new French();
        french.startTranslate();
        french.translate();
    }
}
