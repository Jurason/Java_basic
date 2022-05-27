import java.util.Scanner;

public class Learn {

    public void function() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        do {
            System.out.println("Enter username");
            String userName = myObj.nextLine();  // Read user input

                if (userName.length() >= 3 && userName.length() <= 20) {
                    System.out.println("Username available");
                    System.out.println("Username is: " + userName);  // Output user input
                    break;
                } else {
                    System.out.println("Username unavailable");
                }
        } while (true);

    }

}

