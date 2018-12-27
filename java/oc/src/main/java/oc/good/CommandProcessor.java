package oc.good;

import java.util.ArrayList;
import java.util.List;

public class CommandProcessor {
    public static List<Command> commands=new ArrayList<>();
    public static void process(String command){
        System.out.println("Starting Your Command");
        for (Command oCommand:
             commands) {
            if(oCommand.verb.equals(command))
            {
                oCommand.operation.doSomething(command);
            }
        }
        System.out.println("Done Your Command");
    }
}
