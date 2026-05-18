package javademo.java17.sealed;

public sealed interface Payment permits CardPayment, UpiPayment {}

record CardPayment(String lastFour) implements Payment {}

record UpiPayment(String vpa) implements Payment {}
