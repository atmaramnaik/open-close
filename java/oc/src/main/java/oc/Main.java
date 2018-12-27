package oc;

import oc.good.CommandProcessor;
import oc.good.Command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Command:");
        String command=reader.readLine();

//        oc.bad.CommandProcessor.process(command);

        CommandProcessor.commands.add(new Command("sing",(action)->System.out.println(action+"ing: We passed upon the stair")));
        CommandProcessor.commands.add(new Command("dance",(action)->System.out.println(action+"ing: Gangnam style")));
        CommandProcessor.commands.add(new Command("play",(action)->System.out.println(action+"ing: Chess")));
        CommandProcessor.commands.add(new Command("find",(action)->System.out.println(action+"ing: Socks")));
        CommandProcessor.process(command);
    }
}
