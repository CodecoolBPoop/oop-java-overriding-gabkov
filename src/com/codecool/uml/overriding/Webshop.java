package com.codecool.uml.overriding;

public class Webshop {

    public static void main(String[] args) {
	    Order order = new Order();
	    CheckoutProccess cp = new CheckoutProccess();
	    PaymentProcess pm = new PaymentProcess();

	    pm.process(order);
	    cp.process(order);
	    cp.process(order);
	    pm.process(order);
    }
}
