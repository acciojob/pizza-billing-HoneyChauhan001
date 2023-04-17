package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean flagExtraCheese = false;
    private boolean flagExtraToppings = false;
    private boolean flagTakeaway = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg == true)this.price = 300;
        else this.price = 400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
//        if(this.flagExtraCheese == false){
//            this.price += 80;
//            this.flagExtraCheese = true;
//        }
        this.flagExtraCheese = true;
    }

    public void addExtraToppings(){
        // your code goes here
//        if(this.flagExtraToppings == false){
//            if(this.isVeg == true){
//                this.price += 70;
//            }
//            else {
//                this.price += 120;
//            }
//            this.flagExtraToppings = true;
//        }
        this.flagExtraToppings = true;
    }

    public void addTakeaway(){
        // your code goes here
//        if(this.flagTakeaway == false){
//            this.price += 20;
//            this.flagTakeaway = true;
//        }
        this.flagTakeaway = true;
    }

    public String getBill(){
        // your code goes here
        int p = this.price;
        this.bill = "Base Price of The Pizza: " + p + "\n";
        if(flagExtraCheese == true){
            this.bill = this.bill + "Extra Cheese Added: 80\n";
            this.price += 80;
        }

        if(flagExtraToppings == true){
            if(this.isVeg == true){
                this.bill = this.bill + "Extra Toppings Added: 70\n";
                this.price += 70;
            }
            else {
                this.bill = this.bill + "Extra Toppings Added: 120\n";
                this.price += 120;
            }
        }
        if(flagTakeaway == true){
            this.bill = this.bill + "Paperbag Added: \n";
            this.price += 20;
        }

        this.bill = this.bill + "Total Price: " + this.price + "\n";
        return this.bill;
    }
}
