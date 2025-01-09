package SoftUni2;

abstract class Liege implements Responsive, Killable{
    private String name;
    private boolean alive;
    public String getName(){
        return this.name;
    }
}
