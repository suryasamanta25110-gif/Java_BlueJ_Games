package English;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import English.Instructions.SudokuInstructions;
public class Sudoku {
    byte a[][] = new byte[9][9];
    byte b[][] = new byte[9][9];
    byte c[][] = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    byte d[][] = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    byte e[][] = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    byte f[][] = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    byte g[][] = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    byte h[][] = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    byte i[][] = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    byte j[][] = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    byte k[][] = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    boolean l[][] = new boolean[9][9];
    int m[] = new int[35];
    long n;
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    public void initialization(int a) {
        int b, c;
        for(b = 0; b < 9; b++)
            for(c = 0; c < 9; c++) {
                this.b[b][c] = 0;
                l[b][c] = false;
            }
        switch(a) {
            case 0:
                this.a[0][5] = this.a[1][1] = this.a[2][7] = this.a[3][0] = this.a[4][4] = this.a[5][6] = this.a[6][3] = this.a[7][2] = this.a[8][8] = 1;
                this.a[0][1] = this.a[1][6] = this.a[2][4] = this.a[3][8] = this.a[4][3] = this.a[5][0] = this.a[6][7] = this.a[7][5] = this.a[8][2] = 2;
                this.a[0][4] = this.a[1][2] = this.a[2][8] = this.a[3][7] = this.a[4][0] = this.a[5][5] = this.a[6][1] = this.a[7][6] = this.a[8][3] = 3;
                this.a[0][8] = this.a[1][4] = this.a[2][2] = this.a[3][3] = this.a[4][7] = this.a[5][1] = this.a[6][6] = this.a[7][0] = this.a[8][5] = 4;
                this.a[0][3] = this.a[1][7] = this.a[2][0] = this.a[3][2] = this.a[4][8] = this.a[5][4] = this.a[6][5] = this.a[7][1] = this.a[8][6] = 5;
                this.a[0][0] = this.a[1][3] = this.a[2][6] = this.a[3][5] = this.a[4][1] = this.a[5][8] = this.a[6][2] = this.a[7][4] = this.a[8][7] = 6;
                this.a[0][2] = this.a[1][8] = this.a[2][5] = this.a[3][1] = this.a[4][6] = this.a[5][3] = this.a[6][0] = this.a[7][7] = this.a[8][4] = 7;
                this.a[0][7] = this.a[1][0] = this.a[2][3] = this.a[3][6] = this.a[4][5] = this.a[5][2] = this.a[6][4] = this.a[7][8] = this.a[8][1] = 8;
                this.a[0][6] = this.a[1][5] = this.a[2][1] = this.a[3][4] = this.a[4][2] = this.a[5][7] = this.a[6][8] = this.a[7][3] = this.a[8][0] = 9;
                break;
            case 1:
                this.a[0][7] = this.a[1][2] = this.a[2][5] = this.a[3][3] = this.a[4][6] = this.a[5][1] = this.a[6][4] = this.a[7][8] = this.a[8][0] = 1;
                this.a[0][1] = this.a[1][4] = this.a[2][6] = this.a[3][5] = this.a[4][7] = this.a[5][0] = this.a[6][8] = this.a[7][2] = this.a[8][3] = 2;
                this.a[0][3] = this.a[1][6] = this.a[2][2] = this.a[3][1] = this.a[4][8] = this.a[5][4] = this.a[6][5] = this.a[7][0] = this.a[8][7] = 3;
                this.a[0][4] = this.a[1][8] = this.a[2][0] = this.a[3][2] = this.a[4][3] = this.a[5][7] = this.a[6][6] = this.a[7][1] = this.a[8][5] = 4;
                this.a[0][5] = this.a[1][1] = this.a[2][8] = this.a[3][6] = this.a[4][2] = this.a[5][3] = this.a[6][0] = this.a[7][7] = this.a[8][4] = 5;
                this.a[0][2] = this.a[1][5] = this.a[2][7] = this.a[3][4] = this.a[4][0] = this.a[5][8] = this.a[6][1] = this.a[7][3] = this.a[8][6] = 6;
                this.a[0][8] = this.a[1][3] = this.a[2][1] = this.a[3][0] = this.a[4][4] = this.a[5][6] = this.a[6][7] = this.a[7][5] = this.a[8][2] = 7;
                this.a[0][6] = this.a[1][0] = this.a[2][3] = this.a[3][7] = this.a[4][1] = this.a[5][5] = this.a[6][2] = this.a[7][4] = this.a[8][8] = 8;
                this.a[0][0] = this.a[1][7] = this.a[2][4] = this.a[3][8] = this.a[4][5] = this.a[5][2] = this.a[6][3] = this.a[7][6] = this.a[8][1] = 9;
        }
    }
    public void display() {
        System.out.println("\t\t\t\t\t\t            SUDOKU");
        System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t\t\t\t\t      1   2   3     4   5   6     7   8   9");
        System.out.println("\t\t\t\t\t    +---+---+---+ +---+---+---+ +---+---+---+");
        System.out.print("\t\t\t\t\t  1 | ");
        if(b[0][0] == 0)
            System.out.print("  | ");
        else {
            if(this.l[0][0])
                System.out.print(b[0][0] +" | ");
            else
                System.out.print(b[0][0] +"*| ");
        }
        if(b[0][1] == 0)
            System.out.print("  | ");
        else {
            if(this.l[0][1])
                System.out.print(b[0][1] +" | ");
            else
                System.out.print(b[0][1] +"*| ");
        }
        if(b[0][2] == 0)
            System.out.print("  | | ");
        else {
            if(this.l[0][2])
                System.out.print(b[0][2] +" | | ");
            else
                System.out.print(b[0][2] +"*| | ");
        }
        if(b[0][3] == 0)
            System.out.print("  | ");
        else {
            if(this.l[0][3])
                System.out.print(b[0][3] +" | ");
            else
                System.out.print(b[0][3] +"*| ");
        }
        if(b[0][4] == 0)
            System.out.print("  | ");
        else {
            if(this.l[0][4])
                System.out.print(b[0][4] +" | ");
            else
                System.out.print(b[0][4] +"*| ");
        }
        if(b[0][5] == 0)
            System.out.print("  | | ");
        else {
            if(this.l[0][5])
                System.out.print(b[0][5] +" | | ");
            else
                System.out.print(b[0][5] +"*| | ");
        }
        if(b[0][6] == 0)
            System.out.print("  | ");
        else {
            if(this.l[0][6])
                System.out.print(b[0][6] +" | ");
            else
                System.out.print(b[0][6] +"*| ");
        }
        if(b[0][7] == 0)
            System.out.print("  | ");
        else {
            if(this.l[0][7])
                System.out.print(b[0][7] +" | ");
            else
                System.out.print(b[0][7] +"*| ");
        }
        if(b[0][8] == 0)
            System.out.println("  |");
        else {
            if(this.l[0][8])
                System.out.println(b[0][8] +" |");
            else
                System.out.println(b[0][8] +"*|");
        }
        System.out.println("\t\t\t\t\t    +---+---+---+ +---+---+---+ +---+---+---+");
        System.out.print("\t\t\t\t\t  2 | ");
        if(b[1][0] == 0)
            System.out.print("  | ");
        else {
            if(this.l[1][0])
                System.out.print(b[1][0] +" | ");
            else
                System.out.print(b[1][0] +"*| ");
        }
        if(b[1][1] == 0)
            System.out.print("  | ");
        else {
            if(this.l[1][1])
                System.out.print(b[1][1] +" | ");
            else
                System.out.print(b[1][1] +"*| ");
        }
        if(b[1][2] == 0)
            System.out.print("  | | ");
        else {
            if(this.l[1][2])
                System.out.print(b[1][2] +" | | ");
            else
                System.out.print(b[1][2] +"*| | ");
        }
        if(b[1][3] == 0)
            System.out.print("  | ");
        else {
            if(this.l[1][3])
                System.out.print(b[1][3] +" | ");
            else
                System.out.print(b[1][3] +"*| ");
        }
        if(b[1][4] == 0)
            System.out.print("  | ");
        else {
            if(this.l[1][4])
                System.out.print(b[1][4] +" | ");
            else
                System.out.print(b[1][4] +"*| ");
        }
        if(b[1][5] == 0)
            System.out.print("  | | ");
        else {
            if(this.l[1][5])
                System.out.print(b[1][5] +" | | ");
            else
                System.out.print(b[1][5] +"*| | ");
        }
        if(b[1][6] == 0)
            System.out.print("  | ");
        else {
            if(this.l[1][6])
                System.out.print(b[1][6] +" | ");
            else
                System.out.print(b[1][6] +"*| ");
        }
        if(b[1][7] == 0)
            System.out.print("  | ");
        else {
            if(this.l[1][7])
                System.out.print(b[1][7] +" | ");
            else
                System.out.print(b[1][7] +"*| ");
        }
        if(b[1][8] == 0)
            System.out.println("  |");
        else {
            if(this.l[1][8])
                System.out.println(b[1][8] +" |");
            else
                System.out.println(b[1][8] +"*|");
        }
        System.out.println("\t\t\t\t\t    +---+---+---+ +---+---+---+ +---+---+---+");
        System.out.print("\t\t\t\t\t  3 | ");
        if(b[2][0] == 0)
            System.out.print("  | ");
        else {
            if(this.l[2][0])
                System.out.print(b[2][0] +" | ");
            else
                System.out.print(b[2][0] +"*| ");
        }
        if(b[2][1] == 0)
            System.out.print("  | ");
        else {
            if(this.l[2][1])
                System.out.print(b[2][1] +" | ");
            else
                System.out.print(b[2][1] +"*| ");
        }
        if(b[2][2] == 0)
            System.out.print("  | | ");
        else {
            if(this.l[2][2])
                System.out.print(b[2][2] +" | | ");
            else
                System.out.print(b[2][2] +"*| | ");
        }
        if(b[2][3] == 0)
            System.out.print("  | ");
        else {
            if(this.l[2][3])
                System.out.print(b[2][3] +" | ");
            else
                System.out.print(b[2][3] +"*| ");
        }
        if(b[2][4] == 0)
            System.out.print("  | ");
        else {
            if(this.l[2][4])
                System.out.print(b[2][4] +" | ");
            else
                System.out.print(b[2][4] +"*| ");
        }
        if(b[2][5] == 0)
            System.out.print("  | | ");
        else {
            if(this.l[2][5])
                System.out.print(b[2][5] +" | | ");
            else
                System.out.print(b[2][5] +"*| | ");
        }
        if(b[2][6] == 0)
            System.out.print("  | ");
        else {
            if(this.l[2][6])
                System.out.print(b[2][6] +" | ");
            else
                System.out.print(b[2][6] +"*| ");
        }
        if(b[2][7] == 0)
            System.out.print("  | ");
        else {
            if(this.l[2][7])
                System.out.print(b[2][7] +" | ");
            else
                System.out.print(b[2][7] +"*| ");
        }
        if(b[2][8] == 0)
            System.out.println("  |");
        else {
            if(this.l[2][8])
                System.out.println(b[2][8] +" |");
            else
                System.out.println(b[2][8] +"*|");
        }
        System.out.println("\t\t\t\t\t    +---+---+---+ +---+---+---+ +---+---+---+");
        System.out.println("\t\t\t\t\t    +---+---+---+ +---+---+---+ +---+---+---+");
        System.out.print("\t\t\t\t\t  4 | ");
        if(b[3][0] == 0)
            System.out.print("  | ");
        else {
            if(this.l[3][0])
                System.out.print(b[3][0] +" | ");
            else
                System.out.print(b[3][0] +"*| ");
        }
        if(b[3][1] == 0)
            System.out.print("  | ");
        else {
            if(this.l[3][1])
                System.out.print(b[3][1] +" | ");
            else
                System.out.print(b[3][1] +"*| ");
        }
        if(b[3][2] == 0)
            System.out.print("  | | ");
        else {
            if(this.l[3][2])
                System.out.print(b[3][2] +" | | ");
            else
                System.out.print(b[3][2] +"*| | ");
        }
        if(b[3][3] == 0)
            System.out.print("  | ");
        else {
            if(this.l[3][3])
                System.out.print(b[3][3] +" | ");
            else
                System.out.print(b[3][3] +"*| ");
        }
        if(b[3][4] == 0)
            System.out.print("  | ");
        else {
            if(this.l[3][4])
                System.out.print(b[3][4] +" | ");
            else
                System.out.print(b[3][4] +"*| ");
        }
        if(b[3][5] == 0)
            System.out.print("  | | ");
        else {
            if(this.l[3][5])
                System.out.print(b[3][5] +" | | ");
            else
                System.out.print(b[3][5] +"*| | ");
        }
        if(b[3][6] == 0)
            System.out.print("  | ");
        else {
            if(this.l[3][6])
                System.out.print(b[3][6] +" | ");
            else
                System.out.print(b[3][6] +"*| ");
        }
        if(b[3][7] == 0)
            System.out.print("  | ");
        else {
            if(this.l[3][7])
                System.out.print(b[3][7] +" | ");
            else
                System.out.print(b[3][7] +"*| ");
        }
        if(b[3][8] == 0)
            System.out.println("  |");
        else {
            if(this.l[3][8])
                System.out.println(b[3][8] +" |");
            else
                System.out.println(b[3][8] +"*|");
        }
        System.out.println("\t\t\t\t\t    +---+---+---+ +---+---+---+ +---+---+---+");
        System.out.print("\t\t\t\t\t  5 | ");
        if(b[4][0] == 0)
            System.out.print("  | ");
        else {
            if(this.l[4][0])
                System.out.print(b[4][0] +" | ");
            else
                System.out.print(b[4][0] +"*| ");
        }
        if(b[4][1] == 0)
            System.out.print("  | ");
        else {
            if(this.l[4][1])
                System.out.print(b[4][1] +" | ");
            else
                System.out.print(b[4][1] +"*| ");
        }
        if(b[4][2] == 0)
            System.out.print("  | | ");
        else {
            if(this.l[4][2])
                System.out.print(b[4][2] +" | | ");
            else
                System.out.print(b[4][2] +"*| | ");
        }
        if(b[4][3] == 0)
            System.out.print("  | ");
        else {
            if(this.l[4][3])
                System.out.print(b[4][3] +" | ");
            else
                System.out.print(b[4][3] +"*| ");
        }
        if(b[4][4] == 0)
            System.out.print("  | ");
        else {
            if(this.l[4][4])
                System.out.print(b[4][4] +" | ");
            else
                System.out.print(b[4][4] +"*| ");
        }
        if(b[4][5] == 0)
            System.out.print("  | | ");
        else {
            if(this.l[4][5])
                System.out.print(b[4][5] +" | | ");
            else
                System.out.print(b[4][5] +"*| | ");
        }
        if(b[4][6] == 0)
            System.out.print("  | ");
        else {
            if(this.l[4][6])
                System.out.print(b[4][6] +" | ");
            else
                System.out.print(b[4][6] +"*| ");
        }
        if(b[4][7] == 0)
            System.out.print("  | ");
        else {
            if(this.l[4][7])
                System.out.print(b[4][7] +" | ");
            else
                System.out.print(b[4][7] +"*| ");
        }
        if(b[4][8] == 0)
            System.out.println("  |");
        else {
            if(this.l[4][8])
                System.out.println(b[4][8] +" |");
            else
                System.out.println(b[4][8] +"*|");
        }
        System.out.println("\t\t\t\t\t    +---+---+---+ +---+---+---+ +---+---+---+");
        System.out.print("\t\t\t\t\t  6 | ");
        if(b[5][0] == 0)
            System.out.print("  | ");
        else {
            if(this.l[5][0])
                System.out.print(b[5][0] +" | ");
            else
                System.out.print(b[5][0] +"*| ");
        }
        if(b[5][1] == 0)
            System.out.print("  | ");
        else {
            if(this.l[5][1])
                System.out.print(b[5][1] +" | ");
            else
                System.out.print(b[5][1] +"*| ");
        }
        if(b[5][2] == 0)
            System.out.print("  | | ");
        else {
            if(this.l[5][2])
                System.out.print(b[5][2] +" | | ");
            else
                System.out.print(b[5][2] +"*| | ");
        }
        if(b[5][3] == 0)
            System.out.print("  | ");
        else {
            if(this.l[5][3])
                System.out.print(b[5][3] +" | ");
            else
                System.out.print(b[5][3] +"*| ");
        }
        if(b[5][4] == 0)
            System.out.print("  | ");
        else {
            if(this.l[5][4])
                System.out.print(b[5][4] +" | ");
            else
                System.out.print(b[5][4] +"*| ");
        }
        if(b[5][5] == 0)
            System.out.print("  | | ");
        else {
            if(this.l[5][5])
                System.out.print(b[5][5] +" | | ");
            else
                System.out.print(b[5][5] +"*| | ");
        }
        if(b[5][6] == 0)
            System.out.print("  | ");
        else {
            if(this.l[5][6])
                System.out.print(b[5][6] +" | ");
            else
                System.out.print(b[5][6] +"*| ");
        }
        if(b[5][7] == 0)
            System.out.print("  | ");
        else {
            if(this.l[5][7])
                System.out.print(b[5][7] +" | ");
            else
                System.out.print(b[5][7] +"*| ");
        }
        if(b[5][8] == 0)
            System.out.println("  |");
        else {
            if(this.l[5][8])
                System.out.println(b[5][8] +" |");
            else
                System.out.println(b[5][8] +"*|");
        }
        System.out.println("\t\t\t\t\t    +---+---+---+ +---+---+---+ +---+---+---+");
        System.out.println("\t\t\t\t\t    +---+---+---+ +---+---+---+ +---+---+---+");
        System.out.print("\t\t\t\t\t  7 | ");
        if(b[6][0] == 0)
            System.out.print("  | ");
        else {
            if(this.l[6][0])
                System.out.print(b[6][0] +" | ");
            else
                System.out.print(b[6][0] +"*| ");
        }
        if(b[6][1] == 0)
            System.out.print("  | ");
        else {
            if(this.l[6][1])
                System.out.print(b[6][1] +" | ");
            else
                System.out.print(b[6][1] +"*| ");
        }
        if(b[6][2] == 0)
            System.out.print("  | | ");
        else {
            if(this.l[6][2])
                System.out.print(b[6][2] +" | | ");
            else
                System.out.print(b[6][2] +"*| | ");
        }
        if(b[6][3] == 0)
            System.out.print("  | ");
        else {
            if(this.l[6][3])
                System.out.print(b[6][3] +" | ");
            else
                System.out.print(b[6][3] +"*| ");
        }
        if(b[6][4] == 0)
            System.out.print("  | ");
        else {
            if(this.l[6][4])
                System.out.print(b[6][4] +" | ");
            else
                System.out.print(b[6][4] +"*| ");
        }
        if(b[6][5] == 0)
            System.out.print("  | | ");
        else {
            if(this.l[6][5])
                System.out.print(b[6][5] +" | | ");
            else
                System.out.print(b[6][5] +"*| | ");
        }
        if(b[6][6] == 0)
            System.out.print("  | ");
        else {
            if(this.l[6][6])
                System.out.print(b[6][6] +" | ");
            else
                System.out.print(b[6][6] +"*| ");
        }
        if(b[6][7] == 0)
            System.out.print("  | ");
        else {
            if(this.l[6][7])
                System.out.print(b[6][7] +" | ");
            else
                System.out.print(b[6][7] +"*| ");
        }
        if(b[6][8] == 0)
            System.out.println("  |");
        else {
            if(this.l[6][8])
                System.out.println(b[6][8] +" |");
            else
                System.out.println(b[6][8] +"*|");
        }
        System.out.println("\t\t\t\t\t    +---+---+---+ +---+---+---+ +---+---+---+");
        System.out.print("\t\t\t\t\t  8 | ");
        if(b[7][0] == 0)
            System.out.print("  | ");
        else {
            if(this.l[7][0])
                System.out.print(b[7][0] +" | ");
            else
                System.out.print(b[7][0] +"*| ");
        }
        if(b[7][1] == 0)
            System.out.print("  | ");
        else {
            if(this.l[7][1])
                System.out.print(b[7][1] +" | ");
            else
                System.out.print(b[7][1] +"*| ");
        }
        if(b[7][2] == 0)
            System.out.print("  | | ");
        else {
            if(this.l[7][2])
                System.out.print(b[7][2] +" | | ");
            else
                System.out.print(b[7][2] +"*| | ");
        }
        if(b[7][3] == 0)
            System.out.print("  | ");
        else {
            if(this.l[7][3])
                System.out.print(b[7][3] +" | ");
            else
                System.out.print(b[7][3] +"*| ");
        }
        if(b[7][4] == 0)
            System.out.print("  | ");
        else {
            if(this.l[7][4])
                System.out.print(b[7][4] +" | ");
            else
                System.out.print(b[7][4] +"*| ");
        }
        if(b[7][5] == 0)
            System.out.print("  | | ");
        else {
            if(this.l[7][5])
                System.out.print(b[7][5] +" | | ");
            else
                System.out.print(b[7][5] +"*| | ");
        }
        if(b[7][6] == 0)
            System.out.print("  | ");
        else {
            if(this.l[7][6])
                System.out.print(b[7][6] +" | ");
            else
                System.out.print(b[7][6] +"*| ");
        }
        if(b[7][7] == 0)
            System.out.print("  | ");
        else {
            if(this.l[7][7])
                System.out.print(b[7][7] +" | ");
            else
                System.out.print(b[7][7] +"*| ");
        }
        if(b[7][8] == 0)
            System.out.println("  |");
        else {
            if(this.l[7][8])
                System.out.println(b[7][8] +" |");
            else
                System.out.println(b[7][8] +"*|");
        }
        System.out.println("\t\t\t\t\t    +---+---+---+ +---+---+---+ +---+---+---+");
        System.out.print("\t\t\t\t\t  9 | ");
        if(b[8][0] == 0)
            System.out.print("  | ");
        else {
            if(this.l[8][0])
                System.out.print(b[8][0] +" | ");
            else
                System.out.print(b[8][0] +"*| ");
        }
        if(b[8][1] == 0)
            System.out.print("  | ");
        else {
            if(this.l[8][1])
                System.out.print(b[8][1] +" | ");
            else
                System.out.print(b[8][1] +"*| ");
        }
        if(b[8][2] == 0)
            System.out.print("  | | ");
        else {
            if(this.l[8][2])
                System.out.print(b[8][2] +" | | ");
            else
                System.out.print(b[8][2] +"*| | ");
        }
        if(b[8][3] == 0)
            System.out.print("  | ");
        else {
            if(this.l[8][3])
                System.out.print(b[8][3] +" | ");
            else
                System.out.print(b[8][3] +"*| ");
        }
        if(b[8][4] == 0)
            System.out.print("  | ");
        else {
            if(this.l[8][4])
                System.out.print(b[8][4] +" | ");
            else
                System.out.print(b[8][4] +"*| ");
        }
        if(b[8][5] == 0)
            System.out.print("  | | ");
        else {
            if(this.l[8][5])
                System.out.print(b[8][5] +" | | ");
            else
                System.out.print(b[8][5] +"*| | ");
        }
        if(b[8][6] == 0)
            System.out.print("  | ");
        else {
            if(this.l[8][6])
                System.out.print(b[8][6] +" | ");
            else
                System.out.print(b[8][6] +"*| ");
        }
        if(b[8][7] == 0)
            System.out.print("  | ");
        else {
            if(this.l[8][7])
                System.out.print(b[8][7] +" | ");
            else
                System.out.print(b[8][7] +"*| ");
        }
        if(b[8][8] == 0)
            System.out.println("  |");
        else {
            if(this.l[8][8])
                System.out.println(b[8][8] +" |");
            else
                System.out.println(b[8][8] +"*|");
        }
        System.out.println("\t\t\t\t\t    +---+---+---+ +---+---+---+ +---+---+---+");
    }
    public void prepare()throws IOException {
        int a, b, c, d, e;
        if(n == 1)
            for(a = 0; a < 35; a++) {
                b = (int)(Math.random() * 9.0);
                c = (int)(Math.random() * 9.0);
                for(d = 0; d < m.length; d++)
                    if(b * 10 + c == m[d]) {
                        a--;
                        d = 100;
                        break;
                    }
                if(d == 100)
                    continue;
                m[a] = b * 10 + c;
                this.b[b][c] = this.a[b][c];
                this.l[b][c] = true;
            }
        else if(n == 2)
            for(a = 0; a < 30; a++) {
                b = (int)(Math.random() * 9.0);
                c = (int)(Math.random() * 9.0);
                for(d = 0; d < m.length; d++)
                    if(b * 10 + c == m[d]) {
                        a--;
                        d = 100;
                        break;
                    }
                if(d == 100)
                    continue;
                m[a] = b * 10 + c;
                this.b[b][c] = this.a[b][c];
                this.l[b][c] = true;
            }
        else
            for(a = 0; a < 25; a++) {
                b = (int)(Math.random() * 9.0);
                c = (int)(Math.random() * 9.0);
                for(d = 0; d < m.length; d++)
                    if(b * 10 + c == m[d]) {
                        a--;
                        d = 100;
                        break;
                    }
                if(d == 100)
                    continue;
                m[a] = b * 10 + c;
                this.b[b][c] = this.a[b][c];
                this.l[b][c] = true;
            }
        working();
    }
    public void working()throws IOException {
        long a = 0, b = 0, e;
        boolean c;
        int d, f, g, h;
        String i;
        try {
            while(true) {
                display();
                while(true) {
                    c = true;
                    System.out.print("\nEnter the row number (or enter \'100\' to exit): ");
                    a = Long.parseLong(br.readLine());
                    if((a < 1 || a > 9) && a != 100)
                        while((a < 1 || a > 9) && a != 100) {
                            System.out.print("Enter a proper row number (between 1 and 9): ");
                            a = Long.parseLong(br.readLine());
                        }
                    if(a == 100) {
                        System.out.print('\u000C');
                        exit();
                        break;
                    }
                    a--;
                    System.out.print("Enter the column number: ");
                    b = Long.parseLong(br.readLine());
                    if(b < 1 || b > 9)
                        while(b < 1 || b > 9) {
                            System.out.print("Enter a proper column number (between 1 and 9): ");
                            b = Long.parseLong(br.readLine());
                        }
                    b--;
                    if(n == 1)
                        for(d = 0; d < 35; d++) {
                            if(a * 10 + b == this.m[d]) {
                                System.out.println("You cannot change that number.");
                                c = false;
                                break;
                            }
                        }
                    else if(n == 2)
                        for(d = 0; d < 30; d++) {
                            if(a * 10 + b == this.m[d]) {
                                System.out.println("You cannot change that number.");
                                c = false;
                                break;
                            }
                        }
                    else if(n == 3)
                        for(d = 0; d < 20; d++) {
                            if(a * 10 + b == this.m[d]) {
                                System.out.println("You cannot change that number.");
                                c = false;
                                break;
                            }
                        }
                    if(c)
                        break;
                }
                if(n == 5)
                    break;
                System.out.print("Enter a number: ");
                e = Long.parseLong(br.readLine());
                if(e < 1 || e > 9)
                    while(e < 1 || e > 9) {
                        System.out.print("Enter a valid number (between 1 and 9): ");
                        e = Long.parseLong(br.readLine());
                    }
                if(this.b[(int)a][(int)b] == (byte)e)
                    this.b[(int)a][(int)b] = 0;
                else
                    this.b[(int)a][(int)b] = (byte)e;
                if(a >= 0 && a <= 2) {
                    if(b >= 0 && b <= 2)
                        this.c[(int)a][(int)b] = this.b[(int)a][(int)b];
                    else if(b >= 3 && b <= 5)
                        this.d[(int)a][(int)(b - 3)] = this.b[(int)a][(int)b];
                    else if(b >= 6 && b <= 8)
                        this.e[(int)a][(int)(b - 6)] = this.b[(int)a][(int)b];
                }
                else if(a >= 3 && a <= 5) {
                    if(b >= 0 && b <= 2)
                        this.f[(int)(a - 3)][(int)b] = this.b[(int)a][(int)b];
                    else if(b >= 3 && b <= 5)
                        this.g[(int)(a - 3)][(int)(b - 3)] = this.b[(int)a][(int)b];
                    else if(b >= 6 && b <= 8)
                        this.h[(int)(a - 3)][(int)(b - 6)] = this.b[(int)a][(int)b];
                }
                else if(a >= 6 && a <= 8) {
                    if(b >= 0 && b <= 2)
                        this.i[(int)(a - 6)][(int)b] = this.b[(int)a][(int)b];
                    else if(b >= 3 && b <= 5)
                        this.j[(int)(a - 6)][(int)(b - 3)] = this.b[(int)a][(int)b];
                    else if(b >= 6 && b <= 8)
                        this.k[(int)(a - 6)][(int)(b - 6)] = this.b[(int)a][(int)b];
                }
                for(d = 0; d < 9; d++)
                    for(f = 0; f < 9; f++) {
                        if(this.b[d][f] == 0)
                            this.l[d][f] = false;
                        else
                            this.l[d][f] = true;
                    }
                for(d = 0; d < 9; d++)
                    for(f = 0; f < 8; f++)
                        for(g = f + 1; g < 9; g++)
                            if(this.b[d][f] == this.b[d][g])
                                this.l[d][f] = this.l[d][g] = false;
                for(d = 0; d < 8; d++)
                    for(f = 0; f < 9; f++)
                        for(g = d + 1; g < 9; g++)
                            if(this.b[d][f] == this.b[g][f])
                                this.l[d][f] = this.l[g][f] = false;
                for(d = 0; d < 3; d++)
                    for(f = 0; f < 3; f++)
                        if(this.b[d][f] != 0)
                            for(g = 0; g < 3; g++)
                                for(h = 0; h < 3; h++)
                                    if(g != d && h != f && this.b[d][f] == this.c[g][h])
                                        this.l[d][f] = this.l[g][h] = false;
                for(d = 0; d < 3; d++)
                    for(f = 3; f < 6; f++)
                        if(this.b[d][f] != 0)
                            for(g = 0; g < 3; g++)
                                for(h = 0; h < 3; h++)
                                    if(g != d && h != f - 3 && this.b[d][f] == this.d[g][h])
                                        this.l[d][f] = this.l[g][h] = false;
                for(d = 0; d < 3; d++)
                    for(f = 6; f < 9; f++)
                        if(this.b[d][f] != 0)
                            for(g = 0; g < 3; g++)
                                for(h = 0; h < 3; h++)
                                    if(g != d && h != f - 6 && this.b[d][f] == this.e[g][h])
                                        this.l[d][f] = this.l[g][h] = false;
                for(d = 3; d < 6; d++)
                    for(f = 0; f < 3; f++)
                        if(this.b[d][f] != 0)
                            for(g = 0; g < 3; g++)
                                for(h = 0; h < 3; h++)
                                    if(g != d - 3 && h != f && this.b[d][f] == this.f[g][h])
                                        this.l[d][f] = this.l[g][h] = false;
                for(d = 3; d < 6; d++)
                    for(f = 3; f < 6; f++)
                        if(this.b[d][f] != 0)
                            for(g = 0; g < 3; g++)
                                for(h = 0; h < 3; h++)
                                    if(g != d - 3 && h != f - 3 && this.b[d][f] == this.g[g][h])
                                        this.l[d][f] = this.l[g][h] = false;
                for(d = 3; d < 6; d++)
                    for(f = 6; f < 9; f++)
                        if(this.b[d][f] != 0)
                            for(g = 0; g < 3; g++)
                                for(h = 0; h < 3; h++)
                                    if(g != d - 3 && h != f - 6 && this.b[d][f] == this.h[g][h])
                                        this.l[d][f] = this.l[g][h] = false;
                for(d = 6; d < 9; d++)
                    for(f = 0; f < 3; f++)
                        if(this.b[d][f] != 0)
                            for(g = 0; g < 3; g++)
                                for(h = 0; h < 3; h++)
                                    if(g != d - 6 && h != f && this.b[d][f] == this.i[g][h])
                                        this.l[d][f] = this.l[g][h] = false;
                for(d = 6; d < 9; d++)
                    for(f = 3; f < 6; f++)
                        if(this.b[d][f] != 0)
                            for(g = 0; g < 3; g++)
                                for(h = 0; h < 3; h++)
                                    if(g != d - 6 && h != f - 3 && this.b[d][f] == this.j[g][h])
                                        this.l[d][f] = this.l[g][h] = false;
                for(d = 6; d < 9; d++)
                    for(f = 6; f < 9; f++)
                        if(this.b[d][f] != 0)
                            for(g = 0; g < 3; g++)
                                for(h = 0; h < 3; h++)
                                    if(g != d - 6 && h != f - 6 && this.b[d][f] == this.k[g][h])
                                        this.l[d][f] = this.l[g][h] = false;
                if(n == 1)
                    for(d = 0; d < 35; d++)
                        this.l[this.m[d] / 10][this.m[d] % 10] = true;
                else if(n == 2)
                    for(d = 0; d < 30; d++)
                        this.l[this.m[d] / 10][this.m[d] % 10] = true;
                else if(n == 3)
                    for(d = 0; d < 25; d++)
                        this.l[this.m[d] / 10][this.m[d] % 10] = true;
                System.out.print('\u000C');
                c = true;
                for(d = 0; d < 9; d++)
                    for(f = 0; f < 9; f++)
                        if(this.l[d][f] == false)
                            c = false;
                if(c)
                    break;
            }
            if(n != 5) {
                System.out.println("Congratulations! You have successfully completed the grid.");
                System.out.print("Enter any character to exit: ");
                i = br.readLine();
                System.out.print('\u000C');
            }
        }
        catch(Exception ex) {
            System.out.println("\nAn error occured!");
            System.out.println("Error: "+ ex);
            System.out.print("Please restart the program to interact...");
        }
    }
    public void game()throws IOException {
        String a;
        try {
            System.out.println("\t\t\t\t\t\t            SUDOKU");
            System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Select a game mode:");
            System.out.println("    1 - Easy");
            System.out.println("    2 - Medium");
            System.out.println("    3 - Hard");
            System.out.println("    4 - Read instructions again");
            System.out.println("    5 - Exit");
            System.out.print("\tEnter your choice: ");
            n = Long.parseLong(br.readLine());
            if(n != 1 && n != 2 && n != 3 && n != 4 && n != 5) {
                while(n != 1 && n != 2 && n != 3 && n != 4 && n != 5) {
                    System.out.println("\tInvalid input! Please enter a valid choice (\'1\', \'2\', \'3\', \'4\' or \'5\'): ");
                    n = Long.parseLong(br.readLine());
                }
            }
            if(n == 1 || n == 2 || n == 3) {
                System.out.print("\nEnter any character to start the game: ");
                a = br.readLine();
                System.out.print('\u000C');
                initialization((int)(Math.random() * 2.0));
                prepare();
            }
            else if(n == 4) {
                System.out.print('\u000C');
                repeatInstructions();
            }
            else if(n == 5) {
                System.out.println("\nThanks for having with us.");
                System.out.println("We wish you a very great day.");
                System.out.print("Visit us again!");
                System.exit(0);
            }
        }
        catch(Exception ex) {
            System.out.println("\nAn error occured!");
            System.out.println("Error: "+ ex);
            System.out.print("Please restart the program to interact...");
        }
    }
    public void exit()throws IOException {
        n = 5;
        game();
    }
    public void repeatInstructions()throws IOException {
        SudokuInstructions si = new SudokuInstructions();
        si.instructions();
        game();
    }
    public static void instructions()throws IOException, InterruptedException {
        SudokuInstructions si = new SudokuInstructions();
        Sudoku s = new Sudoku();
        si.display();
        s.game();
    }
}