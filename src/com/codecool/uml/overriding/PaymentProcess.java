package com.codecool.uml.overriding;

public class PaymentProcess extends AbstractProcess {

    protected void action(Orderable item){
        if(item.pay()){
            System.out.println("Payment was successful!");
        } else {
            System.out.println("Payment failed, please check payment details again!");
        }
    }
}
