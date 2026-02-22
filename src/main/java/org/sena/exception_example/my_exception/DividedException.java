package org.sena.exception_example.my_exception;

public class DividedException extends Exception{
    String description;

    public DividedException( String description) {
        setDescription(description);
    }

    @Override
    public String getMessage(){
        return getDescription();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
