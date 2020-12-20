package Lab2.AnimalRescue;

public class Animal {
    private String name;
    private int age;
    private int health;
    private int hungry;
    private int zen;
    private double weight;
    private String favoritFood;
    private String favActivity;


    public String getName(){
        return name;
    }
    public void  setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getHealth(){
        return health;
    }
    public void setHealth(int health){
        this.health = health;
    }

    public int getHungry(){

        return hungry;
    }
    public void setHungry(int hungry) {
        this.hungry= hungry;
    }

    public int getZen(){
        return zen;
    }
    public void setZen(int zen){
        this.zen=zen;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }

    public String getFavoritFood(){

        return favoritFood;
    }
    public void setFavoritFood(String favoritFood){

        this.favoritFood=favoritFood;
    }

    public String getFavActivity(){

        return favActivity;
    }
    public void setFavActivity(String favActivity){
        this.favActivity=favActivity;
    }

}
