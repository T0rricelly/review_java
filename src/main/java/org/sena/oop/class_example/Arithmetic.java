package org.sena.oop.class_example;

public class Arithmetic {
    private int oper1;
    private int oper2;

    public Arithmetic(int oper1, int oper2){
        this.oper1 = oper1;
        this.oper2 = oper2;
    }

    public void add() {
        System.out.println(oper1 + oper2);
    }
    public void subtract(){
        System.out.println(oper1 - oper2);
    }

    // Getters and Setters

    public int getOper1(){
        return this.oper1;
    }
    public void setOper1(int oper1){
        this.oper1 = oper1;
    }
    public int getOper2(){
        return this.oper2;
    }
    public void setOper2(int oper2){
        this.oper2 = oper2;
    }


}
