package Lab2.AnimalRescue;

public abstract class People {
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

    public abstract void sleep();


    public abstract void work();


    public abstract void eat();


    public abstract void run();


    public abstract void speaks();


    public abstract void wash();

    }




