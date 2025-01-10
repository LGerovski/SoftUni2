package SoftUni2;

public class RoyalGuard extends Liege{
    private String name;
    private boolean alive;

    public RoyalGuard(String name){
        this.name=name;
        this.alive=true;
    }

    @Override
    public void kill() {
        if (!this.alive){
            System.out.println("removed royalGuard " + this.name);
        }
        this.alive=false;
    }

    @Override
    public void print() {
        if (this.alive){
            System.out.printf("Royal Guard %s is defending!\n", name);
        }
    }

    @Override
    public String getName() {
        return this.name;
    }
}
