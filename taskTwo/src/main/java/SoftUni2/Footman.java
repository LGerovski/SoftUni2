package SoftUni2;

public class Footman extends Liege {
    private String name;
    private boolean alive;

    private String statement ="Footman " + this.name + " is panicking!\n";
    public Footman(String name){
        this.name=name;
        this.alive = true;
    }
    void print(){
        if (this.alive){
            System.out.printf("Footman %s is panicking!\n", name);
        }
    }
    void kill(){
        if (!this.alive){
            System.out.println("removed footman " + name);
        }
        this.alive = false;
    }

    public String getName(){
        return this.name;
    }
}
