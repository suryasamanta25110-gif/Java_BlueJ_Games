package English;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import English.BuckshotRoulette.HomeScreen;
public class EnglishHomeScreen {
    public static void main(String[] args)throws IOException {
        int a;
        int[] b = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            do {
                System.out.println("\t\t\t\t\t\t          GAMES");
                System.out.println("\t\t\t\t\t\tpowered by SS GAMING STUDIOS");
                System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Choose the game you want to play:");
                System.out.println("    1 - Hand Cricket");
                System.out.println("    2 - Stone Paper Scissors");
                System.out.println("    3 - Tic Tac Toe");
                System.out.println("    4 - Four Door Challenge");
                System.out.println("    5 - Snake And Ladder");
                System.out.println("    6 - Yazy");
                System.out.println("    7 - Sudoku");
                System.out.println("    8 - Mancala");
                System.out.println("    9 - Buckshot Roulette");
                System.out.println("   10 - Go back");
                System.out.print("\tEnter your choice: ");
                a = Byte.parseByte(br.readLine());
                System.out.print('\u000C');
                switch(a) {
                    case 2:
                        System.out.println("\t\t\t\t\t\t          GAMES");
                        System.out.println("\t\t\t\t\t\tpowered by SS GAMING STUDIOS");
                        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("Choose your opponent: ");
                        System.out.println("    1 - Computer");
                        System.out.println("    2 - Human");
                        System.out.println("    3 - Back");
                        System.out.print("\tEnter your choice: ");
                        a = Byte.parseByte(br.readLine());
                        System.out.print('\u000C');
                        if(a == 1)
                            StonePaperScissors.computer();
                        else if(a == 2)
                            StonePaperScissors.human();
                        else
                            while(a != 1&& a != 2 && a != 3) {
                                System.out.print("Invalid input! Please enter a number between 1 and 3: ");
                                a = Byte.parseByte(br.readLine());
                            }
                        break;
                    case 4:
                        FourDoorChallenge.game();
                        break;
                    case 5:
                        SnakeAndLadder.main(b[4]);
                        b[4]++;
                        break;
                    case 6:
                        Yazy.display();
                        break;
                    case 7:
                        Sudoku.instructions();
                        break;
                    case 8:
                        Mancala.main();
                        break;
                    case 9:
                        HomeScreen hs = new HomeScreen();
                        hs.main(b[8]);
                        b[8]++;
                }
            } while(a != 10);
        }
        catch(Exception ex) {
            System.out.println("\nException "+ ex);
            System.out.println("An error occured!");
            System.out.print("Please restart the program to interact...");
        }
    }
}