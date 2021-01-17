package Lab2.AnimalRescue;

public abstract class RecreationActivity {

    private String name;



    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public abstract void running();



}
