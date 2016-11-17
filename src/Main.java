import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] names = new String [3];
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";
        //loops below!!
//first section runs only on first run. next section sets the limits for ending the loop, last section sets the increments.
        for (int i = 0; i<names.length;i++) {
            System.out.println(i);
        }

//same loop as above using the string names instead of numbers
        for(String name : names) {
            System.out.println(name);
        }
//same loop as above but with while
        int i = 0;
        while (i<4) {
            System.out.println("Hello");
        }

//another while example
        while(!correctName) {

            System.out.println("Enter Name");
            String name = scanner.nextLine();
            if(!name.equalsIgnoreCase("kyle")) {
                correctName = false;
        }

//do while example
        Scanner scanner = new Scanner (System.in);
        boolean correctName = false;
        do {

            System.out.println("Enter Name");
            String name = scanner.nextLine();
            if(name.equalsIgnoreCase("kyle")) {
                correctName = True;
            }
        }while (!correctName);

            //boxed and unboxed variables:
    Integer score = 1;
    score.parseInt()

        Person.isValidName("Bob Johnson");

        String name = "Peter Pan";

        System.out.println(Person.hair);

        String [] nameParts = name.split(" ");
        System.out.println(nameParts[0]);
        System.out.println(nameParts[1]);

        nameParts[1] = "Pan";

        name = nameParts[0] +" "+ nameParts[1];

        System.out.println(name);

            /*
            this is how you do a multi-line comment


          dynamic data structures below
             */


           String scoreString = "1";
            int score = Integer.parseInt(scoreString);
            Integer level = 1
            ArrayList<String> moreNames = new ArrayList();
            moreNames.add("jimmy");
            moreNames.add("jammy");
            moreNames.add("joon");

            moreNames.remove(0);

            System.out.println(moreNames.get(2));

            }


            HashMap<String, String> person = new HashMap();
            person.put("name", "Alice");
            person.put("address," "17 princess st");

            System.out.println(person.get("address"));

    }
}

