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

        myCat.eat();





        Adopter myAdopter= new Adopter();

        myAdopter.setAvailableAmount(200);
        System.out.println(myAdopter.getAvailableAmount());

        myAdopter.setName("Vlad");
        System.out.println(myAdopter.getName());

        myAdopter.setNationality("Roman");
        System.out.println(myAdopter.getNationality());

        myAdopter.setAge(30);
        System.out.println(myAdopter.getAge());


        AnimalFood myAnimalFood= new AnimalFood();


        myAnimalFood.setFoodName("Royal Canin");
        System.out.println(myAnimalFood.getFoodName());

        myAnimalFood.setQuantityInKg(2.5);
        System.out.println(myAnimalFood.getQuantityInKg());


        RecreationActivity myRecActivity=new RecreationActivity();

        myRecActivity.setName("runnning");
        System.out.println(myRecActivity.getName());


        Vet myVet=new Vet();
        myVet.setName("Viorel");
        System.out.println(myVet.getName());

        myVet.setSpecialization("Doctor");
        System.out.println(myVet.getSpecialization());

        Food myFood=new Food();

        myFood.setFoodName("Royal Canin");
        System.out.println(myFood.getFoodName());

        Persian myPersianCat = new Persian();

        myPersianCat.setName("Zora");
        System.out.println(myPersianCat.getName());

        myPersianCat.setAge(4);
        System.out.println(myPersianCat.getAge());


        Animal myAnimal = new Animal();

        myAnimal.eat();
        myAnimal.run();








    }






    }
