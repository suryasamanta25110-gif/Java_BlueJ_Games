package English;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import English.Instructions.LoadingScreen;
import English.Instructions.SnakeAndLadderInstructions;
import English.SnakeAndLadderBoards.*;
public class SnakeAndLadder {
    static int x, ch;
    int r, g, y, b;
    int[][] s = new int[2][7];
    int[][] l = new int[2][7];
    static String[][] z = new String[4][4];
    static String[][] w = new String[4][4];
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    GeneralBoard1 gb1 = new GeneralBoard1();
    GeneralBoard2 gb2 = new GeneralBoard2();
    InvisibleBoard ib = new InvisibleBoard();
    public SnakeAndLadder() {
        r = g = y = b = 0;
        if(x == 0) {
            s[0][0] = 17; s[0][1] = 54; s[0][2] = 62; s[0][3] = 64; s[0][4] = 87; s[0][5] = 92; s[0][6] = 98;
            s[1][0] = 7; s[1][1] = 34; s[1][2] = 19; s[1][3] = 60; s[1][4] = 36; s[1][5] = 73; s[1][6] = 79;
            l[0][0] = 4; l[0][1] = 9; l[0][2] = 21; l[0][3] = 28; l[0][4] = 51; l[0][5] = 72; l[0][6] = 80;
            l[1][0] = 14; l[1][1] = 31; l[1][2] = 42; l[1][3] = 84; l[1][4] = 67; l[1][5] = 91; l[1][6] = 99;
        }
        else if(x == 1) {
            s[0][0] = 31; s[0][1] = 41; s[0][2] = 59; s[0][3] = 67; s[0][4] = 82; s[0][5] = 92; s[0][6] = 99;
            s[1][0] = 14; s[1][1] = 20; s[1][2] = 37; s[1][3] = 50; s[1][4] = 61; s[1][5] = 76; s[1][6] = 4;
            l[0][0] = 8; l[0][1] = 17; l[0][2] = 29; l[0][3] = 39; l[0][4] = 62; l[0][5] = 70; l[0][6] = 75;
            l[1][0] = 12; l[1][1] = 93; l[1][2] = 54; l[1][3] = 80; l[1][4] = 78; l[1][5] = 89; l[1][6] = 96;
        }
    }
    public void display() {
        if(ch == 1 || ch == 3 || ch == 4) {
            if(x == 0)
                gb1.main(r, g, y, b);
            else if(x == 1)
                gb2.main(r, g, y, b);
        }
        else if(ch == 2)
            ib.main(r, g, y, b);
    }
    public void general()throws IOException, InterruptedException {
        int a, c, f = 0, g;
        long b;
        boolean e[] = {false, false, false, false};
        String d = null;
        try {
            for(b = 0; f < 3; b++) {
                if((r == 100 && b % 4 == 0) || (this.g == 100 && b % 4 == 1) || (y == 100 && b % 4 == 2) || (this.b == 100 && b % 4 == 3))
                    continue;
                if(b % 4 == 0) {
                    System.out.println("\n\nCurrent scores :");
                    System.out.println("\t"+ '\u24C7' +" RED    : "+ r);
                    System.out.println("\t"+ '\u24BC' +" GREEN  : "+ this.g);
                    System.out.println("\t"+ '\u24CE' +" YELLOW : "+ y);
                    System.out.println("\t"+ '\u24B7' +" BLUE   : "+ this.b);
                    for(c = 0; c < 4; c++)
                        if(z[1][c].equals("RED"))
                            break;
                    System.out.println("\nTurn for "+ z[0][c] +" ("+ z[1][c] +") :");
                    System.out.print("Enter any character to roll the dice (or \'100\' to exit) : ");
                    if(z[0][c].equals("COMPUTER")) {
                        d = Character.toString((char)((int)(Math.random() * 100.0)));
                        Thread.sleep(1000);
                        System.out.println(d);
                    }
                    else
                        d = br.readLine();
                    if(d.equals("100")) {
                        System.out.print("Closing the game. Please wait");
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(1000);
                        System.out.print('\u000C');
                        break;
                    }
                    a = (int)(Math.random() * 6.0) + 1;
                    System.out.print("Dice results : "+ a);
                    Thread.sleep(2000);
                    if(r + a == 100)
                        for(g = 0; g < 4; g++)
                            if(w[0][g] == null) {
                                w[0][g] = z[0][c];
                                w[1][g] = z[1][c];
                                break;
                            }
                    if((r == 0 && a != 1) || (r + a > 100)) {
                        System.out.print('\u000C');
                        display();
                        Thread.sleep(1000);
                    }
                    else {
                        while(a > 0) {
                            a--;
                            r++;
                            System.out.print('\u000C');
                            display();
                            Thread.sleep(1000);
                        }
                    }
                    for(c = 0; c < 7; c++) {
                        if(r == s[0][c]) {
                            r = s[1][c];
                            System.out.print('\u000C');
                            display();
                            Thread.sleep(1000);
                            break;
                        }
                        else if(r == l[0][c]) {
                            r = l[1][c];
                            System.out.print('\u000C');
                            display();
                            Thread.sleep(1000);
                            break;
                        }
                    }
                    if(ch == 3)
                        if(r > 1 && r < 100 && (r == this.g || r == y || r == this.b)) {
                            if(r == this.g)
                                this.g = 1;
                            else if(r == y)
                                y = 1;
                            else if(r == this.b)
                                this.b = 1;
                            System.out.print('\u000C');
                            display();
                            Thread.sleep(1000);
                        }
                }
                else if(b % 4 == 1) {
                    System.out.println("\n\nCurrent scores :");
                    System.out.println("\t"+ '\u24C7' +" RED    : "+ r);
                    System.out.println("\t"+ '\u24BC' +" GREEN  : "+ this.g);
                    System.out.println("\t"+ '\u24CE' +" YELLOW : "+ y);
                    System.out.println("\t"+ '\u24B7' +" BLUE   : "+ this.b);
                    for(c = 0; c < 4; c++)
                        if(z[1][c].equals("GREEN"))
                            break;
                    System.out.println("\nTurn for "+ z[0][c] +" ("+ z[1][c] +") :");
                    System.out.print("Enter any character to roll the dice (or \'100\' to exit) : ");
                    if(z[0][c].equals("COMPUTER")) {
                        d = Character.toString((char)((int)(Math.random() * 100.0)));
                        Thread.sleep(1000);
                        System.out.println(d);
                    }
                    else
                        d = br.readLine();
                    if(d.equals("100")) {
                        System.out.print("Closing the game. Please wait");
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(1000);
                        System.out.print('\u000C');
                        break;
                    }
                    a = (int)(Math.random() * 6.0) + 1;
                    System.out.print("Dice results : "+ a);
                    Thread.sleep(2000);
                    if(this.g + a == 100)
                        for(g = 0; g < 4; g++)
                            if(w[0][g] == null) {
                                w[0][g] = z[0][c];
                                w[1][g] = z[1][c];
                                break;
                            }
                    if((this.g == 0 && a != 1) || (a + this.g > 100)) {
                        System.out.print('\u000C');
                        display();
                        Thread.sleep(1000);
                    }
                    else {
                        while(a > 0) {
                            a--;
                            this.g++;
                            System.out.print('\u000C');
                            display();
                            Thread.sleep(1000);
                        }
                    }
                    for(c = 0; c < 7; c++) {
                        if(this.g == s[0][c]) {
                            this.g = s[1][c];
                            System.out.print('\u000C');
                            display();
                            Thread.sleep(1000);
                            break;
                        }
                        else if(this.g == l[0][c]) {
                            this.g = l[1][c];
                            System.out.print('\u000C');
                            display();
                            Thread.sleep(1000);
                            break;
                        }
                    }
                    if(ch == 3)
                        if(this.g > 1 && this.g < 100 && (this.g == r || this.g == y || this.g == this.b)) {
                            if(this.g == r)
                                r = 1;
                            else if(this.g == y)
                                y = 1;
                            else if(this.g == this.b)
                                this.b = 1;
                            System.out.print('\u000C');
                            display();
                            Thread.sleep(1000);
                        }
                }
                else if(b % 4 == 2) {
                    System.out.println("\n\nCurrent scores :");
                    System.out.println("\t"+ '\u24C7' +" RED    : "+ r);
                    System.out.println("\t"+ '\u24BC' +" GREEN  : "+ this.g);
                    System.out.println("\t"+ '\u24CE' +" YELLOW : "+ y);
                    System.out.println("\t"+ '\u24B7' +" BLUE   : "+ this.b);
                    for(c = 0; c < 4; c++)
                        if(z[1][c].equals("YELLOW"))
                            break;
                    System.out.println("\nTurn for "+ z[0][c] +" ("+ z[1][c] +") :");
                    System.out.print("Enter any character to roll the dice (or \'100\' to exit) : ");
                    if(z[0][c].equals("COMPUTER")) {
                        d = Character.toString((char)((int)(Math.random() * 100.0)));
                        Thread.sleep(1000);
                        System.out.println(d);
                    }
                    else
                        d = br.readLine();
                    if(d.equals("100")) {
                        System.out.print("Closing the game. Please wait");
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(1000);
                        System.out.print('\u000C');
                        break;
                    }
                    a = (int)(Math.random() * 6.0) + 1;
                    System.out.print("Dice results : "+ a);
                    Thread.sleep(2000);
                    if(y + a == 100)
                        for(g = 0; g < 4; g++)
                            if(w[0][g] == null) {
                                w[0][g] = z[0][c];
                                w[1][g] = z[1][c];
                                break;
                            }
                    if((y == 0 && a != 1) || (a + y > 100)) {
                        System.out.print('\u000C');
                        display();
                        Thread.sleep(1000);
                    }
                    else {
                        while(a > 0) {
                            a--;
                            y++;
                            System.out.print('\u000C');
                            display();
                            Thread.sleep(1000);
                        }
                    }
                    for(c = 0; c < 7; c++) {
                        if(y == s[0][c]) {
                            y = s[1][c];
                            System.out.print('\u000C');
                            display();
                            Thread.sleep(1000);
                            break;
                        }
                        else if(y == l[0][c]) {
                            y = l[1][c];
                            System.out.print('\u000C');
                            display();
                            Thread.sleep(1000);
                            break;
                        }
                    }
                    if(ch == 3)
                        if(y > 1 && y < 100 && (y == r || y == this.g || y == this.b)) {
                            if(y == r)
                                r = 1;
                            else if(y == this.g)
                                this.g = 1;
                            else if(y == this.b)
                                this.b = 1;
                            System.out.print('\u000C');
                            display();
                            Thread.sleep(1000);
                        }
                }
                else if(b % 4 == 3) {
                    System.out.println("\n\nCurrent scores :");
                    System.out.println("\t"+ '\u24C7' +" RED    : "+ r);
                    System.out.println("\t"+ '\u24BC' +" GREEN  : "+ this.g);
                    System.out.println("\t"+ '\u24CE' +" YELLOW : "+ y);
                    System.out.println("\t"+ '\u24B7' +" BLUE   : "+ this.b);
                    for(c = 0; c < 4; c++)
                        if(z[1][c].equals("BLUE"))
                            break;
                    System.out.println("\nTurn for "+ z[0][c] +" ("+ z[1][c] +") :");
                    System.out.print("Enter any character to roll the dice (or \'100\' to exit) : ");
                    if(z[0][c].equals("COMPUTER")) {
                        d = Character.toString((char)((int)(Math.random() * 100.0)));
                        Thread.sleep(1000);
                        System.out.println(d);
                    }
                    else
                        d = br.readLine();
                    if(d.equals("100")) {
                        System.out.print("Closing the game. Please wait");
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(1000);
                        System.out.print('\u000C');
                        break;
                    }
                    a = (int)(Math.random() * 6.0) + 1;
                    System.out.print("Dice results : "+ a);
                    Thread.sleep(2000);
                    if(b + a == 100)
                        for(g = 0; g < 4; g++)
                            if(w[0][g] == null) {
                                w[0][g] = z[0][c];
                                w[1][g] = z[1][c];
                                break;
                            }
                    if((this.b == 0 && a != 1) || (this.b + a > 100)) {
                        System.out.print('\u000C');
                        display();
                        Thread.sleep(1000);
                    }
                    else {
                        while(a > 0) {
                            a--;
                            this.b++;
                            System.out.print('\u000C');
                            display();
                            Thread.sleep(1000);
                        }
                    }
                    for(c = 0; c < 7; c++) {
                        if(this.b == s[0][c]) {
                            this.b = s[1][c];
                            System.out.print('\u000C');
                            display();
                            Thread.sleep(1000);
                            break;
                        }
                        else if(this.b == l[0][c]) {
                            this.b = l[1][c];
                            System.out.print('\u000C');
                            display();
                            Thread.sleep(1000);
                            break;
                        }
                    }
                    if(ch == 3)
                        if(this.b > 1 && this.b < 100 && (this.b == r || this.b == this.g || this.b == y)) {
                            if(this.b == r)
                                r = 1;
                            else if(this.b == this.g)
                                this.g = 1;
                            else if(this.b == y)
                                y = 1;
                            System.out.print('\u000C');
                            display();
                            Thread.sleep(1000);
                        }
                }
                if(r == 100)
                    e[0] = true;
                if(this.g == 100)
                    e[1] = true;
                if(y == 100)
                    e[2] = true;
                if(this.b == 100)
                    e[3] = true;
                f = 0;
                for(a = 0; a < 4; a++)
                    if(e[a])
                        f++;
            }
            if(d.equals("100") == false) {
                System.out.println("\nCongratulations players! We have successfully come to an end of this game.");
                System.out.println("The result of the game is as follows :");
                System.out.println("\n\tFirst  : "+ w[0][0] +" ("+ w[1][0] +")");
                System.out.println("\tSecond : "+ w[0][1] +" ("+ w[1][1] +")");
                System.out.println("\tThird  : "+ w[0][2] +" ("+ w[1][2] +")");
                Thread.sleep(2000);
                System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("\t\t\t\t\t\t            CREDITS");
                System.out.println("\nCREATED BY :");
                System.out.println("\tSurya Samanta");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("\nEnter anything to return to the home screen : ");
                d = br.readLine();
                System.out.print('\u000C');
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
        }
    }
    public void pushpull()throws IOException, InterruptedException {
        int a, c, f = 0, g;
        long b;
        boolean e[] = {false, false, false, false};
        boolean h;
        String d = null;
        try {
            for(b = 0; f < 3; b++) {
                if((r == 100 && b % 4 == 0) || (this.g == 100 && b % 4 == 1) || (y == 100 && b % 4 == 2) || (this.b == 100 && b % 4 == 3))
                    continue;
                if(b % 4 == 0) {
                    System.out.println("\n\nCurrent scores :");
                    System.out.println("\t"+ '\u24C7' +" RED    : "+ r);
                    System.out.println("\t"+ '\u24BC' +" GREEN  : "+ this.g);
                    System.out.println("\t"+ '\u24CE' +" YELLOW : "+ y);
                    System.out.println("\t"+ '\u24B7' +" BLUE   : "+ this.b);
                    for(c = 0; c < 4; c++)
                        if(z[1][c].equals("RED"))
                            break;
                    System.out.println("\nTurn for "+ z[0][c] +" ("+ z[1][c] +") :");
                    System.out.print("Enter any character to roll the dice (or \'100\' to exit) : ");
                    if(z[0][c].equals("COMPUTER")) {
                        d = Character.toString((char)((int)(Math.random() * 100.0)));
                        Thread.sleep(1000);
                        System.out.println(d);
                    }
                    else
                        d = br.readLine();
                    if(d.equals("100")) {
                        System.out.print("Closing the game. Please wait");
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(1000);
                        System.out.print('\u000C');
                        break;
                    }
                    a = (int)(Math.random() * 6.0) + 1;
                    System.out.println("Dice results : "+ a);
                    if(r == 0 && a != 1) {
                        System.out.print('\u000C');
                        display();
                        Thread.sleep(1000);
                    }
                    else {
                        System.out.print("Enter any character to roll the dice (or \'100\' to exit) : ");
                        if(z[0][c].equals("COMPUTER")) {
                            d = z[1][c];
                            Thread.sleep(1000);
                            System.out.print(d);
                        }
                        else {
                            d = br.readLine();
                            d = d.toUpperCase();
                        }
                        do {
                            h = false;
                            if((d.equals("RED") || d.equals("GREEN") || d.equals("YELLOW") || d.equals("BLUE")) == false) 
                                while((d.equals("RED") || d.equals("GREEN") || d.equals("YELLOW") || d.equals("BLUE")) == false) {
                                    System.out.print("Colour not found! Enter a valid colour : ");
                                    d = br.readLine();
                                    d = d.toUpperCase();
                                }
                            if(d.equals("RED") && r + a > 100)
                                h = true;
                            else if(d.equals("GREEN") && this.g - a < 1)
                                h = true;
                            else if(d.equals("YELLOW") && y - a < 1)
                                h = true;
                            else if(d.equals("BLUE") && this.b - a < 1)
                                h = true;
                            if(h) {
                                System.out.print("Invalid move! Please enter a valid colour : ");
                                d = br.readLine();
                                d = d.toUpperCase();
                            }
                        } while(h);
                        if(r + a == 100)
                            for(g = 0; g < 4; g++)
                                if(w[0][g] == null) {
                                    w[0][g] = z[0][c];
                                    w[1][g] = z[1][c];
                                    break;
                                }
                        Thread.sleep(2000);
                        while(a > 0) {
                            a--;
                            if(d.equals("RED"))
                                r++;
                            else if(d.equals("GREEN"))
                                this.g--;
                            else if(d.equals("YELLOW"))
                                y--;
                            else if(d.equals("BLUE"))
                                this.b--;
                            System.out.print('\u000C');
                            display();
                            Thread.sleep(1000);
                        }
                    }
                    for(c = 0; c < 7; c++) {
                        if(r == s[0][c] || this.g == s[0][c] || y == s[0][c] || this.b == s[0][c]) {
                            if(r == s[0][c])
                                r = s[1][c];
                            else if(this.g == s[0][c])
                                this.g = s[1][c];
                            else if(y == s[0][c])
                                y = s[1][c];
                            else if(this.b == s[0][c])
                                this.b = s[1][c];
                            System.out.print('\u000C');
                            display();
                            Thread.sleep(1000);
                            break;
                        }
                        else if(r == l[0][c] || this.g == l[0][c] || y == l[0][c] || this.b == l[0][c]) {
                            if(r == l[0][c])
                                r = l[1][c];
                            else if(this.g == l[0][c])
                                this.g = l[1][c];
                            else if(y == l[0][c])
                                y = l[1][c];
                            else if(this.b == l[0][c])
                                this.b = l[1][c];
                            System.out.print('\u000C');
                            display();
                            Thread.sleep(1000);
                            break;
                        }
                    }
                }
                else if(b % 4 == 1) {
                    System.out.println("\n\nCurrent scores :");
                    System.out.println("\t"+ '\u24C7' +" RED    : "+ r);
                    System.out.println("\t"+ '\u24BC' +" GREEN  : "+ this.g);
                    System.out.println("\t"+ '\u24CE' +" YELLOW : "+ y);
                    System.out.println("\t"+ '\u24B7' +" BLUE   : "+ this.b);
                    for(c = 0; c < 4; c++)
                        if(z[1][c].equals("GREEN"))
                            break;
                    System.out.println("\nTurn for "+ z[0][c] +" ("+ z[1][c] +") :");
                    System.out.print("Enter any character to roll the dice (or \'100\' to exit) : ");
                    if(z[0][c].equals("COMPUTER")) {
                        d = Character.toString((char)((int)(Math.random() * 100.0)));
                        Thread.sleep(1000);
                        System.out.println(d);
                    }
                    else
                        d = br.readLine();
                    if(d.equals("100")) {
                        System.out.print("Closing the game. Please wait");
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(1000);
                        System.out.print('\u000C');
                        break;
                    }
                    a = (int)(Math.random() * 6.0) + 1;
                    System.out.println("Dice results : "+ a);
                    if(this.g == 0 && a != 1) {
                        System.out.print('\u000C');
                        display();
                        Thread.sleep(1000);
                    }
                    else {
                        System.out.print("Enter the colour you want to move : ");
                        if(z[0][c].equals("COMPUTER")) {
                            d = z[1][c];
                            Thread.sleep(1000);
                            System.out.print(d);
                        }
                        else {
                            d = br.readLine();
                            d = d.toUpperCase();
                        }
                        do {
                            h = false;
                            if((d.equals("RED") || d.equals("GREEN") || d.equals("YELLOW") || d.equals("BLUE")) == false) 
                                while((d.equals("RED") || d.equals("GREEN") || d.equals("YELLOW") || d.equals("BLUE")) == false) {
                                    System.out.print("Colour not found! Enter a valid colour : ");
                                    d = br.readLine();
                                    d = d.toUpperCase();
                                }
                            if(d.equals("RED") && r + a > 100)
                                h = true;
                            else if(d.equals("GREEN") && this.g - a < 1)
                                h = true;
                            else if(d.equals("YELLOW") && y - a < 1)
                                h = true;
                            else if(d.equals("BLUE") && this.b - a < 1)
                                h = true;
                            if(h) {
                                System.out.print("Invalid move! Please enter a valid colour : ");
                                d = br.readLine();
                                d = d.toUpperCase();
                            }
                        } while(h);
                        if(this.g + a == 100)
                            for(g = 0; g < 4; g++)
                                if(w[0][g] == null) {
                                    w[0][g] = z[0][c];
                                    w[1][g] = z[1][c];
                                    break;
                                }
                        Thread.sleep(2000);
                        while(a > 0) {
                            a--;
                            if(d.equals("RED"))
                                r--;
                            else if(d.equals("GREEN"))
                                this.g++;
                            else if(d.equals("YELLOW"))
                                y--;
                            else if(d.equals("BLUE"))
                                this.b--;
                            System.out.print('\u000C');
                            display();
                            Thread.sleep(1000);
                        }
                    }
                    for(c = 0; c < 7; c++) {
                        if(r == s[0][c] || this.g == s[0][c] || y == s[0][c] || this.b == s[0][c]) {
                            if(r == s[0][c])
                                r = s[1][c];
                            else if(this.g == s[0][c])
                                this.g = s[1][c];
                            else if(y == s[0][c])
                                y = s[1][c];
                            else if(this.b == s[0][c])
                                this.b = s[1][c];
                            System.out.print('\u000C');
                            display();
                            Thread.sleep(1000);
                            break;
                        }
                        else if(r == l[0][c] || this.g == l[0][c] || y == l[0][c] || this.b == l[0][c]) {
                            if(r == l[0][c])
                                r = l[1][c];
                            else if(this.g == l[0][c])
                                this.g = l[1][c];
                            else if(y == l[0][c])
                                y = l[1][c];
                            else if(this.b == l[0][c])
                                this.b = l[1][c];
                            System.out.print('\u000C');
                            display();
                            Thread.sleep(1000);
                            break;
                        }
                    }
                }
                else if(b % 4 == 2) {
                    System.out.println("\n\nCurrent scores :");
                    System.out.println("\t"+ '\u24C7' +" RED    : "+ r);
                    System.out.println("\t"+ '\u24BC' +" GREEN  : "+ this.g);
                    System.out.println("\t"+ '\u24CE' +" YELLOW : "+ y);
                    System.out.println("\t"+ '\u24B7' +" BLUE   : "+ this.b);
                    for(c = 0; c < 4; c++)
                        if(z[1][c].equals("YELLOW"))
                            break;
                    System.out.println("\nTurn for "+ z[0][c] +" ("+ z[1][c] +") :");
                    System.out.print("Enter any character to roll the dice (or \'100\' to exit) : ");
                    if(z[0][c].equals("COMPUTER")) {
                        d = Character.toString((char)((int)(Math.random() * 100.0)));
                        Thread.sleep(1000);
                        System.out.println(d);
                    }
                    else
                        d = br.readLine();
                    if(d.equals("100")) {
                        System.out.print("Closing the game. Please wait");
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(1000);
                        System.out.print('\u000C');
                        break;
                    }
                    a = (int)(Math.random() * 6.0) + 1;
                    System.out.println("Dice results : "+ a);
                    if(y == 0 && a != 1) {
                        System.out.print('\u000C');
                        display();
                        Thread.sleep(1000);
                    }
                    else {
                        System.out.print("Enter the colour you want to move : ");
                        if(z[0][c].equals("COMPUTER")) {
                            d = z[1][c];
                            Thread.sleep(1000);
                            System.out.print(d);
                        }
                        else {
                            d = br.readLine();
                            d = d.toUpperCase();
                        }
                        do {
                            h = false;
                            if((d.equals("RED") || d.equals("GREEN") || d.equals("YELLOW") || d.equals("BLUE")) == false) 
                                while((d.equals("RED") || d.equals("GREEN") || d.equals("YELLOW") || d.equals("BLUE")) == false) {
                                    System.out.print("Colour not found! Enter a valid colour : ");
                                    d = br.readLine();
                                    d = d.toUpperCase();
                                }
                            if(d.equals("RED") && r + a > 100)
                                h = true;
                            else if(d.equals("GREEN") && this.g - a < 1)
                                h = true;
                            else if(d.equals("YELLOW") && y - a < 1)
                                h = true;
                            else if(d.equals("BLUE") && this.b - a < 1)
                                h = true;
                            if(h) {
                                System.out.print("Invalid move! Please enter a valid colour : ");
                                d = br.readLine();
                                d = d.toUpperCase();
                            }
                        } while(h);
                        if(y + a == 100)
                            for(g = 0; g < 4; g++)
                                if(w[0][g] == null) {
                                    w[0][g] = z[0][c];
                                    w[1][g] = z[1][c];
                                    break;
                                }
                        Thread.sleep(2000);
                        while(a > 0) {
                            a--;
                            if(d.equals("RED"))
                                r--;
                            else if(d.equals("GREEN"))
                                this.g--;
                            else if(d.equals("YELLOW"))
                                y++;
                            else if(d.equals("BLUE"))
                                this.b--;
                            System.out.print('\u000C');
                            display();
                            Thread.sleep(1000);
                        }
                    }
                    for(c = 0; c < 7; c++) {
                        if(r == s[0][c] || this.g == s[0][c] || y == s[0][c] || this.b == s[0][c]) {
                            if(r == s[0][c])
                                r = s[1][c];
                            else if(this.g == s[0][c])
                                this.g = s[1][c];
                            else if(y == s[0][c])
                                y = s[1][c];
                            else if(this.b == s[0][c])
                                this.b = s[1][c];
                            System.out.print('\u000C');
                            display();
                            Thread.sleep(1000);
                            break;
                        }
                        else if(r == l[0][c] || this.g == l[0][c] || y == l[0][c] || this.b == l[0][c]) {
                            if(r == l[0][c])
                                r = l[1][c];
                            else if(this.g == l[0][c])
                                this.g = l[1][c];
                            else if(y == l[0][c])
                                y = l[1][c];
                            else if(this.b == l[0][c])
                                this.b = l[1][c];
                            System.out.print('\u000C');
                            display();
                            Thread.sleep(1000);
                            break;
                        }
                    }
                }
                else if(b % 4 == 3) {
                    System.out.println("\n\nCurrent scores :");
                    System.out.println("\t"+ '\u24C7' +" RED    : "+ r);
                    System.out.println("\t"+ '\u24BC' +" GREEN  : "+ this.g);
                    System.out.println("\t"+ '\u24CE' +" YELLOW : "+ y);
                    System.out.println("\t"+ '\u24B7' +" BLUE   : "+ this.b);
                    for(c = 0; c < 4; c++)
                        if(z[1][c].equals("BLUE"))
                            break;
                    System.out.println("\nTurn for "+ z[0][c] +" ("+ z[1][c] +") :");
                    System.out.print("Enter any character to roll the dice (or \'100\' to exit) : ");
                    if(z[0][c].equals("COMPUTER")) {
                        d = Character.toString((char)((int)(Math.random() * 100.0)));
                        Thread.sleep(1000);
                        System.out.println(d);
                    }
                    else
                        d = br.readLine();
                    if(d.equals("100")) {
                        System.out.print("Closing the game. Please wait");
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(1000);
                        System.out.print('\u000C');
                        break;
                    }
                    a = (int)(Math.random() * 6.0) + 1;
                    System.out.println("Dice results : "+ a);
                    if(this.b == 0 && a != 1) {
                        System.out.print('\u000C');
                        display();
                        Thread.sleep(1000);
                    }
                    else {
                        System.out.print("Enter the colour you want to move : ");
                        if(z[0][c].equals("COMPUTER")) {
                            d = z[1][c];
                            Thread.sleep(1000);
                            System.out.print(d);
                        }
                        else {
                            d = br.readLine();
                            d = d.toUpperCase();
                        }
                        do {
                            h = false;
                            if((d.equals("RED") || d.equals("GREEN") || d.equals("YELLOW") || d.equals("BLUE")) == false) 
                                while((d.equals("RED") || d.equals("GREEN") || d.equals("YELLOW") || d.equals("BLUE")) == false) {
                                    System.out.print("Colour not found! Enter a valid colour : ");
                                    d = br.readLine();
                                    d = d.toUpperCase();
                                }
                            if(d.equals("RED") && r + a > 100)
                                h = true;
                            else if(d.equals("GREEN") && this.g - a < 1)
                                h = true;
                            else if(d.equals("YELLOW") && y - a < 1)
                                h = true;
                            else if(d.equals("BLUE") && this.b - a < 1)
                                h = true;
                            if(h) {
                                System.out.print("Invalid move! Please enter a valid colour : ");
                                d = br.readLine();
                                d = d.toUpperCase();
                            }
                        } while(h);
                        if(this.b + a == 100)
                            for(g = 0; g < 4; g++)
                                if(w[0][g] == null) {
                                    w[0][g] = z[0][c];
                                    w[1][g] = z[1][c];
                                    break;
                                }
                        Thread.sleep(2000);
                        while(a > 0) {
                            a--;
                            if(d.equals("RED"))
                                r--;
                            else if(d.equals("GREEN"))
                                this.g--;
                            else if(d.equals("YELLOW"))
                                y--;
                            else if(d.equals("BLUE"))
                                this.b++;
                            System.out.print('\u000C');
                            display();
                            Thread.sleep(1000);
                        }
                    }
                    for(c = 0; c < 7; c++) {
                        if(r == s[0][c] || this.g == s[0][c] || y == s[0][c] || this.b == s[0][c]) {
                            if(r == s[0][c])
                                r = s[1][c];
                            else if(this.g == s[0][c])
                                this.g = s[1][c];
                            else if(y == s[0][c])
                                y = s[1][c];
                            else if(this.b == s[0][c])
                                this.b = s[1][c];
                            System.out.print('\u000C');
                            display();
                            Thread.sleep(1000);
                            break;
                        }
                        else if(r == l[0][c] || this.g == l[0][c] || y == l[0][c] || this.b == l[0][c]) {
                            if(r == l[0][c])
                                r = l[1][c];
                            else if(this.g == l[0][c])
                                this.g = l[1][c];
                            else if(y == l[0][c])
                                y = l[1][c];
                            else if(this.b == l[0][c])
                                this.b = l[1][c];
                            System.out.print('\u000C');
                            display();
                            Thread.sleep(1000);
                            break;
                        }
                    }
                }
                if(r == 100)
                    e[0] = true;
                if(this.g == 100)
                    e[1] = true;
                if(y == 100)
                    e[2] = true;
                if(this.b == 100)
                    e[3] = true;
                f = 0;
                for(a = 0; a < 4; a++)
                    if(e[a])
                        f++;
            }
            if(d.equals("100") == false) {
                System.out.println("\nCongratulations players! We have successfully come to an end of this game.");
                System.out.println("The result of the game is as follows :");
                System.out.println("\n\tFirst  : "+ w[0][0] +" ("+ w[1][0] +")");
                System.out.println("\tSecond : "+ w[0][1] +" ("+ w[1][1] +")");
                System.out.println("\tThird  : "+ w[0][2] +" ("+ w[1][2] +")");
                Thread.sleep(2000);
                System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("\t\t\t\t\t\t            CREDITS");
                System.out.println("\nCREATED BY :");
                System.out.println("\tSurya Samanta");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("\nEnter anything to return to the home screen : ");
                d = br.readLine();
                System.out.print('\u000C');
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
        }
    }
    public static void main(int intro)throws IOException, InterruptedException {
        int b, d, e;
        boolean f;
        String[] c = {"RED", "GREEN", "YELLOW", "BLUE"};
        x = (int)(Math.random() * 2.0);
        SnakeAndLadder sal = new SnakeAndLadder();
        SnakeAndLadderInstructions sali = new SnakeAndLadderInstructions();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        LoadingScreen ls = new LoadingScreen();
        try {
            if(intro == 0)
                sali.display();
            do {
                System.out.println("\t\t\t\t\t\t       SNAKE AND LADDER");
                System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Choose any one of the following :");
                System.out.println("    1 - Read instructions");
                System.out.println("    2 - Enter the game");
                System.out.println("    3 - Exit");
                System.out.print("\tEnter your choice : ");
                b = Integer.parseInt(br.readLine());
                if(b != 1 && b != 2 && b != 3)
                    while(b != 1 && b != 2 && b != 3) {
                        System.out.print("\tInvalid input! Please enter a valid choice : ");
                        b = Integer.parseInt(br.readLine());
                    }
                if(b == 1) {
                    System.out.print('\u000C');
                    sali.instructions();
                }
            } while(b == 1);
            if(b == 2) {
                System.out.print("\nEnter the number of players playing : ");
                b = Integer.parseInt(br.readLine());
                if(b < 2 || b > 4)
                    while(b < 2 || b > 4) {
                        System.out.print("Invalid input! Please enter a value between 2 and 4 : ");
                        b = Integer.parseInt(br.readLine());
                    }
                System.out.println("\nEnter the names of the players and the colours they want to play with :");
                for(d = 0; d < b; d++) {
                    f = true;
                    System.out.print("\n\tName   : ");
                    z[0][d] = br.readLine();
                    z[0][d] = z[0][d].toUpperCase();
                    System.out.print("\tColour : ");
                    z[1][d] = br.readLine();
                    z[1][d] = z[1][d].toUpperCase();
                    while(true) {
                        f = (z[1][d].equals("RED") || z[1][d].equals("GREEN") || z[1][d].equals("YELLOW") || z[1][d].equals("BLUE"));
                        if(f == false)
                            while(f == false) {
                                System.out.print("\tInvalid input! Only RED, GREEN, YELLOW and BLUE colours are accepted : ");
                                z[1][d] = br.readLine();
                                z[1][d] = z[1][d].toUpperCase();
                                f = (z[1][d].equals("RED") || z[1][d].equals("GREEN") || z[1][d].equals("YELLOW") || z[1][d].equals("BLUE"));
                            }
                        for(e = 0; e < 4; e++)
                            if(z[1][d].equalsIgnoreCase(c[e])) {
                                c[e] = null;
                                break;
                            }
                        if(e == 4) {
                            System.out.print("\t"+ z[1][d] +" is already chosen. Choose another colour : ");
                            z[1][d] = br.readLine();
                            z[1][d] = z[1][d].toUpperCase();
                        }
                        else
                            break;
                    }
                }
                if(b < 3) {
                    z[0][2] = "COMPUTER";
                    for(e = 0; e < 4; e++)
                        if(c[e] != null) {
                            z[1][2] = c[e];
                            c[e] = null;
                            break;
                        }
                }
                if(b < 4) {
                    z[0][3] = "COMPUTER";
                    for(e = 0; e < 4; e++)
                        if(c[e] != null) {
                            z[1][3] = c[e];
                            c[e] = null;
                            break;
                        }
                }
                do {
                    System.out.println("\nSelect a mode :");
                    System.out.println("    1 - General mode");
                    System.out.println("    2 - Invisible mode");
                    System.out.println("    3 - Wipe out mode");
                    System.out.println("    4 - Push pull mode");
                    System.out.println("    5 - Read description of each mode");
                    System.out.print("\tEnter your choice : ");
                    ch = Integer.parseInt(br.readLine());
                    if(ch != 1 && ch != 2 && ch != 3 && ch != 4 && ch != 5)
                        while(ch != 1 && ch != 2 && ch != 3 && ch != 4 && ch != 5) {
                            System.out.print("\tInvalid input! Please enter a number among the choices given : ");
                            ch = Integer.parseInt(br.readLine());
                        }
                    if(ch == 5) {
                        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("\t\t\t\t\t\t          DESCRIPTION");
                        System.out.println("\nGENERAL MODE");
                        System.out.println("\tIt is the general snake and ladder game. The ladders will take you up and the snakes will throw you down. The");
                        System.out.println("\tplayer to reach 100 first wins.");
                        System.out.println("\nINVISIBLE MODE");
                        System.out.println("\tSimilar to genertal mode, the snakes and the ladders will not be visible to the players. ");
                        System.out.println("\nWIPE OUT MODE");
                        System.out.println("\tIn this mode, if a player A, in his turn achieves the same score as of another player B, then player B has to ");
                        System.out.println("\tstart from the beginning. In other words, players can wipe out each other.");
                        System.out.println("\nPUSH PULL MODE");
                        System.out.println("\tIn this mode, you can now choose whether you will make yourself push forward or pull others backward. Roll the dice");
                        System.out.println("\tand then choose what you feel good.");
                        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    }
                } while(ch == 5);
                System.out.println("\n\t\t\t\t"+ z[1][0] +"\t\t\t\t"+ z[1][1]);
                System.out.print("\t\t\t\t"+ z[0][0]);
                if(z[0][0].length() < 8)
                    System.out.print("\t");
                if(z[0][0].length() < 16)
                    System.out.print("\t");
                if(z[0][0].length() < 24)
                    System.out.print("\t");
                if(z[0][0].length() < 32)
                    System.out.print("\t");
                System.out.println(z[0][1]);
                System.out.println("\t\t\t\t\t\tVS");
                System.out.println("\t\t\t\t"+ z[1][2] +"\t\t\t\t"+ z[1][3]);
                System.out.print("\t\t\t\t"+ z[0][2]);
                if(z[0][2].length() < 8)
                    System.out.print("\t");
                if(z[0][2].length() < 16)
                    System.out.print("\t");
                if(z[0][2].length() < 24)
                    System.out.print("\t");
                if(z[0][2].length() < 32)
                    System.out.print("\t");
                System.out.println(z[0][3]);
                System.out.print("\nStarting the game. Please wait");
                Thread.sleep(1000);
                System.out.print(".");
                Thread.sleep(1000);
                System.out.print(".");
                Thread.sleep(1000);
                System.out.print(".");
                Thread.sleep(1000);
                System.out.print('\u000C');
                ls.main();
                sal.display();
                if(ch == 1 || ch == 2 || ch == 3)
                    sal.general();
                else if(ch == 4)
                    sal.pushpull();
            }
            else if(b == 3)
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
        }
    }
}