package SoftUni2;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

public class CommandDispatcher {
    public String value;

    List<CommandListener> listeners = new ArrayList<>();

    public void addEventListener(CommandListener name){
        listeners.add(name);
    };

    public void removeEventListener(EventListener name){
        listeners.remove(name);
    };

    public void execCommand(){
        CommandEvent command = new CommandEvent(this, value);
        for (CommandListener listener : listeners) {
            listener.handleCommand(command);
        }
    };

}
