package SoftUni2;

public class Footman {
    private String name;
    private boolean alive;

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
