package SoftUni2;

public class King implements CommandListener {

    @Override
    public void handleCommand(CommandEvent command) {
        System.out.printf("King %s is under attack!\n", command.getCommand());
    }
}
