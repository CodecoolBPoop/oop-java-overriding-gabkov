package com.codecool.uml.overriding;

public class CheckoutProccess extends AbstractProcess {

    protected void action(Orderable item){
        if (item.checkout()){
            System.out.println("Checkout done.");
        } else {
            System.out.println("Checkout failed, please check your order details again.");
        }
    }
}
