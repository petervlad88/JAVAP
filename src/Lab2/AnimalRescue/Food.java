package Lab2.AnimalRescue;

public abstract class Food {
    private String foodName;
    private double priceInRon;
    private double quantityInKg;
    private int stock;



    public String getFoodName(){
        return foodName;
    }
    public void setFoodName(String foodName){
        this.foodName=foodName;
    }


    public double getPriceInRon(){
        return priceInRon;
    }
    public void setPriceInRon(double priceInRon){
        this.priceInRon=priceInRon;
    }

    public double getQuantityInKg() {
        return quantityInKg;
    }
    public void setQuantityInKg(double quantityInKg){
        this.quantityInKg=quantityInKg;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock){
        this.stock=stock;
    }

    public abstract void smell();


    public abstract void taste1();



    }









