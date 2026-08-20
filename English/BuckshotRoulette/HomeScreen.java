package English.BuckshotRoulette;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import English.Instructions.LoadingScreen;
public class HomeScreen {
    public static void main(int x) throws IOException, InterruptedException {
        int a;
        String[] b = new String[4];
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        LoadingScreen lc = new LoadingScreen();
        FourPlayer fp = new FourPlayer();
        Instructions ins = new Instructions();
        try {
            if (x == 0)
                ins.display();
            do {
                System.out.println("\t\t\t\t\t\t      BUCKSHOT ROULETTE");
                System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Choose a mode to play :");
                System.out.println("    1 - Single player mode (Against computer)           (under development)");
                System.out.println("    2 - Double-player mode (Requires 2 players)         (under development)");
                System.out.println("    3 - Multi-player mode  (Requires atleast 3 players)");
                System.out.println("    4 - Read instructions");
                System.out.println("    5 - Go back");
                System.out.print("\tEnter your choice : ");
                a = Integer.parseInt(br.readLine());
                if (a < 1 || a > 5 || a == 1 || a == 2)
                    while (a < 1 || a > 5 || a == 1 || a == 2) {
                        if (a < 1 || a > 5)
                            System.out.print("\tInvalid input! Please enter a valid choice : ");
                        else if (a == 1 || a == 2)
                            System.out.print("\tThis mode is currently under development. Try out other modes : ");
                        a = Integer.parseInt(br.readLine());
                    }
                if (a == 4) {
                    System.out.print('\u000C');
                    ins.instructions();
                }
            } while (a == 4);
            switch (a) {
                /*case 1:
                    b[1] = "COMPUTER";
                    b[2] = b[3] = null;
                    System.out.print("\nEnter your name : ");
                    b[0] = br.readLine().toUpperCase();
                    System.out.println("\n\t\t\t\tPlayer 1:\t\tVS\t\tPlayer 2:");
                    System.out.print("\t\t\t\t"+ b[0]);
                    if (b[0].length() < 8)
                        System.out.print("\t");
                    if (b[0].length() < 16)
                        System.out.print("\t");
                    if (b[0].length() < 24)
                        System.out.print("\t");
                    if (b[0].length() < 32)
                        System.out.print("\t");
                    if (b[0].length() < 40)
                        System.out.print("\t");
                    System.out.println(b[1]);
                    break;
                case 2:
                    b[2] = b[3] = null;
                    System.out.println("\nEnter the names of the players : ");
                    System.out.print("\tPlayer 1 : ");
                    b[0] = br.readLine().toUpperCase();
                    System.out.print("\tPlayer 2 : ");
                    b[1] = br.readLine().toUpperCase();
                    System.out.println("\n\t\t\t\tPlayer 1:\t\tVS\t\tPlayer 2:");
                    System.out.print("\t\t\t\t"+ b[0]);
                    if (b[0].length() < 8)
                        System.out.print("\t");
                    if (b[0].length() < 16)
                        System.out.print("\t");
                    if (b[0].length() < 24)
                        System.out.print("\t");
                    if (b[0].length() < 32)
                        System.out.print("\t");
                    if (b[0].length() < 40)
                        System.out.print("\t");
                    System.out.println(b[1]);
                    break;*/
                case 3:
                    System.out.println("\nEnter the names of the players : ");
                    System.out.print("\tPlayer 1 : ");
                    b[0] = br.readLine().toUpperCase();
                    System.out.print("\tPlayer 2 : ");
                    b[1] = br.readLine().toUpperCase();
                    System.out.print("\tPlayer 3 : ");
                    b[2] = br.readLine().toUpperCase();
                    System.out.print("\tPlayer 4 : ");
                    b[3] = br.readLine().toUpperCase();
                    System.out.println("\n\t\t\t\tPlayer 1:\t\t\t\tPlayer 2:");
                    System.out.print("\t\t\t\t"+ b[0]);
                    if (b[0].length() < 8)
                        System.out.print("\t");
                    if (b[0].length() < 16)
                        System.out.print("\t");
                    if (b[0].length() < 24)
                        System.out.print("\t");
                    if (b[0].length() < 32)
                        System.out.print("\t");
                    if (b[0].length() < 40)
                        System.out.print("\t");
                    System.out.println(b[1]);
                    System.out.println("\t\t\t\t\t\t\tVS");
                    System.out.println("\t\t\t\tPlayer 3:\t\t\t\tPlayer 4:");
                    System.out.print("\t\t\t\t"+ b[2]);
                    if (b[2].length() < 8)
                        System.out.print("\t");
                    if (b[2].length() < 16)
                        System.out.print("\t");
                    if (b[2].length() < 24)
                        System.out.print("\t");
                    if (b[2].length() < 32)
                        System.out.print("\t");
                    if (b[2].length() < 40)
                        System.out.print("\t");
                    System.out.println(b[3]);
            }
            if (a != 5) {
                System.out.print("\nStarting the game. Please wait");
                Thread.sleep(1000);
                System.out.print(".");
                Thread.sleep(1000);
                System.out.print(".");
                Thread.sleep(1000);
                System.out.print(".");
                Thread.sleep(1000);
                System.out.print('\u000C');
                lc.main();
            }
            System.out.print('\u000C');
            if (a == 3)
                fp.main(b);
        } catch (Exception ex) {
            System.out.println("\nAn error occured!");
            System.out.println("Error description : "+ ex);
            System.out.print("Returning to home screen. Please wait");
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.print('\u000C');
        }
    }
}