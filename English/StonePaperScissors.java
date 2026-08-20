package English;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
/**
 * This class contains the code for the famous game stone paper scissors.
 * 
 * @author Surya Samanta
 * @version 1.0
 */
public class StonePaperScissors {
    /**
     * This method contains the code for the game in which the player has to play against the computer.
     */
    public static void computer()throws IOException {
        int a, f = 0, g = 0;
        byte b, c;
        long e;
        String d;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            System.out.println("\t\t\t\t\t\t   STONE PAPER SCISSORS");
            System.out.println("\t\t\t\t\t\tpowered by SS GAMING STUDIOS");
            System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Enter the maximum number of points to win: ");
            a = Integer.parseInt(br.readLine());
            System.out.print("Enter your full name: ");
            d = br.readLine();
            System.out.println("\n\t\t\t\t\tPLAYER 1:\t\t\t\tPLAYER 2:");
            System.out.println("\t\t\t\t\t"+ d +"\t\tVS\t\tComputer");
            System.out.print("\nNOTE =================================================================================");
            System.out.println("=========================================");
            System.out.println("\tEnter \'1\' for STONE, \'2\' for SCISSORS and \3\' for SCISSORS.");
            System.out.print("========================================================================================");
            System.out.println("=======================================");
            System.out.println("Best Of Luck! Enter any number to proceed: ");
            e = Long.parseLong(br.readLine());
            System.out.print('\u000C');
            System.out.println("\t\t\t\t\t\t   STONE PAPER SCISSORS");
            System.out.println("\t\t\t\t\t\tpowered by SS GAMING STUDIOS");
            System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            while(f < a && g < a) {
                System.out.print("Enter: ");
                b = Byte.parseByte(br.readLine());
                while(b != 1 && b != 2 && b != 3) {
                    System.out.print("Wrong input! Please enter a number between 1 and 3: ");
                    b = Byte.parseByte(br.readLine());
                }
                System.out.print('\u000C');
                c = (byte)(Math.random() * 3.0 + 1.0);
                if(b == 1 && c == 1) {
                    System.out.println("\t\t\t\t\t\t   STONE PAPER SCISSORS");
                    System.out.println("\t\t\t\t\t\tpowered by SS GAMING STUDIOS");
                    System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(d +" has choosen ROCK.");
                    System.out.println("Computer has choosen ROCK.");
                    System.out.println("Points of "+ d +"\t:    "+ f);
                    System.out.println("Points of Computer\t:    "+ g);
                }
                else if(b == 1 && c == 2) {
                    System.out.println("\t\t\t\t\t\t   STONE PAPER SCISSORS");
                    System.out.println("\t\t\t\t\t\tpowered by SS GAMING STUDIOS");
                    System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(d +" has choosen ROCK.");
                    System.out.println("Computer has choosen PAPER.");
                    g++;
                    System.out.println("Points of "+ d +"\t:    "+ f);
                    System.out.println("Points of Computer\t:    "+ g);
                }
                else if(b == 1 && c == 3) {
                    System.out.println("\t\t\t\t\t\t   STONE PAPER SCISSORS");
                    System.out.println("\t\t\t\t\t\tpowered by SS GAMING STUDIOS");
                    System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(d +" has choosen ROCK.");
                    System.out.println("Computer has choosen SCISSORS.");
                    f++;
                    System.out.println("Points of "+ d +"\t:    "+ f);
                    System.out.println("Points of Computer\t:    "+ g);
                }
                else if(b == 2 && c == 1) {
                    System.out.println("\t\t\t\t\t\t   STONE PAPER SCISSORS");
                    System.out.println("\t\t\t\t\t\tpowered by SS GAMING STUDIOS");
                    System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(d +" has choosen PAPER.");
                    System.out.println("Computer has choosen ROCK.");
                    f++;
                    System.out.println("Points of "+ d +"\t:    "+ f);
                    System.out.println("Points of Computer\t:    "+ g);
                }
                else if(b == 2 && c == 2) {
                    System.out.println("\t\t\t\t\t\t   STONE PAPER SCISSORS");
                    System.out.println("\t\t\t\t\t\tpowered by SS GAMING STUDIOS");
                    System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(d +" has choosen PAPER.");
                    System.out.println("Computer has choosen PAPER.");
                    System.out.println("Points of "+ d +"\t:    "+ f);
                    System.out.println("Points of Computer\t:    "+ g);
                }
                else if(b == 2 && c == 3) {
                    System.out.println("\t\t\t\t\t\t   STONE PAPER SCISSORS");
                    System.out.println("\t\t\t\t\t\tpowered by SS GAMING STUDIOS");
                    System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(d +" has choosen PAPER.");
                    System.out.println("Computer has choosen SCISSORS.");
                    g++;
                    System.out.println("Points of "+ d +"\t:    "+ f);
                    System.out.println("Points of Computer\t:    "+ g);
                }
                else if(b == 3 && c == 1) {
                    System.out.println("\t\t\t\t\t\t   STONE PAPER SCISSORS");
                    System.out.println("\t\t\t\t\t\tpowered by SS GAMING STUDIOS");
                    System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(d +" has choosen SCISSORS.");
                    System.out.println("Computer has choosen ROCK.");
                    g++;
                    System.out.println("Points of "+ d +"\t:    "+ f);
                    System.out.println("Points of Computer\t:    "+ g);
                }
                else if(b == 3 && c == 2) {
                    System.out.println("\t\t\t\t\t\t   STONE PAPER SCISSORS");
                    System.out.println("\t\t\t\t\t\tpowered by SS GAMING STUDIOS");
                    System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(d +" has choosen SCISSORS.");
                    System.out.println("Computer has choosen PAPER.");
                    f++;
                    System.out.println("Points of "+ d +"\t:    "+ f);
                    System.out.println("Points of Computer\t:    "+ g);
                }
                else if(b == 3 && c == 3) {
                    System.out.println("\t\t\t\t\t\t   STONE PAPER SCISSORS");
                    System.out.println("\t\t\t\t\t\tpowered by SS GAMING STUDIOS");
                    System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(d +" has choosen SCISSORS.");
                    System.out.println("Computer has choosen SCISSORS.");
                    System.out.println("Points of "+ d +"\t:    "+ f);
                    System.out.println("Points of Computer\t:    "+ g);
                }
            }
            if(f == a) {
                System.out.println("\nHurrah! You have won the match.");
                System.out.println("Points of "+ d +"\t:    "+ f);
                System.out.println("Points of Computer\t:    "+ g);
                System.out.println("WINNER\t\t\t:    "+ d +"\n");
            }
            else {
                System.out.println("\nAlas! You have lost the match.");
                System.out.println("Points of "+ d +"\t:    "+ f);
                System.out.println("Points of Computer\t:    "+ g);
                System.out.println("WINNER\t\t\t:    Computer\n");
            }
            System.out.print("Enter any number to return to the home screen: ");
            e = Long.parseLong(br.readLine());
            System.out.print('\u000C');
        }
        catch(Exception ex) {
            System.out.println("\nException "+ ex);
            System.out.println("An error occured!");
            System.out.print("Please restart the program to interact.");
        }
    }
    /**
     * This method contains the code for the game in which the player has to play against another player.
     */
    public static void human()throws IOException {
        int a, f = 0, g = 0;
        byte b, c;
        long h;
        String d, e;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            System.out.println("\t\t\t\t\t\t   STONE PAPER SCISSORS");
            System.out.println("\t\t\t\t\t\tpowered by SS GAMING STUDIOS");
            System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Enter the maximum number of points to win: ");
            a = Integer.parseInt(br.readLine());
            System.out.print("Enter the full name of player 1: ");
            d = br.readLine();
            System.out.print("Enter the full name of player 2: ");
            e = br.readLine();
            System.out.println("\n\t\t\t\t\tPLAYER 1:\t\t\t\tPLAYER 2:");
            System.out.println("\t\t\t\t\t"+ d +"\t\tVS\t\t"+ e);
            System.out.print("\nNOTE =================================================================================");
            System.out.println("=========================================");
            System.out.println("\tEnter \'1\' for STONE, \'2\' for SCISSORS and \3\' for SCISSORS.");
            System.out.print("========================================================================================");
            System.out.println("=======================================");
            System.out.println("Best Of Luck! Enter any number to proceed: ");
            h = Long.parseLong(br.readLine());
            System.out.print('\u000C');
            System.out.println("\t\t\t\t\t\t   STONE PAPER SCISSORS");
            System.out.println("\t\t\t\t\t\tpowered by SS GAMING STUDIOS");
            System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            while(f < a && g < a) {
                System.out.print(d +", enter: ");
                b = Byte.parseByte(br.readLine());
                while(b != 1 && b != 2 && b != 3) {
                    System.out.print("Wrong input! Please enter a number between 1 and 3: ");
                    b = Byte.parseByte(br.readLine());
                }
                System.out.print('\u000C');
                System.out.println("\t\t\t\t\t\t   STONE PAPER SCISSORS");
                System.out.println("\t\t\t\t\t\tpowered by SS GAMING STUDIOS");
                System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.print(e +", enter: ");
                c = Byte.parseByte(br.readLine());
                while(c != 1 && c != 2 && c != 3) {
                    System.out.print("Wrong input! Please enter a number between 1 and 3: ");
                    c = Byte.parseByte(br.readLine());
                }
                System.out.print('\u000C');
                if(b == 1 && c == 1) {
                    System.out.println("\t\t\t\t\t\t   STONE PAPER SCISSORS");
                    System.out.println("\t\t\t\t\t\tpowered by SS GAMING STUDIOS");
                    System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(d +" has choosen ROCK.");
                    System.out.println(e +" has choosen ROCK.");
                    System.out.println("Points of "+ d +"\t:    "+ f);
                    System.out.println("Points of "+ e +"\t:    "+ g);
                }
                else if(b == 1 && c == 2) {
                    System.out.println("\t\t\t\t\t\t   STONE PAPER SCISSORS");
                    System.out.println("\t\t\t\t\t\tpowered by SS GAMING STUDIOS");
                    System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(d +" has choosen ROCK.");
                    System.out.println(e +" has choosen PAPER.");
                    g++;
                    System.out.println("Points of "+ d +"\t:    "+ f);
                    System.out.println("Points of "+ e +"\t:    "+ g);
                }
                else if(b == 1 && c == 3) {
                    System.out.println("\t\t\t\t\t\t   STONE PAPER SCISSORS");
                    System.out.println("\t\t\t\t\t\tpowered by SS GAMING STUDIOS");
                    System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(d +" has choosen ROCK.");
                    System.out.println(e +" has choosen SCISSORS.");
                    f++;
                    System.out.println("Points of "+ d +"\t:    "+ f);
                    System.out.println("Points of "+ e +"\t:    "+ g);
                }
                else if(b == 2 && c == 1) {
                    System.out.println("\t\t\t\t\t\t   STONE PAPER SCISSORS");
                    System.out.println("\t\t\t\t\t\tpowered by SS GAMING STUDIOS");
                    System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(d +" has choosen PAPER.");
                    System.out.println(e +" has choosen ROCK.");
                    f++;
                    System.out.println("Points of "+ d +"\t:    "+ f);
                    System.out.println("Points of "+ e +"\t:    "+ g);
                }
                else if(b == 2 && c == 2) {
                    System.out.println("\t\t\t\t\t\t   STONE PAPER SCISSORS");
                    System.out.println("\t\t\t\t\t\tpowered by SS GAMING STUDIOS");
                    System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(d +" has choosen PAPER.");
                    System.out.println(e +" has choosen PAPER.");
                    System.out.println("Points of "+ d +"\t:    "+ f);
                    System.out.println("Points of "+ e +"\t:    "+ g);
                }
                else if(b == 2 && c == 3) {
                    System.out.println("\t\t\t\t\t\t   STONE PAPER SCISSORS");
                    System.out.println("\t\t\t\t\t\tpowered by SS GAMING STUDIOS");
                    System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(d +" has choosen PAPER.");
                    System.out.println(e +" has choosen SCISSORS.");
                    g++;
                    System.out.println("Points of "+ d +"\t:    "+ f);
                    System.out.println("Points of "+ e +"\t:    "+ g);
                }
                else if(b == 3 && c == 1) {
                    System.out.println("\t\t\t\t\t\t   STONE PAPER SCISSORS");
                    System.out.println("\t\t\t\t\t\tpowered by SS GAMING STUDIOS");
                    System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(d +" has choosen SCISSORS.");
                    System.out.println(e +" has choosen ROCK.");
                    g++;
                    System.out.println("Points of "+ d +"\t:    "+ f);
                    System.out.println("Points of "+ e +"\t:    "+ g);
                }
                else if(b == 3 && c == 2) {
                    System.out.println("\t\t\t\t\t\t   STONE PAPER SCISSORS");
                    System.out.println("\t\t\t\t\t\tpowered by SS GAMING STUDIOS");
                    System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(d +" has choosen SCISSORS.");
                    System.out.println(e +" has choosen PAPER.");
                    f++;
                    System.out.println("Points of "+ d +"\t:    "+ f);
                    System.out.println("Points of "+ e +"\t:    "+ g);
                }
                else if(b == 3 && c == 3) {
                    System.out.println("\t\t\t\t\t\t   STONE PAPER SCISSORS");
                    System.out.println("\t\t\t\t\t\tpowered by SS GAMING STUDIOS");
                    System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(d +" has choosen SCISSORS.");
                    System.out.println(e +" has choosen SCISSORS.");
                    System.out.println("Points of "+ d +"\t:    "+ f);
                    System.out.println("Points of "+ e +"\t:    "+ g);
                }
            }
            if(f == a) {
                System.out.println("\nHurrah! "+ d +" has won the match.");
                System.out.println("Points of "+ d +"\t:    "+ f);
                System.out.println("Points of "+ e +"\t:    "+ g);
                System.out.println("WINNER\t\t\t:    "+ d +"\n");
            }
            else {
                System.out.println("\nHurrah! "+ e +" has won the match.");
                System.out.println("Points of "+ d +"\t:    "+ f);
                System.out.println("Points of "+ e +"\t:    "+ g);
                System.out.println("WINNER\t\t\t:    "+ e +"\n");
            }
            System.out.print("Enter any number to return to the home screen: ");
            h = Long.parseLong(br.readLine());
            System.out.print('\u000C');
        }
        catch(Exception ex) {
            System.out.println("\nException "+ ex);
            System.out.println("An error occured!");
            System.out.print("Please restart the program to interact.");
        }
    }
}