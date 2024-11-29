package SoftUni2;

public class RoyalGuard implements CommandListener{
    private String name = "Gosho";

    @Override
    public void handleCommand(CommandEvent command) {
        System.out.printf("Royal Guard %s is defending!\n", command.getCommand());
    }
}
