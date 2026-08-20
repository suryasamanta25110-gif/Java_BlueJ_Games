package English.BuckshotRoulette;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Instructions {
    public static void display()throws IOException, InterruptedException {
        long a;
        char b;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        Thread.sleep(1500);
        System.out.print('\u000C');
        System.out.println("                                                                                                                             ");
        System.out.println("                                                                                                                             ");
        System.out.println("                                                                                                                             ");
        System.out.println("                                                                                                                             ");
        System.out.println("                                                                                                                             ");
        System.out.println("      *********     ***       ***    *******    ***        ***      ****      ***        ***    *******    *************     ");
        System.out.println("      ***********   ***       ***  ***     ***  ***      ***     **********   ***        ***  ***     ***  *************     ");
        System.out.println("      ***       *** ***       *** ***        ** ***    ***     ****      **** ***        *** ***       ***      ***          ");
        System.out.println("      ***       *** ***       *** ***           ***  ***       ****           ***        *** ***       ***      ***          ");
        System.out.println("      ***********   ***       *** ***           ******           ******       ************** ***       ***      ***          ");
        System.out.println("      ***********   ***       *** ***           *****                ******   ************** ***       ***      ***          ");
        System.out.println("      ***       *** ***       *** ***           *******                  **** ***        *** ***       ***      ***          ");
        System.out.println("      ***       *** ***       *** ***        ** ***   ***      ****      **** ***        *** ***       ***      ***          ");
        System.out.println("      ***********    ***     ***   ***     ***  ***     ***      **********   ***        ***  ***     ***       ***          ");
        System.out.println("      *********        *******       *******    ***       ***       ****      ***        ***    *******         ***          ");
        Thread.sleep(1000);
        System.out.print('\u000C');
        System.out.println("                                                                                                                           ");
        System.out.println("                                                                                                                           ");
        System.out.println("                                                                                                                           ");
        System.out.println("                                                                                                                           ");
        System.out.println("                                                                                                                           ");
        System.out.println("      *********     ***       ***    *******    ***        ***      ****      ***        ***    *******    *************     ");
        System.out.println("      ***********   ***       ***  ***     ***  ***      ***     **********   ***        ***  ***     ***  *************     ");
        System.out.println("      ***       *** ***       *** ***        ** ***    ***     ****      **** ***        *** ***       ***      ***          ");
        System.out.println("      ***       *** ***       *** ***           ***  ***       ****           ***        *** ***       ***      ***          ");
        System.out.println("      ***********   ***       *** ***           ******           ******       ************** ***       ***      ***          ");
        System.out.println("      ***********   ***       *** ***           *****                ******   ************** ***       ***      ***          ");
        System.out.println("      ***       *** ***       *** ***           *******                  **** ***        *** ***       ***      ***          ");
        System.out.println("      ***       *** ***       *** ***        ** ***   ***      ****      **** ***        *** ***       ***      ***          ");
        System.out.println("      ***********    ***     ***   ***     ***  ***     ***      **********   ***        ***  ***     ***       ***          ");
        System.out.println("      *********        *******       *******    ***       ***       ****      ***        ***    *******         ***          ");
        System.out.println("                                                                                                                             ");
        System.out.println("       *********        *******    ***       *** ***           ************* ************* ************* *************       ");
        System.out.println("       ***********    ***     ***  ***       *** ***           ************* ************* ************* *************       ");
        System.out.println("       ***       *** ***       *** ***       *** ***           ***                ***           ***      ***                 ");
        System.out.println("       ***       *** ***       *** ***       *** ***           ***                ***           ***      ***                 ");
        System.out.println("       ***********   ***       *** ***       *** ***           ********           ***           ***      ********            ");
        System.out.println("       ***********   ***       *** ***       *** ***           ********           ***           ***      ********            ");
        System.out.println("       ***      ***  ***       *** ***       *** ***           ***                ***           ***      ***                 ");
        System.out.println("       ***       *** ***       *** ***       *** ***           ***                ***           ***      ***                 ");
        System.out.println("       ***       ***  ***     ***   ***     ***  ************* *************      ***           ***      *************       ");
        System.out.println("       ***       ***    *******       *******    ************* *************      ***           ***      *************       ");
        System.out.println("                                                                                                                             ");
        Thread.sleep(1500);
        System.out.print("\t\t\t\t\t\tC");
        Thread.sleep(250);
        System.out.print("r");
        Thread.sleep(250);
        System.out.print("e");
        Thread.sleep(250);
        System.out.print("a");
        Thread.sleep(250);
        System.out.print("t");
        Thread.sleep(250);
        System.out.print("e");
        Thread.sleep(250);
        System.out.print("d ");
        Thread.sleep(250);
        System.out.print("b");
        Thread.sleep(250);
        System.out.print("y ");
        Thread.sleep(500);
        System.out.print("SS ");
        Thread.sleep(500);
        System.out.print("GAMING ");
        Thread.sleep(500);
        System.out.print("STUDIOS");
        Thread.sleep(1000);
        System.out.println("\n\t\t\t\t<Enter \'1\' to check instructions or any other character to skip>");
        try {
            b = br.readLine().charAt(0);
            System.out.print('\u000C');
            if(b == '1')
                instructions();
        }
        catch(Exception ex) {
            System.out.println("An error occured!");
            System.out.println("Exception: "+ ex);
            System.out.print("Restarting the program. Please wait...");
            Thread.sleep(5000);
            System.out.print('\u000C');
        }
    }
    public static void instructions()throws IOException, InterruptedException {
        long a;
        String b;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("\t\t\t\t\t\t      BUCKSHOT ROULETTE");
        System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        b = "Buckshot Roulette is a popular game of luck. It is played between either 2 or 4 players. The players sit in a circular order,";
        Thread.sleep(500);
        for (a = 0; a < b.length(); a++) {
            System.out.print(b.charAt((int)a));
            Thread.sleep(50);
        }
        System.out.print("\n");
        b = "and a shotgun is kept in the center. The shotgun is loaded with a combination of live and blank shells. At the beginning of";
        for (a = 0; a < b.length(); a++) {
            System.out.print(b.charAt((int)a));
            Thread.sleep(50);
        }
        System.out.print("\n");
        b = "each round, the total number of live and blank shells are shown to the players. But the order of the arrangement of those";
        for (a = 0; a < b.length(); a++) {
            System.out.print(b.charAt((int)a));
            Thread.sleep(50);
        }
        System.out.print("\n");
        b = "shells are not shown. Players, in their respective turns, take the shotgun and may either fire on themselves or other players.";
        for (a = 0; a < b.length(); a++) {
            System.out.print(b.charAt((int)a));
            Thread.sleep(50);
        }
        System.out.print("\n");
        b = "If the player hits himself, and the shell turns out to be blank, then the player gets another chance to guess and fire. In all";
        for (a = 0; a < b.length(); a++) {
            System.out.print(b.charAt((int)a));
            Thread.sleep(50);
        }
        System.out.print("\n");
        b = "other cases, the turns goes to the next player.";
        for (a = 0; a < b.length(); a++) {
            System.out.print(b.charAt((int)a));
            Thread.sleep(50);
        }
        Thread.sleep(1000);
        System.out.print("\n\n");
        b = "At the beginning of each round, players are given some health points. Each time he is fired at with a live shell in the";
        for (a = 0; a < b.length(); a++) {
            System.out.print(b.charAt((int)a));
            Thread.sleep(50);
        }
        System.out.print("\n");
        b = "shotgun, he loses his health points. The player to survive till the end wins.";
        for (a = 0; a < b.length(); a++) {
            System.out.print(b.charAt((int)a));
            Thread.sleep(50);
        }
        Thread.sleep(1000);
        System.out.print("\n\n");
        b = "To make the game more interesting, the players are provided with some items in the beginning of each round, or everytime the";
        for (a = 0; a < b.length(); a++) {
            System.out.print(b.charAt((int)a));
            Thread.sleep(50);
        }
        System.out.print("\n");
        b = "shotgun becomes empty. The players can use this resources to guess the type of shell loaded in the shotgun more accurately, and";
        for (a = 0; a < b.length(); a++) {
            System.out.print(b.charAt((int)a));
            Thread.sleep(50);
        }
        System.out.print("\n");
        b = "take his desicions accordingly.";
        for (a = 0; a < b.length(); a++) {
            System.out.print(b.charAt((int)a));
            Thread.sleep(50);
        }
        Thread.sleep(2500);
        System.out.print("\n\nTo learn the use of all the items, enter \'1\', or any other character to skip : ");
        try {
            b = br.readLine();
            System.out.print('\u000C');
            if(b.equals("1")) {
                System.out.print('\u000C');
                System.out.println("\t\t\t\t\t\t      BUCKSHOT ROULETTE");
                System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                Thread.sleep(500);
                b = "The list of all the items and their use are as follows :";
                for (a = 0; a < b.length(); a++) {
                    System.out.print(b.charAt((int)a));
                    Thread.sleep(100);
                }
                Thread.sleep(500);
                System.out.print('\u000C');
                System.out.println("\t\t\t\t\t\t      BUCKSHOT ROULETTE");
                System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(b);
                System.out.print("\n");
                System.out.println("    ADRENALINE");
                System.out.println("        This item allows the user to steal items of the");
                System.out.println("        opponent. But the items stolen will immediately");
                System.out.println("        be used. Adrenaline of other players cannot be");
                System.out.println("        stolen.");
                Thread.sleep(500);
                System.out.print('\u000C');
                System.out.println("\t\t\t\t\t\t      BUCKSHOT ROULETTE");
                System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(b);
                System.out.print("\n");
                System.out.println("    ADRENALINE                                                     BEER");
                System.out.println("        This item allows the user to steal items of the                This item allows the user to eject out a");
                System.out.println("        opponent. But the items stolen will immediately                bullet from the shotgun. ");
                System.out.println("        be used. Adrenaline of other players cannot be");
                System.out.println("        stolen.");
                Thread.sleep(500);
                System.out.print('\u000C');
                System.out.println("\t\t\t\t\t\t      BUCKSHOT ROULETTE");
                System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(b);
                System.out.print("\n");
                System.out.println("    ADRENALINE                                                     BEER");
                System.out.println("        This item allows the user to steal items of the                This item allows the user to eject out a");
                System.out.println("        opponent. But the items stolen will immediately                bullet from the shotgun. ");
                System.out.println("        be used. Adrenaline of other players cannot be");
                System.out.println("        stolen.");
                System.out.print("\n");
                System.out.println("    BURNER PHONE");
                System.out.println("        This item allows the user to know the polarity of");
                System.out.println("        bullet loaded in a random position of the shotgun.");
                System.out.println("        But sometimes, the phone may not work. ");
                Thread.sleep(500);
                System.out.print('\u000C');
                System.out.println("\t\t\t\t\t\t      BUCKSHOT ROULETTE");
                System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(b);
                System.out.print("\n");
                System.out.println("    ADRENALINE                                                     BEER");
                System.out.println("        This item allows the user to steal items of the                This item allows the user to eject out a");
                System.out.println("        opponent. But the items stolen will immediately                bullet from the shotgun. ");
                System.out.println("        be used. Adrenaline of other players cannot be");
                System.out.println("        stolen.");
                System.out.print("\n");
                System.out.println("    BURNER PHONE                                                   CIGARETTE PACK");
                System.out.println("        This item allows the user to know the polarity of              This item allows the user to regain a");
                System.out.println("        bullet loaded in a random position of the shotgun.             health point.");
                System.out.println("        But sometimes, the phone may not work. ");
                Thread.sleep(500);
                System.out.print('\u000C');
                System.out.println("\t\t\t\t\t\t      BUCKSHOT ROULETTE");
                System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(b);
                System.out.print("\n");
                System.out.println("    ADRENALINE                                                     BEER");
                System.out.println("        This item allows the user to steal items of the                This item allows the user to eject out a");
                System.out.println("        opponent. But the items stolen will immediately                bullet from the shotgun. ");
                System.out.println("        be used. Adrenaline of other players cannot be");
                System.out.println("        stolen.");
                System.out.print("\n");
                System.out.println("    BURNER PHONE                                                   CIGARETTE PACK");
                System.out.println("        This item allows the user to know the polarity of              This item allows the user to regain a");
                System.out.println("        bullet loaded in a random position of the shotgun.             health point.");
                System.out.println("        But sometimes, the phone may not work. ");
                System.out.print("\n");
                System.out.println("    EXPIRED MEDICINE");
                System.out.println("        This item, when used, the user may recover two");
                System.out.println("        health points, or lose one health point, according");
                System.out.println("        to his fate.");
                Thread.sleep(500);
                System.out.print('\u000C');
                System.out.println("\t\t\t\t\t\t      BUCKSHOT ROULETTE");
                System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(b);
                System.out.print("\n");
                System.out.println("    ADRENALINE                                                     BEER");
                System.out.println("        This item allows the user to steal items of the                This item allows the user to eject out a");
                System.out.println("        opponent. But the items stolen will immediately                bullet from the shotgun. ");
                System.out.println("        be used. Adrenaline of other players cannot be");
                System.out.println("        stolen.");
                System.out.print("\n");
                System.out.println("    BURNER PHONE                                                   CIGARETTE PACK");
                System.out.println("        This item allows the user to know the polarity of              This item allows the user to regain a");
                System.out.println("        bullet loaded in a random position of the shotgun.             health point.");
                System.out.println("        But sometimes, the phone may not work. ");
                System.out.print("\n");
                System.out.println("    EXPIRED MEDICINE                                               HAND SAW");
                System.out.println("        This item, when used, the user may recover two                 This items allows the user to deal double");
                System.out.println("        health points, or lose one health point, according             damage to other players, if the bullet fired");
                System.out.println("        to his fate.                                                   is live.");
                Thread.sleep(500);
                System.out.print('\u000C');
                System.out.println("\t\t\t\t\t\t      BUCKSHOT ROULETTE");
                System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(b);
                System.out.print("\n");
                System.out.println("    ADRENALINE                                                     BEER");
                System.out.println("        This item allows the user to steal items of the                This item allows the user to eject out a");
                System.out.println("        opponent. But the items stolen will immediately                bullet from the shotgun. ");
                System.out.println("        be used. Adrenaline of other players cannot be");
                System.out.println("        stolen.");
                System.out.print("\n");
                System.out.println("    BURNER PHONE                                                   CIGARETTE PACK");
                System.out.println("        This item allows the user to know the polarity of              This item allows the user to regain a");
                System.out.println("        bullet loaded in a random position of the shotgun.             health point.");
                System.out.println("        But sometimes, the phone may not work. ");
                System.out.print("\n");
                System.out.println("    EXPIRED MEDICINE                                               HAND SAW");
                System.out.println("        This item, when used, the user may recover two                 This items allows the user to deal double");
                System.out.println("        health points, or lose one health point, according             damage to other players, if the bullet fired");
                System.out.println("        to his fate.                                                   is live.");
                System.out.print("\n");
                System.out.println("    INVERTER");
                System.out.println("        This item allows the user the swap the polarity");
                System.out.println("        of the current shell.");
                Thread.sleep(500);
                System.out.print('\u000C');
                System.out.println("\t\t\t\t\t\t      BUCKSHOT ROULETTE");
                System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(b);
                System.out.print("\n");
                System.out.println("    ADRENALINE                                                     BEER");
                System.out.println("        This item allows the user to steal items of the                This item allows the user to eject out a");
                System.out.println("        opponent. But the items stolen will immediately                bullet from the shotgun. ");
                System.out.println("        be used. Adrenaline of other players cannot be");
                System.out.println("        stolen.");
                System.out.print("\n");
                System.out.println("    BURNER PHONE                                                   CIGARETTE PACK");
                System.out.println("        This item allows the user to know the polarity of              This item allows the user to regain a");
                System.out.println("        bullet loaded in a random position of the shotgun.             health point.");
                System.out.println("        But sometimes, the phone may not work. ");
                System.out.print("\n");
                System.out.println("    EXPIRED MEDICINE                                               HAND SAW");
                System.out.println("        This item, when used, the user may recover two                 This items allows the user to deal double");
                System.out.println("        health points, or lose one health point, according             damage to other players, if the bullet fired");
                System.out.println("        to his fate.                                                   is live.");
                System.out.print("\n");
                System.out.println("    INVERTER                                                       JAMMER / HAND CUFF");
                System.out.println("        This item allows the user the swap the polarity                This items allows the user to skip the turn");
                System.out.println("        of the current shell.                                          of other players.");
                Thread.sleep(500);
                System.out.print('\u000C');
                System.out.println("\t\t\t\t\t\t      BUCKSHOT ROULETTE");
                System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(b);
                System.out.print("\n");
                System.out.println("    ADRENALINE                                                     BEER");
                System.out.println("        This item allows the user to steal items of the                This item allows the user to eject out a");
                System.out.println("        opponent. But the items stolen will immediately                bullet from the shotgun. ");
                System.out.println("        be used. Adrenaline of other players cannot be");
                System.out.println("        stolen.");
                System.out.print("\n");
                System.out.println("    BURNER PHONE                                                   CIGARETTE PACK");
                System.out.println("        This item allows the user to know the polarity of              This item allows the user to regain a");
                System.out.println("        bullet loaded in a random position of the shotgun.             health point.");
                System.out.println("        But sometimes, the phone may not work. ");
                System.out.print("\n");
                System.out.println("    EXPIRED MEDICINE                                               HAND SAW");
                System.out.println("        This item, when used, the user may recover two                 This items allows the user to deal double");
                System.out.println("        health points, or lose one health point, according             damage to other players, if the bullet fired");
                System.out.println("        to his fate.                                                   is live.");
                System.out.print("\n");
                System.out.println("    INVERTER                                                       JAMMER / HAND CUFF");
                System.out.println("        This item allows the user the swap the polarity                This items allows the user to skip the turn");
                System.out.println("        of the current shell.                                          of other players.");
                System.out.print("\n");
                System.out.println("    MAGNIFYING GLASS");
                System.out.println("        This items allows the user to know the polarity of");
                System.out.println("        the current shell.");
                Thread.sleep(500);
                System.out.print('\u000C');
                System.out.println("\t\t\t\t\t\t      BUCKSHOT ROULETTE");
                System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(b);
                System.out.print("\n");
                System.out.println("    ADRENALINE                                                     BEER");
                System.out.println("        This item allows the user to steal items of the                This item allows the user to eject out a");
                System.out.println("        opponent. But the items stolen will immediately                bullet from the shotgun. ");
                System.out.println("        be used. Adrenaline of other players cannot be");
                System.out.println("        stolen.");
                System.out.print("\n");
                System.out.println("    BURNER PHONE                                                   CIGARETTE PACK");
                System.out.println("        This item allows the user to know the polarity of              This item allows the user to regain a");
                System.out.println("        bullet loaded in a random position of the shotgun.             health point.");
                System.out.println("        But sometimes, the phone may not work. ");
                System.out.print("\n");
                System.out.println("    EXPIRED MEDICINE                                               HAND SAW");
                System.out.println("        This item, when used, the user may recover two                 This items allows the user to deal double");
                System.out.println("        health points, or lose one health point, according             damage to other players, if the bullet fired");
                System.out.println("        to his fate.                                                   is live.");
                System.out.print("\n");
                System.out.println("    INVERTER                                                       JAMMER / HAND CUFF");
                System.out.println("        This item allows the user the swap the polarity                This items allows the user to skip the turn");
                System.out.println("        of the current shell.                                          of other players.");
                System.out.print("\n");
                System.out.println("    MAGNIFYING GLASS                                               REMOTE (available in 4-players game)");
                System.out.println("        This items allows the user to know the polarity of             This item allows the user to change the direction");
                System.out.println("        the current shell.                                             in which players get their turns.");
                Thread.sleep(500);
                System.out.println("\nEnter any character to start the game : ");
                br.readLine();
                System.out.print('\u000C');
            }
        }
        catch(Exception ex) {
            System.out.println("An error occured!");
            System.out.println("Exception: "+ ex);
            System.out.print("Please restart the program to interact...");
        }
    }
}
