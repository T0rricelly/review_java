package org.sena.challenge_functional_prog;

import java.util.Objects;

public class Client {
    private Long numberClient;
    private String name;
    private String lastName;
    private String address;
    private String cellphone;


    public Client(Long numberClient, String name, String lastName, String address, String cellphone) {
        this.numberClient = numberClient;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.cellphone = cellphone;
    }


    public Long getNumberClient() {
        return numberClient;
    }

    public void setNumberClient(Long numberClient) {
        this.numberClient = numberClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }
}
