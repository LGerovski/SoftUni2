package SoftUni2;

import java.util.EventObject;

public class CommandEvent extends EventObject {
    private String command;

    public CommandEvent(Object source, String command) {
        super(source);
        this.command = command;
    }

    public String getCommand(){return command;}


}
