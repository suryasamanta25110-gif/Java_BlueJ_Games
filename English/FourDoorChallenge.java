package English;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import English.Instructions.FourDoorChallengeInstructions;
public class FourDoorChallenge {
    public static void game()throws IOException {
        int c, d, e, f, i = 0, j = 0;
        long b;
        char h;
        boolean g = false;
        String a;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        FourDoorChallengeInstructions fdci = new FourDoorChallengeInstructions();
        try {
            fdci.main();
            System.out.println("\t\t\t\t\t\t   FOUR DOOR CHALLENGE");
            System.out.println("\t\t\t\t\t\tpowered by SS GAMING STUDIOS");
            System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Enter your name: ");
            a = br.readLine();
            System.out.print("\nNOTE =================================================================================");
            System.out.println("=========================================");
            System.out.println("\tOnly \'A\', \'B\', \'C\' and \'D\' are acceptable. ");
            System.out.print("========================================================================================");
            System.out.println("=======================================");
            System.out.println("Best Of Luck! Enter any number to proceed: ");
            b = Long.parseLong(br.readLine());
            System.out.print('\u000C');
            System.out.println("\t\t\t\t\t\t   FOUR DOOR CHALLENGE");
            System.out.println("\t\t\t\t\t\tpowered by SS GAMING STUDIOS");
            System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            while(g == false) {
                c = (int)(Math.random() * 4.0);
                d = (int)(Math.random() * 4.0);
                while(d == c)
                    d = (int)(Math.random() * 4.0);
                e = (int)(Math.random() * 4.0);
                while(e == c || e == d)
                    e = (int)(Math.random() * 4.0);
                f = (int)(Math.random() * 4.0);
                while(f == c || f == d || f == e)
                    f = (int)(Math.random() * 4.0);
                System.out.println("Choose a gate:\n");
                System.out.println("\t\t\t\t    *    \t    *    \t    *    \t    *");
                System.out.println("\t\t\t\t  * * *  \t  * * *  \t  * * *  \t  * * *");
                System.out.println("\t\t\t\t* * * * *\t* * * * *\t* * * * *\t* * * * *");
                System.out.println("\t\t\t\t* * A * *\t* * B * *\t* * C * *\t* * D * *");
                System.out.println("\t\t\t\t* * * * *\t* * * * *\t* * * * *\t* * * * *");
                System.out.println("\t\t\t\t* * * * *\t* * * * *\t* * * * *\t* * * * *");
                System.out.print("\nEnter your choice: ");
                h = br.readLine().charAt(0);
                while(h != 'A' && h != 'B' && h != 'C' && h != 'D') {
                    System.out.print("Invalid input! Please enter \'A\', \'B\', \'C\' or \'D\': ");
                    h = br.readLine().charAt(0);
                }
                System.out.print('\u000C');
                System.out.println("\t\t\t\t\t\t   FOUR DOOR CHALLENGE");
                System.out.println("\t\t\t\t\t\tpowered by SS GAMING STUDIOS");
                System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("You have choosen gate "+ h +".");
                System.out.println("Let\'s open the gate...\n");
                if(h == 'A') {
                    System.out.println("\t\t\t\t    *    \t    *    \t    *    \t    *");
                    System.out.println("\t\t\t\t  *   *  \t  * * *  \t  * * *  \t  * * *");
                    System.out.println("\t\t\t\t*       *\t* * * * *\t* * * * *\t* * * * *");
                    if(c == 0) {
                        System.out.println("\t\t\t\t*   1   *\t* * B * *\t* * C * *\t* * D * *");
                        g = false;
                        j = i;
                        i += 1;
                    }
                    else if(c == 1) {
                        System.out.println("\t\t\t\t*   10  *\t* * B * *\t* * C * *\t* * D * *");
                        g = false;
                        j = i;
                        i += 10;
                    }
                    else if(c == 2) {
                        System.out.println("\t\t\t\t*  100  *\t* * B * *\t* * C * *\t* * D * *");
                        g = false;
                        j = i;
                        i += 100;
                    }
                    else if(c == 3) {
                        System.out.println("\t\t\t\t* GUARD *\t* * B * *\t* * C * *\t* * D * *");
                        g = true;
                        j = i;
                        i += -10;
                    }
                    System.out.println("\t\t\t\t*       *\t* * * * *\t* * * * *\t* * * * *");
                    System.out.println("\t\t\t\t* * * * *\t* * * * *\t* * * * *\t* * * * *\n");
                }
                else if(h == 'B') {
                    System.out.println("\t\t\t\t    *    \t    *    \t    *    \t    *");
                    System.out.println("\t\t\t\t  * * *  \t  *   *  \t  * * *  \t  * * *");
                    System.out.println("\t\t\t\t* * * * *\t*       *\t* * * * *\t* * * * *");
                    if(c == 0) {
                        System.out.println("\t\t\t\t* * * * *\t*   1   *\t* * C * *\t* * D * *");
                        g = false;
                        j = i;
                        i += 1;
                    }
                    else if(c == 1) {
                        System.out.println("\t\t\t\t* * * * *\t*   10  *\t* * C * *\t* * D * *");
                        g = false;
                        j = i;
                        i += 10;
                    }
                    else if(c == 2) {
                        System.out.println("\t\t\t\t* * * * *\t*  100  *\t* * C * *\t* * D * *");
                        g = false;
                        j = i;
                        i += 100;
                    }
                    else if(c == 3) {
                        System.out.println("\t\t\t\t* * * * *\t* GUARD *\t* * C * *\t* * D * *");
                        g = true;
                        j = i;
                        i += -10;
                    }
                    System.out.println("\t\t\t\t* * * * *\t*       *\t* * * * *\t* * * * *");
                    System.out.println("\t\t\t\t* * * * *\t* * * * *\t* * * * *\t* * * * *\n");
                }
                else if(h == 'C') {
                    System.out.println("\t\t\t\t    *    \t    *    \t    *    \t    *");
                    System.out.println("\t\t\t\t  * * *  \t  * * *  \t  *   *  \t  * * *");
                    System.out.println("\t\t\t\t* * * * *\t* * * * *\t*       *\t* * * * *");
                    if(c == 0) {
                        System.out.println("\t\t\t\t* * * * *\t* * B * *\t*   1   *\t* * D * *");
                        g = false;
                        j = i;
                        i += 1;
                    }
                    else if(c == 1) {
                        System.out.println("\t\t\t\t* * * * *\t* * B * *\t*   10  *\t* * D * *");
                        g = false;
                        j = i;
                        i += 10;
                    }
                    else if(c == 2) {
                        System.out.println("\t\t\t\t* * * * *\t* * B * *\t*  100  *\t* * D * *");
                        g = false;
                        j = i;
                        i += 100;
                    }
                    else if(c == 3) {
                        System.out.println("\t\t\t\t* * * * *\t* * B * *\t* GUARD *\t* * D * *");
                        g = true;
                        j = i;
                        i += -10;
                    }
                    System.out.println("\t\t\t\t* * * * *\t* * * * *\t*       *\t* * * * *");
                    System.out.println("\t\t\t\t* * * * *\t* * * * *\t* * * * *\t* * * * *\n");
                }
                else if(h == 'D') {
                    System.out.println("\t\t\t\t    *    \t    *    \t    *    \t    *");
                    System.out.println("\t\t\t\t  * * *  \t  * * *  \t  * * *  \t  *   *");
                    System.out.println("\t\t\t\t* * * * *\t* * * * *\t* * * * *\t*       *");
                    if(c == 0) {
                        System.out.println("\t\t\t\t* * * * *\t* * B * *\t* * C * *\t*   1   *");
                        g = false;
                        j = i;
                        i += 1;
                    }
                    else if(c == 1) {
                        System.out.println("\t\t\t\t* * * * *\t* * B * *\t* * C * *\t*   10  *");
                        g = false;
                        j = i;
                        i += 10;
                    }
                    else if(c == 2) {
                        System.out.println("\t\t\t\t* * * * *\t* * B * *\t* * C * *\t*  100  *");
                        g = false;
                        j = i;
                        i += 100;
                    }
                    else if(c == 3) {
                        System.out.println("\t\t\t\t* * * * *\t* * B * *\t* * C * *\t* GUARD *");
                        g = true;
                        j = i;
                        i += -10;
                    }
                    System.out.println("\t\t\t\t* * * * *\t* * * * *\t* * * * *\t*       *");
                    System.out.println("\t\t\t\t* * * * *\t* * * * *\t* * * * *\t* * * * *\n");
                }
                if(g == false) {
                    if(i - j == 1)
                        System.out.println("Good! You have scored 1 point.");
                    else if(i - j == 10)
                        System.out.println("Superb! You have scored 10 points.");
                    else if(i - j == 100)
                        System.out.println("Excellent! You have scored 100 points.");
                    System.out.println("Your current score: "+ i);
                }
            }
            System.out.println("Ah! That hurts!");
            System.out.println("No problem. Better luck next time.");
            System.out.println("Your total score: "+ j);
            System.out.print("\nEnter any number to return to the home screen: ");
            b = Long.parseLong(br.readLine());
            System.out.print('\u000C');
        }
        catch(Exception ex) {
            System.out.println("\nException "+ ex);
            System.out.println("An error occured!");
            System.out.print("Please restart the program to interact.");
        }
    }
}