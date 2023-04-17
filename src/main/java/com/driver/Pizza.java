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
        this.flagExtraCheese = true;
    }

    public void addExtraToppings(){
        this.flagExtraToppings = true;
    }

    public void addTakeaway(){
        this.flagTakeaway = true;
    }

    public String getBill(){
        // your code goes here
        int p = this.price;
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
        if(flagExtraCheese == true){
            this.bill = this.bill + "Extra Cheese Added: 80\n";
            p += 80;
        }

        if(flagExtraToppings == true){
            if(this.isVeg == true){
                this.bill = this.bill + "Extra Toppings Added: 70\n";
                p += 70;
            }
            else {
                this.bill = this.bill + "Extra Toppings Added: 120\n";
                p += 120;
            }
        }
        if(flagTakeaway == true){
            this.bill = this.bill + "Paperbag Added: 20\n";
            p += 20;
        }

        this.bill = this.bill + "Total Price: " + p + "\n";
        return this.bill;
    }
}
