
import java.util.Random;
public class Q8 {
   


    public static void main(String[] args) {
        Random random = new Random();

        // Generate a random integer between 1 and 12
        int monthNumber = random.nextInt(12) + 1;

        // Array of month names
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        // Display the month name
        System.out.println("The random month is: " + months[monthNumber - 1]);
    }
}

