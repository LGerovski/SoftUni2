package SoftUni2;

public class RoyalGuard {
    private String name;
    private boolean alive;

    public RoyalGuard(String name){
        this.name=name;
        this.alive=true;
    }
    void print(){
        if (this.alive){
            System.out.printf("Royal Guard %s is defending!\n", name);
        }
    }
    public void kill(){
        if (!this.alive){
            System.out.println("removed royalGuard " + this.name);
        }
        this.alive=false;
    }
    public String getName(){
        return this.name;
    }
}
