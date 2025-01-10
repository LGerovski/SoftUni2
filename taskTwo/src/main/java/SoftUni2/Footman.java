package SoftUni2;

public class Footman extends Liege {
    private String name;
    private boolean alive;

    public Footman(String name){
        this.name=name;
        this.alive = true;
    }
    @Override
    public void print(){
        if (this.alive){
            System.out.printf("Footman %s is panicking!\n", name);
        }
    }
    @Override
    public void kill(){
        if (!this.alive){
            System.out.println("removed footman " + name);
        }
        this.alive = false;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
