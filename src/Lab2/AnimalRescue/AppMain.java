package Lab2.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Cat myCat=new Cat();
        System.out.println(myCat.name);
        myCat.meows();

        Adopter myAdopter= new Adopter();
        System.out.println(myAdopter.name);

        AnimalFood myAnimalFood= new AnimalFood();
        System.out.println(myAnimalFood.foodName);

        RecreationActivity myRecActivity=new RecreationActivity();
        System.out.println(myRecActivity.name);

        Vet myVet=new Vet();
        System.out.println(myVet.vetName);


    }






    }
