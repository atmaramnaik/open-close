package oc.good;

public class Command {
    public String verb;
    public Operation operation;

    public Command(String verb, Operation operation) {
        this.verb = verb;
        this.operation = operation;
    }
}
