package SoftUni2;

public class Footman implements CommandListener {
       @Override
    public void handleCommand(CommandEvent command) {
        System.out.printf("Footman %s is panicking!\n", command.getCommand());
    }
}
