package English;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import English.Instructions.LoadingScreen;
import English.Instructions.MancalaInstructions;
public class Mancala {
    static int a[] = new int[14];
    String b, c;
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    public Mancala(String x, String y) {
        a[1] = a[2] = a[3] = a[4] = a[5] = a[6] = a[8] = a[9] = a[10] = a[11] = a[12] = a[13] = 4;
        a[0] = a[7] = 0;
        b = x;
        c = y;
    }
    public void board() {
        System.out.println("\t\t\t\t\t\t            MANCALA");
        System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                                                     P L A Y E R   1                                         ");
        System.out.println("             +----------------------------------------------------------------------------------------------+");
        System.out.println("             |  +---------+  +-------+  +-------+  +-------+  +-------+  +-------+  +-------+  +---------+  |");
        System.out.print("             |  | ");
        if(a[0] == 48)
            System.out.print("O O O O |  | ");
        else if(a[0] == 47 || a[0] == 46)
            System.out.print("  O O O |  | ");
        else if(a[0] == 45 || a[0] == 44)
            System.out.print("  O O   |  | ");
        else if(a[0] == 43 || a[0] == 42)
            System.out.print("    O   |  | ");
        else if(a[0] <= 41)
            System.out.print("        |  | ");
        if(a[13] >= 9)
            System.out.print("O O O |  | ");
        else if(a[13] == 8 || a[13] == 7)
            System.out.print("  O O |  | ");
        else if(a[13] == 6 || a[13] == 5)
            System.out.print("  O   |  | ");
        else if(a[13] <= 4)
            System.out.print("      |  | ");
        if(a[12] >= 9)
            System.out.print("O O O |  | ");
        else if(a[12] == 8 || a[12] == 7)
            System.out.print("  O O |  | ");
        else if(a[12] == 6 || a[12] == 5)
            System.out.print("  O   |  | ");
        else if(a[12] <= 4)
            System.out.print("      |  | ");
        if(a[11] >= 9)
            System.out.print("O O O |  | ");
        else if(a[11] == 8 || a[11] == 7)
            System.out.print("  O O |  | ");
        else if(a[11] == 6 || a[11] == 5)
            System.out.print("  O   |  | ");
        else if(a[11] <= 4)
            System.out.print("      |  | ");
        if(a[10] >= 9)
            System.out.print("O O O |  | ");
        else if(a[10] == 8 || a[10] == 7)
            System.out.print("  O O |  | ");
        else if(a[10] == 6 || a[10] == 5)
            System.out.print("  O   |  | ");
        else if(a[10] <= 4)
            System.out.print("      |  | ");
        if(a[9] >= 9)
            System.out.print("O O O |  | ");
        else if(a[9] == 8 || a[9] == 7)
            System.out.print("  O O |  | ");
        else if(a[9] == 6 || a[9] == 5)
            System.out.print("  O   |  | ");
        else if(a[9] <= 4)
            System.out.print("      |  | ");
        if(a[8] >= 9)
            System.out.print("O O O |  | ");
        else if(a[8] == 8 || a[8] == 7)
            System.out.print("  O O |  | ");
        else if(a[8] == 6 || a[8] == 5)
            System.out.print("  O   |  | ");
        else if(a[8] <= 4)
            System.out.print("      |  | ");
        if(a[7] == 48)
            System.out.print("O O O O |  | ");
        else if(a[7] == 47 || a[7] == 46)
            System.out.print("  O O O |  | ");
        else if(a[7] == 45 || a[7] == 44)
            System.out.print("  O O   |  | ");
        else if(a[7] == 43 || a[7] == 42)
            System.out.print("    O   |  | ");
        else if(a[7] <= 41)
            System.out.print("        |  | ");
        System.out.print("\n             |  | ");
        if(a[0] >= 40)
            System.out.print("O O O O |  | ");
        else if(a[0] == 39 || a[0] == 38)
            System.out.print("  O O O |  | ");
        else if(a[0] == 37 || a[0] == 36)
            System.out.print("  O O   |  | ");
        else if(a[0] == 35 || a[0] == 34)
            System.out.print("    O   |  | ");
        else if(a[0] <= 33)
            System.out.print("        |  | ");
        if(a[13] >= 3)
            System.out.print("O O O |  | ");
        else if(a[13] == 2)
            System.out.print("  O O |  | ");
        else if(a[13] == 1)
            System.out.print("  O   |  | ");
        else if(a[13] == 0)
            System.out.print("      |  | ");
        if(a[12] >= 3)
            System.out.print("O O O |  | ");
        else if(a[12] == 2)
            System.out.print("  O O |  | ");
        else if(a[12] == 1)
            System.out.print("  O   |  | ");
        else if(a[12] == 0)
            System.out.print("      |  | ");
        if(a[11] >= 3)
            System.out.print("O O O |  | ");
        else if(a[11] == 2)
            System.out.print("  O O |  | ");
        else if(a[11] == 1)
            System.out.print("  O   |  | ");
        else if(a[11] == 0)
            System.out.print("      |  | ");
        if(a[10] >= 3)
            System.out.print("O O O |  | ");
        else if(a[10] == 2)
            System.out.print("  O O |  | ");
        else if(a[10] == 1)
            System.out.print("  O   |  | ");
        else if(a[10] == 0)
            System.out.print("      |  | ");
        if(a[9] >= 3)
            System.out.print("O O O |  | ");
        else if(a[9] == 2)
            System.out.print("  O O |  | ");
        else if(a[9] == 1)
            System.out.print("  O   |  | ");
        else if(a[9] == 0)
            System.out.print("      |  | ");
        if(a[8] >= 3)
            System.out.print("O O O |  | ");
        else if(a[8] == 2)
            System.out.print("  O O |  | ");
        else if(a[8] == 1)
            System.out.print("  O   |  | ");
        else if(a[8] == 0)
            System.out.print("      |  | ");
        if(a[7] >= 40)
            System.out.print("O O O O |  | ");
        else if(a[7] == 39 || a[7] == 38)
            System.out.print("  O O O |  | ");
        else if(a[7] == 37 || a[7] == 36)
            System.out.print("  O O   |  | ");
        else if(a[7] == 35 || a[7] == 34)
            System.out.print("    O   |  | ");
        else if(a[7] <= 33)
            System.out.print("        |  | ");
        System.out.print("\n          P  |  | ");
        if(a[0] >= 32)
            System.out.print("O O O O |  | ");
        else if(a[0] == 31 || a[0] == 30)
            System.out.print("  O O O |  | ");
        else if(a[0] == 29 || a[0] == 28)
            System.out.print("  O O   |  | ");
        else if(a[0] == 27 || a[0] == 26)
            System.out.print("    O   |  | ");
        else if(a[0] <= 25)
            System.out.print("        |  | ");
        if(a[13] >= 8)
            System.out.print("O O O |  | ");
        else if(a[13] == 7 || a[13] == 6)
            System.out.print("  O O |  | ");
        else if(a[13] == 5 || a[13] == 4)
            System.out.print("  O   |  | ");
        else if(a[13] <= 3)
            System.out.print("      |  | ");
        if(a[12] >= 8)
            System.out.print("O O O |  | ");
        else if(a[12] == 7 || a[12] == 6)
            System.out.print("  O O |  | ");
        else if(a[12] == 5 || a[12] == 4)
            System.out.print("  O   |  | ");
        else if(a[12] <= 3)
            System.out.print("      |  | ");
        if(a[11] >= 8)
            System.out.print("O O O |  | ");
        else if(a[11] == 7 || a[11] == 6)
            System.out.print("  O O |  | ");
        else if(a[11] == 5 || a[11] == 4)
            System.out.print("  O   |  | ");
        else if(a[11] <= 3)
            System.out.print("      |  | ");
        if(a[10] >= 8)
            System.out.print("O O O |  | ");
        else if(a[10] == 7 || a[10] == 6)
            System.out.print("  O O |  | ");
        else if(a[10] == 5 || a[10] == 4)
            System.out.print("  O   |  | ");
        else if(a[10] <= 3)
            System.out.print("      |  | ");
        if(a[9] >= 8)
            System.out.print("O O O |  | ");
        else if(a[9] == 7 || a[9] == 6)
            System.out.print("  O O |  | ");
        else if(a[9] == 5 || a[9] == 4)
            System.out.print("  O   |  | ");
        else if(a[9] <= 3)
            System.out.print("      |  | ");
        if(a[8] >= 8)
            System.out.print("O O O |  | ");
        else if(a[8] == 7 || a[8] == 6)
            System.out.print("  O O |  | ");
        else if(a[8] == 5 || a[8] == 4)
            System.out.print("  O   |  | ");
        else if(a[8] <= 3)
            System.out.print("      |  | ");
        if(a[7] >= 32)
            System.out.print("O O O O |  |  P");
        else if(a[7] == 31 || a[7] == 30)
            System.out.print("  O O O |  |  P");
        else if(a[7] == 29 || a[7] == 28)
            System.out.print("  O O   |  |  P");
        else if(a[7] == 27 || a[7] == 26)
            System.out.print("    O   |  |  P");
        else if(a[7] <= 25)
            System.out.print("        |  |  P");
        System.out.print("\n          L  |  | ");
        if(a[0] >= 24)
            System.out.print("O O O O |  +-------+  +-------+  +-------+  +-------+  +-------+  +-------+  | ");
        else if(a[0] == 23 || a[0] == 22)
            System.out.print("  O O O |  +-------+  +-------+  +-------+  +-------+  +-------+  +-------+  | ");
        else if(a[0] == 21 || a[0] == 20)
            System.out.print("  O O   |  +-------+  +-------+  +-------+  +-------+  +-------+  +-------+  | ");
        else if(a[0] == 19 || a[0] == 18)
            System.out.print("    O   |  +-------+  +-------+  +-------+  +-------+  +-------+  +-------+  | ");
        else if(a[0] <= 17)
            System.out.print("        |  +-------+  +-------+  +-------+  +-------+  +-------+  +-------+  | ");
        if(a[7] >= 24)
            System.out.print("O O O O |  |  L");
        else if(a[7] == 23 || a[7] == 22)
            System.out.print("  O O O |  |  L");
        else if(a[7] == 21 || a[7] == 20)
            System.out.print("  O O   |  |  L");
        else if(a[7] == 19 || a[7] == 18)
            System.out.print("    O   |  |  L");
        else if(a[7] <= 17)
            System.out.print("        |  |  L");
        System.out.print("\n          A  |  | ");
        if(a[0] >= 16)
            System.out.print("O O O O |");
        else if(a[0] == 15 || a[0] == 14)
            System.out.print("  O O O |");
        else if(a[0] == 13 || a[0] == 12)
            System.out.print("  O O   |");
        else if(a[0] == 11 || a[0] == 10)
            System.out.print("    O   |");
        else if(a[0] <= 9)
            System.out.print("        |");
        System.out.print("     0");
        if(a[13] >= 10)
            System.out.print(a[13] +"        0");
        else
            System.out.print("0"+ a[13] +"        0");
        if(a[12] >= 10)
            System.out.print(a[12] +"        0");
        else
            System.out.print("0"+ a[12] +"        0");
        if(a[11] >= 10)
            System.out.print(a[11] +"        0");
        else
            System.out.print("0"+ a[11] +"        0");
        if(a[10] >= 10)
            System.out.print(a[10] +"        0");
        else
            System.out.print("0"+ a[10] +"        0");
        if(a[9] >= 10)
            System.out.print(a[9] +"        0");
        else
            System.out.print("0"+ a[9] +"        0");
        if(a[8] >= 10)
            System.out.print(a[8] +"     | ");
        else
            System.out.print("0"+ a[8] +"     | ");
        if(a[7] >= 16)
            System.out.print("O O O O |  |  A");
        else if(a[7] == 15 || a[7] == 14)
            System.out.print("  O O O |  |  A");
        else if(a[7] == 13 || a[7] == 12)
            System.out.print("  O O   |  |  A");
        else if(a[7] == 11 || a[7] == 10)
            System.out.print("    O   |  |  A");
        else if(a[7] <= 9)
            System.out.print("        |  |  A");
        System.out.print("\n          Y  |  | ");
        if(a[0] >= 8)
            System.out.print("O O O O |                                                                    | ");
        else if(a[0] == 7 || a[0] == 6)
            System.out.print("  O O O |                                                                    | ");
        else if(a[0] == 5 || a[0] == 4)
            System.out.print("  O O   |                                                                    | ");
        else if(a[0] == 3 || a[0] == 2)
            System.out.print("    O   |                                                                    | ");
        else if(a[0] <= 1)
            System.out.print("        |                                                                    | ");
        if(a[7] >= 8)
            System.out.print("O O O O |  |  Y");
        else if(a[7] == 7 || a[7] == 6)
            System.out.print("  O O O |  |  Y");
        else if(a[7] == 5 || a[7] == 4)
            System.out.print("  O O   |  |  Y");
        else if(a[7] == 3 || a[7] == 2)
            System.out.print("    O   |  |  Y");
        else if(a[7] <= 1)
            System.out.print("        |  |  Y");
        System.out.print("\n          E  |  | ");
        if(a[0] >= 7)
            System.out.print("O O O O |                                                                    | ");
        else if(a[0] == 6 || a[0] == 5)
            System.out.print("  O O O |                                                                    | ");
        else if(a[0] == 4 || a[0] == 3)
            System.out.print("  O O   |                                                                    | ");
        else if(a[0] == 2 || a[0] == 1)
            System.out.print("    O   |                                                                    | ");
        else if(a[0] == 0)
            System.out.print("        |                                                                    | ");
        if(a[7] >= 7)
            System.out.print("O O O O |  |  E");
        else if(a[7] == 6 || a[7] == 5)
            System.out.print("  O O O |  |  E");
        else if(a[7] == 4 || a[7] == 3)
            System.out.print("  O O   |  |  E");
        else if(a[7] == 2 || a[7] == 1)
            System.out.print("    O   |  |  E");
        else if(a[7] == 0)
            System.out.print("        |  |  E");
        System.out.print("\n          R  |  | ");
        if(a[0] >= 15)
            System.out.print("O O O O |");
        else if(a[0] == 14 || a[0] == 13)
            System.out.print("  O O O |");
        else if(a[0] == 12 || a[0] == 11)
            System.out.print("  O O   |");
        else if(a[0] == 10 || a[0] == 9)
            System.out.print("    O   |");
        else if(a[0] <= 8)
            System.out.print("        |");
        System.out.print("     0");
        if(a[1] >= 10)
            System.out.print(a[1] +"        0");
        else
            System.out.print("0"+ a[1] +"        0");
        if(a[2] >= 10)
            System.out.print(a[2] +"        0");
        else
            System.out.print("0"+ a[2] +"        0");
        if(a[3] >= 10)
            System.out.print(a[3] +"        0");
        else
            System.out.print("0"+ a[3] +"        0");
        if(a[4] >= 10)
            System.out.print(a[4] +"        0");
        else
            System.out.print("0"+ a[4] +"        0");
        if(a[5] >= 10)
            System.out.print(a[5] +"        0");
        else
            System.out.print("0"+ a[5] +"        0");
        if(a[6] >= 10)
            System.out.print(a[6] +"     | ");
        else
            System.out.print("0"+ a[6] +"     | ");
        if(a[7] >= 15)
            System.out.print("O O O O |  |  R");
        else if(a[7] == 14 || a[7] == 13)
            System.out.print("  O O O |  |  R");
        else if(a[7] == 12 || a[7] == 11)
            System.out.print("  O O   |  |  R");
        else if(a[7] == 10 || a[7] == 9)
            System.out.print("    O   |  |  R");
        else if(a[7] <= 8)
            System.out.print("        |  |  R");
        System.out.print("\n             |  | ");
        if(a[0] >= 23)
            System.out.print("O O O O |  +-------+  +-------+  +-------+  +-------+  +-------+  +-------+  | ");
        else if(a[0] == 22 || a[0] == 21)
            System.out.print("  O O O |  +-------+  +-------+  +-------+  +-------+  +-------+  +-------+  | ");
        else if(a[0] == 20 || a[0] == 19)
            System.out.print("  O O   |  +-------+  +-------+  +-------+  +-------+  +-------+  +-------+  | ");
        else if(a[0] == 18 || a[0] == 17)
            System.out.print("    O   |  +-------+  +-------+  +-------+  +-------+  +-------+  +-------+  | ");
        else if(a[0] <= 16)
            System.out.print("        |  +-------+  +-------+  +-------+  +-------+  +-------+  +-------+  | ");
        if(a[7] >= 23)
            System.out.print("O O O O |  | ");
        else if(a[7] == 22 || a[7] == 21)
            System.out.print("  O O O |  | ");
        else if(a[7] == 20 || a[7] == 19)
            System.out.print("  O O   |  | ");
        else if(a[7] == 18 || a[7] == 17)
            System.out.print("    O   |  | ");
        else if(a[7] <= 16)
            System.out.print("        |  | ");
        System.out.print("\n          1  |  | ");
        if(a[0] >= 31)
            System.out.print("O O O O |  | ");
        else if(a[0] == 30 || a[0] == 29)
            System.out.print("  O O O |  | ");
        else if(a[0] == 28 || a[0] == 27)
            System.out.print("  O O   |  | ");
        else if(a[0] == 26 || a[0] == 25)
            System.out.print("    O   |  | ");
        else if(a[0] <= 24)
            System.out.print("        |  | ");
        if(a[1] >= 9)
            System.out.print("O O O |  | ");
        else if(a[1] == 8 || a[1] == 7)
            System.out.print("  O O |  | ");
        else if(a[1] == 6 || a[1] == 5)
            System.out.print("  O   |  | ");
        else if(a[1] <= 4)
            System.out.print("      |  | ");
        if(a[2] >= 9)
            System.out.print("O O O |  | ");
        else if(a[2] == 8 || a[2] == 7)
            System.out.print("  O O |  | ");
        else if(a[2] == 6 || a[2] == 5)
            System.out.print("  O   |  | ");
        else if(a[2] <= 4)
            System.out.print("      |  | ");
        if(a[3] >= 9)
            System.out.print("O O O |  | ");
        else if(a[3] == 8 || a[3] == 7)
            System.out.print("  O O |  | ");
        else if(a[3] == 6 || a[3] == 5)
            System.out.print("  O   |  | ");
        else if(a[3] <= 4)
            System.out.print("      |  | ");
        if(a[4] >= 9)
            System.out.print("O O O |  | ");
        else if(a[4] == 8 || a[4] == 7)
            System.out.print("  O O |  | ");
        else if(a[4] == 6 || a[4] == 5)
            System.out.print("  O   |  | ");
        else if(a[4] <= 4)
            System.out.print("      |  | ");
        if(a[5] >= 9)
            System.out.print("O O O |  | ");
        else if(a[5] == 8 || a[5] == 7)
            System.out.print("  O O |  | ");
        else if(a[5] == 6 || a[5] == 5)
            System.out.print("  O   |  | ");
        else if(a[5] <= 4)
            System.out.print("      |  | ");
        if(a[6] >= 9)
            System.out.print("O O O |  | ");
        else if(a[6] == 8 || a[6] == 7)
            System.out.print("  O O |  | ");
        else if(a[6] == 6 || a[6] == 5)
            System.out.print("  O   |  | ");
        else if(a[6] <= 4)
            System.out.print("      |  | ");
        if(a[7] >= 31)
            System.out.print("O O O O |  |  2");
        else if(a[7] == 30 || a[7] == 29)
            System.out.print("  O O O |  |  2");
        else if(a[7] == 28 || a[7] == 27)
            System.out.print("  O O   |  |  2");
        else if(a[7] == 26 || a[7] == 25)
            System.out.print("    O   |  |  2");
        else if(a[7] <= 24)
            System.out.print("        |  |  2");
        System.out.print("\n             |  | ");
        if(a[0] >= 39)
            System.out.print("O O O O |  | ");
        else if(a[0] == 38 || a[0] == 37)
            System.out.print("  O O O |  | ");
        else if(a[0] == 36 || a[0] == 35)
            System.out.print("  O O   |  | ");
        else if(a[0] == 34 || a[0] == 33)
            System.out.print("    O   |  | ");
        else if(a[0] <= 32)
            System.out.print("        |  | ");
        if(a[1] >= 3)
            System.out.print("O O O |  | ");
        else if(a[1] == 2)
            System.out.print("  O O |  | ");
        else if(a[1] == 1)
            System.out.print("  O   |  | ");
        else if(a[1] == 0)
            System.out.print("      |  | ");
        if(a[2] >= 3)
            System.out.print("O O O |  | ");
        else if(a[2] == 2)
            System.out.print("  O O |  | ");
        else if(a[2] == 1)
            System.out.print("  O   |  | ");
        else if(a[2] == 0)
            System.out.print("      |  | ");
        if(a[3] >= 3)
            System.out.print("O O O |  | ");
        else if(a[3] == 2)
            System.out.print("  O O |  | ");
        else if(a[3] == 1)
            System.out.print("  O   |  | ");
        else if(a[3] == 0)
            System.out.print("      |  | ");
        if(a[4] >= 3)
            System.out.print("O O O |  | ");
        else if(a[4] == 2)
            System.out.print("  O O |  | ");
        else if(a[4] == 1)
            System.out.print("  O   |  | ");
        else if(a[4] == 0)
            System.out.print("      |  | ");
        if(a[5] >= 3)
            System.out.print("O O O |  | ");
        else if(a[5] == 2)
            System.out.print("  O O |  | ");
        else if(a[5] == 1)
            System.out.print("  O   |  | ");
        else if(a[5] == 0)
            System.out.print("      |  | ");
        if(a[6] >= 3)
            System.out.print("O O O |  | ");
        else if(a[6] == 2)
            System.out.print("  O O |  | ");
        else if(a[6] == 1)
            System.out.print("  O   |  | ");
        else if(a[6] == 0)
            System.out.print("      |  | ");
        if(a[7] >= 39)
            System.out.print("O O O O |  | ");
        else if(a[7] == 38 || a[7] == 37)
            System.out.print("  O O O |  | ");
        else if(a[7] == 36 || a[7] == 35)
            System.out.print("  O O   |  | ");
        else if(a[7] == 34 || a[7] == 33)
            System.out.print("    O   |  | ");
        else if(a[7] <= 32)
            System.out.print("        |  | ");
        System.out.print("\n             |  | ");
        if(a[0] >= 47)
            System.out.print("O O O O |  | ");
        else if(a[0] == 46 || a[0] == 45)
            System.out.print("  O O O |  | ");
        else if(a[0] == 44 || a[0] == 43)
            System.out.print("  O O   |  | ");
        else if(a[0] == 42 || a[0] == 41)
            System.out.print("    O   |  | ");
        else if(a[0] <= 40)
            System.out.print("        |  | ");
        if(a[1] >= 8)
            System.out.print("O O O |  | ");
        else if(a[1] == 7 || a[1] == 6)
            System.out.print("  O O |  | ");
        else if(a[1] == 5 || a[1] == 4)
            System.out.print("  O   |  | ");
        else if(a[1] <= 3)
            System.out.print("      |  | ");
        if(a[2] >= 8)
            System.out.print("O O O |  | ");
        else if(a[2] == 7 || a[2] == 6)
            System.out.print("  O O |  | ");
        else if(a[2] == 5 || a[2] == 4)
            System.out.print("  O   |  | ");
        else if(a[2] <= 3)
            System.out.print("      |  | ");
        if(a[3] >= 8)
            System.out.print("O O O |  | ");
        else if(a[3] == 7 || a[3] == 6)
            System.out.print("  O O |  | ");
        else if(a[3] == 5 || a[3] == 4)
            System.out.print("  O   |  | ");
        else if(a[3] <= 3)
            System.out.print("      |  | ");
        if(a[4] >= 8)
            System.out.print("O O O |  | ");
        else if(a[4] == 7 || a[4] == 6)
            System.out.print("  O O |  | ");
        else if(a[4] == 5 || a[4] == 4)
            System.out.print("  O   |  | ");
        else if(a[4] <= 3)
            System.out.print("      |  | ");
        if(a[5] >= 8)
            System.out.print("O O O |  | ");
        else if(a[5] == 7 || a[5] == 6)
            System.out.print("  O O |  | ");
        else if(a[5] == 5 || a[5] == 4)
            System.out.print("  O   |  | ");
        else if(a[5] <= 3)
            System.out.print("      |  | ");
        if(a[6] >= 8)
            System.out.print("O O O |  | ");
        else if(a[6] == 7 || a[6] == 6)
            System.out.print("  O O |  | ");
        else if(a[6] == 5 || a[6] == 4)
            System.out.print("  O   |  | ");
        else if(a[6] <= 3)
            System.out.print("      |  | ");
        if(a[7] >= 47)
            System.out.print("O O O O |  | ");
        else if(a[7] == 46 || a[7] == 45)
            System.out.print("  O O O |  | ");
        else if(a[7] == 44 || a[7] == 43)
            System.out.print("  O O   |  | ");
        else if(a[7] == 42 || a[7] == 41)
            System.out.print("    O   |  | ");
        else if(a[7] <= 40)
            System.out.print("        |  | ");
        System.out.println("\n             |  +---------+  +-------+  +-------+  +-------+  +-------+  +-------+  +-------+  +---------+  |");
        System.out.println("             +----------------------------------------------------------------------------------------------+");
        System.out.println("                                                     P L A Y E R   2                                         ");
    }
    public String computerMind() {
        String a;
        int b, c, e;
        boolean d;
        a = "";
        d = true;
        for(b = 1; b <= 2 && d; b++) {
            switch(b) {
                case 1:
                    for(c = 1; c <= 6; c++) {
                        if(this.a[c] == 7 - c) {
                            a += (char)(c + 64);
                            d = false;
                            break;
                        }
                    }
                    break;
                case 2:
                    for(c = 1; c <= 6; c++) {
                        e = this.a[c] + c;
                        while(e > 13)
                            e -= 13;
                        if(e >= 1 && e <= 6 && this.a[e] == 0 && this.a[14 - e] != 0 && c != e) {
                            a += (char)(c + 64);
                            d = false;
                            break;
                        }
                    }
            }
        }
        if(a.length() == 0) {
            a = ""+ (char)((int)(Math.random() * 6) + 65);
        }
        return a;
    }
    public void computer()throws IOException, InterruptedException {
        long a;
        int b, e;
        String c;
        boolean d;
        board();
        try {
            for(a = (int)(Math.random() * 2.0); this.a[0] + this.a[7] != 48; a++) {
                System.out.println("\nThe current score of the players is as follows :");
                System.out.println("\t"+ this.b +" : "+ this.a[0]);
                System.out.println("\t"+ this.c +" : "+ this.a[7]);
                if(a % 2 == 1) {
                    System.out.println("\nTurn for "+ this.b.toUpperCase() +" : ");
                    System.out.println("\nNumber of stones in each cup (from left to right) are as follows :");
                    System.out.println("\tA\tB\tC\tD\tE\tF");
                    for(b = 13; b >= 8; b--)
                        System.out.print("\t"+ this.a[b]);
                    System.out.print("\n\nEnter the character corresponding to your desired cup : ");
                    c = br.readLine();
                    c = c.toUpperCase();
                    d = true;
                    while(d) {
                        if(c.length() != 1 || c.charAt(0) < 65 || c.charAt(0) > 70) {
                            while(c.length() != 1 || c.charAt(0) < 65 || c.charAt(0) > 70) {
                                System.out.print("Invalid input! Re-enter your choice : ");
                                c = br.readLine();
                                c = c.toUpperCase();
                            }
                        }
                        else if(this.a[Math.abs(c.charAt(0) - 78)] == 0) {
                            System.out.print("Your desired cup does not contain any stone. Choose another cup : ");
                            c = br.readLine();
                            c = c.toUpperCase();
                        }
                        else
                            d = false;
                    }
                    b = e = Math.abs(c.charAt(0) - 78);
                    while(this.a[b] != 0) {
                        e++;
                        if(e == 14)
                            e = 0;
                        else if(e == 7)
                            e = 8;
                        Thread.sleep(1000);
                        this.a[e]++;
                        this.a[b]--;
                        System.out.print('\u000C');
                        board();
                    }
                    if(e == 0)
                        a--;
                    else if(this.a[e] == 1 && this.a[14 - e] != 0 && e >= 8 && e <= 13) {
                        Thread.sleep(1000);
                        this.a[0]++;
                        this.a[e]--;
                        System.out.print('\u000C');
                        board();
                        while(this.a[14 - e] != 0) {
                            Thread.sleep(1000);
                            this.a[0]++;
                            this.a[14 - e]--;
                            System.out.print('\u000C');
                            board();
                        }
                    }
                }
                else {
                    System.out.println("\nTurn for "+ this.c.toUpperCase() +" : ");
                    System.out.println("\nNumber of stones in each cup (from left to right) are as follows :");
                    System.out.println("\tA\tB\tC\tD\tE\tF");
                    for(b = 1; b <= 6; b++)
                        System.out.print("\t"+ this.a[b]);
                    System.out.print("\n\nEnter the character corresponding to your desired cup : ");
                    c = computerMind();
                    Thread.sleep(2000);
                    System.out.println(c);
                    if(this.a[c.charAt(0) - 64] == 0) {
                        while(this.a[c.charAt(0) - 64] == 0) {
                            System.out.print("Your desired cup does not contain any stone. Choose another cup : ");
                            c = computerMind();
                            Thread.sleep(2000);
                            System.out.println(c);
                        }
                    }
                    b = e = c.charAt(0) - 64;
                    while(this.a[b] != 0) {
                        e++;
                        if(e == 14)
                            e = 1;
                        Thread.sleep(1000);
                        this.a[e]++;
                        this.a[b]--;
                        System.out.print('\u000C');
                        board();
                    }
                    if(e == 7)
                        a--;
                    else if(this.a[e] == 1 && this.a[14 - e] != 0 && e >= 1 && e <= 6) {
                        Thread.sleep(1000);
                        this.a[7]++;
                        this.a[e]--;
                        System.out.print('\u000C');
                        board();
                        while(this.a[14 - e] != 0) {
                            Thread.sleep(1000);
                            this.a[7]++;
                            this.a[14 - e]--;
                            System.out.print('\u000C');
                            board();
                        }
                    }
                }
                if(this.a[1] + this.a[2] + this.a[3] + this.a[4] + this.a[5] + this.a[6] == 0)
                    for(b = 8; b <= 13; b++)
                        while(this.a[b] != 0) {
                            Thread.sleep(1000);
                            this.a[b]--;
                            this.a[0]++;
                            System.out.print('\u000C');
                            board();
                        }
                else if(this.a[8] + this.a[9] + this.a[10] + this.a[11] + this.a[12] + this.a[13] == 0)
                    for(b = 1; b <= 6; b++)
                        while(this.a[b] != 0) {
                            Thread.sleep(1000);
                            this.a[b]--;
                            this.a[7]++;
                            System.out.print('\u000C');
                            board();
                        }
            }
            if(this.a[0] > this.a[7]) {
                System.out.println("\nCONGRATULATIONS!");
                System.out.println("You won the match.");
            }
            else if(this.a[0] < this.a[7]) {
                System.out.println("\nOOPS!");
                System.out.println("You lost the match. Better luck next time.");
            }
            else
                System.out.println("\nWOW! It is a tie.");
            System.out.println("\nTotal points :");
            System.out.println("\t"+ this.b +" : "+ this.a[0]);
            System.out.println("\t"+ this.c +" : "+ this.a[7]);
            Thread.sleep(2000);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\t\t\t\t\t\t            CREDITS");
            System.out.println("\nCREATED BY :");
            System.out.println("\tSurya Samanta");
            System.out.println("\nINSPIRED FROM :");
            System.out.println("\t2 Player games : the Challenge\t[Available in Google Play Store]");
            System.out.println("\tby JindoBlu");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Enter anything to return to the home screen : ");
            this.b = br.readLine();
            System.out.print('\u000C');
        }
        catch(Exception ex) {
            System.out.println("\nOops! An error occurred!");
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
            System.exit(0);
        }
    }
    public void twoPlayers()throws IOException, InterruptedException {
        long a;
        int b, e;
        String c;
        boolean d;
        board();
        try {
            for(a = (int)(Math.random() * 2.0); this.a[0] + this.a[7] != 48; a++) {
                System.out.println("\nThe current score of the players is as follows :");
                System.out.println("\t"+ this.b +" : "+ this.a[0]);
                System.out.println("\t"+ this.c +" : "+ this.a[7]);
                if(a % 2 == 1) {
                    System.out.println("\nTurn for "+ this.b.toUpperCase() +" : ");
                    System.out.println("\nNumber of stones in each cup (from left to right) are as follows :");
                    System.out.println("\tA\tB\tC\tD\tE\tF");
                    for(b = 13; b >= 8; b--)
                        System.out.print("\t"+ this.a[b]);
                    System.out.print("\n\nEnter the character corresponding to your desired cup : ");
                    c = br.readLine();
                    c = c.toUpperCase();
                    d = true;
                    while(d) {
                        if(c.length() != 1 || c.charAt(0) < 65 || c.charAt(0) > 70) {
                            while(c.length() != 1 || c.charAt(0) < 65 || c.charAt(0) > 70) {
                                System.out.print("Invalid input! Re-enter your choice : ");
                                c = br.readLine();
                                c = c.toUpperCase();
                            }
                        }
                        else if(this.a[Math.abs(c.charAt(0) - 78)] == 0) {
                            System.out.print("Your desired cup does not contain any stone. Choose another cup : ");
                            c = br.readLine();
                            c = c.toUpperCase();
                        }
                        else
                            d = false;
                    }
                    b = e = Math.abs(c.charAt(0) - 78);
                    while(this.a[b] != 0) {
                        e++;
                        if(e == 14)
                            e = 0;
                        else if(e == 7)
                            e = 8;
                        Thread.sleep(1000);
                        this.a[e]++;
                        this.a[b]--;
                        System.out.print('\u000C');
                        board();
                    }
                    if(e == 0)
                        a--;
                    else if(this.a[e] == 1 && this.a[14 - e] != 0 && e >= 8 && e <= 13) {
                        Thread.sleep(1000);
                        this.a[0]++;
                        this.a[e]--;
                        System.out.print('\u000C');
                        board();
                        while(this.a[14 - e] != 0) {
                            Thread.sleep(1000);
                            this.a[0]++;
                            this.a[14 - e]--;
                            System.out.print('\u000C');
                            board();
                        }
                    }
                }
                else {
                    System.out.println("\nTurn for "+ this.c.toUpperCase() +" : ");
                    System.out.println("\nNumber of stones in each cup (from left to right) are as follows :");
                    System.out.println("\tA\tB\tC\tD\tE\tF");
                    for(b = 1; b <= 6; b++)
                        System.out.print("\t"+ this.a[b]);
                    System.out.print("\n\nEnter the character corresponding to your desired cup : ");
                    c = br.readLine();
                    c = c.toUpperCase();
                    d = true;
                    while(d) {
                        if(c.length() != 1 || c.charAt(0) < 65 || c.charAt(0) > 70) {
                            while(c.length() != 1 || c.charAt(0) < 65 || c.charAt(0) > 70) {
                                System.out.print("Invalid input! Re-enter your choice : ");
                                c = br.readLine();
                                c = c.toUpperCase();
                            }
                        }
                        else if(this.a[c.charAt(0) - 64] == 0) {
                            System.out.print("Your desired cup does not contain any stone. Choose another cup : ");
                            c = br.readLine();
                            c = c.toUpperCase();
                        }
                        else
                            d = false;
                    }
                    b = e = c.charAt(0) - 64;
                    while(this.a[b] != 0) {
                        e++;
                        if(e == 14)
                            e = 1;
                        Thread.sleep(1000);
                        this.a[e]++;
                        this.a[b]--;
                        System.out.print('\u000C');
                        board();
                    }
                    if(e == 7)
                        a--;
                    else if(this.a[e] == 1 && this.a[14 - e] != 0 && e >= 1 && e <= 6) {
                        Thread.sleep(1000);
                        this.a[7]++;
                        this.a[e]--;
                        System.out.print('\u000C');
                        board();
                        while(this.a[14 - e] != 0) {
                            Thread.sleep(1000);
                            this.a[7]++;
                            this.a[14 - e]--;
                            System.out.print('\u000C');
                            board();
                        }
                    }
                }
                if(this.a[1] + this.a[2] + this.a[3] + this.a[4] + this.a[5] + this.a[6] == 0)
                    for(b = 8; b <= 13; b++)
                        while(this.a[b] != 0) {
                            Thread.sleep(1000);
                            this.a[b]--;
                            this.a[0]++;
                            System.out.print('\u000C');
                            board();
                        }
                else if(this.a[8] + this.a[9] + this.a[10] + this.a[11] + this.a[12] + this.a[13] == 0)
                    for(b = 1; b <= 6; b++)
                        while(this.a[b] != 0) {
                            Thread.sleep(1000);
                            this.a[b]--;
                            this.a[7]++;
                            System.out.print('\u000C');
                            board();
                        }
            }
            if(this.a[0] > this.a[7]) {
                System.out.println("\nCONGRATULATIONS!");
                System.out.println(this.b +" won the match.");
            }
            else if(this.a[0] < this.a[7]) {
                System.out.println("\nCONGRATULATIONS!");
                System.out.println(this.c +" won the match.");
            }
            else
                System.out.println("\nWOW! It is a tie.");
            System.out.println("\nTotal points :");
            System.out.println("\t"+ this.b +" : "+ this.a[0]);
            System.out.println("\t"+ this.c +" : "+ this.a[7]);
            Thread.sleep(2000);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\t\t\t\t\t\t            CREDITS");
            System.out.println("\nCREATED BY :");
            System.out.println("\tSurya Samanta");
            System.out.println("\nINSPIRED FROM :");
            System.out.println("\t2 Player games : the Challenge\t[Available in Google Play Store]");
            System.out.println("\tby JindoBlu");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\nEnter anything to return to the home screen : ");
            this.b = br.readLine();
            System.out.print('\u000C');
        }
        catch(Exception ex) {
            System.out.println("\nOops! An error occurred!");
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
            System.exit(0);
        }
    }
    public static void instructions()throws IOException, InterruptedException {
        MancalaInstructions mi = new MancalaInstructions();
        mi.instructions();
        main();
    }
    public static void main()throws IOException, InterruptedException {
        String a, b;
        int c;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        LoadingScreen lc = new LoadingScreen();
        MancalaInstructions mi = new MancalaInstructions();
        mi.display();
        System.out.println("\t\t\t\t\t\t            MANCALA");
        System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        try {
            System.out.println("Select a mode :");
            System.out.println("    1 - Single-Player Mode (Against Computer)");
            System.out.println("    2 - Multi-Player Mode (Against Friend)");
            System.out.println("    3 - Read instructions again");
            System.out.print("\tEnter your choice : ");
            c = Integer.parseInt(br.readLine());
            if(c != 1 && c != 2 && c != 3) {
                while(c != 1 && c != 2 && c != 3) {
                    System.out.print("\tPlease enter a valid input : ");
                    c = Integer.parseInt(br.readLine());
                }
            }
            if(c == 1) {
                System.out.print("\nPlease enter your full name : ");
                a = br.readLine();
                b = "Computer";
                Mancala ma = new Mancala(a, b);
                System.out.println("\n\t\t\t\t\tPLAYER 1:\t\t\t\tPLAYER 2:");
                System.out.println("\t\t\t\t\t"+ a +"\t\tVS\t\t"+ b);
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
                ma.computer();
            }
            else if(c == 2) {
                System.out.println("\nPlease enter the full names :");
                System.out.print("\tPlayer 1 : ");
                a = br.readLine();
                System.out.print("\tPlayer 2 : ");
                b = br.readLine();
                Mancala ma = new Mancala(a, b);
                System.out.println("\n\t\t\t\t\tPLAYER 1:\t\t\t\tPLAYER 2:");
                System.out.println("\t\t\t\t\t"+ a +"\t\tVS\t\t"+ b);
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
                ma.twoPlayers();
            }
            else if(c == 3) {
                System.out.print('\u000C');
                instructions();
            }
        }
        catch(Exception ex) {
            System.out.println("\nOops! An error occurred!");
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
            System.exit(0);
        }
    }
}