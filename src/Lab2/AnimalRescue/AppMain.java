package Lab2.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {

        Cat myCat=new Cat();
        System.out.println(myCat.getName());
        myCat.meows();
        System.out.println((myCat.getHealth()));


        Adopter myAdopter= new Adopter();
        System.out.println(myAdopter.getName());
        System.out.println(myAdopter.getNationality());
        System.out.println(myAdopter.getAvailableAmount());


        AnimalFood myAnimalFood= new AnimalFood();
        System.out.println(myAnimalFood.getFoodName());


        RecreationActivity myRecActivity=new RecreationActivity();
        System.out.println(myRecActivity.getName());


        Vet myVet=new Vet();
        System.out.println(myVet.getVetName());
        System.out.println(myVet.getSpecialization());


    }






    }
