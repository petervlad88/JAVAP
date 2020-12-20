package Lab2.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {

        Cat myCat=new Cat();
        myCat.setName("Lili");
        System.out.println(myCat.getName());

        myCat.setAge(5);
        System.out.println(myCat.getAge());

        myCat.setHealth(2);
        System.out.println(myCat.getHealth());

        myCat.setHungry(9);
        System.out.println(myCat.getHungry());

        myCat.setZen(10);
        System.out.println(myCat.getZen());

        myCat.setWeight(6.5);
        System.out.println(myCat.getWeight());

        myCat.setFavoritFood("Wet food");
        System.out.println(myCat.getFavoritFood());

        myCat.setFavActivity("running");
        System.out.println(myCat.getFavActivity());






        Adopter myAdopter= new Adopter();
        System.out.println(myAdopter.getAvailableAmount());
        myAdopter.setName("Vlad");
        System.out.println(myAdopter.getName());
        myAdopter.setNationality("Roman");
        System.out.println(myAdopter.getNationality());
        System.out.println(myAdopter.getAvailableAmount());
        System.out.println(myAdopter.getAge());


        AnimalFood myAnimalFood= new AnimalFood();
        System.out.println(myAnimalFood.getFoodName());
        myAnimalFood.setFoodName("Royal Canin");
        System.out.println(myAnimalFood.getFoodName());
        myAnimalFood.getQuantityInKg();
        System.out.println(myAnimalFood.getQuantityInKg());


        RecreationActivity myRecActivity=new RecreationActivity();
        System.out.println(myRecActivity.getName());


        Vet myVet=new Vet();
        myVet.setName("Viorel");
        System.out.println(myVet.getName());
        System.out.println(myVet.getSpecialization());

        Food myFood=new Food();

        myFood.setFoodName("Royal Canin");
        System.out.println(myFood.getFoodName());


    }






    }
