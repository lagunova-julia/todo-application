package todo;

import picocli.CommandLine;



public class App {

    public static void main(String[] args) {
        new CommandLine(new HelloCommand()).execute("-h");
    }


}

@CommandLine.Command(name = "hello", version = "1.0.0", mixinStandardHelpOptions = true, requiredOptionMarker = '*',
description = "This is a simple HelloCommand")
class HelloCommand implements Runnable {

    @CommandLine.Option(names={"-u", "--user"}, required = false, description = "Provide User Name")
    String user;

    @Override
    public void run() {
        if (user == null || user.length() == 0)
            System.out.println("[hello] Hello World!");
        else
            System.out.println("[hello] Hello " + user);
    }
}



