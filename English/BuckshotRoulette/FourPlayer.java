package English.BuckshotRoulette;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import English.Instructions.LoadingScreen;
public class FourPlayer {
    static String[] x = new String[4];
    int[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int[] b = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int[] c = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int[] d = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int[] e = {0, 0, 0, 0};
    int[] f;
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    public void game() throws IOException, InterruptedException {
        try {
            int a, b, c, d, e, f, i, j, k, x;
            int[] h;
            boolean y = true, z, m = true, n;
            String g;
            Display dis = new Display();
            BulletGeneration bg = new BulletGeneration();
            for (a = 1; a <= 3; a++) {
                b = 0;
                x = 100;
                for (b = 0; b < 9; b++) {
                    this.a[b] = 0;
                    this.b[b] = 0;
                    this.c[b] = 0;
                    this.d[b] = 0;
                }
                if (a == 1)
                    for (d = 0; d < 4; d++)
                        this.e[d] = 4;
                else if (a == 2)
                    for (d = 0; d < 4; d++)
                        this.e[d] = 6;
                else
                    for (d = 0; d < 4; d++)
                        this.e[d] = 8;
                levelStartup(a);
                this.f = new int[1];
                k = 1;
                do {
                    b = 0;
                    if (k == this.f.length) {
                        for (d = 0; d < 4; d++) {
                            if (this.e[d] == 0)
                                continue;
                            System.out.println("\t\t\t\t\t\t      BUCKSHOT ROULETTE");
                            System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("Player "+ (d + 1) +" ("+ this.x[d] +") : ");
                            System.out.print("\tEnter any character to reveal all your new items : ");
                            g = br.readLine();
                            e = 0;
                            if (d == 0)
                                for (f = 1; f < 9; f++) {
                                    if (this.a[f] == 0)
                                        e++;
                                }
                            else if (d == 1)
                                for (f = 1; f < 9; f++) {
                                    if (this.b[f] == 0)
                                        e++;
                                }
                            else if (d == 2)
                                for (f = 1; f < 9; f++) {
                                    if (this.c[f] == 0)
                                        e++;
                                }
                            else if (d == 3)
                                for (f = 1; f < 9; f++) {
                                    if (this.d[f] == 0)
                                        e++;
                                }
                            if (e == 0)
                                System.out.println("\tOops! No available space!");
                            else {
                                if (e > 4)
                                    e = 4;
                                System.out.println("\tYour new items are as follows :");
                                h = new int[e];
                                for (f = 0; f < h.length; f++) {
                                    h[f] = (int) (Math.random() * 10.0) + 1;
                                    System.out.print("\t\t-> ");
                                    if (h[f] == 1)
                                        System.out.println("Adrenaline");
                                    else if (h[f] == 2)
                                        System.out.println("Beer");
                                    else if (h[f] == 3)
                                        System.out.println("Burner Phone");
                                    else if (h[f] == 4)
                                        System.out.println("Cigarette Pack");
                                    else if (h[f] == 5)
                                        System.out.println("Expired Medicine");
                                    else if (h[f] == 6)
                                        System.out.println("Hand Saw");
                                    else if (h[f] == 7)
                                        System.out.println("Inverter");
                                    else if (h[f] == 8)
                                        System.out.println("Jammer");
                                    else if (h[f] == 9)
                                        System.out.println("Magnifying Glass");
                                    else if (h[f] == 10)
                                        System.out.println("Remote");
                                }
                                Thread.sleep(4000);
                                System.out.print('\u000C');
                                dis.fourPlayers(this.a, this.b, this.c, this.d, x % 4, this.x, this.e);
                                for (f = 0; f < h.length; f++) {
                                    e = 0;
                                    if (d == 0) {
                                        for (c = 1; c < 9; c++)
                                            if (this.a[c] == 0)
                                                e++;
                                        c = (int) (Math.random() * e) + 1;
                                        for (i = 1, e = 0; i < 9; i++) {
                                            if (this.a[i] == 0)
                                                e++;
                                            if (e == c)
                                                break;
                                        }
                                        this.a[i] = h[f];
                                    } else if (d == 1) {
                                        for (c = 1; c < 9; c++)
                                            if (this.b[c] == 0)
                                                e++;
                                        c = (int) (Math.random() * e) + 1;
                                        for (i = 1, e = 0; i < 9; i++) {
                                            if (this.b[i] == 0)
                                                e++;
                                            if (e == c)
                                                break;
                                        }
                                        this.b[i] = h[f];
                                    } else if (d == 2) {
                                        for (c = 1; c < 9; c++)
                                            if (this.c[c] == 0)
                                                e++;
                                        c = (int) (Math.random() * e) + 1;
                                        for (i = 1, e = 0; i < 9; i++) {
                                            if (this.c[i] == 0)
                                                e++;
                                            if (e == c)
                                                break;
                                        }
                                        this.c[i] = h[f];
                                    } else if (d == 3) {
                                        for (c = 1; c < 9; c++)
                                            if (this.d[c] == 0)
                                                e++;
                                        c = (int) (Math.random() * e) + 1;
                                        for (i = 1, e = 0; i < 9; i++) {
                                            if (this.d[i] == 0)
                                                e++;
                                            if (e == c)
                                                break;
                                        }
                                        this.d[i] = h[f];
                                    }
                                    Thread.sleep(1000);
                                    System.out.print('\u000C');
                                    dis.fourPlayers(this.a, this.b, this.c, this.d, x % 4, this.x, this.e);
                                }
                            }
                            Thread.sleep(4000);
                            System.out.print('\u000C');
                        }
                        this.f = bg.main();
                        k = 0;
                        m = false;
                        this.a[0] = this.b[0] = this.c[0] = this.d[0] = 0;
                    } else {
                        c = 0;
                        z = false;
                        if (x % 4 == 0 && this.e[0] != 0) {
                            if (this.a[0] == 0) {
                                do {
                                    dis.fourPlayers(this.a, this.b, this.c, this.d, x % 4, this.x, this.e);
                                    System.out.println("\nTurn for "+ this.x[0] +" (Player 1) : ");
                                    System.out.println("\nChoose any one :");
                                    System.out.println("    1 - Shot a player");
                                    System.out.println("    2 - Use resources");
                                    System.out.print("\tEnter your choice : ");
                                    c = Integer.parseInt(br.readLine());
                                    if (c < 1 || c > 2)
                                        while (c < 1 || c > 2) {
                                            System.out.print("\tInvalid input! Please enter the number shown next to your choice : ");
                                            c = Integer.parseInt(br.readLine());
                                        }
                                    if (c == 1) {
                                        System.out.println("\nChoose the player you want to shoot : ");
                                        System.out.println("    1 - Yourself (Player 1)");
                                        System.out.println("    2 - "+ this.x[1] +" (Player 2)");
                                        System.out.println("    3 - "+ this.x[2] +" (Player 3)");
                                        System.out.println("    4 - "+ this.x[3] +" (Player 4)");
                                        System.out.print("\tEnter your choice : ");
                                        e = Integer.parseInt(br.readLine());
                                        if (e < 1 || e > 4)
                                            while (e < 1 || e > 4) {
                                                System.out.println("\tInvalid input! Please enter the number shown next to the name of the player you want to shoot : ");
                                                e = Integer.parseInt(br.readLine());
                                            }
                                        if (e == 1) {
                                            if (this.f[k] == 0) {
                                                System.out.println("\nIt was a BLANK shell.");
                                                System.out.println(this.x[0] +" (Player 1) gets another turn.");
                                                m = false;
                                            } else if (this.f[k] == 1) {
                                                System.out.println("\nIt was a LIVE shell.");
                                                System.out.print("Health DECREASED from "+ this.e[0] + '\u2665' +" to ");
                                                if (z)
                                                    this.e[0] -= 2;
                                                else
                                                    this.e[0]--;
                                                System.out.println(""+ this.e[0] + '\u2665' +".");
                                                this.a[12]++;
                                            }
                                        } else {
                                            if (this.f[k] == 0) {
                                                System.out.println("\nIt was a BLANK shell.");
                                                this.a[12]++;
                                            } else {
                                                System.out.println("\nIt was a LIVE shell.");
                                                if (z)
                                                    this.a[9] += 2;
                                                else
                                                    this.a[9]++;
                                                if (e == 2) {
                                                    System.out.print("Health of "+ this.x[1] +" (Player 2) DECREASED from "+ this.e[1] + '\u2665' +" to ");
                                                    if (z) {
                                                        this.e[1] -= 2;
                                                        this.b[10] += 2;
                                                    } else {
                                                        this.e[1]--;
                                                        this.b[10]++;
                                                    }
                                                    System.out.println(""+ this.e[1] + '\u2665' +".");
                                                } else if (e == 3) {
                                                    System.out.print("Health of "+ this.x[2] +" (Player 3) DECREASED from "+ this.e[2] + '\u2665' +" to ");
                                                    if (z) {
                                                        this.e[2] -= 2;
                                                        this.c[10] += 2;
                                                    } else {
                                                        this.e[2]--;
                                                        this.c[10]++;
                                                    }
                                                    System.out.println(""+ this.e[2] + '\u2665' +".");
                                                } else if (e == 4) {
                                                    System.out.print("Health of "+ this.x[3] +" (Player 4) DECREASED from "+ this.e[3] + '\u2665' +" to ");
                                                    if (z) {
                                                        this.e[3] -= 2;
                                                        this.d[10] += 2;
                                                    } else {
                                                        this.e[3]--;
                                                        this.d[10]++;
                                                    }
                                                    System.out.println(""+ this.e[3] + '\u2665' +".");
                                                }
                                            }
                                        }
                                        k++;
                                    } else if (c == 2) {
                                        e = 0;
                                        for (d = 1; d < 9; d++)
                                            if (this.a[d] == 0)
                                                e++;
                                        if (e == 8)
                                            System.out.print("\tOops! No items present to use.");
                                        else {
                                            System.out.println("\nEnter the number shown next to the item you want to use :");
                                            for (d = 1; d < 9; d++)
                                                if (this.a[d] != 0) {
                                                    System.out.print("    "+ d +" - ");
                                                    if (this.a[d] == 1)
                                                        System.out.println("Adrenaline");
                                                    else if (this.a[d] == 2)
                                                        System.out.println("Beer");
                                                    else if (this.a[d] == 3)
                                                        System.out.println("Burner Phone");
                                                    else if (this.a[d] == 4)
                                                        System.out.println("Cigarette Pack");
                                                    else if (this.a[d] == 5)
                                                        System.out.println("Expired Medicine");
                                                    else if (this.a[d] == 6)
                                                        System.out.println("Hand Saw");
                                                    else if (this.a[d] == 7)
                                                        System.out.println("Inverter");
                                                    else if (this.a[d] == 8)
                                                        System.out.println("Jammer");
                                                    else if (this.a[d] == 9)
                                                        System.out.println("Magnifying Glass");
                                                    else if (this.a[d] == 10)
                                                        System.out.println("Remote");
                                                }
                                            System.out.println("  100 - Go back");
                                            System.out.print("\tEnter your choice : ");
                                            d = Integer.parseInt(br.readLine());
                                            if (d != 100 && (d < 1 || d > 8 || this.a[d] == 0))
                                                while (d != 100 && (d < 1 || d > 8 || this.a[d] == 0)) {
                                                    System.out.print("\tInvalid input! Please enter the number shown next to the item you desire to use : ");
                                                    d = Integer.parseInt(br.readLine());
                                                }
                                            if (d != 100) {
                                                if (this.a[d] == 1) {
                                                    System.out.println("\nSelect the item you want to steal and use :");
                                                    for (e = 1; e < 9; e++)
                                                        if (this.b[e] != 0 && this.b[e] != 1) {
                                                            System.out.print("   2"+ e +" - ");
                                                            if (this.b[e] == 2)
                                                                System.out.println("Beer             (from Player 2)");
                                                            else if (this.b[e] == 3)
                                                                System.out.println("Burner Phone     (from Player 2)");
                                                            else if (this.b[e] == 4)
                                                                System.out.println("Cigarette Pack   (from Player 2)");
                                                            else if (this.b[e] == 5)
                                                                System.out.println("Expired Medicine (from Player 2)");
                                                            else if (this.b[e] == 6)
                                                                System.out.println("Hand Saw         (from Player 2)");
                                                            else if (this.b[e] == 7)
                                                                System.out.println("Inverter         (from Player 2)");
                                                            else if (this.b[e] == 8)
                                                                System.out.println("Jammer           (from Player 2)");
                                                            else if (this.b[e] == 9)
                                                                System.out.println("Magnifying Glass (from Player 2)");
                                                            else if (this.b[e] == 10)
                                                                System.out.println("Remote           (from Player 2)");
                                                        }
                                                    for (e = 1; e < 9; e++)
                                                        if (this.c[e] != 0 && this.c[e] != 1) {
                                                            System.out.print("   3"+ e +" - ");
                                                            if (this.c[e] == 2)
                                                                System.out.println("Beer             (from Player 3)");
                                                            else if (this.c[e] == 3)
                                                                System.out.println("Burner Phone     (from Player 3)");
                                                            else if (this.c[e] == 4)
                                                                System.out.println("Cigarette Pack   (from Player 3)");
                                                            else if (this.c[e] == 5)
                                                                System.out.println("Expired Medicine (from Player 3)");
                                                            else if (this.c[e] == 6)
                                                                System.out.println("Hand Saw         (from Player 3)");
                                                            else if (this.c[e] == 7)
                                                                System.out.println("Inverter         (from Player 3)");
                                                            else if (this.c[e] == 8)
                                                                System.out.println("Jammer           (from Player 3)");
                                                            else if (this.c[e] == 9)
                                                                System.out.println("Magnifying Glass (from Player 3)");
                                                            else if (this.c[e] == 10)
                                                                System.out.println("Remote           (from Player 3)");
                                                        }
                                                    for (e = 1; e < 9; e++)
                                                        if (this.d[e] != 0 && this.d[e] != 1) {
                                                            System.out.print("   4"+ e +" - ");
                                                            if (this.d[e] == 2)
                                                                System.out.println("Beer             (from Player 4)");
                                                            else if (this.d[e] == 3)
                                                                System.out.println("Burner Phone     (from Player 4)");
                                                            else if (this.d[e] == 4)
                                                                System.out.println("Cigarette Pack   (from Player 4)");
                                                            else if (this.d[e] == 5)
                                                                System.out.println("Expired Medicine (from Player 4)");
                                                            else if (this.d[e] == 6)
                                                                System.out.println("Hand Saw         (from Player 4)");
                                                            else if (this.d[e] == 7)
                                                                System.out.println("Inverter         (from Player 4)");
                                                            else if (this.d[e] == 8)
                                                                System.out.println("Jammer           (from Player 4)");
                                                            else if (this.d[e] == 9)
                                                                System.out.println("Magnifying Glass (from Player 4)");
                                                            else if (this.d[e] == 10)
                                                                System.out.println("Remote           (from Player 4)");
                                                        }
                                                    System.out.print("\tEnter your choice : ");
                                                    e = Integer.parseInt(br.readLine());
                                                    do {
                                                        n = true;
                                                        if (Integer.toString(e).length() != 2 || (e / 10 != 2 && e / 10 != 3 && e / 10 != 4))
                                                            n = false;
                                                        else {
                                                            if (e / 10 == 2 && (this.b[e % 10] == 0 || this.b[e % 10] == 1))
                                                                n = false;
                                                            else if (e / 10 == 3 && (this.c[e % 10] == 0 || this.c[e % 10] == 1))
                                                                n = false;
                                                            else if (e / 10 == 4 && (this.d[e % 10] == 0 || this.d[e % 10] == 1))
                                                                n = false;
                                                        }
                                                        if (!n) {
                                                            System.out.print("\tEnter the number shown next to the item you want to steal and use : ");
                                                            e = Integer.parseInt(br.readLine());
                                                        }
                                                    } while (!n);
                                                    if (e / 10 == 2) {
                                                        if (this.b[e % 10] == 2) {
                                                            if (this.f[k] == 0)
                                                                System.out.println("\nBLANK shell ejected.");
                                                            else
                                                                System.out.println("\nLIVE shell ejected.");
                                                            k++;
                                                        } else if (this.b[e % 10] == 3) {
                                                            f = (int) (Math.random() * this.f.length);
                                                            if (f < k)
                                                                System.out.println("\nHow unfortunate!");
                                                            else {
                                                                if (f == 0)
                                                                    System.out.print("\n1st ");
                                                                else if (f == 1)
                                                                    System.out.print("\n2nd ");
                                                                else if (f == 2)
                                                                    System.out.print("\n3rd ");
                                                                else
                                                                    System.out.print("\n"+ (e + 1) +"th ");
                                                                if (this.f[f] == 0)
                                                                    System.out.println("shell is BLANK.");
                                                                else
                                                                    System.out.println("shell is LIVE.");
                                                            }
                                                        } else if (this.b[e % 10] == 4) {
                                                            if ((a == 1 && this.e[0] == 4) || (a == 2 && this.e[0] == 6) || (a == 3 && this.e[0] == 8))
                                                                System.out.println("\nYou are already full health.");
                                                            else {
                                                                this.e[0]++;
                                                                System.out.println("\nHealth INCREASED from "+ (this.e[0] - 1) + '\u2665' +" to "+ this.e[0] + '\u2665' +".");
                                                            }
                                                            this.a[11]++;
                                                        } else if (this.b[e % 10] == 5) {
                                                            f = (int) (Math.random() * 2.0);
                                                            if (f == 0) {
                                                                this.e[0]--;
                                                                System.out.println("\nHealth DECREASED from "+ (this.e[0] + 1) + '\u2665' +" to "+ this.e[0] + '\u2665' +".");
                                                            } else {
                                                                if ((a == 1 && this.e[0] == 4) || (a == 2 && this.e[0] == 6) || (a == 3 && this.e[0] == 8))
                                                                    System.out.println("\nYou are already full health.");
                                                                if ((a == 1 && this.e[0] == 3) || (a == 2 && this.e[0] == 5) || (a == 3 && this.e[0] == 7)) {
                                                                    this.e[0]++;
                                                                    System.out.println("\nHealth INCREASED from "+ (this.e[0] - 1) + '\u2665' +" to "+ this.e[0] + '\u2665' +".");
                                                                } else {
                                                                    this.e[0] += 2;
                                                                    System.out.println("\nHealth INCREASED from "+ (this.e[0] - 2) + '\u2665' +" to "+ this.e[0] + '\u2665' +".");
                                                                }
                                                            }
                                                        } else if (this.b[e % 10] == 6) {
                                                            z = true;
                                                            System.out.println("\nHand saw ACTIVATED.");
                                                        } else if (this.b[e % 10] == 7) {
                                                            if (this.f[k] == 0)
                                                                this.f[k] = 1;
                                                            else if (this.f[k] == 1)
                                                                this.f[k] = 0;
                                                            System.out.println("\nPolarity of current shell SWAPPED.");
                                                        } else if (this.b[e % 10] == 8) {
                                                            System.out.print("\nEnter the player number whose turn you want to be skipped : ");
                                                            f = Integer.parseInt(br.readLine());
                                                            if (f < 1 || f > 4 || f == 1)
                                                                while (f < 1 || f > 4 || f == 1) {
                                                                    System.out.print("Invalid input! Please enter the number of your opponent whose turn you want to skip : ");
                                                                    f = Integer.parseInt(br.readLine());
                                                                }
                                                            if (f == 2) {
                                                                this.b[0]++;
                                                                System.out.println("Next turn of Player 2 ("+ this.x[1] +") will be SKIPPED.");
                                                            } else if (f == 3) {
                                                                this.c[0]++;
                                                                System.out.println("Next turn of Player 3 ("+ this.x[2] +") will be SKIPPED.");
                                                            } else if (f == 4) {
                                                                this.d[0]++;
                                                                System.out.println("Next turn of Player 4 ("+ this.x[3] +") will be SKIPPED.");
                                                            }
                                                        } else if (this.b[e % 10] == 9) {
                                                            if (this.f[k] == 0)
                                                                System.out.println("\nIt is a BLANK shell.");
                                                            else
                                                                System.out.println("\nIt is a LIVE shell.");
                                                        } else if (this.b[e % 10] == 10) {
                                                            if(y) {
                                                                y = false;
                                                                System.out.println("\nRemote used. Players will get turns in CLOCKWISE manner.");
                                                            } else {
                                                                y = true;
                                                                System.out.println("\nRemote used. Players will get turns in ANTI-CLOCKWISE manner.");
                                                            }
                                                        }
                                                        this.b[e % 10] = 0;
                                                    } else if (e / 10 == 3) {
                                                        if (this.c[e % 10] == 2) {
                                                            if (this.f[k] == 0)
                                                                System.out.println("\nBLANK shell ejected.");
                                                            else
                                                                System.out.println("\nLIVE shell ejected.");
                                                            k++;
                                                        } else if (this.c[e % 10] == 3) {
                                                            f = (int) (Math.random() * this.f.length);
                                                            if (f < k)
                                                                System.out.println("\nHow unfortunate!");
                                                            else {
                                                                if (f == 0)
                                                                    System.out.print("\n1st ");
                                                                else if (f == 1)
                                                                    System.out.print("\n2nd ");
                                                                else if (f == 2)
                                                                    System.out.print("\n3rd ");
                                                                else
                                                                    System.out.print("\n"+ (e + 1) +"th ");
                                                                if (this.f[f] == 0)
                                                                    System.out.println("shell is BLANK.");
                                                                else
                                                                    System.out.println("shell is LIVE.");
                                                            }
                                                        } else if (this.c[e % 10] == 4) {
                                                            if ((a == 1 && this.e[0] == 4) || (a == 2 && this.e[0] == 6) || (a == 3 && this.e[0] == 8))
                                                                System.out.println("\nYou are already full health.");
                                                            else {
                                                                this.e[0]++;
                                                                System.out.println("\nHealth INCREASED from "+ (this.e[0] - 1) + '\u2665' +" to "+ this.e[0] + '\u2665' +".");
                                                            }
                                                            this.a[11]++;
                                                        } else if (this.c[e % 10] == 5) {
                                                            f = (int) (Math.random() * 2.0);
                                                            if (f == 0) {
                                                                this.e[0]--;
                                                                System.out.println("\nHealth DECREASED from "+ (this.e[0] + 1) + '\u2665' +" to "+ this.e[0] + '\u2665' +".");
                                                            } else {
                                                                if ((a == 1 && this.e[0] == 4) || (a == 2 && this.e[0] == 6) || (a == 3 && this.e[0] == 8))
                                                                    System.out.println("\nYou are already full health.");
                                                                if ((a == 1 && this.e[0] == 3) || (a == 2 && this.e[0] == 5) || (a == 3 && this.e[0] == 7)) {
                                                                    this.e[0]++;
                                                                    System.out.println("\nHealth INCREASED from "+ (this.e[0] - 1) + '\u2665' +" to "+ this.e[0] + '\u2665' +".");
                                                                } else {
                                                                    this.e[0] += 2;
                                                                    System.out.println("\nHealth INCREASED from "+ (this.e[0] - 2) + '\u2665' +" to "+ this.e[0] + '\u2665' +".");
                                                                }
                                                            }
                                                        } else if (this.c[e % 10] == 6) {
                                                            z = true;
                                                            System.out.println("\nHand saw ACTIVATED.");
                                                        } else if (this.c[e % 10] == 7) {
                                                            if (this.f[k] == 0)
                                                                this.f[k] = 1;
                                                            else if (this.f[k] == 1)
                                                                this.f[k] = 0;
                                                            System.out.println("\nPolarity of current shell SWAPPED.");
                                                        } else if (this.c[e % 10] == 8) {
                                                            System.out.print("\nEnter the player number whose turn you want to be skipped : ");
                                                            f = Integer.parseInt(br.readLine());
                                                            if (f < 1 || f > 4 || f == 1)
                                                                while (f < 1 || f > 4 || f == 1) {
                                                                    System.out.print("Invalid input! Please enter the number of your opponent whose turn you want to skip : ");
                                                                    f = Integer.parseInt(br.readLine());
                                                                }
                                                            if (f == 2) {
                                                                this.b[0]++;
                                                                System.out.println("Next turn of Player 2 ("+ this.x[1] +") will be SKIPPED.");
                                                            } else if (f == 3) {
                                                                this.c[0]++;
                                                                System.out.println("Next turn of Player 3 ("+ this.x[2] +") will be SKIPPED.");
                                                            } else if (f == 4) {
                                                                this.d[0]++;
                                                                System.out.println("Next turn of Player 4 ("+ this.x[3] +") will be SKIPPED.");
                                                            }
                                                        } else if (this.c[e % 10] == 9) {
                                                            if (this.f[k] == 0)
                                                                System.out.println("\nIt is a BLANK shell.");
                                                            else
                                                                System.out.println("\nIt is a LIVE shell.");
                                                        } else if (this.c[e % 10] == 10) {
                                                            if(y) {
                                                                y = false;
                                                                System.out.println("\nRemote used. Players will get turns in CLOCKWISE manner.");
                                                            } else {
                                                                y = true;
                                                                System.out.println("\nRemote used. Players will get turns in ANTI-CLOCKWISE manner.");
                                                            }
                                                        }
                                                        this.c[e % 10] = 0;
                                                    } else if (e / 10 == 4) {
                                                        if (this.d[e % 10] == 2) {
                                                            if (this.f[k] == 0)
                                                                System.out.println("\nBLANK shell ejected.");
                                                            else
                                                                System.out.println("\nLIVE shell ejected.");
                                                            k++;
                                                        } else if (this.d[e % 10] == 3) {
                                                            f = (int) (Math.random() * this.f.length);
                                                            if (f < k)
                                                                System.out.println("\nHow unfortunate!");
                                                            else {
                                                                if (f == 0)
                                                                    System.out.print("\n1st ");
                                                                else if (f == 1)
                                                                    System.out.print("\n2nd ");
                                                                else if (f == 2)
                                                                    System.out.print("\n3rd ");
                                                                else
                                                                    System.out.print("\n"+ (e + 1) +"th ");
                                                                if (this.f[f] == 0)
                                                                    System.out.println("shell is BLANK.");
                                                                else
                                                                    System.out.println("shell is LIVE.");
                                                            }
                                                        } else if (this.d[e % 10] == 4) {
                                                            if ((a == 1 && this.e[0] == 4) || (a == 2 && this.e[0] == 6) || (a == 3 && this.e[0] == 8))
                                                                System.out.println("\nYou are already full health.");
                                                            else {
                                                                this.e[0]++;
                                                                System.out.println("\nHealth INCREASED from "+ (this.e[0] - 1) + '\u2665' +" to "+ this.e[0] + '\u2665' +".");
                                                            }
                                                            this.a[11]++;
                                                        } else if (this.d[e % 10] == 5) {
                                                            f = (int) (Math.random() * 2.0);
                                                            if (f == 0) {
                                                                this.e[0]--;
                                                                System.out.println("\nHealth DECREASED from "+ (this.e[0] + 1) + '\u2665' +" to "+ this.e[0] + '\u2665' +".");
                                                            } else {
                                                                if ((a == 1 && this.e[0] == 4) || (a == 2 && this.e[0] == 6) || (a == 3 && this.e[0] == 8))
                                                                    System.out.println("\nYou are already full health.");
                                                                if ((a == 1 && this.e[0] == 3) || (a == 2 && this.e[0] == 5) || (a == 3 && this.e[0] == 7)) {
                                                                    this.e[0]++;
                                                                    System.out.println("\nHealth INCREASED from "+ (this.e[0] - 1) + '\u2665' +" to "+ this.e[0] + '\u2665' +".");
                                                                } else {
                                                                    this.e[0] += 2;
                                                                    System.out.println("\nHealth INCREASED from "+ (this.e[0] - 2) + '\u2665' +" to "+ this.e[0] + '\u2665' +".");
                                                                }
                                                            }
                                                        } else if (this.d[e % 10] == 6) {
                                                            z = true;
                                                            System.out.println("\nHand saw ACTIVATED.");
                                                        } else if (this.d[e % 10] == 7) {
                                                            if (this.f[k] == 0)
                                                                this.f[k] = 1;
                                                            else if (this.f[k] == 1)
                                                                this.f[k] = 0;
                                                            System.out.println("\nPolarity of current shell SWAPPED.");
                                                        } else if (this.d[e % 10] == 8) {
                                                            System.out.print("\nEnter the player number whose turn you want to be skipped : ");
                                                            f = Integer.parseInt(br.readLine());
                                                            if (f < 1 || f > 4 || f == 1)
                                                                while (f < 1 || f > 4 || f == 1) {
                                                                    System.out.print("Invalid input! Please enter the number of your opponent whose turn you want to skip : ");
                                                                    f = Integer.parseInt(br.readLine());
                                                                }
                                                            if (f == 2) {
                                                                this.b[0]++;
                                                                System.out.println("Next turn of Player 2 ("+ this.x[1] +") will be SKIPPED.");
                                                            } else if (f == 3) {
                                                                this.c[0]++;
                                                                System.out.println("Next turn of Player 3 ("+ this.x[2] +") will be SKIPPED.");
                                                            } else if (f == 4) {
                                                                this.d[0]++;
                                                                System.out.println("Next turn of Player 4 ("+ this.x[3] +") will be SKIPPED.");
                                                            }
                                                        } else if (this.d[e % 10] == 9) {
                                                            if (this.f[k] == 0)
                                                                System.out.println("\nIt is a BLANK shell.");
                                                            else
                                                                System.out.println("\nIt is a LIVE shell.");
                                                        } else if (this.d[e % 10] == 10) {
                                                            if(y) {
                                                                y = false;
                                                                System.out.println("\nRemote used. Players will get turns in CLOCKWISE manner.");
                                                            } else {
                                                                y = true;
                                                                System.out.println("\nRemote used. Players will get turns in ANTI-CLOCKWISE manner.");
                                                            }
                                                        }
                                                        this.d[e % 10] = 0;
                                                    }
                                                } else if (this.a[d] == 2) {
                                                    if (this.f[k] == 0)
                                                        System.out.println("\nBLANK shell ejected.");
                                                    else
                                                        System.out.println("\nLIVE shell ejected.");
                                                    k++;
                                                } else if (this.a[d] == 3) {
                                                    e = (int) (Math.random() * this.f.length);
                                                    if (e < k)
                                                        System.out.println("\nHow unfortunate!");
                                                    else {
                                                        if (e == 0)
                                                            System.out.print("\n1st ");
                                                        else if (e == 1)
                                                            System.out.print("\n2nd ");
                                                        else if (e == 2)
                                                            System.out.print("\n3rd ");
                                                        else
                                                            System.out.print("\n"+ (e + 1) +"th ");
                                                        if (this.f[e] == 0)
                                                            System.out.println("shell is BLANK.");
                                                        else
                                                            System.out.println("shell is LIVE.");
                                                    }
                                                } else if (this.a[d] == 4) {
                                                    if ((a == 1 && this.e[0] == 4) || (a == 2 && this.e[0] == 6) || (a == 3 && this.e[0] == 8))
                                                        System.out.println("\nYou are already full health.");
                                                    else {
                                                        this.e[0]++;
                                                        System.out.println("\nHealth INCREASED from "+ (this.e[0] - 1) + '\u2665' +" to "+ this.e[0] + '\u2665' +".");
                                                    }
                                                    this.a[11]++;
                                                } else if (this.a[d] == 5) {
                                                    e = (int) (Math.random() * 2.0);
                                                    if (e == 0) {
                                                        this.e[0]--;
                                                        System.out.println("\nHealth DECREASED from "+ (this.e[0] + 1) + '\u2665' +" to "+ this.e[0] + '\u2665' +".");
                                                    } else {
                                                        if ((a == 1 && this.e[0] == 4) || (a == 2 && this.e[0] == 6) || (a == 3 && this.e[0] == 8))
                                                            System.out.println("\nYou are already full health.");
                                                        if ((a == 1 && this.e[0] == 3) || (a == 2 && this.e[0] == 5) || (a == 3 && this.e[0] == 7)) {
                                                            this.e[0]++;
                                                            System.out.println("\nHealth INCREASED from "+ (this.e[0] - 1) + '\u2665' +" to "+ this.e[0] + '\u2665' +".");
                                                        } else {
                                                            this.e[0] += 2;
                                                            System.out.println("\nHealth INCREASED from "+ (this.e[0] - 2) + '\u2665' +" to "+ this.e[0] + '\u2665' +".");
                                                        }
                                                    }
                                                } else if (this.a[d] == 6) {
                                                    z = true;
                                                    System.out.println("\nHand saw ACTIVATED.");
                                                } else if (this.a[d] == 7) {
                                                    if (this.f[k] == 0)
                                                        this.f[k] = 1;
                                                    else if (this.f[k] == 1)
                                                        this.f[k] = 0;
                                                    System.out.println("\nPolarity of current shell SWAPPED.");
                                                } else if (this.a[d] == 8) {
                                                    System.out.print("\nEnter the player number whose turn you want to be skipped : ");
                                                    e = Integer.parseInt(br.readLine());
                                                    if (e < 1 || e > 4 || e == 1)
                                                        while (e < 1 || e > 4 || e == 1) {
                                                            System.out.print("Invalid input! Please enter the number of your opponent whose turn you want to skip : ");
                                                            e = Integer.parseInt(br.readLine());
                                                        }
                                                    if (e == 2) {
                                                        this.b[0]++;
                                                        System.out.println("Next turn of Player 2 ("+ this.x[1] +") will be SKIPPED.");
                                                    } else if (e == 3) {
                                                        this.c[0]++;
                                                        System.out.println("Next turn of Player 3 ("+ this.x[2] +") will be SKIPPED.");
                                                    } else if (e == 4) {
                                                        this.d[0]++;
                                                        System.out.println("Next turn of Player 4 ("+ this.x[3] +")will be SKIPPED.");
                                                    }
                                                } else if (this.a[d] == 9) {
                                                    if (this.f[k] == 0)
                                                        System.out.println("\nIt is a BLANK shell.");
                                                    else
                                                        System.out.println("\nIt is a LIVE shell.");
                                                } else if (this.a[d] == 10) {
                                                    if(y) {
                                                        y = false;
                                                        System.out.println("\nRemote used. Players will get turns in CLOCKWISE manner.");
                                                    } else {
                                                        y = true;
                                                        System.out.println("\nRemote used. Players will get turns in ANTI-CLOCKWISE manner.");
                                                    }
                                                }
                                                this.a[d] = 0;
                                            }
                                        }
                                    }
                                    if (d != 100) {
                                        this.a[13]++;
                                        Thread.sleep(4000);
                                    } else
                                        d = 0;
                                    System.out.print('\u000C');
                                } while (c != 1);
                            } else {
                                this.a[0]--;
                                dis.fourPlayers(this.a, this.b, this.c, this.d, x % 4, this.x, this.e);
                                System.out.println("\nTurn for "+ this.x[0] +" (Player 1) : ");
                                System.out.println("\tTurn SKIPPED.");
                                Thread.sleep(2500);
                            }
                        } else if (x % 4 == 1 && this.e[1] != 0) {
                            if (this.b[0] == 0) {
                                do {
                                    dis.fourPlayers(this.a, this.b, this.c, this.d, x % 4, this.x, this.e);
                                    System.out.println("\nTurn for "+ this.x[1] +" (Player 2) : ");
                                    System.out.println("\nChoose any one :");
                                    System.out.println("    1 - Shot a player");
                                    System.out.println("    2 - Use resources");
                                    System.out.print("\tEnter your choice : ");
                                    c = Integer.parseInt(br.readLine());
                                    if (c < 1 || c > 2)
                                        while (c < 1 || c > 2) {
                                            System.out.print("\tInvalid input! Please enter the number shown next to your choice : ");
                                            c = Integer.parseInt(br.readLine());
                                        }
                                    if (c == 1) {
                                        System.out.println("\nChoose the player you want to shoot : ");
                                        System.out.println("    1 - "+ this.x[0] +" (Player 1)");
                                        System.out.println("    2 - Yourself (Player 2)");
                                        System.out.println("    3 - "+ this.x[2] +" (Player 3)");
                                        System.out.println("    4 - "+ this.x[3] +" (Player 4)");
                                        System.out.print("\tEnter your choice : ");
                                        e = Integer.parseInt(br.readLine());
                                        if (e < 1 || e > 4)
                                            while (e < 1 || e > 4) {
                                                System.out.println("\tInvalid input! Please enter the number shown next to the name of the player you want to shoot : ");
                                                e = Integer.parseInt(br.readLine());
                                            }
                                        if (e == 2) {
                                            if (this.f[k] == 0) {
                                                System.out.println("\nIt was a BLANK shell.");
                                                System.out.println(this.x[1] +" (Player 2) gets another turn.");
                                                m = false;
                                            } else if (this.f[k] == 1) {
                                                System.out.println("\nIt was a LIVE shell.");
                                                System.out.print("Health DECREASED from "+ this.e[1] + '\u2665' +" to ");
                                                if (z)
                                                    this.e[1] -= 2;
                                                else
                                                    this.e[1]--;
                                                System.out.println(""+ this.e[1] + '\u2665' +".");
                                                this.b[12]++;
                                            }
                                        } else {
                                            if (this.f[k] == 0) {
                                                System.out.println("\nIt was a BLANK shell.");
                                                this.b[12]++;
                                            } else {
                                                System.out.println("\nIt was a LIVE shell.");
                                                if (z)
                                                    this.b[9] += 2;
                                                else
                                                    this.b[9]++;
                                                if (e == 1) {
                                                    System.out.print("Health of "+ this.x[0] +" (Player 1) DECREASED from "+ this.e[0] + '\u2665' +" to ");
                                                    if (z) {
                                                        this.e[0] -= 2;
                                                        this.a[10] += 2;
                                                    } else {
                                                        this.e[0]--;
                                                        this.a[10]++;
                                                    }
                                                    System.out.println(""+ this.e[0] + '\u2665' +".");
                                                } else if (e == 3) {
                                                    System.out.print("Health of "+ this.x[2] +" (Player 3) DECREASED from "+ this.e[2] + '\u2665' +" to ");
                                                    if (z) {
                                                        this.e[2] -= 2;
                                                        this.c[10] += 2;
                                                    } else {
                                                        this.e[2]--;
                                                        this.c[10]++;
                                                    }
                                                    System.out.println(""+ this.e[2] + '\u2665' +".");
                                                } else if (e == 4) {
                                                    System.out.print("Health of "+ this.x[3] +" (Player 4) DECREASED from "+ this.e[3] + '\u2665' +" to ");
                                                    if (z) {
                                                        this.e[3] -= 2;
                                                        this.d[10] += 2;
                                                    } else {
                                                        this.e[3]--;
                                                        this.d[10]++;
                                                    }
                                                    System.out.println(""+ this.e[3] + '\u2665' +".");
                                                }
                                            }
                                        }
                                        k++;
                                    } else if (c == 2) {
                                        e = 0;
                                        for (d = 1; d < 9; d++)
                                            if (this.b[d] == 0)
                                                e++;
                                        if (e == 8)
                                            System.out.print("\tOops! No items present to use.");
                                        else {
                                            System.out.println("\nEnter the number shown next to the item you want to use :");
                                            for (d = 1; d < 9; d++)
                                                if (this.b[d] != 0) {
                                                    System.out.print("    "+ d +" - ");
                                                    if (this.b[d] == 1)
                                                        System.out.println("Adrenaline");
                                                    else if (this.b[d] == 2)
                                                        System.out.println("Beer");
                                                    else if (this.b[d] == 3)
                                                        System.out.println("Burner Phone");
                                                    else if (this.b[d] == 4)
                                                        System.out.println("Cigarette Pack");
                                                    else if (this.b[d] == 5)
                                                        System.out.println("Expired Medicine");
                                                    else if (this.b[d] == 6)
                                                        System.out.println("Hand Saw");
                                                    else if (this.b[d] == 7)
                                                        System.out.println("Inverter");
                                                    else if (this.b[d] == 8)
                                                        System.out.println("Jammer");
                                                    else if (this.b[d] == 9)
                                                        System.out.println("Magnifying Glass");
                                                    else if (this.b[d] == 10)
                                                        System.out.println("Remote");
                                                }
                                            System.out.println("  100 - Go back");
                                            System.out.print("\tEnter your choice : ");
                                            d = Integer.parseInt(br.readLine());
                                            if (d != 100 && (d < 1 || d > 8 || this.b[d] == 0))
                                                while (d != 100 && (d < 1 || d > 8 || this.b[d] == 0)) {
                                                    System.out.print("\tInvalid input! Please enter the number shown next to the item you desire to use : ");
                                                    d = Integer.parseInt(br.readLine());
                                                }
                                            if (d != 100) {
                                                if (this.b[d] == 1) {
                                                    System.out.println("\nSelect the item you want to steal and use :");
                                                    for (e = 1; e < 9; e++)
                                                        if (this.a[e] != 0 && this.a[e] != 1) {
                                                            System.out.print("   1"+ e +" - ");
                                                            if (this.a[e] == 2)
                                                                System.out.println("Beer             (from Player 1)");
                                                            else if (this.a[e] == 3)
                                                                System.out.println("Burner Phone     (from Player 1)");
                                                            else if (this.a[e] == 4)
                                                                System.out.println("Cigarette Pack   (from Player 1)");
                                                            else if (this.a[e] == 5)
                                                                System.out.println("Expired Medicine (from Player 1)");
                                                            else if (this.a[e] == 6)
                                                                System.out.println("Hand Saw         (from Player 1)");
                                                            else if (this.a[e] == 7)
                                                                System.out.println("Inverter         (from Player 1)");
                                                            else if (this.a[e] == 8)
                                                                System.out.println("Jammer           (from Player 1)");
                                                            else if (this.a[e] == 9)
                                                                System.out.println("Magnifying Glass (from Player 1)");
                                                            else if (this.a[e] == 10)
                                                                System.out.println("Remote           (from Player 1)");
                                                        }
                                                    for (e = 1; e < 9; e++)
                                                        if (this.c[e] != 0 && this.c[e] != 1) {
                                                            System.out.print("   3"+ e +" - ");
                                                            if (this.c[e] == 2)
                                                                System.out.println("Beer             (from Player 3)");
                                                            else if (this.c[e] == 3)
                                                                System.out.println("Burner Phone     (from Player 3)");
                                                            else if (this.c[e] == 4)
                                                                System.out.println("Cigarette Pack   (from Player 3)");
                                                            else if (this.c[e] == 5)
                                                                System.out.println("Expired Medicine (from Player 3)");
                                                            else if (this.c[e] == 6)
                                                                System.out.println("Hand Saw         (from Player 3)");
                                                            else if (this.c[e] == 7)
                                                                System.out.println("Inverter         (from Player 3)");
                                                            else if (this.c[e] == 8)
                                                                System.out.println("Jammer           (from Player 3)");
                                                            else if (this.c[e] == 9)
                                                                System.out.println("Magnifying Glass (from Player 3)");
                                                            else if (this.c[e] == 10)
                                                                System.out.println("Remote           (from Player 3)");
                                                        }
                                                    for (e = 1; e < 9; e++)
                                                        if (this.d[e] != 0 && this.d[e] != 1) {
                                                            System.out.print("   4"+ e +" - ");
                                                            if (this.d[e] == 2)
                                                                System.out.println("Beer             (from Player 4)");
                                                            else if (this.d[e] == 3)
                                                                System.out.println("Burner Phone     (from Player 4)");
                                                            else if (this.d[e] == 4)
                                                                System.out.println("Cigarette Pack   (from Player 4)");
                                                            else if (this.d[e] == 5)
                                                                System.out.println("Expired Medicine (from Player 4)");
                                                            else if (this.d[e] == 6)
                                                                System.out.println("Hand Saw         (from Player 4)");
                                                            else if (this.d[e] == 7)
                                                                System.out.println("Inverter         (from Player 4)");
                                                            else if (this.d[e] == 8)
                                                                System.out.println("Jammer           (from Player 4)");
                                                            else if (this.d[e] == 9)
                                                                System.out.println("Magnifying Glass (from Player 4)");
                                                            else if (this.d[e] == 10)
                                                                System.out.println("Remote           (from Player 4)");
                                                        }
                                                    System.out.print("\tEnter your choice : ");
                                                    e = Integer.parseInt(br.readLine());
                                                    do {
                                                        n = true;
                                                        if (Integer.toString(e).length() != 2 || (e / 10 != 1 && e / 10 != 3 && e / 10 != 4))
                                                            n = false;
                                                        else {
                                                            if (e / 10 == 1 && (this.a[e % 10] == 0 || this.a[e % 10] == 1))
                                                                n = false;
                                                            else if (e / 10 == 3 && (this.c[e % 10] == 0 || this.c[e % 10] == 1))
                                                                n = false;
                                                            else if (e / 10 == 4 && (this.d[e % 10] == 0 || this.d[e % 10] == 1))
                                                                n = false;
                                                        }
                                                        if (!n) {
                                                            System.out.print("\tEnter the number shown next to the item you want to steal and use : ");
                                                            e = Integer.parseInt(br.readLine());
                                                        }
                                                    } while (!n);
                                                    if (e / 10 == 1) {
                                                        if (this.a[e % 10] == 2) {
                                                            if (this.f[k] == 0)
                                                                System.out.println("\nBLANK shell ejected.");
                                                            else
                                                                System.out.println("\nLIVE shell ejected.");
                                                            k++;
                                                        } else if (this.a[e % 10] == 3) {
                                                            f = (int) (Math.random() * this.f.length);
                                                            if (f < k)
                                                                System.out.println("\nHow unfortunate!");
                                                            else {
                                                                if (f == 0)
                                                                    System.out.print("\n1st ");
                                                                else if (f == 1)
                                                                    System.out.print("\n2nd ");
                                                                else if (f == 2)
                                                                    System.out.print("\n3rd ");
                                                                else
                                                                    System.out.print("\n"+ (e + 1) +"th ");
                                                                if (this.f[f] == 0)
                                                                    System.out.println("shell is BLANK.");
                                                                else
                                                                    System.out.println("shell is LIVE.");
                                                            }
                                                        } else if (this.a[e % 10] == 4) {
                                                            if ((a == 1 && this.e[1] == 4) || (a == 2 && this.e[1] == 6) || (a == 3 && this.e[1] == 8))
                                                                System.out.println("\nYou are already full health.");
                                                            else {
                                                                this.e[1]++;
                                                                System.out.println("\nHealth INCREASED from "+ (this.e[1] - 1) + '\u2665' +" to "+ this.e[1] + '\u2665' +".");
                                                            }
                                                            this.b[11]++;
                                                        } else if (this.a[e % 10] == 5) {
                                                            f = (int) (Math.random() * 2.0);
                                                            if (f == 0) {
                                                                this.e[1]--;
                                                                System.out.println("\nHealth DECREASED from "+ (this.e[1] + 1) + '\u2665' +" to "+ this.e[1] + '\u2665' +".");
                                                            } else {
                                                                if ((a == 1 && this.e[1] == 4) || (a == 2 && this.e[1] == 6) || (a == 3 && this.e[1] == 8))
                                                                    System.out.println("\nYou are already full health.");
                                                                if ((a == 1 && this.e[1] == 3) || (a == 2 && this.e[1] == 5) || (a == 3 && this.e[1] == 7)) {
                                                                    this.e[1]++;
                                                                    System.out.println("\nHealth INCREASED from "+ (this.e[1] - 1) + '\u2665' +" to "+ this.e[1] + '\u2665' +".");
                                                                } else {
                                                                    this.e[1] += 2;
                                                                    System.out.println("\nHealth INCREASED from "+ (this.e[1] - 2) + '\u2665' +" to "+ this.e[1] + '\u2665' +".");
                                                                }
                                                            }
                                                        } else if (this.a[e % 10] == 6) {
                                                            z = true;
                                                            System.out.println("\nHand saw ACTIVATED.");
                                                        } else if (this.a[e % 10] == 7) {
                                                            if (this.f[k] == 0)
                                                                this.f[k] = 1;
                                                            else if (this.f[k] == 1)
                                                                this.f[k] = 0;
                                                            System.out.println("\nPolarity of current shell SWAPPED.");
                                                        } else if (this.a[e % 10] == 8) {
                                                            System.out.print("\nEnter the player number whose turn you want to be skipped : ");
                                                            f = Integer.parseInt(br.readLine());
                                                            if (f < 1 || f > 4 || f == 2)
                                                                while (f < 1 || f > 4 || f == 2) {
                                                                    System.out.print("Invalid input! Please enter the number of your opponent whose turn you want to skip : ");
                                                                    f = Integer.parseInt(br.readLine());
                                                                }
                                                            if (f == 1) {
                                                                this.a[0]++;
                                                                System.out.println("Next turn of Player 1 ("+ this.x[0] +") will be SKIPPED.");
                                                            } else if (f == 3) {
                                                                this.c[0]++;
                                                                System.out.println("Next turn of Player 3 ("+ this.x[2] +") will be SKIPPED.");
                                                            } else if (f == 4) {
                                                                this.d[0]++;
                                                                System.out.println("Next turn of Player 4 ("+ this.x[3] +") will be SKIPPED.");
                                                            }
                                                        } else if (this.a[e % 10] == 9) {
                                                            if (this.f[k] == 0)
                                                                System.out.println("\nIt is a BLANK shell.");
                                                            else
                                                                System.out.println("\nIt is a LIVE shell.");
                                                        } else if (this.a[e % 10] == 10) {
                                                            if(y) {
                                                                y = false;
                                                                System.out.println("\nRemote used. Players will get turns in CLOCKWISE manner.");
                                                            } else {
                                                                y = true;
                                                                System.out.println("\nRemote used. Players will get turns in ANTI-CLOCKWISE manner.");
                                                            }
                                                        }
                                                        this.a[e % 10] = 0;
                                                    } else if (e / 10 == 3) {
                                                        if (this.c[e % 10] == 2) {
                                                            if (this.f[k] == 0)
                                                                System.out.println("\nBLANK shell ejected.");
                                                            else
                                                                System.out.println("\nLIVE shell ejected.");
                                                            k++;
                                                        } else if (this.c[e % 10] == 3) {
                                                            f = (int) (Math.random() * this.f.length);
                                                            if (f < k)
                                                                System.out.println("\nHow unfortunate!");
                                                            else {
                                                                if (f == 0)
                                                                    System.out.print("\n1st ");
                                                                else if (f == 1)
                                                                    System.out.print("\n2nd ");
                                                                else if (f == 2)
                                                                    System.out.print("\n3rd ");
                                                                else
                                                                    System.out.print("\n"+ (e + 1) +"th ");
                                                                if (this.f[f] == 0)
                                                                    System.out.println("shell is BLANK.");
                                                                else
                                                                    System.out.println("shell is LIVE.");
                                                            }
                                                        } else if (this.c[e % 10] == 4) {
                                                            if ((a == 1 && this.e[1] == 4) || (a == 2 && this.e[1] == 6) || (a == 3 && this.e[1] == 8))
                                                                System.out.println("\nYou are already full health.");
                                                            else {
                                                                this.e[1]++;
                                                                System.out.println("\nHealth INCREASED from "+ (this.e[1] - 1) + '\u2665' +" to "+ this.e[1] + '\u2665' +".");
                                                            }
                                                            this.b[11]++;
                                                        } else if (this.c[e % 10] == 5) {
                                                            f = (int) (Math.random() * 2.0);
                                                            if (f == 0) {
                                                                this.e[1]--;
                                                                System.out.println("\nHealth DECREASED from "+ (this.e[1] + 1) + '\u2665' +" to "+ this.e[1] + '\u2665' +".");
                                                            } else {
                                                                if ((a == 1 && this.e[1] == 4) || (a == 2 && this.e[1] == 6) || (a == 3 && this.e[1] == 8))
                                                                    System.out.println("\nYou are already full health.");
                                                                if ((a == 1 && this.e[1] == 3) || (a == 2 && this.e[1] == 5) || (a == 3 && this.e[1] == 7)) {
                                                                    this.e[1]++;
                                                                    System.out.println("\nHealth INCREASED from "+ (this.e[1] - 1) + '\u2665' +" to "+ this.e[1] + '\u2665' +".");
                                                                } else {
                                                                    this.e[1] += 2;
                                                                    System.out.println("\nHealth INCREASED from "+ (this.e[1] - 2) + '\u2665' +" to "+ this.e[1] + '\u2665' +".");
                                                                }
                                                            }
                                                        } else if (this.c[e % 10] == 6) {
                                                            z = true;
                                                            System.out.println("\nHand saw ACTIVATED.");
                                                        } else if (this.c[e % 10] == 7) {
                                                            if (this.f[k] == 0)
                                                                this.f[k] = 1;
                                                            else if (this.f[k] == 1)
                                                                this.f[k] = 0;
                                                            System.out.println("\nPolarity of current shell SWAPPED.");
                                                        } else if (this.c[e % 10] == 8) {
                                                            System.out.print("\nEnter the player number whose turn you want to be skipped : ");
                                                            f = Integer.parseInt(br.readLine());
                                                            if (f < 1 || f > 4 || f == 2)
                                                                while (f < 1 || f > 4 || f == 2) {
                                                                    System.out.print("Invalid input! Please enter the number of your opponent whose turn you want to skip : ");
                                                                    f = Integer.parseInt(br.readLine());
                                                                }
                                                            if (f == 1) {
                                                                this.a[0]++;
                                                                System.out.println("Next turn of Player 1 ("+ this.x[0] +") will be SKIPPED.");
                                                            } else if (f == 3) {
                                                                this.c[0]++;
                                                                System.out.println("Next turn of Player 3 ("+ this.x[2] +") will be SKIPPED.");
                                                            } else if (f == 4) {
                                                                this.d[0]++;
                                                                System.out.println("Next turn of Player 4 ("+ this.x[3] +") will be SKIPPED.");
                                                            }
                                                        } else if (this.c[e % 10] == 9) {
                                                            if (this.f[k] == 0)
                                                                System.out.println("\nIt is a BLANK shell.");
                                                            else
                                                                System.out.println("\nIt is a LIVE shell.");
                                                        } else if (this.c[e % 10] == 10) {
                                                            if(y) {
                                                                y = false;
                                                                System.out.println("\nRemote used. Players will get turns in CLOCKWISE manner.");
                                                            } else {
                                                                y = true;
                                                                System.out.println("\nRemote used. Players will get turns in ANTI-CLOCKWISE manner.");
                                                            }
                                                        }
                                                        this.c[e % 10] = 0;
                                                    } else if (e / 10 == 4) {
                                                        if (this.d[e % 10] == 2) {
                                                            if (this.f[k] == 0)
                                                                System.out.println("\nBLANK shell ejected.");
                                                            else
                                                                System.out.println("\nLIVE shell ejected.");
                                                            k++;
                                                        } else if (this.d[e % 10] == 3) {
                                                            f = (int) (Math.random() * this.f.length);
                                                            if (f < k)
                                                                System.out.println("\nHow unfortunate!");
                                                            else {
                                                                if (f == 0)
                                                                    System.out.print("\n1st ");
                                                                else if (f == 1)
                                                                    System.out.print("\n2nd ");
                                                                else if (f == 2)
                                                                    System.out.print("\n3rd ");
                                                                else
                                                                    System.out.print("\n"+ (e + 1) +"th ");
                                                                if (this.f[f] == 0)
                                                                    System.out.println("shell is BLANK.");
                                                                else
                                                                    System.out.println("shell is LIVE.");
                                                            }
                                                        } else if (this.d[e % 10] == 4) {
                                                            if ((a == 1 && this.e[1] == 4) || (a == 2 && this.e[1] == 6) || (a == 3 && this.e[1] == 8))
                                                                System.out.println("\nYou are already full health.");
                                                            else {
                                                                this.e[1]++;
                                                                System.out.println("\nHealth INCREASED from "+ (this.e[1] - 1) + '\u2665' +" to "+ this.e[1] + '\u2665' +".");
                                                            }
                                                            this.b[11]++;
                                                        } else if (this.d[e % 10] == 5) {
                                                            f = (int) (Math.random() * 2.0);
                                                            if (f == 0) {
                                                                this.e[1]--;
                                                                System.out.println("\nHealth DECREASED from "+ (this.e[1] + 1) + '\u2665' +" to "+ this.e[1] + '\u2665' +".");
                                                            } else {
                                                                if ((a == 1 && this.e[1] == 4) || (a == 2 && this.e[1] == 6) || (a == 3 && this.e[1] == 8))
                                                                    System.out.println("\nYou are already full health.");
                                                                if ((a == 1 && this.e[1] == 3) || (a == 2 && this.e[1] == 5) || (a == 3 && this.e[1] == 7)) {
                                                                    this.e[1]++;
                                                                    System.out.println("\nHealth INCREASED from "+ (this.e[1] - 1) + '\u2665' +" to "+ this.e[1] + '\u2665' +".");
                                                                } else {
                                                                    this.e[1] += 2;
                                                                    System.out.println("\nHealth INCREASED from "+ (this.e[1] - 2) + '\u2665' +" to "+ this.e[1] + '\u2665' +".");
                                                                }
                                                            }
                                                        } else if (this.d[e % 10] == 6) {
                                                            z = true;
                                                            System.out.println("\nHand saw ACTIVATED.");
                                                        } else if (this.d[e % 10] == 7) {
                                                            if (this.f[k] == 0)
                                                                this.f[k] = 1;
                                                            else if (this.f[k] == 1)
                                                                this.f[k] = 0;
                                                            System.out.println("\nPolarity of current shell SWAPPED.");
                                                        } else if (this.d[e % 10] == 8) {
                                                            System.out.print("\nEnter the player number whose turn you want to be skipped : ");
                                                            f = Integer.parseInt(br.readLine());
                                                            if (f < 1 || f > 4 || f == 2)
                                                                while (f < 1 || f > 4 || f == 2) {
                                                                    System.out.print("Invalid input! Please enter the number of your opponent whose turn you want to skip : ");
                                                                    f = Integer.parseInt(br.readLine());
                                                                }
                                                            if (f == 1) {
                                                                this.a[0]++;
                                                                System.out.println("Next turn of Player 1 ("+ this.x[0] +") will be SKIPPED.");
                                                            } else if (f == 3) {
                                                                this.c[0]++;
                                                                System.out.println("Next turn of Player 3 ("+ this.x[2] +") will be SKIPPED.");
                                                            } else if (f == 4) {
                                                                this.d[0]++;
                                                                System.out.println("Next turn of Player 4 ("+ this.x[3] +") will be SKIPPED.");
                                                            }
                                                        } else if (this.d[e % 10] == 9) {
                                                            if (this.f[k] == 0)
                                                                System.out.println("\nIt is a BLANK shell.");
                                                            else
                                                                System.out.println("\nIt is a LIVE shell.");
                                                        } else if (this.d[e % 10] == 10) {
                                                            if(y) {
                                                                y = false;
                                                                System.out.println("\nRemote used. Players will get turns in CLOCKWISE manner.");
                                                            } else {
                                                                y = true;
                                                                System.out.println("\nRemote used. Players will get turns in ANTI-CLOCKWISE manner.");
                                                            }
                                                        }
                                                        this.d[e % 10] = 0;
                                                    }
                                                } else if (this.b[d] == 2) {
                                                    if (this.f[k] == 0)
                                                        System.out.println("\nBLANK shell ejected.");
                                                    else
                                                        System.out.println("\nLIVE shell ejected.");
                                                    k++;
                                                } else if (this.b[d] == 3) {
                                                    e = (int) (Math.random() * this.f.length);
                                                    if (e < k)
                                                        System.out.println("\nHow unfortunate!");
                                                    else {
                                                        if (e == 0)
                                                            System.out.print("\n1st ");
                                                        else if (e == 1)
                                                            System.out.print("\n2nd ");
                                                        else if (e == 2)
                                                            System.out.print("\n3rd ");
                                                        else
                                                            System.out.print("\n"+ (e + 1) +"th ");
                                                        if (this.f[e] == 0)
                                                            System.out.println("shell is BLANK.");
                                                        else
                                                            System.out.println("shell is LIVE.");
                                                    }
                                                } else if (this.b[d] == 4) {
                                                    if ((a == 1 && this.e[1] == 4) || (a == 2 && this.e[1] == 6) || (a == 3 && this.e[1] == 8))
                                                        System.out.println("\nYou are already full health.");
                                                    else {
                                                        this.e[1]++;
                                                        System.out.println("\nHealth INCREASED from "+ (this.e[1] - 1) + '\u2665' +" to "+ this.e[1] + '\u2665' +".");
                                                    }
                                                    this.b[11]++;
                                                } else if (this.b[d] == 5) {
                                                    e = (int) (Math.random() * 2.0);
                                                    if (e == 0) {
                                                        this.e[1]--;
                                                        System.out.println("\nHealth DECREASED from "+ (this.e[1] + 1) + '\u2665' +" to "+ this.e[1] + '\u2665' +".");
                                                    } else {
                                                        if ((a == 1 && this.e[1] == 4) || (a == 2 && this.e[1] == 6) || (a == 3 && this.e[1] == 8))
                                                            System.out.println("\nYou are already full health.");
                                                        if ((a == 1 && this.e[1] == 3) || (a == 2 && this.e[1] == 5) || (a == 3 && this.e[1] == 7)) {
                                                            this.e[1]++;
                                                            System.out.println("\nHealth INCREASED from "+ (this.e[1] - 1) + '\u2665' +" to "+ this.e[1] + '\u2665' +".");
                                                        } else {
                                                            this.e[1] += 2;
                                                            System.out.println("\nHealth INCREASED from "+ (this.e[1] - 2) + '\u2665' +" to "+ this.e[1] + '\u2665' +".");
                                                        }
                                                    }
                                                } else if (this.b[d] == 6) {
                                                    z = true;
                                                    System.out.println("\nHand saw ACTIVATED.");
                                                } else if (this.b[d] == 7) {
                                                    if (this.f[k] == 0)
                                                        this.f[k] = 1;
                                                    else if (this.f[k] == 1)
                                                        this.f[k] = 0;
                                                    System.out.println("\nPolarity of current shell SWAPPED.");
                                                } else if (this.b[d] == 8) {
                                                    System.out.print("\nEnter the player number whose turn you want to be skipped : ");
                                                    e = Integer.parseInt(br.readLine());
                                                    if (e < 1 || e > 4 || e == 2)
                                                        while (e < 1 || e > 4 || e == 2) {
                                                            System.out.print("Invalid input! Please enter the number of your opponent whose turn you want to skip : ");
                                                            e = Integer.parseInt(br.readLine());
                                                        }
                                                    if (e == 1) {
                                                        this.a[0]++;
                                                        System.out.println("Next turn of Player 1 ("+ this.x[0] +") will be SKIPPED.");
                                                    } else if (e == 3) {
                                                        this.c[0]++;
                                                        System.out.println("Next turn of Player 3 ("+ this.x[2] +") will be SKIPPED.");
                                                    } else if (e == 4) {
                                                        this.d[0]++;
                                                        System.out.println("Next turn of Player 4 ("+ this.x[3] +")will be SKIPPED.");
                                                    }
                                                } else if (this.b[d] == 9) {
                                                    if (this.f[k] == 0)
                                                        System.out.println("\nIt is a BLANK shell.");
                                                    else
                                                        System.out.println("\nIt is a LIVE shell.");
                                                } else if (this.b[d] == 10) {
                                                    if(y) {
                                                        y = false;
                                                        System.out.println("\nRemote used. Players will get turns in CLOCKWISE manner.");
                                                    } else {
                                                        y = true;
                                                        System.out.println("\nRemote used. Players will get turns in ANTI-CLOCKWISE manner.");
                                                    }
                                                }
                                                this.b[d] = 0;
                                            }
                                        }
                                    }
                                    if (d != 100) {
                                        this.b[13]++;
                                        Thread.sleep(4000);
                                    } else
                                        d = 0;
                                    System.out.print('\u000C');
                                } while (c != 1);
                            } else {
                                this.b[0]--;
                                dis.fourPlayers(this.a, this.b, this.c, this.d, x % 4, this.x, this.e);
                                System.out.println("\nTurn for "+ this.x[1] +" (Player 2) : ");
                                System.out.println("\tTurn SKIPPED.");
                                Thread.sleep(2500);
                            }
                        } else if (x % 4 == 2 && this.e[2] != 0) {
                            if (this.c[0] == 0) {
                                do {
                                    dis.fourPlayers(this.a, this.b, this.c, this.d, x % 4, this.x, this.e);
                                    System.out.println("\nTurn for "+ this.x[2] +" (Player 3) : ");
                                    System.out.println("\nChoose any one :");
                                    System.out.println("    1 - Shot a player");
                                    System.out.println("    2 - Use resources");
                                    System.out.print("\tEnter your choice : ");
                                    c = Integer.parseInt(br.readLine());
                                    if (c < 1 || c > 2)
                                        while (c < 1 || c > 2) {
                                            System.out.print("\tInvalid input! Please enter the number shown next to your choice : ");
                                            c = Integer.parseInt(br.readLine());
                                        }
                                    if (c == 1) {
                                        System.out.println("\nChoose the player you want to shoot : ");
                                        System.out.println("    1 - "+ this.x[0] +" (Player 1)");
                                        System.out.println("    2 - "+ this.x[1] +" (Player 2)");
                                        System.out.println("    3 - Yourself (Player 3)");
                                        System.out.println("    4 - "+ this.x[3] +" (Player 4)");
                                        System.out.print("\tEnter your choice : ");
                                        e = Integer.parseInt(br.readLine());
                                        if (e < 1 || e > 4)
                                            while (e < 1 || e > 4) {
                                                System.out.println("\tInvalid input! Please enter the number shown next to the name of the player you want to shoot : ");
                                                e = Integer.parseInt(br.readLine());
                                            }
                                        if (e == 3) {
                                            if (this.f[k] == 0) {
                                                System.out.println("\nIt was a BLANK shell.");
                                                System.out.println(this.x[2] +" (Player 3) gets another turn.");
                                                m = false;
                                            } else if (this.f[k] == 1) {
                                                System.out.println("\nIt was a LIVE shell.");
                                                System.out.print("Health DECREASED from "+ this.e[2] + '\u2665' +" to ");
                                                if (z)
                                                    this.e[2] -= 2;
                                                else
                                                    this.e[2]--;
                                                System.out.println(""+ this.e[2] + '\u2665' +".");
                                                this.c[12]++;
                                            }
                                        } else {
                                            if (this.f[k] == 0) {
                                                System.out.println("\nIt was a BLANK shell.");
                                                this.c[12]++;
                                            } else {
                                                System.out.println("\nIt was a LIVE shell.");
                                                if (z)
                                                    this.c[9] += 2;
                                                else
                                                    this.c[9]++;
                                                if (e == 1) {
                                                    System.out.print("Health of "+ this.x[0] +" (Player 1) DECREASED from "+ this.e[0] + '\u2665' +" to ");
                                                    if (z) {
                                                        this.e[0] -= 2;
                                                        this.a[10] += 2;
                                                    } else {
                                                        this.e[0]--;
                                                        this.a[10]++;
                                                    }
                                                    System.out.println(""+ this.e[0] + '\u2665' +".");
                                                } else if (e == 2) {
                                                    System.out.print("Health of "+ this.x[1] +" (Player 2) DECREASED from "+ this.e[1] + '\u2665' +" to ");
                                                    if (z) {
                                                        this.e[1] -= 2;
                                                        this.b[10] += 2;
                                                    } else {
                                                        this.e[1]--;
                                                        this.b[10]++;
                                                    }
                                                    System.out.println(""+ this.e[1] + '\u2665' +".");
                                                } else if (e == 4) {
                                                    System.out.print("Health of "+ this.x[3] +" (Player 4) DECREASED from "+ this.e[3] + '\u2665' +" to ");
                                                    if (z) {
                                                        this.e[3] -= 2;
                                                        this.d[10] += 2;
                                                    } else {
                                                        this.e[3]--;
                                                        this.d[10]++;
                                                    }
                                                    System.out.println(""+ this.e[3] + '\u2665' +".");
                                                }
                                            }
                                        }
                                        k++;
                                    } else if (c == 2) {
                                        e = 0;
                                        for (d = 1; d < 9; d++)
                                            if (this.c[d] == 0)
                                                e++;
                                        if (e == 8)
                                            System.out.print("\tOops! No items present to use.");
                                        else {
                                            System.out.println("\nEnter the number shown next to the item you want to use :");
                                            for (d = 1; d < 9; d++)
                                                if (this.c[d] != 0) {
                                                    System.out.print("    "+ d +" - ");
                                                    if (this.c[d] == 1)
                                                        System.out.println("Adrenaline");
                                                    else if (this.c[d] == 2)
                                                        System.out.println("Beer");
                                                    else if (this.c[d] == 3)
                                                        System.out.println("Burner Phone");
                                                    else if (this.c[d] == 4)
                                                        System.out.println("Cigarette Pack");
                                                    else if (this.c[d] == 5)
                                                        System.out.println("Expired Medicine");
                                                    else if (this.c[d] == 6)
                                                        System.out.println("Hand Saw");
                                                    else if (this.c[d] == 7)
                                                        System.out.println("Inverter");
                                                    else if (this.c[d] == 8)
                                                        System.out.println("Jammer");
                                                    else if (this.c[d] == 9)
                                                        System.out.println("Magnifying Glass");
                                                    else if (this.c[d] == 10)
                                                        System.out.println("Remote");
                                                }
                                            System.out.println("  100 - Go back");
                                            System.out.print("\tEnter your choice : ");
                                            d = Integer.parseInt(br.readLine());
                                            if (d != 100 && (d < 1 || d > 8 || this.c[d] == 0))
                                                while (d != 100 && (d < 1 || d > 8 || this.c[d] == 0)) {
                                                    System.out.print("\tInvalid input! Please enter the number shown next to the item you desire to use : ");
                                                    d = Integer.parseInt(br.readLine());
                                                }
                                            if (d != 100) {
                                                if (this.c[d] == 1) {
                                                    System.out.println("\nSelect the item you want to steal and use :");
                                                    for (e = 1; e < 9; e++)
                                                        if (this.a[e] != 0 && this.a[e] != 1) {
                                                            System.out.print("   1"+ e +" - ");
                                                            if (this.a[e] == 2)
                                                                System.out.println("Beer             (from Player 1)");
                                                            else if (this.a[e] == 3)
                                                                System.out.println("Burner Phone     (from Player 1)");
                                                            else if (this.a[e] == 4)
                                                                System.out.println("Cigarette Pack   (from Player 1)");
                                                            else if (this.a[e] == 5)
                                                                System.out.println("Expired Medicine (from Player 1)");
                                                            else if (this.a[e] == 6)
                                                                System.out.println("Hand Saw         (from Player 1)");
                                                            else if (this.a[e] == 7)
                                                                System.out.println("Inverter         (from Player 1)");
                                                            else if (this.a[e] == 8)
                                                                System.out.println("Jammer           (from Player 1)");
                                                            else if (this.a[e] == 9)
                                                                System.out.println("Magnifying Glass (from Player 1)");
                                                            else if (this.a[e] == 10)
                                                                System.out.println("Remote           (from Player 1)");
                                                        }
                                                    for (e = 1; e < 9; e++)
                                                        if (this.b[e] != 0 && this.b[e] != 1) {
                                                            System.out.print("   2"+ e +" - ");
                                                            if (this.b[e] == 2)
                                                                System.out.println("Beer             (from Player 2)");
                                                            else if (this.b[e] == 3)
                                                                System.out.println("Burner Phone     (from Player 2)");
                                                            else if (this.b[e] == 4)
                                                                System.out.println("Cigarette Pack   (from Player 2)");
                                                            else if (this.b[e] == 5)
                                                                System.out.println("Expired Medicine (from Player 2)");
                                                            else if (this.b[e] == 6)
                                                                System.out.println("Hand Saw         (from Player 2)");
                                                            else if (this.b[e] == 7)
                                                                System.out.println("Inverter         (from Player 2)");
                                                            else if (this.b[e] == 8)
                                                                System.out.println("Jammer           (from Player 2)");
                                                            else if (this.b[e] == 9)
                                                                System.out.println("Magnifying Glass (from Player 2)");
                                                            else if (this.b[e] == 10)
                                                                System.out.println("Remote           (from Player 2)");
                                                        }
                                                    for (e = 1; e < 9; e++)
                                                        if (this.d[e] != 0 && this.d[e] != 1) {
                                                            System.out.print("   4"+ e +" - ");
                                                            if (this.d[e] == 2)
                                                                System.out.println("Beer             (from Player 4)");
                                                            else if (this.d[e] == 3)
                                                                System.out.println("Burner Phone     (from Player 4)");
                                                            else if (this.d[e] == 4)
                                                                System.out.println("Cigarette Pack   (from Player 4)");
                                                            else if (this.d[e] == 5)
                                                                System.out.println("Expired Medicine (from Player 4)");
                                                            else if (this.d[e] == 6)
                                                                System.out.println("Hand Saw         (from Player 4)");
                                                            else if (this.d[e] == 7)
                                                                System.out.println("Inverter         (from Player 4)");
                                                            else if (this.d[e] == 8)
                                                                System.out.println("Jammer           (from Player 4)");
                                                            else if (this.d[e] == 9)
                                                                System.out.println("Magnifying Glass (from Player 4)");
                                                            else if (this.d[e] == 10)
                                                                System.out.println("Remote           (from Player 4)");
                                                        }
                                                    System.out.print("\tEnter your choice : ");
                                                    e = Integer.parseInt(br.readLine());
                                                    do {
                                                        n = true;
                                                        if (Integer.toString(e).length() != 2 || (e / 10 != 1 && e / 10 != 2 && e / 10 != 4))
                                                            n = false;
                                                        else {
                                                            if (e / 10 == 1 && (this.a[e % 10] == 0 || this.a[e % 10] == 1))
                                                                n = false;
                                                            else if (e / 10 == 2 && (this.b[e % 10] == 0 || this.b[e % 10] == 1))
                                                                n = false;
                                                            else if (e / 10 == 4 && (this.d[e % 10] == 0 || this.d[e % 10] == 1))
                                                                n = false;
                                                        }
                                                        if (!n) {
                                                            System.out.print("\tEnter the number shown next to the item you want to steal and use : ");
                                                            e = Integer.parseInt(br.readLine());
                                                        }
                                                    } while (!n);
                                                    if (e / 10 == 1) {
                                                        if (this.a[e % 10] == 2) {
                                                            if (this.f[k] == 0)
                                                                System.out.println("\nBLANK shell ejected.");
                                                            else
                                                                System.out.println("\nLIVE shell ejected.");
                                                            k++;
                                                        } else if (this.a[e % 10] == 3) {
                                                            f = (int) (Math.random() * this.f.length);
                                                            if (f < k)
                                                                System.out.println("\nHow unfortunate!");
                                                            else {
                                                                if (f == 0)
                                                                    System.out.print("\n1st ");
                                                                else if (f == 1)
                                                                    System.out.print("\n2nd ");
                                                                else if (f == 2)
                                                                    System.out.print("\n3rd ");
                                                                else
                                                                    System.out.print("\n"+ (e + 1) +"th ");
                                                                if (this.f[f] == 0)
                                                                    System.out.println("shell is BLANK.");
                                                                else
                                                                    System.out.println("shell is LIVE.");
                                                            }
                                                        } else if (this.a[e % 10] == 4) {
                                                            if ((a == 1 && this.e[2] == 4) || (a == 2 && this.e[2] == 6) || (a == 3 && this.e[2] == 8))
                                                                System.out.println("\nYou are already full health.");
                                                            else {
                                                                this.e[2]++;
                                                                System.out.println("\nHealth INCREASED from "+ (this.e[2] - 1) + '\u2665' +" to "+ this.e[2] + '\u2665' +".");
                                                            }
                                                            this.c[11]++;
                                                        } else if (this.a[e % 10] == 5) {
                                                            f = (int) (Math.random() * 2.0);
                                                            if (f == 0) {
                                                                this.e[2]--;
                                                                System.out.println("\nHealth DECREASED from "+ (this.e[2] + 1) + '\u2665' +" to "+ this.e[2] + '\u2665' +".");
                                                            } else {
                                                                if ((a == 1 && this.e[2] == 4) || (a == 2 && this.e[2] == 6) || (a == 3 && this.e[2] == 8))
                                                                    System.out.println("\nYou are already full health.");
                                                                if ((a == 1 && this.e[2] == 3) || (a == 2 && this.e[2] == 5) || (a == 3 && this.e[2] == 7)) {
                                                                    this.e[2]++;
                                                                    System.out.println("\nHealth INCREASED from "+ (this.e[2] - 1) + '\u2665' +" to "+ this.e[2] + '\u2665' +".");
                                                                } else {
                                                                    this.e[2] += 2;
                                                                    System.out.println("\nHealth INCREASED from "+ (this.e[2] - 2) + '\u2665' +" to "+ this.e[2] + '\u2665' +".");
                                                                }
                                                            }
                                                        } else if (this.a[e % 10] == 6) {
                                                            z = true;
                                                            System.out.println("\nHand saw ACTIVATED.");
                                                        } else if (this.a[e % 10] == 7) {
                                                            if (this.f[k] == 0)
                                                                this.f[k] = 1;
                                                            else if (this.f[k] == 1)
                                                                this.f[k] = 0;
                                                            System.out.println("\nPolarity of current shell SWAPPED.");
                                                        } else if (this.a[e % 10] == 8) {
                                                            System.out.print("\nEnter the player number whose turn you want to be skipped : ");
                                                            f = Integer.parseInt(br.readLine());
                                                            if (f < 1 || f > 4 || f == 3)
                                                                while (f < 1 || f > 4 || f == 3) {
                                                                    System.out.print("Invalid input! Please enter the number of your opponent whose turn you want to skip : ");
                                                                    f = Integer.parseInt(br.readLine());
                                                                }
                                                            if (f == 1) {
                                                                this.a[0]++;
                                                                System.out.println("Next turn of Player 1 ("+ this.x[0] +") will be SKIPPED.");
                                                            } else if (f == 2) {
                                                                this.b[0]++;
                                                                System.out.println("Next turn of Player 2 ("+ this.x[1] +") will be SKIPPED.");
                                                            } else if (f == 4) {
                                                                this.d[0]++;
                                                                System.out.println("Next turn of Player 4 ("+ this.x[3] +") will be SKIPPED.");
                                                            }
                                                        } else if (this.a[e % 10] == 9) {
                                                            if (this.f[k] == 0)
                                                                System.out.println("\nIt is a BLANK shell.");
                                                            else
                                                                System.out.println("\nIt is a LIVE shell.");
                                                        } else if (this.a[e % 10] == 10) {
                                                            if(y) {
                                                                y = false;
                                                                System.out.println("\nRemote used. Players will get turns in CLOCKWISE manner.");
                                                            } else {
                                                                y = true;
                                                                System.out.println("\nRemote used. Players will get turns in ANTI-CLOCKWISE manner.");
                                                            }
                                                        }
                                                        this.a[e % 10] = 0;
                                                    } else if (e / 10 == 2) {
                                                        if (this.b[e % 10] == 2) {
                                                            if (this.f[k] == 0)
                                                                System.out.println("\nBLANK shell ejected.");
                                                            else
                                                                System.out.println("\nLIVE shell ejected.");
                                                            k++;
                                                        } else if (this.b[e % 10] == 3) {
                                                            f = (int) (Math.random() * this.f.length);
                                                            if (f < k)
                                                                System.out.println("\nHow unfortunate!");
                                                            else {
                                                                if (f == 0)
                                                                    System.out.print("\n1st ");
                                                                else if (f == 1)
                                                                    System.out.print("\n2nd ");
                                                                else if (f == 2)
                                                                    System.out.print("\n3rd ");
                                                                else
                                                                    System.out.print("\n"+ (e + 1) +"th ");
                                                                if (this.f[f] == 0)
                                                                    System.out.println("shell is BLANK.");
                                                                else
                                                                    System.out.println("shell is LIVE.");
                                                            }
                                                        } else if (this.b[e % 10] == 4) {
                                                            if ((a == 1 && this.e[2] == 4) || (a == 2 && this.e[2] == 6) || (a == 3 && this.e[2] == 8))
                                                                System.out.println("\nYou are already full health.");
                                                            else {
                                                                this.e[2]++;
                                                                System.out.println("\nHealth INCREASED from "+ (this.e[2] - 1) + '\u2665' +" to "+ this.e[2] + '\u2665' +".");
                                                            }
                                                            this.c[11]++;
                                                        } else if (this.b[e % 10] == 5) {
                                                            f = (int) (Math.random() * 2.0);
                                                            if (f == 0) {
                                                                this.e[2]--;
                                                                System.out.println("\nHealth DECREASED from "+ (this.e[2] + 1) + '\u2665' +" to "+ this.e[2] + '\u2665' +".");
                                                            } else {
                                                                if ((a == 1 && this.e[1] == 4) || (a == 2 && this.e[1] == 6) || (a == 3 && this.e[1] == 8))
                                                                    System.out.println("\nYou are already full health.");
                                                                if ((a == 1 && this.e[1] == 3) || (a == 2 && this.e[1] == 5) || (a == 3 && this.e[1] == 7)) {
                                                                    this.e[2]++;
                                                                    System.out.println("\nHealth INCREASED from "+ (this.e[2] - 1) + '\u2665' +" to "+ this.e[2] + '\u2665' +".");
                                                                } else {
                                                                    this.e[2] += 2;
                                                                    System.out.println("\nHealth INCREASED from "+ (this.e[2] - 2) + '\u2665' +" to "+ this.e[2] + '\u2665' +".");
                                                                }
                                                            }
                                                        } else if (this.b[e % 10] == 6) {
                                                            z = true;
                                                            System.out.println("\nHand saw ACTIVATED.");
                                                        } else if (this.b[e % 10] == 7) {
                                                            if (this.f[k] == 0)
                                                                this.f[k] = 1;
                                                            else if (this.f[k] == 1)
                                                                this.f[k] = 0;
                                                            System.out.println("\nPolarity of current shell SWAPPED.");
                                                        } else if (this.b[e % 10] == 8) {
                                                            System.out.print("\nEnter the player number whose turn you want to be skipped : ");
                                                            f = Integer.parseInt(br.readLine());
                                                            if (f < 1 || f > 4 || f == 3)
                                                                while (f < 1 || f > 4 || f == 3) {
                                                                    System.out.print("Invalid input! Please enter the number of your opponent whose turn you want to skip : ");
                                                                    f = Integer.parseInt(br.readLine());
                                                                }
                                                            if (f == 1) {
                                                                this.a[0]++;
                                                                System.out.println("Next turn of Player 1 ("+ this.x[0] +") will be SKIPPED.");
                                                            } else if (f == 2) {
                                                                this.b[0]++;
                                                                System.out.println("Next turn of Player 2 ("+ this.x[1] +") will be SKIPPED.");
                                                            } else if (f == 4) {
                                                                this.d[0]++;
                                                                System.out.println("Next turn of Player 4 ("+ this.x[3] +") will be SKIPPED.");
                                                            }
                                                        } else if (this.b[e % 10] == 9) {
                                                            if (this.f[k] == 0)
                                                                System.out.println("\nIt is a BLANK shell.");
                                                            else
                                                                System.out.println("\nIt is a LIVE shell.");
                                                        } else if (this.b[e % 10] == 10) {
                                                            if(y) {
                                                                y = false;
                                                                System.out.println("\nRemote used. Players will get turns in CLOCKWISE manner.");
                                                            } else {
                                                                y = true;
                                                                System.out.println("\nRemote used. Players will get turns in ANTI-CLOCKWISE manner.");
                                                            }
                                                        }
                                                        this.b[e % 10] = 0;
                                                    } else if (e / 10 == 4) {
                                                        if (this.d[e % 10] == 2) {
                                                            if (this.f[k] == 0)
                                                                System.out.println("\nBLANK shell ejected.");
                                                            else
                                                                System.out.println("\nLIVE shell ejected.");
                                                            k++;
                                                        } else if (this.d[e % 10] == 3) {
                                                            f = (int) (Math.random() * this.f.length);
                                                            if (f < k)
                                                                System.out.println("\nHow unfortunate!");
                                                            else {
                                                                if (f == 0)
                                                                    System.out.print("\n1st ");
                                                                else if (f == 1)
                                                                    System.out.print("\n2nd ");
                                                                else if (f == 2)
                                                                    System.out.print("\n3rd ");
                                                                else
                                                                    System.out.print("\n"+ (e + 1) +"th ");
                                                                if (this.f[f] == 0)
                                                                    System.out.println("shell is BLANK.");
                                                                else
                                                                    System.out.println("shell is LIVE.");
                                                            }
                                                        } else if (this.d[e % 10] == 4) {
                                                            if ((a == 1 && this.e[2] == 4) || (a == 2 && this.e[2] == 6) || (a == 3 && this.e[2] == 8))
                                                                System.out.println("\nYou are already full health.");
                                                            else {
                                                                this.e[2]++;
                                                                System.out.println("\nHealth INCREASED from "+ (this.e[2] - 1) + '\u2665' +" to "+ this.e[2] + '\u2665' +".");
                                                            }
                                                            this.c[11]++;
                                                        } else if (this.d[e % 10] == 5) {
                                                            f = (int) (Math.random() * 2.0);
                                                            if (f == 0) {
                                                                this.e[2]--;
                                                                System.out.println("\nHealth DECREASED from "+ (this.e[2] + 1) + '\u2665' +" to "+ this.e[2] + '\u2665' +".");
                                                            } else {
                                                                if ((a == 1 && this.e[2] == 4) || (a == 2 && this.e[2] == 6) || (a == 3 && this.e[2] == 8))
                                                                    System.out.println("\nYou are already full health.");
                                                                if ((a == 1 && this.e[2] == 3) || (a == 2 && this.e[2] == 5) || (a == 3 && this.e[2] == 7)) {
                                                                    this.e[2]++;
                                                                    System.out.println("\nHealth INCREASED from "+ (this.e[2] - 1) + '\u2665' +" to "+ this.e[2] + '\u2665' +".");
                                                                } else {
                                                                    this.e[2] += 2;
                                                                    System.out.println("\nHealth INCREASED from "+ (this.e[2] - 2) + '\u2665' +" to "+ this.e[2] + '\u2665' +".");
                                                                }
                                                            }
                                                        } else if (this.d[e % 10] == 6) {
                                                            z = true;
                                                            System.out.println("\nHand saw ACTIVATED.");
                                                        } else if (this.d[e % 10] == 7) {
                                                            if (this.f[k] == 0)
                                                                this.f[k] = 1;
                                                            else if (this.f[k] == 1)
                                                                this.f[k] = 0;
                                                            System.out.println("\nPolarity of current shell SWAPPED.");
                                                        } else if (this.d[e % 10] == 8) {
                                                            System.out.print("\nEnter the player number whose turn you want to be skipped : ");
                                                            f = Integer.parseInt(br.readLine());
                                                            if (f < 1 || f > 4 || f == 3)
                                                                while (f < 1 || f > 4 || f == 3) {
                                                                    System.out.print("Invalid input! Please enter the number of your opponent whose turn you want to skip : ");
                                                                    f = Integer.parseInt(br.readLine());
                                                                }
                                                            if (f == 1) {
                                                                this.a[0]++;
                                                                System.out.println("Next turn of Player 1 ("+ this.x[0] +") will be SKIPPED.");
                                                            } else if (f == 2) {
                                                                this.b[0]++;
                                                                System.out.println("Next turn of Player 2 ("+ this.x[1] +") will be SKIPPED.");
                                                            } else if (f == 4) {
                                                                this.d[0]++;
                                                                System.out.println("Next turn of Player 4 ("+ this.x[3] +") will be SKIPPED.");
                                                            }
                                                        } else if (this.d[e % 10] == 9) {
                                                            if (this.f[k] == 0)
                                                                System.out.println("\nIt is a BLANK shell.");
                                                            else
                                                                System.out.println("\nIt is a LIVE shell.");
                                                        } else if (this.d[e % 10] == 10) {
                                                            if(y) {
                                                                y = false;
                                                                System.out.println("\nRemote used. Players will get turns in CLOCKWISE manner.");
                                                            } else {
                                                                y = true;
                                                                System.out.println("\nRemote used. Players will get turns in ANTI-CLOCKWISE manner.");
                                                            }
                                                        }
                                                        this.d[e % 10] = 0;
                                                    }
                                                } else if (this.c[d] == 2) {
                                                    if (this.f[k] == 0)
                                                        System.out.println("\nBLANK shell ejected.");
                                                    else
                                                        System.out.println("\nLIVE shell ejected.");
                                                    k++;
                                                } else if (this.c[d] == 3) {
                                                    e = (int) (Math.random() * this.f.length);
                                                    if (e < k)
                                                        System.out.println("\nHow unfortunate!");
                                                    else {
                                                        if (e == 0)
                                                            System.out.print("\n1st ");
                                                        else if (e == 1)
                                                            System.out.print("\n2nd ");
                                                        else if (e == 2)
                                                            System.out.print("\n3rd ");
                                                        else
                                                            System.out.print("\n"+ (e + 1) +"th ");
                                                        if (this.f[e] == 0)
                                                            System.out.println("shell is BLANK.");
                                                        else
                                                            System.out.println("shell is LIVE.");
                                                    }
                                                } else if (this.c[d] == 4) {
                                                    if ((a == 1 && this.e[2] == 4) || (a == 2 && this.e[2] == 6) || (a == 3 && this.e[2] == 8))
                                                        System.out.println("\nYou are already full health.");
                                                    else {
                                                        this.e[2]++;
                                                        System.out.println("\nHealth INCREASED from "+ (this.e[2] - 1) + '\u2665' +" to "+ this.e[2] + '\u2665' +".");
                                                    }
                                                    this.c[11]++;
                                                } else if (this.c[d] == 5) {
                                                    e = (int) (Math.random() * 2.0);
                                                    if (e == 0) {
                                                        this.e[2]--;
                                                        System.out.println("\nHealth DECREASED from "+ (this.e[2] + 1) + '\u2665' +" to "+ this.e[2] + '\u2665' +".");
                                                    } else {
                                                        if ((a == 1 && this.e[2] == 4) || (a == 2 && this.e[2] == 6) || (a == 3 && this.e[2] == 8))
                                                            System.out.println("\nYou are already full health.");
                                                        if ((a == 1 && this.e[2] == 3) || (a == 2 && this.e[2] == 5) || (a == 3 && this.e[2] == 7)) {
                                                            this.e[2]++;
                                                            System.out.println("\nHealth INCREASED from "+ (this.e[2] - 1) + '\u2665' +" to "+ this.e[2] + '\u2665' +".");
                                                        } else {
                                                            this.e[2] += 2;
                                                            System.out.println("\nHealth INCREASED from "+ (this.e[2] - 2) + '\u2665' +" to "+ this.e[2] + '\u2665' +".");
                                                        }
                                                    }
                                                } else if (this.c[d] == 6) {
                                                    z = true;
                                                    System.out.println("\nHand saw ACTIVATED.");
                                                } else if (this.c[d] == 7) {
                                                    if (this.f[k] == 0)
                                                        this.f[k] = 1;
                                                    else if (this.f[k] == 1)
                                                        this.f[k] = 0;
                                                    System.out.println("\nPolarity of current shell SWAPPED.");
                                                } else if (this.c[d] == 8) {
                                                    System.out.print("\nEnter the player number whose turn you want to be skipped : ");
                                                    e = Integer.parseInt(br.readLine());
                                                    if (e < 1 || e > 4 || e == 3)
                                                        while (e < 1 || e > 4 || e == 3) {
                                                            System.out.print("Invalid input! Please enter the number of your opponent whose turn you want to skip : ");
                                                            e = Integer.parseInt(br.readLine());
                                                        }
                                                    if (e == 1) {
                                                        this.a[0]++;
                                                        System.out.println("Next turn of Player 1 ("+ this.x[0] +") will be SKIPPED.");
                                                    } else if (e == 2) {
                                                        this.b[0]++;
                                                        System.out.println("Next turn of Player 2 ("+ this.x[1] +") will be SKIPPED.");
                                                    } else if (e == 4) {
                                                        this.d[0]++;
                                                        System.out.println("Next turn of Player 4 ("+ this.x[3] +")will be SKIPPED.");
                                                    }
                                                } else if (this.c[d] == 9) {
                                                    if (this.f[k] == 0)
                                                        System.out.println("\nIt is a BLANK shell.");
                                                    else
                                                        System.out.println("\nIt is a LIVE shell.");
                                                } else if (this.c[d] == 10) {
                                                    if(y) {
                                                        y = false;
                                                        System.out.println("\nRemote used. Players will get turns in CLOCKWISE manner.");
                                                    } else {
                                                        y = true;
                                                        System.out.println("\nRemote used. Players will get turns in ANTI-CLOCKWISE manner.");
                                                    }
                                                }
                                                this.c[d] = 0;
                                            }
                                        }
                                    }
                                    if (d != 100) {
                                        this.c[13]++;
                                        Thread.sleep(4000);
                                    } else
                                        d = 0;
                                    System.out.print('\u000C');
                                } while (c != 1);
                            } else {
                                this.c[0]--;
                                dis.fourPlayers(this.a, this.b, this.c, this.d, x % 4, this.x, this.e);
                                System.out.println("\nTurn for "+ this.x[2] +" (Player 3) : ");
                                System.out.println("\tTurn SKIPPED.");
                                Thread.sleep(2500);
                            }
                        } else if (x % 4 == 3 && this.e[3] != 0) {
                            if (this.d[0] == 0) {
                                do {
                                    dis.fourPlayers(this.a, this.b, this.c, this.d, x % 4, this.x, this.e);
                                    System.out.println("\nTurn for "+ this.x[3] +" (Player 4) : ");
                                    System.out.println("\nChoose any one :");
                                    System.out.println("    1 - Shot a player");
                                    System.out.println("    2 - Use resources");
                                    System.out.print("\tEnter your choice : ");
                                    c = Integer.parseInt(br.readLine());
                                    if (c < 1 || c > 2)
                                        while (c < 1 || c > 2) {
                                            System.out.print("\tInvalid input! Please enter the number shown next to your choice : ");
                                            c = Integer.parseInt(br.readLine());
                                        }
                                    if (c == 1) {
                                        System.out.println("\nChoose the player you want to shoot : ");
                                        System.out.println("    1 - "+ this.x[0] +" (Player 1)");
                                        System.out.println("    2 - "+ this.x[1] +" (Player 2)");
                                        System.out.println("    3 - "+ this.x[2] +" (Player 3)");
                                        System.out.println("    4 - Yourself (Player 4)");
                                        System.out.print("\tEnter your choice : ");
                                        e = Integer.parseInt(br.readLine());
                                        if (e < 1 || e > 4)
                                            while (e < 1 || e > 4) {
                                                System.out.println("\tInvalid input! Please enter the number shown next to the name of the player you want to shoot : ");
                                                e = Integer.parseInt(br.readLine());
                                            }
                                        if (e == 4) {
                                            if (this.f[k] == 0) {
                                                System.out.println("\nIt was a BLANK shell.");
                                                System.out.println(this.x[3] +" (Player 4) gets another turn.");
                                                m = false;
                                            } else if (this.f[k] == 1) {
                                                System.out.println("\nIt was a LIVE shell.");
                                                System.out.print("Health DECREASED from "+ this.e[3] + '\u2665' +" to ");
                                                if (z)
                                                    this.e[3] -= 2;
                                                else
                                                    this.e[3]--;
                                                System.out.println(""+ this.e[3] + '\u2665' +".");
                                                this.d[12]++;
                                            }
                                        } else {
                                            if (this.f[k] == 0) {
                                                System.out.println("\nIt was a BLANK shell.");
                                                this.d[12]++;
                                            } else {
                                                System.out.println("\nIt was a LIVE shell.");
                                                if (z)
                                                    this.d[9] += 2;
                                                else
                                                    this.d[9]++;
                                                if (e == 1) {
                                                    System.out.print("Health of "+ this.x[0] +" (Player 1) DECREASED from "+ this.e[0] + '\u2665' +" to ");
                                                    if (z) {
                                                        this.e[0] -= 2;
                                                        this.a[10] += 2;
                                                    } else {
                                                        this.e[0]--;
                                                        this.a[10]++;
                                                    }
                                                    System.out.println(""+ this.e[0] + '\u2665' +".");
                                                } else if (e == 2) {
                                                    System.out.print("Health of "+ this.x[1] +" (Player 2) DECREASED from "+ this.e[1] + '\u2665' +" to ");
                                                    if (z) {
                                                        this.e[1] -= 2;
                                                        this.b[10] += 2;
                                                    } else {
                                                        this.e[1]--;
                                                        this.b[10]++;
                                                    }
                                                    System.out.println(""+ this.e[1] + '\u2665' +".");
                                                } else if (e == 3) {
                                                    System.out.print("Health of "+ this.x[2] +" (Player 3) DECREASED from "+ this.e[3] + '\u2665' +" to ");
                                                    if (z) {
                                                        this.e[2] -= 2;
                                                        this.c[10] += 2;
                                                    } else {
                                                        this.e[2]--;
                                                        this.c[10]++;
                                                    }
                                                    System.out.println(""+ this.e[2] + '\u2665' +".");
                                                }
                                            }
                                        }
                                        k++;
                                    } else if (c == 2) {
                                        e = 0;
                                        for (d = 1; d < 9; d++)
                                            if (this.d[d] == 0)
                                                e++;
                                        if (e == 8)
                                            System.out.print("\tOops! No items present to use.");
                                        else {
                                            System.out.println("\nEnter the number shown next to the item you want to use :");
                                            for (d = 1; d < 9; d++)
                                                if (this.d[d] != 0) {
                                                    System.out.print("    "+ d +" - ");
                                                    if (this.d[d] == 1)
                                                        System.out.println("Adrenaline");
                                                    else if (this.d[d] == 2)
                                                        System.out.println("Beer");
                                                    else if (this.d[d] == 3)
                                                        System.out.println("Burner Phone");
                                                    else if (this.d[d] == 4)
                                                        System.out.println("Cigarette Pack");
                                                    else if (this.d[d] == 5)
                                                        System.out.println("Expired Medicine");
                                                    else if (this.d[d] == 6)
                                                        System.out.println("Hand Saw");
                                                    else if (this.d[d] == 7)
                                                        System.out.println("Inverter");
                                                    else if (this.d[d] == 8)
                                                        System.out.println("Jammer");
                                                    else if (this.d[d] == 9)
                                                        System.out.println("Magnifying Glass");
                                                    else if (this.d[d] == 10)
                                                        System.out.println("Remote");
                                                }
                                            System.out.println("  100 - Go back");
                                            System.out.print("\tEnter your choice : ");
                                            d = Integer.parseInt(br.readLine());
                                            if (d != 100 && (d < 1 || d > 8 || this.d[d] == 0))
                                                while (d != 100 && (d < 1 || d > 8 || this.d[d] == 0)) {
                                                    System.out.print("\tInvalid input! Please enter the number shown next to the item you desire to use : ");
                                                    d = Integer.parseInt(br.readLine());
                                                }
                                            if (d != 100) {
                                                if (this.d[d] == 1) {
                                                    System.out.println("\nSelect the item you want to steal and use :");
                                                    for (e = 1; e < 9; e++)
                                                        if (this.a[e] != 0 && this.a[e] != 1) {
                                                            System.out.print("   1"+ e +" - ");
                                                            if (this.a[e] == 2)
                                                                System.out.println("Beer             (from Player 1)");
                                                            else if (this.a[e] == 3)
                                                                System.out.println("Burner Phone     (from Player 1)");
                                                            else if (this.a[e] == 4)
                                                                System.out.println("Cigarette Pack   (from Player 1)");
                                                            else if (this.a[e] == 5)
                                                                System.out.println("Expired Medicine (from Player 1)");
                                                            else if (this.a[e] == 6)
                                                                System.out.println("Hand Saw         (from Player 1)");
                                                            else if (this.a[e] == 7)
                                                                System.out.println("Inverter         (from Player 1)");
                                                            else if (this.a[e] == 8)
                                                                System.out.println("Jammer           (from Player 1)");
                                                            else if (this.a[e] == 9)
                                                                System.out.println("Magnifying Glass (from Player 1)");
                                                            else if (this.a[e] == 10)
                                                                System.out.println("Remote           (from Player 1)");
                                                        }
                                                    for (e = 1; e < 9; e++)
                                                        if (this.b[e] != 0 && this.b[e] != 1) {
                                                            System.out.print("   2"+ e +" - ");
                                                            if (this.b[e] == 2)
                                                                System.out.println("Beer             (from Player 2)");
                                                            else if (this.b[e] == 3)
                                                                System.out.println("Burner Phone     (from Player 2)");
                                                            else if (this.b[e] == 4)
                                                                System.out.println("Cigarette Pack   (from Player 2)");
                                                            else if (this.b[e] == 5)
                                                                System.out.println("Expired Medicine (from Player 2)");
                                                            else if (this.b[e] == 6)
                                                                System.out.println("Hand Saw         (from Player 2)");
                                                            else if (this.b[e] == 7)
                                                                System.out.println("Inverter         (from Player 2)");
                                                            else if (this.b[e] == 8)
                                                                System.out.println("Jammer           (from Player 2)");
                                                            else if (this.b[e] == 9)
                                                                System.out.println("Magnifying Glass (from Player 2)");
                                                            else if (this.b[e] == 10)
                                                                System.out.println("Remote           (from Player 2)");
                                                        }
                                                    for (e = 1; e < 9; e++)
                                                        if (this.c[e] != 0 && this.c[e] != 1) {
                                                            System.out.print("   4"+ e +" - ");
                                                            if (this.c[e] == 2)
                                                                System.out.println("Beer             (from Player 3)");
                                                            else if (this.c[e] == 3)
                                                                System.out.println("Burner Phone     (from Player 3)");
                                                            else if (this.c[e] == 4)
                                                                System.out.println("Cigarette Pack   (from Player 3)");
                                                            else if (this.c[e] == 5)
                                                                System.out.println("Expired Medicine (from Player 3)");
                                                            else if (this.c[e] == 6)
                                                                System.out.println("Hand Saw         (from Player 3)");
                                                            else if (this.c[e] == 7)
                                                                System.out.println("Inverter         (from Player 3)");
                                                            else if (this.c[e] == 8)
                                                                System.out.println("Jammer           (from Player 3)");
                                                            else if (this.c[e] == 9)
                                                                System.out.println("Magnifying Glass (from Player 3)");
                                                            else if (this.c[e] == 10)
                                                                System.out.println("Remote           (from Player 3)");
                                                        }
                                                    System.out.print("\tEnter your choice : ");
                                                    e = Integer.parseInt(br.readLine());
                                                    do {
                                                        n = true;
                                                        if (Integer.toString(e).length() != 2 || (e / 10 != 1 && e / 10 != 2 && e / 10 != 3))
                                                            n = false;
                                                        else {
                                                            if (e / 10 == 1 && (this.a[e % 10] == 0 || this.a[e % 10] == 1))
                                                                n = false;
                                                            else if (e / 10 == 2 && (this.b[e % 10] == 0 || this.b[e % 10] == 1))
                                                                n = false;
                                                            else if (e / 10 == 3 && (this.c[e % 10] == 0 || this.c[e % 10] == 1))
                                                                n = false;
                                                        }
                                                        if (!n) {
                                                            System.out.print("\tEnter the number shown next to the item you want to steal and use : ");
                                                            e = Integer.parseInt(br.readLine());
                                                        }
                                                    } while (!n);
                                                    if (e / 10 == 1) {
                                                        if (this.a[e % 10] == 2) {
                                                            if (this.f[k] == 0)
                                                                System.out.println("\nBLANK shell ejected.");
                                                            else
                                                                System.out.println("\nLIVE shell ejected.");
                                                            k++;
                                                        } else if (this.a[e % 10] == 3) {
                                                            f = (int) (Math.random() * this.f.length);
                                                            if (f < k)
                                                                System.out.println("\nHow unfortunate!");
                                                            else {
                                                                if (f == 0)
                                                                    System.out.print("\n1st ");
                                                                else if (f == 1)
                                                                    System.out.print("\n2nd ");
                                                                else if (f == 2)
                                                                    System.out.print("\n3rd ");
                                                                else
                                                                    System.out.print("\n"+ (e + 1) +"th ");
                                                                if (this.f[f] == 0)
                                                                    System.out.println("shell is BLANK.");
                                                                else
                                                                    System.out.println("shell is LIVE.");
                                                            }
                                                        } else if (this.a[e % 10] == 4) {
                                                            if ((a == 1 && this.e[3] == 4) || (a == 2 && this.e[3] == 6) || (a == 3 && this.e[3] == 8))
                                                                System.out.println("\nYou are already full health.");
                                                            else {
                                                                this.e[3]++;
                                                                System.out.println("\nHealth INCREASED from "+ (this.e[3] - 1) + '\u2665' +" to "+ this.e[3] + '\u2665' +".");
                                                            }
                                                            this.d[11]++;
                                                        } else if (this.a[e % 10] == 5) {
                                                            f = (int) (Math.random() * 2.0);
                                                            if (f == 0) {
                                                                this.e[3]--;
                                                                System.out.println("\nHealth DECREASED from "+ (this.e[3] + 1) + '\u2665' +" to "+ this.e[3] + '\u2665' +".");
                                                            } else {
                                                                if ((a == 1 && this.e[3] == 4) || (a == 2 && this.e[3] == 6) || (a == 3 && this.e[3] == 8))
                                                                    System.out.println("\nYou are already full health.");
                                                                if ((a == 1 && this.e[3] == 3) || (a == 2 && this.e[3] == 5) || (a == 3 && this.e[3] == 7)) {
                                                                    this.e[3]++;
                                                                    System.out.println("\nHealth INCREASED from "+ (this.e[3] - 1) + '\u2665' +" to "+ this.e[3] + '\u2665' +".");
                                                                } else {
                                                                    this.e[3] += 2;
                                                                    System.out.println("\nHealth INCREASED from "+ (this.e[3] - 2) + '\u2665' +" to "+ this.e[3] + '\u2665' +".");
                                                                }
                                                            }
                                                        } else if (this.a[e % 10] == 6) {
                                                            z = true;
                                                            System.out.println("\nHand saw ACTIVATED.");
                                                        } else if (this.a[e % 10] == 7) {
                                                            if (this.f[k] == 0)
                                                                this.f[k] = 1;
                                                            else if (this.f[k] == 1)
                                                                this.f[k] = 0;
                                                            System.out.println("\nPolarity of current shell SWAPPED.");
                                                        } else if (this.a[e % 10] == 8) {
                                                            System.out.print("\nEnter the player number whose turn you want to be skipped : ");
                                                            f = Integer.parseInt(br.readLine());
                                                            if (f < 1 || f > 4 || f == 4)
                                                                while (f < 1 || f > 4 || f == 4) {
                                                                    System.out.print("Invalid input! Please enter the number of your opponent whose turn you want to skip : ");
                                                                    f = Integer.parseInt(br.readLine());
                                                                }
                                                            if (f == 1) {
                                                                this.a[0]++;
                                                                System.out.println("Next turn of Player 1 ("+ this.x[0] +") will be SKIPPED.");
                                                            } else if (f == 2) {
                                                                this.b[0]++;
                                                                System.out.println("Next turn of Player 2 ("+ this.x[1] +") will be SKIPPED.");
                                                            } else if (f == 3) {
                                                                this.c[0]++;
                                                                System.out.println("Next turn of Player 3 ("+ this.x[2] +") will be SKIPPED.");
                                                            }
                                                        } else if (this.a[e % 10] == 9) {
                                                            if (this.f[k] == 0)
                                                                System.out.println("\nIt is a BLANK shell.");
                                                            else
                                                                System.out.println("\nIt is a LIVE shell.");
                                                        } else if (this.a[e % 10] == 10) {
                                                            if(y) {
                                                                y = false;
                                                                System.out.println("\nRemote used. Players will get turns in CLOCKWISE manner.");
                                                            } else {
                                                                y = true;
                                                                System.out.println("\nRemote used. Players will get turns in ANTI-CLOCKWISE manner.");
                                                            }
                                                        }
                                                        this.a[e % 10] = 0;
                                                    } else if (e / 10 == 2) {
                                                        if (this.b[e % 10] == 2) {
                                                            if (this.f[k] == 0)
                                                                System.out.println("\nBLANK shell ejected.");
                                                            else
                                                                System.out.println("\nLIVE shell ejected.");
                                                            k++;
                                                        } else if (this.b[e % 10] == 3) {
                                                            f = (int) (Math.random() * this.f.length);
                                                            if (f < k)
                                                                System.out.println("\nHow unfortunate!");
                                                            else {
                                                                if (f == 0)
                                                                    System.out.print("\n1st ");
                                                                else if (f == 1)
                                                                    System.out.print("\n2nd ");
                                                                else if (f == 2)
                                                                    System.out.print("\n3rd ");
                                                                else
                                                                    System.out.print("\n"+ (e + 1) +"th ");
                                                                if (this.f[f] == 0)
                                                                    System.out.println("shell is BLANK.");
                                                                else
                                                                    System.out.println("shell is LIVE.");
                                                            }
                                                        } else if (this.b[e % 10] == 4) {
                                                            if ((a == 1 && this.e[3] == 4) || (a == 2 && this.e[3] == 6) || (a == 3 && this.e[3] == 8))
                                                                System.out.println("\nYou are already full health.");
                                                            else {
                                                                this.e[3]++;
                                                                System.out.println("\nHealth INCREASED from "+ (this.e[3] - 1) + '\u2665' +" to "+ this.e[3] + '\u2665' +".");
                                                            }
                                                            this.d[11]++;
                                                        } else if (this.b[e % 10] == 5) {
                                                            f = (int) (Math.random() * 2.0);
                                                            if (f == 0) {
                                                                this.e[3]--;
                                                                System.out.println("\nHealth DECREASED from "+ (this.e[3] + 1) + '\u2665' +" to "+ this.e[3] + '\u2665' +".");
                                                            } else {
                                                                if ((a == 1 && this.e[3] == 4) || (a == 2 && this.e[3] == 6) || (a == 3 && this.e[3] == 8))
                                                                    System.out.println("\nYou are already full health.");
                                                                if ((a == 1 && this.e[3] == 3) || (a == 2 && this.e[3] == 5) || (a == 3 && this.e[3] == 7)) {
                                                                    this.e[3]++;
                                                                    System.out.println("\nHealth INCREASED from "+ (this.e[3] - 1) + '\u2665' +" to "+ this.e[3] + '\u2665' +".");
                                                                } else {
                                                                    this.e[3] += 2;
                                                                    System.out.println("\nHealth INCREASED from "+ (this.e[3] - 2) + '\u2665' +" to "+ this.e[3] + '\u2665' +".");
                                                                }
                                                            }
                                                        } else if (this.b[e % 10] == 6) {
                                                            z = true;
                                                            System.out.println("\nHand saw ACTIVATED.");
                                                        } else if (this.b[e % 10] == 7) {
                                                            if (this.f[k] == 0)
                                                                this.f[k] = 1;
                                                            else if (this.f[k] == 1)
                                                                this.f[k] = 0;
                                                            System.out.println("\nPolarity of current shell SWAPPED.");
                                                        } else if (this.b[e % 10] == 8) {
                                                            System.out.print("\nEnter the player number whose turn you want to be skipped : ");
                                                            f = Integer.parseInt(br.readLine());
                                                            if (f < 1 || f > 4 || f == 4)
                                                                while (f < 1 || f > 4 || f == 4) {
                                                                    System.out.print("Invalid input! Please enter the number of your opponent whose turn you want to skip : ");
                                                                    f = Integer.parseInt(br.readLine());
                                                                }
                                                            if (f == 1) {
                                                                this.a[0]++;
                                                                System.out.println("Next turn of Player 1 ("+ this.x[0] +") will be SKIPPED.");
                                                            } else if (f == 2) {
                                                                this.b[0]++;
                                                                System.out.println("Next turn of Player 2 ("+ this.x[1] +") will be SKIPPED.");
                                                            } else if (f == 3) {
                                                                this.c[0]++;
                                                                System.out.println("Next turn of Player 3 ("+ this.x[2] +") will be SKIPPED.");
                                                            }
                                                        } else if (this.b[e % 10] == 9) {
                                                            if (this.f[k] == 0)
                                                                System.out.println("\nIt is a BLANK shell.");
                                                            else
                                                                System.out.println("\nIt is a LIVE shell.");
                                                        } else if (this.b[e % 10] == 10) {
                                                            if(y) {
                                                                y = false;
                                                                System.out.println("\nRemote used. Players will get turns in CLOCKWISE manner.");
                                                            } else {
                                                                y = true;
                                                                System.out.println("\nRemote used. Players will get turns in ANTI-CLOCKWISE manner.");
                                                            }
                                                        }
                                                        this.b[e % 10] = 0;
                                                    } else if (e / 10 == 3) {
                                                        if (this.c[e % 10] == 2) {
                                                            if (this.f[k] == 0)
                                                                System.out.println("\nBLANK shell ejected.");
                                                            else
                                                                System.out.println("\nLIVE shell ejected.");
                                                            k++;
                                                        } else if (this.c[e % 10] == 3) {
                                                            f = (int) (Math.random() * this.f.length);
                                                            if (f < k)
                                                                System.out.println("\nHow unfortunate!");
                                                            else {
                                                                if (f == 0)
                                                                    System.out.print("\n1st ");
                                                                else if (f == 1)
                                                                    System.out.print("\n2nd ");
                                                                else if (f == 2)
                                                                    System.out.print("\n3rd ");
                                                                else
                                                                    System.out.print("\n"+ (e + 1) +"th ");
                                                                if (this.f[f] == 0)
                                                                    System.out.println("shell is BLANK.");
                                                                else
                                                                    System.out.println("shell is LIVE.");
                                                            }
                                                        } else if (this.c[e % 10] == 4) {
                                                            if ((a == 1 && this.e[3] == 4) || (a == 2 && this.e[3] == 6) || (a == 3 && this.e[3] == 8))
                                                                System.out.println("\nYou are already full health.");
                                                            else {
                                                                this.e[3]++;
                                                                System.out.println("\nHealth INCREASED from "+ (this.e[3] - 1) + '\u2665' +" to "+ this.e[3] + '\u2665' +".");
                                                            }
                                                            this.d[11]++;
                                                        } else if (this.c[e % 10] == 5) {
                                                            f = (int) (Math.random() * 2.0);
                                                            if (f == 0) {
                                                                this.e[3]--;
                                                                System.out.println("\nHealth DECREASED from "+ (this.e[3] + 1) + '\u2665' +" to "+ this.e[3] + '\u2665' +".");
                                                            } else {
                                                                if ((a == 1 && this.e[3] == 4) || (a == 2 && this.e[3] == 6) || (a == 3 && this.e[3] == 8))
                                                                    System.out.println("\nYou are already full health.");
                                                                if ((a == 1 && this.e[3] == 3) || (a == 2 && this.e[3] == 5) || (a == 3 && this.e[3] == 7)) {
                                                                    this.e[3]++;
                                                                    System.out.println("\nHealth INCREASED from "+ (this.e[3] - 1) + '\u2665' +" to "+ this.e[3] + '\u2665' +".");
                                                                } else {
                                                                    this.e[3] += 2;
                                                                    System.out.println("\nHealth INCREASED from "+ (this.e[3] - 2) + '\u2665' +" to "+ this.e[3] + '\u2665' +".");
                                                                }
                                                            }
                                                        } else if (this.c[e % 10] == 6) {
                                                            z = true;
                                                            System.out.println("\nHand saw ACTIVATED.");
                                                        } else if (this.c[e % 10] == 7) {
                                                            if (this.f[k] == 0)
                                                                this.f[k] = 1;
                                                            else if (this.f[k] == 1)
                                                                this.f[k] = 0;
                                                            System.out.println("\nPolarity of current shell SWAPPED.");
                                                        } else if (this.c[e % 10] == 8) {
                                                            System.out.print("\nEnter the player number whose turn you want to be skipped : ");
                                                            f = Integer.parseInt(br.readLine());
                                                            if (f < 1 || f > 4 || f == 4)
                                                                while (f < 1 || f > 4 || f == 4) {
                                                                    System.out.print("Invalid input! Please enter the number of your opponent whose turn you want to skip : ");
                                                                    f = Integer.parseInt(br.readLine());
                                                                }
                                                            if (f == 1) {
                                                                this.a[0]++;
                                                                System.out.println("Next turn of Player 1 ("+ this.x[0] +") will be SKIPPED.");
                                                            } else if (f == 2) {
                                                                this.b[0]++;
                                                                System.out.println("Next turn of Player 2 ("+ this.x[1] +") will be SKIPPED.");
                                                            } else if (f == 3) {
                                                                this.c[0]++;
                                                                System.out.println("Next turn of Player 3 ("+ this.x[2] +") will be SKIPPED.");
                                                            }
                                                        } else if (this.c[e % 10] == 9) {
                                                            if (this.f[k] == 0)
                                                                System.out.println("\nIt is a BLANK shell.");
                                                            else
                                                                System.out.println("\nIt is a LIVE shell.");
                                                        } else if (this.c[e % 10] == 10) {
                                                            if(y) {
                                                                y = false;
                                                                System.out.println("\nRemote used. Players will get turns in CLOCKWISE manner.");
                                                            } else {
                                                                y = true;
                                                                System.out.println("\nRemote used. Players will get turns in ANTI-CLOCKWISE manner.");
                                                            }
                                                        }
                                                        this.c[e % 10] = 0;
                                                    }
                                                } else if (this.d[d] == 2) {
                                                    if (this.f[k] == 0)
                                                        System.out.println("\nBLANK shell ejected.");
                                                    else
                                                        System.out.println("\nLIVE shell ejected.");
                                                    k++;
                                                } else if (this.d[d] == 3) {
                                                    e = (int) (Math.random() * this.f.length);
                                                    if (e < k)
                                                        System.out.println("\nHow unfortunate!");
                                                    else {
                                                        if (e == 0)
                                                            System.out.print("\n1st ");
                                                        else if (e == 1)
                                                            System.out.print("\n2nd ");
                                                        else if (e == 2)
                                                            System.out.print("\n3rd ");
                                                        else
                                                            System.out.print("\n"+ (e + 1) +"th ");
                                                        if (this.f[e] == 0)
                                                            System.out.println("shell is BLANK.");
                                                        else
                                                            System.out.println("shell is LIVE.");
                                                    }
                                                } else if (this.d[d] == 4) {
                                                    if ((a == 1 && this.e[3] == 4) || (a == 2 && this.e[3] == 6) || (a == 3 && this.e[3] == 8))
                                                        System.out.println("\nYou are already full health.");
                                                    else {
                                                        this.e[3]++;
                                                        System.out.println("\nHealth INCREASED from "+ (this.e[3] - 1) + '\u2665' +" to "+ this.e[3] + '\u2665' +".");
                                                    }
                                                    this.d[11]++;
                                                } else if (this.d[d] == 5) {
                                                    e = (int) (Math.random() * 2.0);
                                                    if (e == 0) {
                                                        this.e[3]--;
                                                        System.out.println("\nHealth DECREASED from "+ (this.e[3] + 1) + '\u2665' +" to "+ this.e[3] + '\u2665' +".");
                                                    } else {
                                                        if ((a == 1 && this.e[3] == 4) || (a == 2 && this.e[3] == 6) || (a == 3 && this.e[3] == 8))
                                                            System.out.println("\nYou are already full health.");
                                                        if ((a == 1 && this.e[3] == 3) || (a == 2 && this.e[3] == 5) || (a == 3 && this.e[3] == 7)) {
                                                            this.e[3]++;
                                                            System.out.println("\nHealth INCREASED from "+ (this.e[3] - 1) + '\u2665' +" to "+ this.e[3] + '\u2665' +".");
                                                        } else {
                                                            this.e[3] += 2;
                                                            System.out.println("\nHealth INCREASED from "+ (this.e[3] - 2) + '\u2665' +" to "+ this.e[3] + '\u2665' +".");
                                                        }
                                                    }
                                                } else if (this.d[d] == 6) {
                                                    z = true;
                                                    System.out.println("\nHand saw ACTIVATED.");
                                                } else if (this.d[d] == 7) {
                                                    if (this.f[k] == 0)
                                                        this.f[k] = 1;
                                                    else if (this.f[k] == 1)
                                                        this.f[k] = 0;
                                                    System.out.println("\nPolarity of current shell SWAPPED.");
                                                } else if (this.d[d] == 8) {
                                                    System.out.print("\nEnter the player number whose turn you want to be skipped : ");
                                                    e = Integer.parseInt(br.readLine());
                                                    if (e < 1 || e > 4 || e == 4)
                                                        while (e < 1 || e > 4 || e == 4) {
                                                            System.out.print("Invalid input! Please enter the number of your opponent whose turn you want to skip : ");
                                                            e = Integer.parseInt(br.readLine());
                                                        }
                                                    if (e == 1) {
                                                        this.a[0]++;
                                                        System.out.println("Next turn of Player 1 ("+ this.x[0] +") will be SKIPPED.");
                                                    } else if (e == 2) {
                                                        this.b[0]++;
                                                        System.out.println("Next turn of Player 2 ("+ this.x[1] +") will be SKIPPED.");
                                                    } else if (e == 3) {
                                                        this.c[0]++;
                                                        System.out.println("Next turn of Player 3 ("+ this.x[2] +")will be SKIPPED.");
                                                    }
                                                } else if (this.d[d] == 9) {
                                                    if (this.f[k] == 0)
                                                        System.out.println("\nIt is a BLANK shell.");
                                                    else
                                                        System.out.println("\nIt is a LIVE shell.");
                                                } else if (this.d[d] == 10) {
                                                    if(y) {
                                                        y = false;
                                                        System.out.println("\nRemote used. Players will get turns in CLOCKWISE manner.");
                                                    } else {
                                                        y = true;
                                                        System.out.println("\nRemote used. Players will get turns in ANTI-CLOCKWISE manner.");
                                                    }
                                                }
                                                this.d[d] = 0;
                                            }
                                        }
                                    }
                                    if (d != 100) {
                                        this.d[13]++;
                                        Thread.sleep(4000);
                                    } else
                                        d = 0;
                                    System.out.print('\u000C');
                                } while (c != 1);
                            } else {
                                this.d[0]--;
                                dis.fourPlayers(this.a, this.b, this.c, this.d, x % 4, this.x, this.e);
                                System.out.println("\nTurn for "+ this.x[3] +" (Player 4) : ");
                                System.out.println("\tTurn SKIPPED.");
                                Thread.sleep(2500);
                            }
                        }
                    }
                    for (c = 0; c < 4; c++)
                        if (this.e[c] == 0)
                            b++;
                    if (m) {
                        if (y)
                            x++;
                        else
                            x--;
                    } else
                        m = true;
                    z = false;
                    System.out.print('\u000C');
                        
                } while (b != 3);
                System.out.println("\t\t\t\t\t\t      BUCKSHOT ROULETTE");
                System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                for (i = 0; i < 4; i++)
                    if (this.e[i] != 0)
                        break;
                System.out.print("Winner of the round : ");
                Thread.sleep(250);
                for (j = 0; j < this.x[i].length(); j++) {
                    Thread.sleep(100);
                    System.out.print(this.x[i].charAt(j));
                }
                if (a == 1) {
                    System.out.println("\n"+ this.x[i] +" (Player "+ (i + 1) +") gets "+ '\u20B9' +"10,000.");
                    System.out.println("\nGet ready for Round 2.");
                    if (i == 0)
                        this.a[14]++;
                    else if (i == 1)
                        this.b[14]++;
                    else if (i == 2)
                        this.c[14]++;
                    else if (i == 3)
                        this.d[14]++;
                    Thread.sleep(5000);
                    System.out.print('\u000C');
                } else if (a == 2) {
                    System.out.println("\n"+ this.x[i] +" (Player "+ (i + 1) +") gets "+ '\u20B9' +"1,00,000.");
                    System.out.println("\nGet ready for Round 3.");
                    if (i == 0)
                        this.a[14] += 2;
                    else if (i == 1)
                        this.b[14] += 2;
                    else if (i == 2)
                        this.c[14] += 2;
                    else if (i == 3)
                        this.d[14] += 2;
                    Thread.sleep(5000);
                    System.out.print('\u000C');
                } else if (a == 3) {
                    System.out.println("\n"+ this.x[i] +" (Player "+ (i + 1) +") gets "+ '\u20B9' +"10,00,000.");
                    if (i == 0)
                        this.a[14] += 3;
                    else if (i == 1)
                        this.b[14] += 3;
                    else if (i == 2)
                        this.c[14] += 3;
                    else if (i == 3)
                        this.c[14] += 3;
                    Thread.sleep(2000);
                    System.out.println("\nMATCH RESULTS  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    Thread.sleep(250);
                    System.out.print("\tMost damage dealt    :    ");
                    i = this.a[9];
                    j = 0;
                    if (i < this.b[9]) {
                        i = this.b[9];
                        j = 1;
                    }
                    if (i < this.c[9]) {
                        i = this.c[9];
                        j = 2;
                    }
                    if (i < this.d[9]) {
                        i = this.d[9];
                        j = 3;
                    }
                    for (i = 0; i < this.x[j].length(); i++) {
                        Thread.sleep(100);
                        System.out.print(this.x[j].charAt(i));
                    }
                    Thread.sleep(250);
                    System.out.print("\tMost damage taken    :    ");
                    i = this.a[10];
                    j = 0;
                    if (i < this.b[10]) {
                        i = this.b[10];
                        j = 1;
                    }
                    if (i < this.c[10]) {
                        i = this.c[10];
                        j = 2;
                    }
                    if (i < this.d[10]) {
                        i = this.d[10];
                        j = 3;
                    }
                    for (i = 0; i < this.x[j].length(); i++) {
                        Thread.sleep(100);
                        System.out.print(this.x[j].charAt(i));
                    }
                    Thread.sleep(250);
                    System.out.print("\tThe chimney          :    ");
                    i = this.a[11];
                    j = 0;
                    if (i < this.b[11]) {
                        i = this.b[11];
                        j = 1;
                    }
                    if (i < this.c[11]) {
                        i = this.c[11];
                        j = 2;
                    }
                    if (i < this.d[11]) {
                        i = this.d[11];
                        j = 3;
                    }
                    for (i = 0; i < this.x[j].length(); i++) {
                        Thread.sleep(100);
                        System.out.print(this.x[j].charAt(i));
                    }
                    Thread.sleep(250);
                    System.out.print("\tLeast careful        :    ");
                    i = this.a[12];
                    j = 0;
                    if (i < this.b[12]) {
                        i = this.b[12];
                        j = 1;
                    }
                    if (i < this.c[12]) {
                        i = this.c[12];
                        j = 2;
                    }
                    if (i < this.d[12]) {
                        i = this.d[12];
                        j = 3;
                    }
                    for (i = 0; i < this.x[j].length(); i++) {
                        Thread.sleep(100);
                        System.out.print(this.x[j].charAt(i));
                    }
                    Thread.sleep(250);
                    System.out.print("\tMost resourceful     :    ");
                    i = this.a[13];
                    j = 0;
                    if (i < this.b[13]) {
                        i = this.b[13];
                        j = 1;
                    }
                    if (i < this.c[13]) {
                        i = this.c[13];
                        j = 2;
                    }
                    if (i < this.d[13]) {
                        i = this.d[13];
                        j = 3;
                    }
                    for (i = 0; i < this.x[j].length(); i++) {
                        Thread.sleep(100);
                        System.out.print(this.x[j].charAt(i));
                    }
                    Thread.sleep(250);
                    System.out.print("\tMost wealthiest      :    ");
                    i = this.a[14];
                    j = 0;
                    if (i < this.b[14]) {
                        i = this.b[14];
                        j = 1;
                    }
                    if (i < this.c[14]) {
                        i = this.c[14];
                        j = 2;
                    }
                    if (i < this.d[14]) {
                        i = this.d[14];
                        j = 3;
                    }
                    for (i = 0; i < this.x[j].length(); i++) {
                        Thread.sleep(100);
                        System.out.print(this.x[j].charAt(i));
                    }
                    Thread.sleep(2500);
                    System.out.println("\nCREDITS  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("\tSurya Samanta");
                    Thread.sleep(2500);
                    System.out.print("Enter any character to return to the home screen : ");
                    g = br.readLine();
                    System.out.print('\u000C');
                }
            }
        } catch (Exception ex) {
            System.out.println("\nAn error occured!");
            System.out.println("Error description : "+ ex);
            System.out.print("Please wait");
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
    public void levelStartup(int a) throws InterruptedException {
        String s;
        int i;
        s = "LEVEL "+ Integer.toString(a);
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t    ");
        for (i = 0; i < s.length(); i++) {
            Thread.sleep(250);
            System.out.print(s.charAt(i) +"   ");
        }
        Thread.sleep(1000);
        System.out.print("\n\n\t\t\t\t\t\t     ");
        s = "Everybody will get ";
        for (i = 0; i < s.length(); i++) {
            Thread.sleep(100);
            System.out.print(s.charAt(i));
        }
        Thread.sleep(1000);
        System.out.print(this.e[0] +" ");
        Thread.sleep(100);
        System.out.print('\u2665');
        Thread.sleep(2500);
        System.out.print('\u000C');
    }
    public static void main(String[] a) throws IOException, InterruptedException {
        int b;
        FourPlayer fp = new FourPlayer();
        for (b = 0; b < a.length; b++)
            x[b] = a[b];
        fp.game();
    }
}