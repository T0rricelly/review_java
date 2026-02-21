package org.sena.interface_example;

public class French implements Translator{
    public void translate(){
        System.out.println("Traduzco a frances");
    }
    @Override
    public void startTranslate(){
        System.out.println("Iniciando a traducir frances");
    }
}
