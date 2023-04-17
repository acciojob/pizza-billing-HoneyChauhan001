package com.driver;

public class Pizza {

    private int price;
    private int basePrice;
    private Boolean isVeg;
    private String bill;
    private int vegBasePrice = 300;
    private int nonVegBasePrices = 400;
    private boolean isCheeseAdded;
    private int cheesePrice = 80;
    private boolean isExtraToppings;
    private int vegExtraToppingsPrices = 70;
    private int nonVegExtraToppingsPrices = 120;
    private boolean isTakeaway;
    private int takeawayPrice = 20;

    private int toppingsPrice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        basePrice = getBasePrice();
        price = basePrice;
        isCheeseAdded = false;
        isExtraToppings = false;
        isTakeaway = false;
    }

    private int getBasePrice(){
        return isVeg ? vegBasePrice : nonVegBasePrices;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isCheeseAdded){
            isCheeseAdded = true;
            price += cheesePrice;
        }
    }

    public void addExtraToppings(){
        if(!isExtraToppings){
            isExtraToppings = true;
            toppingsPrice = isVeg ? vegExtraToppingsPrices : nonVegExtraToppingsPrices;
            price += toppingsPrice;
        }
    }

    public void addTakeaway(){
        if(!isTakeaway){
            isTakeaway = true;
            price += takeawayPrice;
        }
    }

    public String getBill(){
        // your code goes here
        String var = "";
        var += "Base Price Of The Pizza: " + basePrice + "\n";
        if(isCheeseAdded){
            var += "Extra Cheese Added: " + cheesePrice + "\n";
        }
        if(isExtraToppings){
            var += "Extra Toppings Added: " + toppingsPrice + "\n";
        }
        if(isTakeaway){
            var += "Paperbag Added: " + takeawayPrice + "\n";
        }
        var += "Total Prices: " + price + "\n";
        this.bill = var;
        return this.bill;
    }
}
