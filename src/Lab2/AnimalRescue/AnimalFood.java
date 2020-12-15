package Lab2.AnimalRescue;

public class AnimalFood {

    private String foodName;
    private double priceInRon=15.5;
    private double quantityInKg=1.5;
    private int stock=10;



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

    public double getQuantityInKg(){
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






}
