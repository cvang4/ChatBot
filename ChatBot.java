import java.text.BreakIterator;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        
        greeting();
        repeat();
        guessAge();
        counting();
        knowledge();
        story();
        days();

    }

    //greeting
    public static void greeting() {
        Scanner scanner  = new Scanner (System.in);

        System.out.println("Hello what is your name?");
        String name = scanner.nextLine();
    }

    //Asking user to repeat name
    public static void repeat() {
        Scanner scanner  = new Scanner (System.in);

        System.out.println("Can you type your name again?");
        String name2 = scanner.nextLine();
        System.out.println("Hi " + name2);

    }

    //guessAge Method
    public  static void guessAge() {
        System.out.println("Can I guess your age? Please enter the year you were born.");

        Scanner scanner = new Scanner (System.in);
        int year = scanner.nextInt();

        if (year >= 2010) {
            System.out.println("Oh wow you are still a young padawan. I'm guessing 12 years or younger.");
        }
        else if (year >= 2000 && year < 2010) {
            System.out.println("Ok seems like you are still young. In your teens or early 20s.");
        }
        else if (year >= 1990 && year < 2000){
            System.out.println("Sounds like you are in your prime. Late 20s or early 30s.");
        }
        else if (year >= 1970 && year < 1990) {
            System.out.println("You are in your late 30s through 50. The years are getting on you phsically, but this is when you are the most wisest.");
        }
        else {
            System.out.println("You're in your 50s or older. You might be getting closer to planning for retirment.");
        }
    }

    //Counting to a number
    public static void counting() {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Would you like me to count a number? Enter any number less than 100.");
        int number = scanner.nextInt();

        int i = number;
        for (i = number; i <= 100; i++) {
            System.out.println("The number is " + i);

        }
    }

    //Programming knowledge
    public static void knowledge() {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Let's test your knowledge");

        while (true){
        System.out.println("What programming language are you using to interact with me?");
        System.out.println("A - CSS");
        System.out.println("B - Java");
        System.out.println("C - HTML");
        System.out.println("D - English");
        String answer = scanner.nextLine();

        if (answer.equals("A")) {
            System.out.println("Remember CSS is mainly used for styling.");
            continue;
        }

        if (answer.equals("B")) {
            System.out.println("Correct!");
            break;
        }

        if (answer.equals("C")) {
            System.out.println("HTML is mainly for structuring websites. Try again.");
            continue;
        }

        if (answer.equals("D")) {
            System.out.println("The program is written in English yes... quit joking with me.");
            continue;
        }

        }
    }

    //Requirements for level 2. Story.
    public static void story() {
        
        Scanner scanner = new Scanner (System.in);

        System.out.println("Let's make a story about you now.");
        System.out.println("If Pokémon were real, name one of your favorites?");
        String pokemon = scanner.nextLine();
        System.out.println("What would you use your Pokémon for?");
        String use = scanner.nextLine();

        System.out.println("Here is your Pokémon adventure story: ");
        System.out.println("If you had a Pokémon it would be " + pokemon + ".");
        System.out.println("With powers come great responsibility and choices. You have always wanted a buddy with abilities for " + use + ".");
        System.out.println("Now you and " + pokemon + " can travel the world and " + use + ".");

    }

    //Requirements for level 3. Switch statement.
    public static void days() {
        
        Scanner scanner = new Scanner (System.in);

        System.out.println("Now before you go, you can get to know me a little better. Choose a number 1 through 7 to understand how one of my days are.");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Sundays are me prepping for the weekdays.");
                break;
            case 2:
                System.out.println("Mondays are the worst. First day of the work week :(");
                break;
            case 3:
                System.out.println("Taco Tuesdays. Tacos and margaritas get me through the week!");
                break;
            case 4:
                System.out.println("Wednesday hump days. Almost there!");
                break;
            case 5:
                System.out.println("Thursdays, my mind is on the weekend already.");
                break;
            case 6:
                System.out.println("Fridays, you can catch me slacking off ;)");
                break;
            case 7:
                System.out.println("Saturdays are the best!");
                break;
            default:
                System.out.println("If I'm not looking at the day, I must be on vacation somewhere.");
        }
    }
}
