import java.util.Scanner;

public class Subtrings {
    static void substring(){

        // .substring() = A metho used to extract a portion of a string
        //                .substring(start, end)

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        IO.print("Enter your email: ");

        email = scanner.nextLine();

        if(email.contains("@")) {
    //        String username = email.substring(0, 9);
    //        String domain = email.substring(10);
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            IO.println(domain);
            IO.println(username);
        }
        else{
            IO.println("Emails must contain @");
        }



        scanner.close();
    }
}
