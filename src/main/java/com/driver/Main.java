package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(false);
    System.out.println(dp.getPrice());
    dp.addExtraCheese();
    System.out.println(dp.getBill());

    Pizza p = new Pizza(false);

    p.addExtraToppings();
    System.out.println(p.getBill());
  }
}