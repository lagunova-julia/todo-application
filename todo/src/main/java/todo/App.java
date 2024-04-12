package todo;

import picocli.CommandLine;
import todo.commands.HelloCommand;


public class App {

    public static void main(String[] args) {
        new CommandLine(new HelloCommand()).execute(args);
    }


}




