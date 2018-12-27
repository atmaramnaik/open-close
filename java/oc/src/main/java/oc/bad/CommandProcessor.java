package oc.bad;

public class CommandProcessor {
    public static void process(String command){
        System.out.println("Starting Your Command");
        switch (command){
            case "sing":
                System.out.println(command+"ing: We passed upon the stair");
                break;
            case "dance":
                System.out.println(command+"ing: Gangnam style");
                break;
            case "play":
                System.out.println(command+"ing: Gangnam style");
                break;
        }
        System.out.println("Done Your Command");
    }
}
