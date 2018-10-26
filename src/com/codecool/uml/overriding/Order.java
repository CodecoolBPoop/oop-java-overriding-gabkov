package com.codecool.uml.overriding;

public class Order implements Orderable {

    private int id = 1;
    private String status;


    Order(){
        id++;
        status = "New";
    }

    public String getStatus() {
        return status;
    }

    @Override
    public boolean checkout() {
        if(getStatus().equals("New")) {
            status = "Checked";
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean pay() {
        if(getStatus().equals("Checked")){
            status = "Payed";
            return true;
        }else{
            return false;
        }
    }
}
