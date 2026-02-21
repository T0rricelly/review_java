package org.sena.interface_example;

public interface Translator {
    void translate();

    // Metodos con implementacion por default
    default void startTranslate(){
        System.out.println("Iniciando traductor");
    }
}
