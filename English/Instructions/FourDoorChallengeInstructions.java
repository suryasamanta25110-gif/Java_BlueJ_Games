package English.Instructions;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class FourDoorChallengeInstructions
{
    public static void main()throws IOException
    {
        try
        {
            while(true)
            {
                long a;
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                System.out.println("\t\t\t\t\t\t   FOUR DOOR CHALLENGE");
                System.out.println("\t\t\t\t\t\tpowered by SS GAMING STUDIOS");
                System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.print("FourDoorChallenge is basically a score-based game where a player has to score more ");
                System.out.print("points to win. It is a single-player game.\nThe player is being provided with four ");
                System.out.print("gates. Three of them contains points - 1, 10 and 100, and the other has a guard ");
                System.out.print("behind\nit. It is not revealed to the player about the elements hidden behind each ");
                System.out.print("door. The player has to guess the gate containing\npoints and survive from the ");
                System.out.println("guard. The player scoring the most points win.");
                System.out.print("\nMake a choice. Inputs other than \'1\' or \'2\' is not acceptable and the next ");
                System.out.println("set of instructions will be shown.");
                System.out.println("1 - Next");
                System.out.println("2 - Skip");
                System.out.print("Enter your choice: ");
                a = Long.parseLong(br.readLine());
                System.out.print('\u000C');
                if(a == 2)
                    break;
                System.out.println("\t\t\t\t\t\t   FOUR DOOR CHALLENGE");
                System.out.println("\t\t\t\t\t\tpowered by SS GAMING STUDIOS");
                System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("The following screen will be displayed while playing:\n");
                System.out.println("\t\t\t\t    *    \t    *    \t    *    \t    *");
                System.out.println("\t\t\t\t  * * *  \t  * * *  \t  * * *  \t  * * *");
                System.out.println("\t\t\t\t* * * * *\t* * * * *\t* * * * *\t* * * * *");
                System.out.println("\t\t\t\t* * A * *\t* * B * *\t* * C * *\t* * D * *");
                System.out.println("\t\t\t\t* * * * *\t* * * * *\t* * * * *\t* * * * *");
                System.out.println("\t\t\t\t* * * * *\t* * * * *\t* * * * *\t* * * * *");
                System.out.println("\nThe elements present behind the doors will be unknown to the player.");
                System.out.println("Suppose this doors contain the following elements behind them:\n");
                System.out.println("\t\t\t\t    *    \t    *    \t    *    \t    *");
                System.out.println("\t\t\t\t  *   *  \t  *   *  \t  *   *  \t  *   *");
                System.out.println("\t\t\t\t*       *\t*       *\t*       *\t*       *");
                System.out.println("\t\t\t\t*  100  *\t*   1   *\t* GUARD *\t*   10  *");
                System.out.println("\t\t\t\t*       *\t*       *\t*       *\t*       *");
                System.out.println("\t\t\t\t* * * * *\t* * * * *\t* * * * *\t* * * * *");
                System.out.print("\nHere, if the player chooses door A, he/she will get 100 points. If he/she ");
                System.out.print("chooses door C, he/she loses, and so on. But\nremember that these information will ");
                System.out.println("be hidden from the player.");
                System.out.print("\nMake a choice. Inputs other than \'1\' or \'2\' is not acceptable and the next ");
                System.out.println("set of instructions will be shown.");
                System.out.println("1 - Next");
                System.out.println("2 - Skip");
                System.out.print("Enter your choice: ");
                a = Long.parseLong(br.readLine());
                System.out.print('\u000C');
                if(a == 2)
                    break;
                System.out.println("\t\t\t\t\t\t   FOUR DOOR CHALLENGE");
                System.out.println("\t\t\t\t\t\tpowered by SS GAMING STUDIOS");
                System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("\n\t\t\t\t    *    \t    *    \t    *    \t    *");
                System.out.println("\t\t\t\t  * * *  \t  * * *  \t  * * *  \t  * * *");
                System.out.println("\t\t\t\t* * * * *\t* * * * *\t* * * * *\t* * * * *");
                System.out.println("\t\t\t\t* * A * *\t* * B * *\t* * C * *\t* * D * *");
                System.out.println("\t\t\t\t* * * * *\t* * * * *\t* * * * *\t* * * * *");
                System.out.println("\t\t\t\t* * * * *\t* * * * *\t* * * * *\t* * * * *");
                System.out.print("\nHere, if the player wants to open door A, then he/she should enter \'A\'. If ");
                System.out.print("he\she wants to choose door D, then he\she must enter\n\'D\'. Conclusion is that ");
                System.out.print("the player has to enter the letter that is engraved on the door he/she wishes to ");
                System.out.println("open, and most\nimportantly, the letter should be in uppercase.");
                System.out.print("\nEnter any number to start: ");
                a = Long.parseLong(br.readLine());
                System.out.print('\u000C');
                break;
            }
        }
        catch(Exception ex)
        {
            System.out.println("\nException "+ ex);
            System.out.println("An error occured!");
            System.out.print("Please restart the program to interact.");
        }
    }
}