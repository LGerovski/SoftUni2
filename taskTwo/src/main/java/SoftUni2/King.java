package SoftUni2;

public class King implements Responsive {
    private String name;
    public King(String name){
        this.name=name;
    }
    @Override
    public void print() {
        System.out.printf("King %s is under attack!\n",this.name);
    }
}
