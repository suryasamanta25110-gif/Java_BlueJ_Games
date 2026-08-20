package Bengali;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import Bengali.Instructions.LoadingScreen;
import Bengali.Instructions.SnakeAndLadderInstructions;
import Bengali.SnakeAndLadderBoards.*;
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
    public String bengaliConversion(int a) {
        String b = "";
        int c;
        for(c = 0; c < Integer.toString(a).length(); c++)
            b = (char)(a / (int)(Math.pow(10.0, c)) % 10 + 2534) + b;
        return b;
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
                    System.out.println("\n\n"+ (char)(2476) + (char)(2480) + (char)(2509) + (char)(2468) + (char)(2478) + (char)(2494) + (char)(2472) +" "+ (char)(2488) + (char)(2509) + (char)(2453) + (char)(2507) + (char)(2480) +" :");
                    System.out.println("\t"+ '\u24C7' +" "+ (char)(2482) + (char)(2494) + (char)(2482) +"\t:  "+ bengaliConversion(r));
                    System.out.println("\t"+ '\u24BC' +" "+ (char)(2488) + (char)(2476) + (char)(2497) + (char)(2460) +"\t:  "+ bengaliConversion(this.g));
                    System.out.println("\t"+ '\u24CE' +" "+ (char)(2489) + (char)(2482) + (char)(2497) + (char)(2470) +"\t:  "+ bengaliConversion(y));
                    System.out.println("\t"+ '\u24B7' +" "+ (char)(2472) + (char)(2496) + (char)(2482) +"\t:  "+ bengaliConversion(this.b));
                    for(c = 0; c < 4; c++)
                        if(z[1][c].equals("RED"))
                            break;
                    System.out.println("\n"+ z[0][c] +" ("+ (char)(2482) + (char)(2494) + (char)(2482) +") -"+ (char)(2447) + (char)(2480) +" "+ (char)(2470) + (char)(2494) + (char)(2472) +" :");
                    System.out.print(""+ (char)(2455) + (char)(2497) + (char)(2463) + (char)(2495) +" "+ (char)(2458) + (char)(2494) + (char)(2482) + (char)(2494) + (char)(2480) +" "+ (char)(2460) + (char)(2472) + (char)(2509) + (char)(2479) + (char)(2503) +" "+ (char)(2479) + (char)(2503) + (char)(2453) + (char)(2507) + (char)(2472) + (char)(2507) +" "+ (char)(2453) + (char)(2509) + (char)(2479) + (char)(2494) + (char)(2480) + (char)(2503) + (char)(2453) + (char)(2509) + (char)(2463) + (char)(2494) + (char)(2480) +" "+ (char)(2439) + (char)(2472) + (char)(2474) + (char)(2497) + (char)(2463) +" "+ (char)(2470) + (char)(2495) + (char)(2472) +" ("+ (char)(2437) + (char)(2469) + (char)(2476) + (char)(2494) +" "+ (char)(2455) + (char)(2503) + (char)(2478) +" "+ (char)(2476) + (char)(2472) + (char)(2509) + (char)(2471) +" "+ (char)(2453) + (char)(2480) + (char)(2494) + (char)(2480) +" "+ (char)(2460) + (char)(2472) + (char)(2509) + (char)(2479) + (char)(2503) +" \'100\' "+ (char)(2439) + (char)(2472) + (char)(2474) + (char)(2497) + (char)(2463) +" "+ (char)(2470) + (char)(2495) + (char)(2472) +") : ");
                    if(z[0][c].equals("COMPUTER")) {
                        d = Character.toString((char)((int)(Math.random() * 100.0)));
                        Thread.sleep(1000);
                        System.out.println(d);
                    }
                    else
                        d = br.readLine();
                    if(d.equals("100")) {
                        System.out.print(""+ (char)(2455) + (char)(2503) + (char)(2478) +" "+ (char)(2476) + (char)(2472) + (char)(2509) + (char)(2471) +" "+ (char)(2453) + (char)(2480) + (char)(2494) +" "+ (char)(2489) + (char)(2458) + (char)(2509) + (char)(2459) + (char)(2503) +" "+ (char)(2551) +" "+ (char)(2437) + (char)(2472) + (char)(2497) + (char)(2455) + (char)(2509) + (char)(2480) + (char)(2489) +" "+ (char)(2453) + (char)(2480) + (char)(2503) +" "+ (char)(2437) + (char)(2474) + (char)(2503) + (char)(2453) + (char)(2509) + (char)(2487) + (char)(2494) +" "+ (char)(2453) + (char)(2480) + (char)(2497) + (char)(2472));
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
                    System.out.print(""+ (char)(2455) + (char)(2497) + (char)(2463) + (char)(2495) + (char)(2480) +" "+ (char)(2475) + (char)(2482) + (char)(2494) + (char)(2475) + (char)(2482) +" : "+ (char)(a + 2534));
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
                    System.out.println("\n\n"+ (char)(2476) + (char)(2480) + (char)(2509) + (char)(2468) + (char)(2478) + (char)(2494) + (char)(2472) +" "+ (char)(2488) + (char)(2509) + (char)(2453) + (char)(2507) + (char)(2480) +" :");
                    System.out.println("\t"+ '\u24C7' +" "+ (char)(2482) + (char)(2494) + (char)(2482) +"\t:  "+ bengaliConversion(r));
                    System.out.println("\t"+ '\u24BC' +" "+ (char)(2488) + (char)(2476) + (char)(2497) + (char)(2460) +"\t:  "+ bengaliConversion(this.g));
                    System.out.println("\t"+ '\u24CE' +" "+ (char)(2489) + (char)(2482) + (char)(2497) + (char)(2470) +"\t:  "+ bengaliConversion(y));
                    System.out.println("\t"+ '\u24B7' +" "+ (char)(2472) + (char)(2496) + (char)(2482) +"\t:  "+ bengaliConversion(this.b));
                    for(c = 0; c < 4; c++)
                        if(z[1][c].equals("GREEN"))
                            break;
                    System.out.println("\n"+ z[0][c] +" ("+ (char)(2488) + (char)(2476) + (char)(2497) + (char)(2460) +") -"+ (char)(2447) + (char)(2480) +" "+ (char)(2470) + (char)(2494) + (char)(2472) +" :");
                    System.out.print(""+ (char)(2455) + (char)(2497) + (char)(2463) + (char)(2495) +" "+ (char)(2458) + (char)(2494) + (char)(2482) + (char)(2494) + (char)(2480) +" "+ (char)(2460) + (char)(2472) + (char)(2509) + (char)(2479) + (char)(2503) +" "+ (char)(2479) + (char)(2503) + (char)(2453) + (char)(2507) + (char)(2472) + (char)(2507) +" "+ (char)(2453) + (char)(2509) + (char)(2479) + (char)(2494) + (char)(2480) + (char)(2503) + (char)(2453) + (char)(2509) + (char)(2463) + (char)(2494) + (char)(2480) +" "+ (char)(2439) + (char)(2472) + (char)(2474) + (char)(2497) + (char)(2463) +" "+ (char)(2470) + (char)(2495) + (char)(2472) +" ("+ (char)(2437) + (char)(2469) + (char)(2476) + (char)(2494) +" "+ (char)(2455) + (char)(2503) + (char)(2478) +" "+ (char)(2476) + (char)(2472) + (char)(2509) + (char)(2471) +" "+ (char)(2453) + (char)(2480) + (char)(2494) + (char)(2480) +" "+ (char)(2460) + (char)(2472) + (char)(2509) + (char)(2479) + (char)(2503) +" \'100\' "+ (char)(2439) + (char)(2472) + (char)(2474) + (char)(2497) + (char)(2463) +" "+ (char)(2470) + (char)(2495) + (char)(2472) +") : ");
                    if(z[0][c].equals("COMPUTER")) {
                        d = Character.toString((char)((int)(Math.random() * 100.0)));
                        Thread.sleep(1000);
                        System.out.println(d);
                    }
                    else
                        d = br.readLine();
                    if(d.equals("100")) {
                        System.out.print(""+ (char)(2455) + (char)(2503) + (char)(2478) +" "+ (char)(2476) + (char)(2472) + (char)(2509) + (char)(2471) +" "+ (char)(2453) + (char)(2480) + (char)(2494) +" "+ (char)(2489) + (char)(2458) + (char)(2509) + (char)(2459) + (char)(2503) +" "+ (char)(2551) +" "+ (char)(2437) + (char)(2472) + (char)(2497) + (char)(2455) + (char)(2509) + (char)(2480) + (char)(2489) +" "+ (char)(2453) + (char)(2480) + (char)(2503) +" "+ (char)(2437) + (char)(2474) + (char)(2503) + (char)(2453) + (char)(2509) + (char)(2487) + (char)(2494) +" "+ (char)(2453) + (char)(2480) + (char)(2497) + (char)(2472));
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
                    System.out.print(""+ (char)(2455) + (char)(2497) + (char)(2463) + (char)(2495) + (char)(2480) +" "+ (char)(2475) + (char)(2482) + (char)(2494) + (char)(2475) + (char)(2482) +" : "+ (char)(a + 2534));
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
                    System.out.println("\n\n"+ (char)(2476) + (char)(2480) + (char)(2509) + (char)(2468) + (char)(2478) + (char)(2494) + (char)(2472) +" "+ (char)(2488) + (char)(2509) + (char)(2453) + (char)(2507) + (char)(2480) +" :");
                    System.out.println("\t"+ '\u24C7' +" "+ (char)(2482) + (char)(2494) + (char)(2482) +"\t:  "+ bengaliConversion(r));
                    System.out.println("\t"+ '\u24BC' +" "+ (char)(2488) + (char)(2476) + (char)(2497) + (char)(2460) +"\t:  "+ bengaliConversion(this.g));
                    System.out.println("\t"+ '\u24CE' +" "+ (char)(2489) + (char)(2482) + (char)(2497) + (char)(2470) +"\t:  "+ bengaliConversion(y));
                    System.out.println("\t"+ '\u24B7' +" "+ (char)(2472) + (char)(2496) + (char)(2482) +"\t:  "+ bengaliConversion(this.b));
                    for(c = 0; c < 4; c++)
                        if(z[1][c].equals("YELLOW"))
                            break;
                    System.out.println("\n"+ z[0][c] +" ("+ (char)(2489) + (char)(2482) + (char)(2497) + (char)(2470) +") -"+ (char)(2447) + (char)(2480) +" "+ (char)(2470) + (char)(2494) + (char)(2472) +" :");
                    System.out.print(""+ (char)(2455) + (char)(2497) + (char)(2463) + (char)(2495) +" "+ (char)(2458) + (char)(2494) + (char)(2482) + (char)(2494) + (char)(2480) +" "+ (char)(2460) + (char)(2472) + (char)(2509) + (char)(2479) + (char)(2503) +" "+ (char)(2479) + (char)(2503) + (char)(2453) + (char)(2507) + (char)(2472) + (char)(2507) +" "+ (char)(2453) + (char)(2509) + (char)(2479) + (char)(2494) + (char)(2480) + (char)(2503) + (char)(2453) + (char)(2509) + (char)(2463) + (char)(2494) + (char)(2480) +" "+ (char)(2439) + (char)(2472) + (char)(2474) + (char)(2497) + (char)(2463) +" "+ (char)(2470) + (char)(2495) + (char)(2472) +" ("+ (char)(2437) + (char)(2469) + (char)(2476) + (char)(2494) +" "+ (char)(2455) + (char)(2503) + (char)(2478) +" "+ (char)(2476) + (char)(2472) + (char)(2509) + (char)(2471) +" "+ (char)(2453) + (char)(2480) + (char)(2494) + (char)(2480) +" "+ (char)(2460) + (char)(2472) + (char)(2509) + (char)(2479) + (char)(2503) +" \'100\' "+ (char)(2439) + (char)(2472) + (char)(2474) + (char)(2497) + (char)(2463) +" "+ (char)(2470) + (char)(2495) + (char)(2472) +") : ");
                    if(z[0][c].equals("COMPUTER")) {
                        d = Character.toString((char)((int)(Math.random() * 100.0)));
                        Thread.sleep(1000);
                        System.out.println(d);
                    }
                    else
                        d = br.readLine();
                    if(d.equals("100")) {
                        System.out.print(""+ (char)(2455) + (char)(2503) + (char)(2478) +" "+ (char)(2476) + (char)(2472) + (char)(2509) + (char)(2471) +" "+ (char)(2453) + (char)(2480) + (char)(2494) +" "+ (char)(2489) + (char)(2458) + (char)(2509) + (char)(2459) + (char)(2503) +" "+ (char)(2551) +" "+ (char)(2437) + (char)(2472) + (char)(2497) + (char)(2455) + (char)(2509) + (char)(2480) + (char)(2489) +" "+ (char)(2453) + (char)(2480) + (char)(2503) +" "+ (char)(2437) + (char)(2474) + (char)(2503) + (char)(2453) + (char)(2509) + (char)(2487) + (char)(2494) +" "+ (char)(2453) + (char)(2480) + (char)(2497) + (char)(2472));
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
                    System.out.print(""+ (char)(2455) + (char)(2497) + (char)(2463) + (char)(2495) + (char)(2480) +" "+ (char)(2475) + (char)(2482) + (char)(2494) + (char)(2475) + (char)(2482) +" : "+ (char)(a + 2534));
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
                    System.out.println("\n\n"+ (char)(2476) + (char)(2480) + (char)(2509) + (char)(2468) + (char)(2478) + (char)(2494) + (char)(2472) +" "+ (char)(2488) + (char)(2509) + (char)(2453) + (char)(2507) + (char)(2480) +" :");
                    System.out.println("\t"+ '\u24C7' +" "+ (char)(2482) + (char)(2494) + (char)(2482) +"\t:  "+ bengaliConversion(r));
                    System.out.println("\t"+ '\u24BC' +" "+ (char)(2488) + (char)(2476) + (char)(2497) + (char)(2460) +"\t:  "+ bengaliConversion(this.g));
                    System.out.println("\t"+ '\u24CE' +" "+ (char)(2489) + (char)(2482) + (char)(2497) + (char)(2470) +"\t:  "+ bengaliConversion(y));
                    System.out.println("\t"+ '\u24B7' +" "+ (char)(2472) + (char)(2496) + (char)(2482) +"\t:  "+ bengaliConversion(this.b));
                    for(c = 0; c < 4; c++)
                        if(z[1][c].equals("BLUE"))
                            break;
                    System.out.println("\n"+ z[0][c] +" ("+ (char)(2472) + (char)(2496) + (char)(2482) +") -"+ (char)(2447) + (char)(2480) +" "+ (char)(2470) + (char)(2494) + (char)(2472) +" :");
                    System.out.print(""+ (char)(2455) + (char)(2497) + (char)(2463) + (char)(2495) +" "+ (char)(2458) + (char)(2494) + (char)(2482) + (char)(2494) + (char)(2480) +" "+ (char)(2460) + (char)(2472) + (char)(2509) + (char)(2479) + (char)(2503) +" "+ (char)(2479) + (char)(2503) + (char)(2453) + (char)(2507) + (char)(2472) + (char)(2507) +" "+ (char)(2453) + (char)(2509) + (char)(2479) + (char)(2494) + (char)(2480) + (char)(2503) + (char)(2453) + (char)(2509) + (char)(2463) + (char)(2494) + (char)(2480) +" "+ (char)(2439) + (char)(2472) + (char)(2474) + (char)(2497) + (char)(2463) +" "+ (char)(2470) + (char)(2495) + (char)(2472) +" ("+ (char)(2437) + (char)(2469) + (char)(2476) + (char)(2494) +" "+ (char)(2455) + (char)(2503) + (char)(2478) +" "+ (char)(2476) + (char)(2472) + (char)(2509) + (char)(2471) +" "+ (char)(2453) + (char)(2480) + (char)(2494) + (char)(2480) +" "+ (char)(2460) + (char)(2472) + (char)(2509) + (char)(2479) + (char)(2503) +" \'100\' "+ (char)(2439) + (char)(2472) + (char)(2474) + (char)(2497) + (char)(2463) +" "+ (char)(2470) + (char)(2495) + (char)(2472) +") : ");
                    if(z[0][c].equals("COMPUTER")) {
                        d = Character.toString((char)((int)(Math.random() * 100.0)));
                        Thread.sleep(1000);
                        System.out.println(d);
                    }
                    else
                        d = br.readLine();
                    if(d.equals("100")) {
                        System.out.print(""+ (char)(2455) + (char)(2503) + (char)(2478) +" "+ (char)(2476) + (char)(2472) + (char)(2509) + (char)(2471) +" "+ (char)(2453) + (char)(2480) + (char)(2494) +" "+ (char)(2489) + (char)(2458) + (char)(2509) + (char)(2459) + (char)(2503) +" "+ (char)(2551) +" "+ (char)(2437) + (char)(2472) + (char)(2497) + (char)(2455) + (char)(2509) + (char)(2480) + (char)(2489) +" "+ (char)(2453) + (char)(2480) + (char)(2503) +" "+ (char)(2437) + (char)(2474) + (char)(2503) + (char)(2453) + (char)(2509) + (char)(2487) + (char)(2494) +" "+ (char)(2453) + (char)(2480) + (char)(2497) + (char)(2472));
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
                    System.out.print(""+ (char)(2455) + (char)(2497) + (char)(2463) + (char)(2495) + (char)(2480) +" "+ (char)(2475) + (char)(2482) + (char)(2494) + (char)(2475) + (char)(2482) +" : "+ (char)(a + 2534));
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
                System.out.println("\n"+ (char)(2454) + (char)(2503) + (char)(2482) + (char)(2507) + (char)(2527) + (char)(2494) + (char)(2524) + (char)(2470) + (char)(2503) + (char)(2480) +" "+ (char)(2437) + (char)(2477) + (char)(2495) + (char)(2472) + (char)(2472) + (char)(2509) + (char)(2470) + (char)(2472) +" "+ (char)(2460) + (char)(2494) + (char)(2472) + (char)(2494) + (char)(2472) + (char)(2507) +" "+ (char)(2489) + (char)(2458) + (char)(2509) + (char)(2459) + (char)(2503) +" "+ (char)(2551) +" "+ (char)(2438) + (char)(2478) + (char)(2480) + (char)(2494) +" "+ (char)(2447) + (char)(2439) +" "+ (char)(2454) + (char)(2503) + (char)(2482) + (char)(2494) + (char)(2480) +" "+ (char)(2437) + (char)(2472) + (char)(2509) + (char)(2468) + (char)(2495) + (char)(2478) +" "+ (char)(2474) + (char)(2480) + (char)(2509) + (char)(2479) + (char)(2494) + (char)(2527) +" "+ (char)(2458) + (char)(2482) + (char)(2503) +" "+ (char)(2447) + (char)(2488) + (char)(2503) + (char)(2459) + (char)(2495) +" "+ (char)(2551));
                System.out.println(""+ (char)(2454) + (char)(2503) + (char)(2482) + (char)(2494) + (char)(2480) +" "+ (char)(2475) + (char)(2482) + (char)(2494) + (char)(2475) + (char)(2482) +" "+ (char)(2438) + (char)(2474) + (char)(2472) + (char)(2494) + (char)(2470) + (char)(2503) + (char)(2480) +" "+ (char)(2488) + (char)(2494) + (char)(2478) + (char)(2472) + (char)(2503) +" "+ (char)(2474) + (char)(2503) + (char)(2486) +" "+ (char)(2453) + (char)(2480) + (char)(2494) +" "+ (char)(2489) + (char)(2458) + (char)(2509) + (char)(2459) + (char)(2503) +" :");
                System.out.println("\n\t"+ (char)(2474) + (char)(2509) + (char)(2480) + (char)(2469) + (char)(2478) +"\t:\t"+ w[0][0] +" ("+ w[1][0] +")");
                System.out.println("\t"+ (char)(2470) + (char)(2509) + (char)(2476) + (char)(2495) + (char)(2468) + (char)(2496) + (char)(2527) +"\t:\t"+ w[0][1] +" ("+ w[1][1] +")");
                System.out.println("\t"+ (char)(2468) + (char)(2499) + (char)(2468) + (char)(2496) + (char)(2527) +"\t:\t"+ w[0][2] +" ("+ w[1][2] +")");
                Thread.sleep(2000);
                System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("\t\t\t\t\t\t                        "+ (char)(2453) + (char)(2509) + (char)(2480) + (char)(2503) + (char)(2465) + (char)(2495) + (char)(2463));
                System.out.println(""+ (char)(2468) + (char)(2504) + (char)(2480) + (char)(2495) +" "+ (char)(2453) + (char)(2480) + (char)(2503) + (char)(2459) + (char)(2503) + (char)(2480) +" : ");
                System.out.println("\t"+ (char)(2488) + (char)(2498) + (char)(2480) + (char)(2509) + (char)(2479) + (char)(2509) + (char)(2479) +" "+ (char)(2488) + (char)(2494) + (char)(2478) + (char)(2472) + (char)(2509) + (char)(2468));
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.print("\n"+ (char)(2489) + (char)(2507) + (char)(2478) +" "+ (char)(2488) + (char)(2509) + (char)(2453) + (char)(2509) + (char)(2480) + (char)(2495) + (char)(2472) + (char)(2503) +" "+ (char)(2475) + (char)(2495) + (char)(2480) + (char)(2503) +" "+ (char)(2479) + (char)(2494) + (char)(2451) + (char)(2527) + (char)(2494) + (char)(2480) +" "+ (char)(2460) + (char)(2472) + (char)(2509) + (char)(2479) + (char)(2503) +" "+ (char)(2479) + (char)(2503) + (char)(2453) + (char)(2507) + (char)(2472) + (char)(2507) +" "+ (char)(2453) + (char)(2509) + (char)(2479) + (char)(2494) + (char)(2480) + (char)(2503) + (char)(2453) + (char)(2509) + (char)(2463) + (char)(2494) + (char)(2480) +" "+ (char)(2439) + (char)(2472) + (char)(2474) + (char)(2497) + (char)(2463) +" "+ (char)(2453) + (char)(2480) + (char)(2497) + (char)(2472) +" : ");
                d = br.readLine();
                System.out.print('\u000C');
            }
        }
        catch(Exception ex) {
            System.out.println("\n"+ (char)(2447) + (char)(2453) + (char)(2463) + (char)(2495) +" "+ (char)(2447) + (char)(2480) + (char)(2480) +" "+ (char)(2456) + (char)(2463) + (char)(2503) + (char)(2459) + (char)(2503) +" "+ (char)(2551));
            System.out.println(""+ (char)(2447) + (char)(2480) + (char)(2480) + (char)(2480) + (char)(2503) + (char)(2480) +" "+ (char)(2476) + (char)(2480) + (char)(2509) + (char)(2467) + (char)(2472) + (char)(2494) +" : "+ ex);
            System.out.print(""+ (char)(2489) + (char)(2507) + (char)(2478) +" "+ (char)(2488) + (char)(2509) + (char)(2453) + (char)(2509) + (char)(2480) + (char)(2495) + (char)(2472) + (char)(2503) +" "+ (char)(2475) + (char)(2503) + (char)(2480) + (char)(2494) + (char)(2472) + (char)(2507) +" "+ (char)(2489) + (char)(2458) + (char)(2509) + (char)(2459) + (char)(2503) +" "+ (char)(2551) +" "+ (char)(2437) + (char)(2472) + (char)(2497) + (char)(2455) + (char)(2509) + (char)(2480) + (char)(2489) +" "+ (char)(2453) + (char)(2480) + (char)(2503) +" "+ (char)(2437) + (char)(2474) + (char)(2503) + (char)(2453) + (char)(2509) + (char)(2487) + (char)(2494) +" "+ (char)(2453) + (char)(2480) + (char)(2497) + (char)(2472));
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
                    System.out.println("\n\n"+ (char)(2476) + (char)(2480) + (char)(2509) + (char)(2468) + (char)(2478) + (char)(2494) + (char)(2472) +" "+ (char)(2488) + (char)(2509) + (char)(2453) + (char)(2507) + (char)(2480) +" :");
                    System.out.println("\t"+ '\u24C7' +" "+ (char)(2482) + (char)(2494) + (char)(2482) +"\t:  "+ bengaliConversion(r));
                    System.out.println("\t"+ '\u24BC' +" "+ (char)(2488) + (char)(2476) + (char)(2497) + (char)(2460) +"\t:  "+ bengaliConversion(this.g));
                    System.out.println("\t"+ '\u24CE' +" "+ (char)(2489) + (char)(2482) + (char)(2497) + (char)(2470) +"\t:  "+ bengaliConversion(y));
                    System.out.println("\t"+ '\u24B7' +" "+ (char)(2472) + (char)(2496) + (char)(2482) +"\t:  "+ bengaliConversion(this.b));
                    for(c = 0; c < 4; c++)
                        if(z[1][c].equals("RED"))
                            break;
                    System.out.println("\n"+ z[0][c] +" ("+ (char)(2482) + (char)(2494) + (char)(2482) +") -"+ (char)(2447) + (char)(2480) +" "+ (char)(2470) + (char)(2494) + (char)(2472) +" :");
                    System.out.print(""+ (char)(2455) + (char)(2497) + (char)(2463) + (char)(2495) +" "+ (char)(2458) + (char)(2494) + (char)(2482) + (char)(2494) + (char)(2480) +" "+ (char)(2460) + (char)(2472) + (char)(2509) + (char)(2479) + (char)(2503) +" "+ (char)(2479) + (char)(2503) + (char)(2453) + (char)(2507) + (char)(2472) + (char)(2507) +" "+ (char)(2453) + (char)(2509) + (char)(2479) + (char)(2494) + (char)(2480) + (char)(2503) + (char)(2453) + (char)(2509) + (char)(2463) + (char)(2494) + (char)(2480) +" "+ (char)(2439) + (char)(2472) + (char)(2474) + (char)(2497) + (char)(2463) +" "+ (char)(2470) + (char)(2495) + (char)(2472) +" ("+ (char)(2437) + (char)(2469) + (char)(2476) + (char)(2494) +" "+ (char)(2455) + (char)(2503) + (char)(2478) +" "+ (char)(2476) + (char)(2472) + (char)(2509) + (char)(2471) +" "+ (char)(2453) + (char)(2480) + (char)(2494) + (char)(2480) +" "+ (char)(2460) + (char)(2472) + (char)(2509) + (char)(2479) + (char)(2503) +" \'100\' "+ (char)(2439) + (char)(2472) + (char)(2474) + (char)(2497) + (char)(2463) +" "+ (char)(2470) + (char)(2495) + (char)(2472) +") : ");
                    if(z[0][c].equals("COMPUTER")) {
                        d = Character.toString((char)((int)(Math.random() * 100.0)));
                        Thread.sleep(1000);
                        System.out.println(d);
                    }
                    else
                        d = br.readLine();
                    if(d.equals("100")) {
                        System.out.print(""+ (char)(2455) + (char)(2503) + (char)(2478) +" "+ (char)(2476) + (char)(2472) + (char)(2509) + (char)(2471) +" "+ (char)(2453) + (char)(2480) + (char)(2494) +" "+ (char)(2489) + (char)(2458) + (char)(2509) + (char)(2459) + (char)(2503) +" "+ (char)(2551) +" "+ (char)(2437) + (char)(2472) + (char)(2497) + (char)(2455) + (char)(2509) + (char)(2480) + (char)(2489) +" "+ (char)(2453) + (char)(2480) + (char)(2503) +" "+ (char)(2437) + (char)(2474) + (char)(2503) + (char)(2453) + (char)(2509) + (char)(2487) + (char)(2494) +" "+ (char)(2453) + (char)(2480) + (char)(2497) + (char)(2472));
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
                    System.out.println(""+ (char)(2455) + (char)(2497) + (char)(2463) + (char)(2495) + (char)(2480) +" "+ (char)(2475) + (char)(2482) + (char)(2494) + (char)(2475) + (char)(2482) +" : "+ a);
                    if(r == 0 && a != 1) {
                        System.out.print('\u000C');
                        display();
                        Thread.sleep(1000);
                    }
                    else {
                        System.out.print(""+ (char)(2455) + (char)(2497) + (char)(2463) + (char)(2495) +" "+ (char)(2458) + (char)(2494) + (char)(2482) + (char)(2494) + (char)(2480) +" "+ (char)(2460) + (char)(2472) + (char)(2509) + (char)(2479) + (char)(2503) +" "+ (char)(2479) + (char)(2503) + (char)(2453) + (char)(2507) + (char)(2472) + (char)(2507) +" "+ (char)(2453) + (char)(2509) + (char)(2479) + (char)(2494) + (char)(2480) + (char)(2503) + (char)(2453) + (char)(2509) + (char)(2463) + (char)(2494) + (char)(2480) +" "+ (char)(2439) + (char)(2472) + (char)(2474) + (char)(2497) + (char)(2463) +" "+ (char)(2470) + (char)(2495) + (char)(2472) +" ("+ (char)(2437) + (char)(2469) + (char)(2476) + (char)(2494) +" "+ (char)(2455) + (char)(2503) + (char)(2478) +" "+ (char)(2476) + (char)(2472) + (char)(2509) + (char)(2471) +" "+ (char)(2453) + (char)(2480) + (char)(2494) + (char)(2480) +" "+ (char)(2460) + (char)(2472) + (char)(2509) + (char)(2479) + (char)(2503) +" \'100\' "+ (char)(2439) + (char)(2472) + (char)(2474) + (char)(2497) + (char)(2463) +" "+ (char)(2470) + (char)(2495) + (char)(2472) +") : ");
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
                                    System.out.print(""+ (char)(2437) + (char)(2476) + (char)(2504) + (char)(2471) +" "+ (char)(2480) + (char)(2457) +"! "+ (char)(2447) + (char)(2453) + (char)(2463) + (char)(2495) +" "+ (char)(2488) + (char)(2464) + (char)(2495) + (char)(2453) +" "+ (char)(2480) + (char)(2457) +" "+ (char)(2476) + (char)(2503) + (char)(2459) + (char)(2503) +" "+ (char)(2482) + (char)(2495) + (char)(2454) + (char)(2497) + (char)(2472) +" : ");
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
                                System.out.print(""+ (char)(2437) + (char)(2476) + (char)(2504) + (char)(2471) +" "+ (char)(2478) + (char)(2497) + (char)(2477) +"! "+ (char)(2447) + (char)(2453) + (char)(2463) + (char)(2495) +" "+ (char)(2488) + (char)(2464) + (char)(2495) + (char)(2453) +" "+ (char)(2480) + (char)(2457) +" "+ (char)(2476) + (char)(2503) + (char)(2459) + (char)(2503) +" "+ (char)(2482) + (char)(2495) + (char)(2454) + (char)(2497) + (char)(2472) +" : ");
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
                    System.out.println("\n\n"+ (char)(2476) + (char)(2480) + (char)(2509) + (char)(2468) + (char)(2478) + (char)(2494) + (char)(2472) +" "+ (char)(2488) + (char)(2509) + (char)(2453) + (char)(2507) + (char)(2480) +" :");
                    System.out.println("\t"+ '\u24C7' +" "+ (char)(2482) + (char)(2494) + (char)(2482) +"\t:  "+ bengaliConversion(r));
                    System.out.println("\t"+ '\u24BC' +" "+ (char)(2488) + (char)(2476) + (char)(2497) + (char)(2460) +"\t:  "+ bengaliConversion(this.g));
                    System.out.println("\t"+ '\u24CE' +" "+ (char)(2489) + (char)(2482) + (char)(2497) + (char)(2470) +"\t:  "+ bengaliConversion(y));
                    System.out.println("\t"+ '\u24B7' +" "+ (char)(2472) + (char)(2496) + (char)(2482) +"\t:  "+ bengaliConversion(this.b));
                    for(c = 0; c < 4; c++)
                        if(z[1][c].equals("GREEN"))
                            break;
                    System.out.println("\n"+ z[0][c] +" ("+ (char)(2488) + (char)(2476) + (char)(2497) + (char)(2460) +") -"+ (char)(2447) + (char)(2480) +" "+ (char)(2470) + (char)(2494) + (char)(2472) +" :");
                    System.out.print(""+ (char)(2455) + (char)(2497) + (char)(2463) + (char)(2495) +" "+ (char)(2458) + (char)(2494) + (char)(2482) + (char)(2494) + (char)(2480) +" "+ (char)(2460) + (char)(2472) + (char)(2509) + (char)(2479) + (char)(2503) +" "+ (char)(2479) + (char)(2503) + (char)(2453) + (char)(2507) + (char)(2472) + (char)(2507) +" "+ (char)(2453) + (char)(2509) + (char)(2479) + (char)(2494) + (char)(2480) + (char)(2503) + (char)(2453) + (char)(2509) + (char)(2463) + (char)(2494) + (char)(2480) +" "+ (char)(2439) + (char)(2472) + (char)(2474) + (char)(2497) + (char)(2463) +" "+ (char)(2470) + (char)(2495) + (char)(2472) +" ("+ (char)(2437) + (char)(2469) + (char)(2476) + (char)(2494) +" "+ (char)(2455) + (char)(2503) + (char)(2478) +" "+ (char)(2476) + (char)(2472) + (char)(2509) + (char)(2471) +" "+ (char)(2453) + (char)(2480) + (char)(2494) + (char)(2480) +" "+ (char)(2460) + (char)(2472) + (char)(2509) + (char)(2479) + (char)(2503) +" \'100\' "+ (char)(2439) + (char)(2472) + (char)(2474) + (char)(2497) + (char)(2463) +" "+ (char)(2470) + (char)(2495) + (char)(2472) +") : ");
                    if(z[0][c].equals("COMPUTER")) {
                        d = Character.toString((char)((int)(Math.random() * 100.0)));
                        Thread.sleep(1000);
                        System.out.println(d);
                    }
                    else
                        d = br.readLine();
                    if(d.equals("100")) {
                        System.out.print(""+ (char)(2455) + (char)(2503) + (char)(2478) +" "+ (char)(2476) + (char)(2472) + (char)(2509) + (char)(2471) +" "+ (char)(2453) + (char)(2480) + (char)(2494) +" "+ (char)(2489) + (char)(2458) + (char)(2509) + (char)(2459) + (char)(2503) +" "+ (char)(2551) +" "+ (char)(2437) + (char)(2472) + (char)(2497) + (char)(2455) + (char)(2509) + (char)(2480) + (char)(2489) +" "+ (char)(2453) + (char)(2480) + (char)(2503) +" "+ (char)(2437) + (char)(2474) + (char)(2503) + (char)(2453) + (char)(2509) + (char)(2487) + (char)(2494) +" "+ (char)(2453) + (char)(2480) + (char)(2497) + (char)(2472));
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
                    System.out.println(""+ (char)(2455) + (char)(2497) + (char)(2463) + (char)(2495) + (char)(2480) +" "+ (char)(2475) + (char)(2482) + (char)(2494) + (char)(2475) + (char)(2482) +" : "+ a);
                    if(this.g == 0 && a != 1) {
                        System.out.print('\u000C');
                        display();
                        Thread.sleep(1000);
                    }
                    else {
                        System.out.print(""+ (char)(2438) + (char)(2474) + (char)(2472) + (char)(2495) +" "+ (char)(2479) + (char)(2503) +" "+ (char)(2480) + (char)(2457) + (char)(2463) + (char)(2495) +" "+ (char)(2488) + (char)(2480) + (char)(2494) + (char)(2468) + (char)(2503) +" "+ (char)(2458) + (char)(2494) + (char)(2472) +", "+ (char)(2488) + (char)(2503) + (char)(2439) +" "+ (char)(2480) + (char)(2457) + (char)(2463) + (char)(2495) +" "+ (char)(2482) + (char)(2495) + (char)(2454) + (char)(2497) + (char)(2472) +" : ");
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
                                    System.out.print(""+ (char)(2437) + (char)(2476) + (char)(2504) + (char)(2471) +" "+ (char)(2480) + (char)(2457) +"! "+ (char)(2447) + (char)(2453) + (char)(2463) + (char)(2495) +" "+ (char)(2488) + (char)(2464) + (char)(2495) + (char)(2453) +" "+ (char)(2480) + (char)(2457) +" "+ (char)(2476) + (char)(2503) + (char)(2459) + (char)(2503) +" "+ (char)(2482) + (char)(2495) + (char)(2454) + (char)(2497) + (char)(2472) +" : ");
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
                                System.out.print(""+ (char)(2437) + (char)(2476) + (char)(2504) + (char)(2471) +" "+ (char)(2478) + (char)(2497) + (char)(2477) +"! "+ (char)(2447) + (char)(2453) + (char)(2463) + (char)(2495) +" "+ (char)(2488) + (char)(2464) + (char)(2495) + (char)(2453) +" "+ (char)(2480) + (char)(2457) +" "+ (char)(2476) + (char)(2503) + (char)(2459) + (char)(2503) +" "+ (char)(2482) + (char)(2495) + (char)(2454) + (char)(2497) + (char)(2472) +" : ");
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
                    System.out.println("\n\n"+ (char)(2476) + (char)(2480) + (char)(2509) + (char)(2468) + (char)(2478) + (char)(2494) + (char)(2472) +" "+ (char)(2488) + (char)(2509) + (char)(2453) + (char)(2507) + (char)(2480) +" :");
                    System.out.println("\t"+ '\u24C7' +" "+ (char)(2482) + (char)(2494) + (char)(2482) +"\t:  "+ bengaliConversion(r));
                    System.out.println("\t"+ '\u24BC' +" "+ (char)(2488) + (char)(2476) + (char)(2497) + (char)(2460) +"\t:  "+ bengaliConversion(this.g));
                    System.out.println("\t"+ '\u24CE' +" "+ (char)(2489) + (char)(2482) + (char)(2497) + (char)(2470) +"\t:  "+ bengaliConversion(y));
                    System.out.println("\t"+ '\u24B7' +" "+ (char)(2472) + (char)(2496) + (char)(2482) +"\t:  "+ bengaliConversion(this.b));
                    for(c = 0; c < 4; c++)
                        if(z[1][c].equals("YELLOW"))
                            break;
                    System.out.println("\n"+ z[0][c] +" ("+ (char)(2489) + (char)(2482) + (char)(2497) + (char)(2470) +") -"+ (char)(2447) + (char)(2480) +" "+ (char)(2470) + (char)(2494) + (char)(2472) +" :");
                    System.out.print(""+ (char)(2455) + (char)(2497) + (char)(2463) + (char)(2495) +" "+ (char)(2458) + (char)(2494) + (char)(2482) + (char)(2494) + (char)(2480) +" "+ (char)(2460) + (char)(2472) + (char)(2509) + (char)(2479) + (char)(2503) +" "+ (char)(2479) + (char)(2503) + (char)(2453) + (char)(2507) + (char)(2472) + (char)(2507) +" "+ (char)(2453) + (char)(2509) + (char)(2479) + (char)(2494) + (char)(2480) + (char)(2503) + (char)(2453) + (char)(2509) + (char)(2463) + (char)(2494) + (char)(2480) +" "+ (char)(2439) + (char)(2472) + (char)(2474) + (char)(2497) + (char)(2463) +" "+ (char)(2470) + (char)(2495) + (char)(2472) +" ("+ (char)(2437) + (char)(2469) + (char)(2476) + (char)(2494) +" "+ (char)(2455) + (char)(2503) + (char)(2478) +" "+ (char)(2476) + (char)(2472) + (char)(2509) + (char)(2471) +" "+ (char)(2453) + (char)(2480) + (char)(2494) + (char)(2480) +" "+ (char)(2460) + (char)(2472) + (char)(2509) + (char)(2479) + (char)(2503) +" \'100\' "+ (char)(2439) + (char)(2472) + (char)(2474) + (char)(2497) + (char)(2463) +" "+ (char)(2470) + (char)(2495) + (char)(2472) +") : ");
                    if(z[0][c].equals("COMPUTER")) {
                        d = Character.toString((char)((int)(Math.random() * 100.0)));
                        Thread.sleep(1000);
                        System.out.println(d);
                    }
                    else
                        d = br.readLine();
                    if(d.equals("100")) {
                        System.out.print(""+ (char)(2455) + (char)(2503) + (char)(2478) +" "+ (char)(2476) + (char)(2472) + (char)(2509) + (char)(2471) +" "+ (char)(2453) + (char)(2480) + (char)(2494) +" "+ (char)(2489) + (char)(2458) + (char)(2509) + (char)(2459) + (char)(2503) +" "+ (char)(2551) +" "+ (char)(2437) + (char)(2472) + (char)(2497) + (char)(2455) + (char)(2509) + (char)(2480) + (char)(2489) +" "+ (char)(2453) + (char)(2480) + (char)(2503) +" "+ (char)(2437) + (char)(2474) + (char)(2503) + (char)(2453) + (char)(2509) + (char)(2487) + (char)(2494) +" "+ (char)(2453) + (char)(2480) + (char)(2497) + (char)(2472));
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
                    System.out.println(""+ (char)(2455) + (char)(2497) + (char)(2463) + (char)(2495) + (char)(2480) +" "+ (char)(2475) + (char)(2482) + (char)(2494) + (char)(2475) + (char)(2482) +" : "+ a);
                    if(y == 0 && a != 1) {
                        System.out.print('\u000C');
                        display();
                        Thread.sleep(1000);
                    }
                    else {
                        System.out.print(""+ (char)(2438) + (char)(2474) + (char)(2472) + (char)(2495) +" "+ (char)(2479) + (char)(2503) +" "+ (char)(2480) + (char)(2457) + (char)(2463) + (char)(2495) +" "+ (char)(2488) + (char)(2480) + (char)(2494) + (char)(2468) + (char)(2503) +" "+ (char)(2458) + (char)(2494) + (char)(2472) +", "+ (char)(2488) + (char)(2503) + (char)(2439) +" "+ (char)(2480) + (char)(2457) + (char)(2463) + (char)(2495) +" "+ (char)(2482) + (char)(2495) + (char)(2454) + (char)(2497) + (char)(2472) +" : ");
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
                                    System.out.print(""+ (char)(2437) + (char)(2476) + (char)(2504) + (char)(2471) +" "+ (char)(2480) + (char)(2457) +"! "+ (char)(2447) + (char)(2453) + (char)(2463) + (char)(2495) +" "+ (char)(2488) + (char)(2464) + (char)(2495) + (char)(2453) +" "+ (char)(2480) + (char)(2457) +" "+ (char)(2476) + (char)(2503) + (char)(2459) + (char)(2503) +" "+ (char)(2482) + (char)(2495) + (char)(2454) + (char)(2497) + (char)(2472) +" : ");
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
                                System.out.print(""+ (char)(2437) + (char)(2476) + (char)(2504) + (char)(2471) +" "+ (char)(2478) + (char)(2497) + (char)(2477) +"! "+ (char)(2447) + (char)(2453) + (char)(2463) + (char)(2495) +" "+ (char)(2488) + (char)(2464) + (char)(2495) + (char)(2453) +" "+ (char)(2480) + (char)(2457) +" "+ (char)(2476) + (char)(2503) + (char)(2459) + (char)(2503) +" "+ (char)(2482) + (char)(2495) + (char)(2454) + (char)(2497) + (char)(2472) +" : ");
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
                    System.out.println("\n\n"+ (char)(2476) + (char)(2480) + (char)(2509) + (char)(2468) + (char)(2478) + (char)(2494) + (char)(2472) +" "+ (char)(2488) + (char)(2509) + (char)(2453) + (char)(2507) + (char)(2480) +" :");
                    System.out.println("\t"+ '\u24C7' +" "+ (char)(2482) + (char)(2494) + (char)(2482) +"\t:  "+ bengaliConversion(r));
                    System.out.println("\t"+ '\u24BC' +" "+ (char)(2488) + (char)(2476) + (char)(2497) + (char)(2460) +"\t:  "+ bengaliConversion(this.g));
                    System.out.println("\t"+ '\u24CE' +" "+ (char)(2489) + (char)(2482) + (char)(2497) + (char)(2470) +"\t:  "+ bengaliConversion(y));
                    System.out.println("\t"+ '\u24B7' +" "+ (char)(2472) + (char)(2496) + (char)(2482) +"\t:  "+ bengaliConversion(this.b));
                    for(c = 0; c < 4; c++)
                        if(z[1][c].equals("BLUE"))
                            break;
                    System.out.println("\n"+ z[0][c] +" ("+ (char)(2472) + (char)(2496) + (char)(2482) +") -"+ (char)(2447) + (char)(2480) +" "+ (char)(2470) + (char)(2494) + (char)(2472) +" :");
                    System.out.print(""+ (char)(2455) + (char)(2497) + (char)(2463) + (char)(2495) +" "+ (char)(2458) + (char)(2494) + (char)(2482) + (char)(2494) + (char)(2480) +" "+ (char)(2460) + (char)(2472) + (char)(2509) + (char)(2479) + (char)(2503) +" "+ (char)(2479) + (char)(2503) + (char)(2453) + (char)(2507) + (char)(2472) + (char)(2507) +" "+ (char)(2453) + (char)(2509) + (char)(2479) + (char)(2494) + (char)(2480) + (char)(2503) + (char)(2453) + (char)(2509) + (char)(2463) + (char)(2494) + (char)(2480) +" "+ (char)(2439) + (char)(2472) + (char)(2474) + (char)(2497) + (char)(2463) +" "+ (char)(2470) + (char)(2495) + (char)(2472) +" ("+ (char)(2437) + (char)(2469) + (char)(2476) + (char)(2494) +" "+ (char)(2455) + (char)(2503) + (char)(2478) +" "+ (char)(2476) + (char)(2472) + (char)(2509) + (char)(2471) +" "+ (char)(2453) + (char)(2480) + (char)(2494) + (char)(2480) +" "+ (char)(2460) + (char)(2472) + (char)(2509) + (char)(2479) + (char)(2503) +" \'100\' "+ (char)(2439) + (char)(2472) + (char)(2474) + (char)(2497) + (char)(2463) +" "+ (char)(2470) + (char)(2495) + (char)(2472) +") : ");
                    if(z[0][c].equals("COMPUTER")) {
                        d = Character.toString((char)((int)(Math.random() * 100.0)));
                        Thread.sleep(1000);
                        System.out.println(d);
                    }
                    else
                        d = br.readLine();
                    if(d.equals("100")) {
                        System.out.print(""+ (char)(2455) + (char)(2503) + (char)(2478) +" "+ (char)(2476) + (char)(2472) + (char)(2509) + (char)(2471) +" "+ (char)(2453) + (char)(2480) + (char)(2494) +" "+ (char)(2489) + (char)(2458) + (char)(2509) + (char)(2459) + (char)(2503) +" "+ (char)(2551) +" "+ (char)(2437) + (char)(2472) + (char)(2497) + (char)(2455) + (char)(2509) + (char)(2480) + (char)(2489) +" "+ (char)(2453) + (char)(2480) + (char)(2503) +" "+ (char)(2437) + (char)(2474) + (char)(2503) + (char)(2453) + (char)(2509) + (char)(2487) + (char)(2494) +" "+ (char)(2453) + (char)(2480) + (char)(2497) + (char)(2472));
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
                    System.out.println(""+ (char)(2455) + (char)(2497) + (char)(2463) + (char)(2495) + (char)(2480) +" "+ (char)(2475) + (char)(2482) + (char)(2494) + (char)(2475) + (char)(2482) +" : "+ a);
                    if(this.b == 0 && a != 1) {
                        System.out.print('\u000C');
                        display();
                        Thread.sleep(1000);
                    }
                    else {
                        System.out.print(""+ (char)(2438) + (char)(2474) + (char)(2472) + (char)(2495) +" "+ (char)(2479) + (char)(2503) +" "+ (char)(2480) + (char)(2457) + (char)(2463) + (char)(2495) +" "+ (char)(2488) + (char)(2480) + (char)(2494) + (char)(2468) + (char)(2503) +" "+ (char)(2458) + (char)(2494) + (char)(2472) +", "+ (char)(2488) + (char)(2503) + (char)(2439) +" "+ (char)(2480) + (char)(2457) + (char)(2463) + (char)(2495) +" "+ (char)(2482) + (char)(2495) + (char)(2454) + (char)(2497) + (char)(2472) +" : ");
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
                                    System.out.print(""+ (char)(2437) + (char)(2476) + (char)(2504) + (char)(2471) +" "+ (char)(2480) + (char)(2457) +"! "+ (char)(2447) + (char)(2453) + (char)(2463) + (char)(2495) +" "+ (char)(2488) + (char)(2464) + (char)(2495) + (char)(2453) +" "+ (char)(2480) + (char)(2457) +" "+ (char)(2476) + (char)(2503) + (char)(2459) + (char)(2503) +" "+ (char)(2482) + (char)(2495) + (char)(2454) + (char)(2497) + (char)(2472) +" : ");
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
                                System.out.print(""+ (char)(2437) + (char)(2476) + (char)(2504) + (char)(2471) +" "+ (char)(2478) + (char)(2497) + (char)(2477) +"! "+ (char)(2447) + (char)(2453) + (char)(2463) + (char)(2495) +" "+ (char)(2488) + (char)(2464) + (char)(2495) + (char)(2453) +" "+ (char)(2480) + (char)(2457) +" "+ (char)(2476) + (char)(2503) + (char)(2459) + (char)(2503) +" "+ (char)(2482) + (char)(2495) + (char)(2454) + (char)(2497) + (char)(2472) +" : ");
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
                System.out.println("\n"+ (char)(2454) + (char)(2503) + (char)(2482) + (char)(2507) + (char)(2527) + (char)(2494) + (char)(2524) + (char)(2470) + (char)(2503) + (char)(2480) +" "+ (char)(2437) + (char)(2477) + (char)(2495) + (char)(2472) + (char)(2472) + (char)(2509) + (char)(2470) + (char)(2472) +" "+ (char)(2460) + (char)(2494) + (char)(2472) + (char)(2494) + (char)(2472) + (char)(2507) +" "+ (char)(2489) + (char)(2458) + (char)(2509) + (char)(2459) + (char)(2503) +" "+ (char)(2551) +" "+ (char)(2438) + (char)(2478) + (char)(2480) + (char)(2494) +" "+ (char)(2447) + (char)(2439) +" "+ (char)(2454) + (char)(2503) + (char)(2482) + (char)(2494) + (char)(2480) +" "+ (char)(2437) + (char)(2472) + (char)(2509) + (char)(2468) + (char)(2495) + (char)(2478) +" "+ (char)(2474) + (char)(2480) + (char)(2509) + (char)(2479) + (char)(2494) + (char)(2527) +" "+ (char)(2458) + (char)(2482) + (char)(2503) +" "+ (char)(2447) + (char)(2488) + (char)(2503) + (char)(2459) + (char)(2495) +" "+ (char)(2551));
                System.out.println(""+ (char)(2454) + (char)(2503) + (char)(2482) + (char)(2494) + (char)(2480) +" "+ (char)(2475) + (char)(2482) + (char)(2494) + (char)(2475) + (char)(2482) +" "+ (char)(2438) + (char)(2474) + (char)(2472) + (char)(2494) + (char)(2470) + (char)(2503) + (char)(2480) +" "+ (char)(2488) + (char)(2494) + (char)(2478) + (char)(2472) + (char)(2503) +" "+ (char)(2474) + (char)(2503) + (char)(2486) +" "+ (char)(2453) + (char)(2480) + (char)(2494) +" "+ (char)(2489) + (char)(2458) + (char)(2509) + (char)(2459) + (char)(2503) +" :");
                System.out.println("\n\t"+ (char)(2474) + (char)(2509) + (char)(2480) + (char)(2469) + (char)(2478) +"\t:\t"+ w[0][0] +" ("+ w[1][0] +")");
                System.out.println("\t"+ (char)(2470) + (char)(2509) + (char)(2476) + (char)(2495) + (char)(2468) + (char)(2496) + (char)(2527) +"\t:\t"+ w[0][1] +" ("+ w[1][1] +")");
                System.out.println("\t"+ (char)(2468) + (char)(2499) + (char)(2468) + (char)(2496) + (char)(2527) +"\t:\t"+ w[0][2] +" ("+ w[1][2] +")");
                Thread.sleep(2000);
                System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("\t\t\t\t\t\t                        "+ (char)(2453) + (char)(2509) + (char)(2480) + (char)(2503) + (char)(2465) + (char)(2495) + (char)(2463));
                System.out.println(""+ (char)(2468) + (char)(2504) + (char)(2480) + (char)(2495) +" "+ (char)(2453) + (char)(2480) + (char)(2503) + (char)(2459) + (char)(2503) + (char)(2480) +" : ");
                System.out.println("\t"+ (char)(2488) + (char)(2498) + (char)(2480) + (char)(2509) + (char)(2479) + (char)(2509) + (char)(2479) +" "+ (char)(2488) + (char)(2494) + (char)(2478) + (char)(2472) + (char)(2509) + (char)(2468));
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.print("\n"+ (char)(2489) + (char)(2507) + (char)(2478) +" "+ (char)(2488) + (char)(2509) + (char)(2453) + (char)(2509) + (char)(2480) + (char)(2495) + (char)(2472) + (char)(2503) +" "+ (char)(2475) + (char)(2495) + (char)(2480) + (char)(2503) +" "+ (char)(2479) + (char)(2494) + (char)(2451) + (char)(2527) + (char)(2494) + (char)(2480) +" "+ (char)(2460) + (char)(2472) + (char)(2509) + (char)(2479) + (char)(2503) +" "+ (char)(2479) + (char)(2503) + (char)(2453) + (char)(2507) + (char)(2472) + (char)(2507) +" "+ (char)(2453) + (char)(2509) + (char)(2479) + (char)(2494) + (char)(2480) + (char)(2503) + (char)(2453) + (char)(2509) + (char)(2463) + (char)(2494) + (char)(2480) +" "+ (char)(2439) + (char)(2472) + (char)(2474) + (char)(2497) + (char)(2463) +" "+ (char)(2453) + (char)(2480) + (char)(2497) + (char)(2472) +" : ");
                d = br.readLine();
                System.out.print('\u000C');
            }
        }
        catch(Exception ex) {
            System.out.println("\n"+ (char)(2447) + (char)(2453) + (char)(2463) + (char)(2495) +" "+ (char)(2447) + (char)(2480) + (char)(2480) +" "+ (char)(2456) + (char)(2463) + (char)(2503) + (char)(2459) + (char)(2503) +" "+ (char)(2551));
            System.out.println(""+ (char)(2447) + (char)(2480) + (char)(2480) + (char)(2480) + (char)(2503) + (char)(2480) +" "+ (char)(2476) + (char)(2480) + (char)(2509) + (char)(2467) + (char)(2472) + (char)(2494) +" : "+ ex);
            System.out.print(""+ (char)(2489) + (char)(2507) + (char)(2478) +" "+ (char)(2488) + (char)(2509) + (char)(2453) + (char)(2509) + (char)(2480) + (char)(2495) + (char)(2472) + (char)(2503) +" "+ (char)(2475) + (char)(2503) + (char)(2480) + (char)(2494) + (char)(2472) + (char)(2507) +" "+ (char)(2489) + (char)(2458) + (char)(2509) + (char)(2459) + (char)(2503) +" "+ (char)(2551) +" "+ (char)(2437) + (char)(2472) + (char)(2497) + (char)(2455) + (char)(2509) + (char)(2480) + (char)(2489) +" "+ (char)(2453) + (char)(2480) + (char)(2503) +" "+ (char)(2437) + (char)(2474) + (char)(2503) + (char)(2453) + (char)(2509) + (char)(2487) + (char)(2494) +" "+ (char)(2453) + (char)(2480) + (char)(2497) + (char)(2472));
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
                System.out.println("\t\t\t\t\t\t                     "+ (char)(2488) + (char)(2494) + (char)(2474) +" "+ (char)(2488) + (char)(2495) + (char)(2433) + (char)(2524) + (char)(2495));
                System.out.println("\t\t\t\t\t\t SS GAMING STUDIOS -"+ (char)(2470) + (char)(2509) + (char)(2476) + (char)(2494) + (char)(2480) + (char)(2494) +" "+ (char)(2472) + (char)(2495) + (char)(2480) + (char)(2509) + (char)(2478) + (char)(2495) + (char)(2468));
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(""+ (char)(2472) + (char)(2496) + (char)(2458) + (char)(2503) + (char)(2480) +" "+ (char)(2479) + (char)(2503) + (char)(2453) + (char)(2507) + (char)(2472) + (char)(2507) +" "+ (char)(2447) + (char)(2453) + (char)(2463) + (char)(2495) +" "+ (char)(2476) + (char)(2503) + (char)(2459) + (char)(2503) +" "+ (char)(2472) + (char)(2495) + (char)(2472) +" : ");
                System.out.println("        1   -   "+ (char)(2472) + (char)(2495) + (char)(2480) + (char)(2509) + (char)(2470) + (char)(2503) + (char)(2486) + (char)(2494) + (char)(2476) + (char)(2482) + (char)(2496) +" "+ (char)(2474) + (char)(2524) + (char)(2497) + (char)(2472));
                System.out.println("        2   -   "+ (char)(2455) + (char)(2503) + (char)(2478) + (char)(2503) +" "+ (char)(2466) + (char)(2497) + (char)(2453) + (char)(2497) + (char)(2472));
                System.out.println("        3   -   "+ (char)(2476) + (char)(2494) + (char)(2489) + (char)(2495) + (char)(2480));
                System.out.print("\t"+ (char)(2438) + (char)(2474) + (char)(2472) + (char)(2480) + (char)(2480) +" "+ (char)(2474) + (char)(2459) + (char)(2472) + (char)(2509) + (char)(2470) +" : ");
                b = Integer.parseInt(br.readLine());
                if(b != 1 && b != 2 && b != 3)
                    while(b != 1 && b != 2 && b != 3) {
                        System.out.print("\t"+ (char)(2437) + (char)(2476) + (char)(2504) + (char)(2471) +" "+ (char)(2439) + (char)(2472) + (char)(2474) + (char)(2497) + (char)(2463) +" ! "+ (char)(2437) + (char)(2472) + (char)(2497) + (char)(2455) + (char)(2509) + (char)(2480) + (char)(2489) +" "+ (char)(2453) + (char)(2480) + (char)(2503) +" "+ (char)(2447) + (char)(2453) + (char)(2463) + (char)(2495) +" "+ (char)(2476) + (char)(2504) + (char)(2471) +" "+ (char)(2474) + (char)(2459) + (char)(2472) + (char)(2509) + (char)(2470) +" "+ (char)(2470) + (char)(2495) + (char)(2472) +" : ");
                        b = Integer.parseInt(br.readLine());
                    }
                if(b == 1) {
                    System.out.print('\u000C');
                    sali.instructions();
                }
            } while(b == 1);
            if(b == 2) {
                System.out.print("\n"+ (char)(2454) + (char)(2503) + (char)(2482) + (char)(2507) + (char)(2527) + (char)(2494) + (char)(2524) + (char)(2470) + (char)(2503) + (char)(2480) +" "+ (char)(2488) + (char)(2434) + (char)(2454) + (char)(2509) + (char)(2479) + (char)(2494) +" "+ (char)(2482) + (char)(2495) + (char)(2454) + (char)(2497) + (char)(2472) +" : ");
                b = Integer.parseInt(br.readLine());
                if(b < 2 || b > 4)
                    while(b < 2 || b > 4) {
                        System.out.print(""+ (char)(2437) + (char)(2476) + (char)(2504) + (char)(2471) +" "+ (char)(2439) + (char)(2472) + (char)(2474) + (char)(2497) + (char)(2463) +" ! "+ (char)(2536) +" "+ (char)(2469) + (char)(2503) + (char)(2453) + (char)(2503) +" "+ (char)(2538) +" -"+ (char)(2447) + (char)(2480) +" "+ (char)(2478) + (char)(2471) + (char)(2509) + (char)(2479) + (char)(2503) +" "+ (char)(2447) + (char)(2453) + (char)(2463) + (char)(2495) +" "+ (char)(2488) + (char)(2434) + (char)(2454) + (char)(2509) + (char)(2479) + (char)(2494) +" "+ (char)(2482) + (char)(2495) + (char)(2454) + (char)(2497) + (char)(2472) +" : ");
                        b = Integer.parseInt(br.readLine());
                    }
                System.out.println("\n"+ (char)(2454) + (char)(2503) + (char)(2482) + (char)(2507) + (char)(2527) + (char)(2494) + (char)(2524) + (char)(2470) + (char)(2503) + (char)(2480) +" "+ (char)(2472) + (char)(2494) + (char)(2478) +" "+ (char)(2447) + (char)(2476) + (char)(2434) +" "+ (char)(2468) + (char)(2494) + (char)(2470) + (char)(2503) + (char)(2480) +" "+ (char)(2474) + (char)(2459) + (char)(2472) + (char)(2509) + (char)(2470) + (char)(2503) + (char)(2480) +" "+ (char)(2480) + (char)(2457) +" "+ (char)(2482) + (char)(2495) + (char)(2454) + (char)(2497) + (char)(2472) +" : ");
                for(d = 0; d < b; d++) {
                    f = true;
                    System.out.print("\n\t"+ (char)(2472) + (char)(2494) + (char)(2478) +"\t: ");
                    z[0][d] = br.readLine();
                    z[0][d] = z[0][d].toUpperCase();
                    System.out.print("\t"+ (char)(2480) + (char)(2457) +"\t: ");
                    z[1][d] = br.readLine();
                    z[1][d] = z[1][d].toUpperCase();
                    while(true) {
                        f = (z[1][d].equals("RED") || z[1][d].equals("GREEN") || z[1][d].equals("YELLOW") || z[1][d].equals("BLUE"));
                        if(f == false)
                            while(f == false) {
                                System.out.print("\t"+ (char)(2437) + (char)(2476) + (char)(2504) + (char)(2471) +" "+ (char)(2439) + (char)(2472) + (char)(2474) + (char)(2497) + (char)(2463) +" ! "+ (char)(2453) + (char)(2503) + (char)(2476) + (char)(2482) + (char)(2478) + (char)(2494) + (char)(2468) + (char)(2509) + (char)(2480) +"  RED, GREEN, YELLOW "+ (char)(2447) + (char)(2476) + (char)(2434) +"  BLUE "+ (char)(2480) + (char)(2457) + (char)(2455) + (char)(2497) + (char)(2482) + (char)(2495) + (char)(2439) +" "+ (char)(2455) + (char)(2509) + (char)(2480) + (char)(2489) + (char)(2467) +" "+ (char)(2453) + (char)(2480) + (char)(2494) +" "+ (char)(2489) + (char)(2476) + (char)(2503) +" : ");
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
                            System.out.print("\t"+ z[1][d] +" "+ (char)(2480) + (char)(2457) + (char)(2463) + (char)(2495) +" "+ (char)(2447) + (char)(2453) + (char)(2460) + (char)(2472) +" "+ (char)(2476) + (char)(2503) + (char)(2459) + (char)(2503) +" "+ (char)(2472) + (char)(2495) + (char)(2527) + (char)(2503) + (char)(2459) + (char)(2503) + (char)(2472) +" "+ (char)(2551) +" "+ (char)(2438) + (char)(2474) + (char)(2472) + (char)(2495) +" "+ (char)(2437) + (char)(2472) + (char)(2509) + (char)(2479) +" "+ (char)(2480) + (char)(2457) +" "+ (char)(2476) + (char)(2503) + (char)(2459) + (char)(2503) +" "+ (char)(2472) + (char)(2495) + (char)(2472) +" : ");
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
                    System.out.println("\n"+ (char)(2447) + (char)(2453) + (char)(2463) + (char)(2495) +" "+ (char)(2478) + (char)(2507) + (char)(2465) +" "+ (char)(2476) + (char)(2503) + (char)(2459) + (char)(2503) +" "+ (char)(2472) + (char)(2495) + (char)(2472) +" : ");
                    System.out.println("        1   -   "+ (char)(2488) + (char)(2494) + (char)(2471) + (char)(2494) + (char)(2480) + (char)(2472) +" "+ (char)(2478) + (char)(2507) + (char)(2465));
                    System.out.println("        2   -   "+ (char)(2437) + (char)(2470) + (char)(2499) + (char)(2486) + (char)(2509) + (char)(2479) +" "+ (char)(2478) + (char)(2507) + (char)(2465));
                    System.out.println("        3   -   "+ (char)(2472) + (char)(2495) + (char)(2486) + (char)(2509) + (char)(2458) + (char)(2495) + (char)(2489) + (char)(2509) + (char)(2472) +" "+ (char)(2478) + (char)(2507) + (char)(2465));
                    System.out.println("        4   -   "+ (char)(2463) + (char)(2494) + (char)(2472) + (char)(2494) +" "+ (char)(2464) + (char)(2503) + (char)(2482) + (char)(2494) +" "+ (char)(2478) + (char)(2507) + (char)(2465));
                    System.out.println("        5   -   "+ (char)(2474) + (char)(2509) + (char)(2480) + (char)(2468) + (char)(2509) + (char)(2479) + (char)(2503) + (char)(2453) + (char)(2463) + (char)(2495) +" "+ (char)(2478) + (char)(2507) + (char)(2465) + (char)(2503) + (char)(2480) +" "+ (char)(2476) + (char)(2480) + (char)(2509) + (char)(2467) + (char)(2472) + (char)(2494) +" "+ (char)(2474) + (char)(2524) + (char)(2497) + (char)(2472));
                    System.out.print("\t"+ (char)(2438) + (char)(2474) + (char)(2472) + (char)(2480) + (char)(2480) +" "+ (char)(2474) + (char)(2459) + (char)(2472) + (char)(2509) + (char)(2470) +" : ");
                    ch = Integer.parseInt(br.readLine());
                    if(ch != 1 && ch != 2 && ch != 3 && ch != 4 && ch != 5)
                        while(ch != 1 && ch != 2 && ch != 3 && ch != 4 && ch != 5) {
                            System.out.print("\t"+ (char)(2437) + (char)(2476) + (char)(2504) + (char)(2471) +" "+ (char)(2439) + (char)(2472) + (char)(2474) + (char)(2497) + (char)(2463) +" ! "+ (char)(2437) + (char)(2472) + (char)(2497) + (char)(2455) + (char)(2509) + (char)(2480) + (char)(2489) +" "+ (char)(2453) + (char)(2480) + (char)(2503) +" "+ (char)(2447) + (char)(2453) + (char)(2463) + (char)(2495) +" "+ (char)(2476) + (char)(2504) + (char)(2471) +" "+ (char)(2474) + (char)(2459) + (char)(2472) + (char)(2509) + (char)(2470) +" "+ (char)(2470) + (char)(2495) + (char)(2472) +" : ");
                            ch = Integer.parseInt(br.readLine());
                        }
                    if(ch == 5) {
                        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("\t\t\t\t\t\t                    "+ (char)(2476) + (char)(2480) + (char)(2509) + (char)(2467) + (char)(2472) + (char)(2494));
                        System.out.println("\n"+ (char)(2488) + (char)(2494) + (char)(2471) + (char)(2494) + (char)(2480) + (char)(2472) +" "+ (char)(2478) + (char)(2507) + (char)(2465));
                        System.out.println("\t"+ (char)(2447) + (char)(2463) + (char)(2495) +" "+ (char)(2488) + (char)(2494) + (char)(2471) + (char)(2494) + (char)(2480) + (char)(2472) +" "+ (char)(2488) + (char)(2494) + (char)(2474) +" "+ (char)(2488) + (char)(2495) + (char)(2433) + (char)(2524) + (char)(2495) + (char)(2480) +" "+ (char)(2454) + (char)(2503) + (char)(2482) + (char)(2494) +" "+ (char)(2551) +" "+ (char)(2488) + (char)(2495) + (char)(2433) + (char)(2524) + (char)(2495) + (char)(2455) + (char)(2497) + (char)(2482) + (char)(2495) +" "+ (char)(2438) + (char)(2474) + (char)(2472) + (char)(2494) + (char)(2453) + (char)(2503) +" "+ (char)(2441) + (char)(2474) + (char)(2480) + (char)(2503) +" "+ (char)(2472) + (char)(2495) + (char)(2527) + (char)(2503) +" "+ (char)(2479) + (char)(2494) + (char)(2476) + (char)(2503) +" "+ (char)(2447) + (char)(2476) + (char)(2434) +" "+ (char)(2488) + (char)(2494) + (char)(2474) + (char)(2455) + (char)(2497) + (char)(2482) + (char)(2495) +" "+ (char)(2438) + (char)(2474) + (char)(2472) + (char)(2494) + (char)(2453) + (char)(2503) +" "+ (char)(2472) + (char)(2496) + (char)(2458) + (char)(2503) +" "+ (char)(2475) + (char)(2503) + (char)(2482) + (char)(2503) +" "+ (char)(2470) + (char)(2503) + (char)(2476) + (char)(2503) +" "+ (char)(2551) +" "+ (char)(2479) + (char)(2503) +" "+ (char)(2454) + (char)(2503) + (char)(2482) + (char)(2507) + (char)(2527) + (char)(2494) + (char)(2524) +" "+ (char)(2474) + (char)(2509) + (char)(2480) + (char)(2469) + (char)(2478) + (char)(2503) +" "+ (char)(2535) + (char)(2534) + (char)(2534) +" -"+ (char)(2468) + (char)(2503) +" "+ (char)(2474) + (char)(2508) + (char)(2433) + (char)(2459) + (char)(2494) + (char)(2468) + (char)(2503) +" "+ (char)(2474) + (char)(2494) + (char)(2480) + (char)(2476) + (char)(2503) +", ");
                        System.out.println("\t"+ (char)(2488) + (char)(2503) + (char)(2439) +" "+ (char)(2454) + (char)(2503) + (char)(2482) + (char)(2507) + (char)(2527) + (char)(2494) + (char)(2524) +" "+ (char)(2474) + (char)(2509) + (char)(2480) + (char)(2469) + (char)(2478) +" "+ (char)(2488) + (char)(2509) + (char)(2469) + (char)(2494) + (char)(2472) +" "+ (char)(2437) + (char)(2471) + (char)(2495) + (char)(2453) + (char)(2494) + (char)(2480) +" "+ (char)(2453) + (char)(2480) + (char)(2476) + (char)(2503) +" "+ (char)(2551));
                        System.out.println("\n"+ (char)(2437) + (char)(2470) + (char)(2499) + (char)(2486) + (char)(2509) + (char)(2479) +" "+ (char)(2478) + (char)(2507) + (char)(2465));
                        System.out.println("\t"+ (char)(2437) + (char)(2472) + (char)(2503) + (char)(2453) + (char)(2463) + (char)(2494) + (char)(2439) +" "+ (char)(2488) + (char)(2494) + (char)(2471) + (char)(2494) + (char)(2480) + (char)(2472) +" "+ (char)(2478) + (char)(2507) + (char)(2465) + (char)(2503) + (char)(2480) +" "+ (char)(2478) + (char)(2468) +", "+ (char)(2486) + (char)(2497) + (char)(2471) + (char)(2497) +" "+ (char)(2454) + (char)(2503) + (char)(2482) + (char)(2507) + (char)(2527) + (char)(2494) + (char)(2524) + (char)(2470) + (char)(2503) + (char)(2480) +" "+ (char)(2453) + (char)(2494) + (char)(2459) + (char)(2503) +" "+ (char)(2488) + (char)(2494) + (char)(2474) +" "+ (char)(2447) + (char)(2476) + (char)(2434) +" "+ (char)(2488) + (char)(2495) + (char)(2433) + (char)(2524) + (char)(2495) + (char)(2455) + (char)(2497) + (char)(2482) + (char)(2495) +" "+ (char)(2437) + (char)(2470) + (char)(2499) + (char)(2486) + (char)(2509) + (char)(2479) +" "+ (char)(2469) + (char)(2494) + (char)(2453) + (char)(2476) + (char)(2503) +" "+ (char)(2551));
                        System.out.println("\n"+ (char)(2472) + (char)(2495) + (char)(2486) + (char)(2509) + (char)(2458) + (char)(2495) + (char)(2489) + (char)(2509) + (char)(2472) +" "+ (char)(2478) + (char)(2507) + (char)(2465));
                        System.out.println("\t"+ (char)(2447) + (char)(2439) +" "+ (char)(2478) + (char)(2507) + (char)(2465) + (char)(2503) +", "+ (char)(2479) + (char)(2470) + (char)(2495) +" "+ (char)(2453) + (char)(2507) + (char)(2472) +" "+ (char)(2454) + (char)(2503) + (char)(2482) + (char)(2507) + (char)(2527) + (char)(2494) + (char)(2524) +" '"+ (char)(2453) +"'-"+ (char)(2447) + (char)(2480) +" "+ (char)(2488) + (char)(2509) + (char)(2453) + (char)(2507) + (char)(2480) +" "+ (char)(2437) + (char)(2474) + (char)(2480) +" "+ (char)(2447) + (char)(2453) + (char)(2460) + (char)(2472) +" "+ (char)(2454) + (char)(2503) + (char)(2482) + (char)(2507) + (char)(2527) + (char)(2494) + (char)(2524) +" '"+ (char)(2454) +"'-"+ (char)(2447) + (char)(2480) +" "+ (char)(2488) + (char)(2509) + (char)(2453) + (char)(2507) + (char)(2480) + (char)(2503) + (char)(2480) +" "+ (char)(2488) + (char)(2457) + (char)(2509) + (char)(2455) + (char)(2503) +" "+ (char)(2488) + (char)(2478) + (char)(2494) + (char)(2472) +" "+ (char)(2489) + (char)(2527) + (char)(2503) +" "+ (char)(2479) + (char)(2494) + (char)(2527) +", "+ (char)(2468) + (char)(2476) + (char)(2503) +" "+ (char)(2454) + (char)(2503) + (char)(2482) + (char)(2507) + (char)(2527) + (char)(2494) + (char)(2524) +" '"+ (char)(2454) +"'-"+ (char)(2453) + (char)(2503) +" "+ (char)(2474) + (char)(2509) + (char)(2480) + (char)(2469) + (char)(2478) +" "+ (char)(2469) + (char)(2503) + (char)(2453) + (char)(2503) +" "+ (char)(2454) + (char)(2503) + (char)(2482) + (char)(2494) +" "+ (char)(2486) + (char)(2497) + (char)(2480) + (char)(2497) +" "+ (char)(2453) + (char)(2480) + (char)(2468) + (char)(2503) +" "+ (char)(2489) + (char)(2476) + (char)(2503) +" "+ (char)(2551));
                        System.out.println("\t"+ (char)(2437) + (char)(2480) + (char)(2509) + (char)(2469) + (char)(2494) + (char)(2510) +", "+ (char)(2447) + (char)(2439) +" "+ (char)(2478) + (char)(2507) + (char)(2465) + (char)(2503) +" "+ (char)(2454) + (char)(2503) + (char)(2482) + (char)(2507) + (char)(2527) + (char)(2494) + (char)(2524) + (char)(2480) + (char)(2494) +" "+ (char)(2447) + (char)(2453) + (char)(2503) +" "+ (char)(2437) + (char)(2474) + (char)(2480) + (char)(2503) + (char)(2480) +" "+ (char)(2455) + (char)(2497) + (char)(2463) + (char)(2495) +" "+ (char)(2453) + (char)(2494) + (char)(2463) + (char)(2468) + (char)(2503) +" "+ (char)(2474) + (char)(2494) + (char)(2480) + (char)(2476) + (char)(2503) +" "+ (char)(2551));
                        System.out.println("\n"+ (char)(2463) + (char)(2494) + (char)(2472) + (char)(2494) +" "+ (char)(2464) + (char)(2503) + (char)(2482) + (char)(2494) +" "+ (char)(2478) + (char)(2507) + (char)(2465));
                        System.out.println("\t"+ (char)(2447) + (char)(2439) +" "+ (char)(2478) + (char)(2507) + (char)(2465) + (char)(2503) +", "+ (char)(2454) + (char)(2503) + (char)(2482) + (char)(2507) + (char)(2527) + (char)(2494) + (char)(2524) + (char)(2480) + (char)(2494) +" "+ (char)(2468) + (char)(2494) + (char)(2470) + (char)(2503) + (char)(2480) +" "+ (char)(2472) + (char)(2495) + (char)(2460) + (char)(2503) + (char)(2470) + (char)(2503) + (char)(2480) +" "+ (char)(2470) + (char)(2494) + (char)(2472) + (char)(2503) +" "+ (char)(2455) + (char)(2497) + (char)(2463) + (char)(2495) + (char)(2480) +" "+ (char)(2475) + (char)(2482) + (char)(2494) + (char)(2475) + (char)(2482) +" "+ (char)(2437) + (char)(2472) + (char)(2497) + (char)(2479) + (char)(2494) + (char)(2527) + (char)(2496) +" "+ (char)(2468) + (char)(2494) + (char)(2470) + (char)(2503) + (char)(2480) +" "+ (char)(2439) + (char)(2458) + (char)(2509) + (char)(2459) + (char)(2494) +" "+ (char)(2478) + (char)(2468) +" "+ (char)(2489) + (char)(2527) + (char)(2468) + (char)(2507) +" "+ (char)(2472) + (char)(2495) + (char)(2460) + (char)(2503) + (char)(2470) + (char)(2503) + (char)(2480) + (char)(2453) + (char)(2503) +" "+ (char)(2468) + (char)(2468) +" "+ (char)(2488) + (char)(2457) + (char)(2509) + (char)(2454) + (char)(2453) +" "+ (char)(2456) + (char)(2480) +" "+ (char)(2447) + (char)(2455) + (char)(2495) + (char)(2527) + (char)(2503) +" "+ (char)(2472) + (char)(2495) + (char)(2527) + (char)(2503) +" "+ (char)(2479) + (char)(2494) + (char)(2476) + (char)(2503) +", "+ (char)(2453) + (char)(2495) + (char)(2434) + (char)(2476) + (char)(2494) +" "+ (char)(2437) + (char)(2474) + (char)(2480) + (char)(2470) + (char)(2503) + (char)(2480) +" "+ (char)(2468) + (char)(2468));
                        System.out.println("\t"+ (char)(2488) + (char)(2457) + (char)(2509) + (char)(2454) + (char)(2453) +" "+ (char)(2456) + (char)(2480) +" "+ (char)(2474) + (char)(2495) + (char)(2459) + (char)(2495) + (char)(2527) + (char)(2503) +" "+ (char)(2472) + (char)(2495) + (char)(2527) + (char)(2503) +" "+ (char)(2438) + (char)(2488) + (char)(2476) + (char)(2503) +" "+ (char)(2551));
                        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    }
                } while(ch == 5);
                System.out.print("\n\t\t\t\t");
                if(z[1][0].equals("RED"))
                    System.out.print(""+ (char)(2482) + (char)(2494) + (char)(2482));
                else if(z[1][0].equals("GREEN"))
                    System.out.print(""+ (char)(2488) + (char)(2476) + (char)(2497) + (char)(2460));
                else if(z[1][0].equals("YELLOW"))
                    System.out.print(""+ (char)(2489) + (char)(2482) + (char)(2497) + (char)(2470));
                else if(z[1][0].equals("BLUE"))
                    System.out.print(""+ (char)(2472) + (char)(2496) + (char)(2482));
                System.out.print("\t\t\t\t");
                if(z[1][1].equals("RED"))
                    System.out.println(""+ (char)(2482) + (char)(2494) + (char)(2482));
                else if(z[1][1].equals("GREEN"))
                    System.out.println(""+ (char)(2488) + (char)(2476) + (char)(2497) + (char)(2460));
                else if(z[1][1].equals("YELLOW"))
                    System.out.println(""+ (char)(2489) + (char)(2482) + (char)(2497) + (char)(2470));
                else if(z[1][1].equals("BLUE"))
                    System.out.println(""+ (char)(2472) + (char)(2496) + (char)(2482));
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
                System.out.print("\n\t\t\t\t");
                if(z[1][2].equals("RED"))
                    System.out.print(""+ (char)(2482) + (char)(2494) + (char)(2482));
                else if(z[1][2].equals("GREEN"))
                    System.out.print(""+ (char)(2488) + (char)(2476) + (char)(2497) + (char)(2460));
                else if(z[1][2].equals("YELLOW"))
                    System.out.print(""+ (char)(2489) + (char)(2482) + (char)(2497) + (char)(2470));
                else if(z[1][2].equals("BLUE"))
                    System.out.print(""+ (char)(2472) + (char)(2496) + (char)(2482));
                System.out.print("\t\t\t\t");
                if(z[1][3].equals("RED"))
                    System.out.println(""+ (char)(2482) + (char)(2494) + (char)(2482));
                else if(z[1][3].equals("GREEN"))
                    System.out.println(""+ (char)(2488) + (char)(2476) + (char)(2497) + (char)(2460));
                else if(z[1][3].equals("YELLOW"))
                    System.out.println(""+ (char)(2489) + (char)(2482) + (char)(2497) + (char)(2470));
                else if(z[1][3].equals("BLUE"))
                    System.out.println(""+ (char)(2472) + (char)(2496) + (char)(2482));
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
                System.out.print("\n"+ (char)(2455) + (char)(2503) + (char)(2478) +" "+ (char)(2458) + (char)(2494) + (char)(2482) + (char)(2497) +" "+ (char)(2489) + (char)(2458) + (char)(2509) + (char)(2459) + (char)(2503) +" "+ (char)(2551) +" "+ (char)(2437) + (char)(2472) + (char)(2497) + (char)(2455) + (char)(2509) + (char)(2480) + (char)(2489) +" "+ (char)(2453) + (char)(2480) + (char)(2503) +" "+ (char)(2437) + (char)(2474) + (char)(2503) + (char)(2453) + (char)(2509) + (char)(2487) + (char)(2494) +" "+ (char)(2453) + (char)(2480) + (char)(2497) + (char)(2472));
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
            System.out.println("\n"+ (char)(2447) + (char)(2453) + (char)(2463) + (char)(2495) +" "+ (char)(2447) + (char)(2480) + (char)(2480) +" "+ (char)(2456) + (char)(2463) + (char)(2503) + (char)(2459) + (char)(2503) +" "+ (char)(2551));
            System.out.println(""+ (char)(2447) + (char)(2480) + (char)(2480) + (char)(2480) + (char)(2503) + (char)(2480) +" "+ (char)(2476) + (char)(2480) + (char)(2509) + (char)(2467) + (char)(2472) + (char)(2494) +" : "+ ex);
            System.out.print(""+ (char)(2489) + (char)(2507) + (char)(2478) +" "+ (char)(2488) + (char)(2509) + (char)(2453) + (char)(2509) + (char)(2480) + (char)(2495) + (char)(2472) + (char)(2503) +" "+ (char)(2475) + (char)(2503) + (char)(2480) + (char)(2494) + (char)(2472) + (char)(2507) +" "+ (char)(2489) + (char)(2458) + (char)(2509) + (char)(2459) + (char)(2503) +" "+ (char)(2551) +" "+ (char)(2437) + (char)(2472) + (char)(2497) + (char)(2455) + (char)(2509) + (char)(2480) + (char)(2489) +" "+ (char)(2453) + (char)(2480) + (char)(2503) +" "+ (char)(2437) + (char)(2474) + (char)(2503) + (char)(2453) + (char)(2509) + (char)(2487) + (char)(2494) +" "+ (char)(2453) + (char)(2480) + (char)(2497) + (char)(2472));
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
