package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int extraCheesePrice;
    private int extraToppingprice;
    private int takeAwayPrice;
    private  boolean isCheeseAdded;
    private  boolean isToppingAdded;
    private  boolean isTakeawayAdded;
    private boolean isBillGenerated;


    public Pizza(Boolean isVeg){
        this.isCheeseAdded=false;
        this.isToppingAdded=false;
        this.isTakeawayAdded=false;
        this.extraCheesePrice=80;
        this.isVeg = isVeg;
        this.takeAwayPrice=20;
        if(isVeg==true){
            this.price=300;
            this.extraToppingprice=70;

        }
        else{
            this.price=400;
            this.extraToppingprice=120;
        }
        this.bill= "Base Price Of The Pizza:" +this.price +"\n";
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(isCheeseAdded==false){
            this.price=this.price+this.extraCheesePrice;
            isCheeseAdded=true;
        }
        // your code goes here
    }

    public void addExtraToppings(){
        if(isToppingAdded==false){
            this.price=this.price +this.extraToppingprice;
            isToppingAdded=true;

        }
        // your code goes here
    }

    public void addTakeaway() {
        // your code goes here
        if (isTakeawayAdded == false) {
            this.price = this.price + this.takeAwayPrice;
            isTakeawayAdded = true;
        }
    }

    public String getBill(){
        if(isBillGenerated==false){
            isBillGenerated=true;

            if(isCheeseAdded==true){
                this.bill=this.bill+"Extra Cheese Addded:" + this.extraCheesePrice + "\n";
            }
            if(isToppingAdded==true){
                this.bill=this.bill+"Extra Topping Added:" + this.extraToppingprice +"\n";

            }
            if(isTakeawayAdded==true){
                this.bill=this.bill+"Paperbag Added:" + this.takeAwayPrice +"\n";

            }
            this.bill=this.bill+"Total price:" +this.price+ "\n";
        }
        // your code goes here
        return this.bill;
    }
}
