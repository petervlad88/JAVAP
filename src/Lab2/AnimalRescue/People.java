package Lab2.AnimalRescue;

public class People {
    private String name;
    private String nationality;
    private int availableAmount;
    private int age;
    private String specialization;


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getNationality(){
        return nationality;
    }
    public void setNationality(String nationality){
        this.nationality=nationality;
    }

    public int getAvailableAmount(){
        return availableAmount;
    }
    public void setAvailableAmount(int availableAmount){
        this.availableAmount=availableAmount;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getSpecialization(){
        return specialization;

    }
    public void setSpecialization(String specialization){
        this.specialization=specialization;

    }

    public void sleep(){
        System.out.println("sleeping");
    }

    public void work(){
        System.out.println("working ");
    }

    public void eat(){
        System.out.println("food");
    }

    public void run(){
        System.out.println("running");
    }

    public void speaks(){
        System.out.println("speaking");
    }

    public void wash(){
        System.out.println("shower");
    }




}
