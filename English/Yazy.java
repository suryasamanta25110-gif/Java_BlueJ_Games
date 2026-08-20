package English;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import English.Instructions.YazyInstructions;
public class Yazy {
    int a[] = {-10, -10, -10, -10, -10, -10, -10, -10, -10, -10, -10};
    int b[] = {-10, -10, -10, -10, -10, -10, -10, -10, -10, -10, -10};
    int c[] = {-10, -10, -10, -10, -10, -10, -10, -10, -10, -10, -10};
    int d[] = {-10, -10, -10, -10, -10, -10, -10, -10, -10, -10, -10};
    int e[] = new int[11];
    int f[] = new int[5];
    int g, h, i, j;
    String k, l, m, n;
    boolean o[] = {false, false, false, false, false};
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    public void dice() {
        if(o[0] == true)
            System.out.print("\t\t+--       --");
        else
            System.out.print("\t\t            ");
        if(o[0] == true || o[1] == true)
            System.out.print("+");
        else
            System.out.print(" ");
        if(o[1] == true)
            System.out.print("--       --");
        else
            System.out.print("           ");
        if(o[1] == true || o[2] == true)
            System.out.print("+");
        else
            System.out.print(" ");
        if(o[2] == true)
            System.out.print("--       --");
        else
            System.out.print("           ");
        if(o[2] == true || o[3] == true)
            System.out.print("+");
        else
            System.out.print(" ");
        if(o[3] == true)
            System.out.print("--       --");
        else
            System.out.print("           ");
        if(o[3] == true || o[4] == true)
            System.out.print("+");
        else
            System.out.print(" ");
        if(o[4] == true)
            System.out.println("--       --+");
        else
            System.out.println("");
        if(o[0] == true)
            System.out.print("\t\t| +-------+ ");
        else
            System.out.print("\t\t  +-------+ ");
        if(o[0] == true || o[1] == true)
            System.out.print("| +-------+ ");
        else
            System.out.print("  +-------+ ");
        if(o[1] == true || o[2] == true)
            System.out.print("| +-------+ ");
        else
            System.out.print("  +-------+ ");
        if(o[2] == true || o[3] == true)
            System.out.print("| +-------+ ");
        else
            System.out.print("  +-------+ ");
        if(o[3] == true || o[4] == true)
            System.out.print("| +-------+ ");
        else
            System.out.print("  +-------+ ");
        if(o[4] == true)
            System.out.println("|");
        else
            System.out.println("");
        if(f[0] == 1)
            System.out.print("\t\t  |       |   |");
        else if(f[0] == 2)
            System.out.print("\t\t  |     O |   |");
        else if(f[0] == 3)
            System.out.print("\t\t  | O     |   |");
        else if(f[0] == 4)
            System.out.print("\t\t  | O   O |   |");
        else if(f[0] == 5)
            System.out.print("\t\t  | O   O |   |");
        else
            System.out.print("\t\t  | O O O |   |");
        if(f[1] == 1)
            System.out.print("       |   |");
        else if(f[1] == 2)
            System.out.print("     O |   |");
        else if(f[1] == 3)
            System.out.print(" O     |   |");
        else if(f[1] == 4)
            System.out.print(" O   O |   |");
        else if(f[1] == 5)
            System.out.print(" O   O |   |");
        else
            System.out.print(" O O O |   |");
        if(f[2] == 1)
            System.out.print("       |   |");
        else if(f[2] == 2)
            System.out.print("     O |   |");
        else if(f[2] == 3)
            System.out.print(" O     |   |");
        else if(f[2] == 4)
            System.out.print(" O   O |   |");
        else if(f[2] == 5)
            System.out.print(" O   O |   |");
        else
            System.out.print(" O O O |   |");
        if(f[3] == 1)
            System.out.print("       |   |");
        else if(f[3] == 2)
            System.out.print("     O |   |");
        else if(f[3] == 3)
            System.out.print(" O     |   |");
        else if(f[3] == 4)
            System.out.print(" O   O |   |");
        else if(f[3] == 5)
            System.out.print(" O   O |   |");
        else
            System.out.print(" O O O |   |");
        if(f[4] == 1)
            System.out.print("       |\n\t\t  |");
        else if(f[4] == 2)
            System.out.print("     O |\n\t\t  |");
        else if(f[4] == 3)
            System.out.print(" O     |\n\t\t  |");
        else if(f[4] == 4)
            System.out.print(" O   O |\n\t\t  |");
        else if(f[4] == 5)
            System.out.print(" O   O |\n\t\t  |");
        else
            System.out.print(" O O O |\n\t\t  |");
        if(f[0] == 1)
            System.out.print("   O   |   |");
        else if(f[0] == 2)
            System.out.print("       |   |");
        else if(f[0] == 3)
            System.out.print("   O   |   |");
        else if(f[0] == 4)
            System.out.print("       |   |");
        else if(f[0] == 5)
            System.out.print("   O   |   |");
        else
            System.out.print("       |   |");
        if(f[1] == 1)
            System.out.print("   O   |   |");
        else if(f[1] == 2)
            System.out.print("       |   |");
        else if(f[1] == 3)
            System.out.print("   O   |   |");
        else if(f[1] == 4)
            System.out.print("       |   |");
        else if(f[1] == 5)
            System.out.print("   O   |   |");
        else
            System.out.print("       |   |");
        if(f[2] == 1)
            System.out.print("   O   |   |");
        else if(f[2] == 2)
            System.out.print("       |   |");
        else if(f[2] == 3)
            System.out.print("   O   |   |");
        else if(f[2] == 4)
            System.out.print("       |   |");
        else if(f[2] == 5)
            System.out.print("   O   |   |");
        else
            System.out.print("       |   |");
        if(f[3] == 1)
            System.out.print("   O   |   |");
        else if(f[3] == 2)
            System.out.print("       |   |");
        else if(f[3] == 3)
            System.out.print("   O   |   |");
        else if(f[3] == 4)
            System.out.print("       |   |");
        else if(f[3] == 5)
            System.out.print("   O   |   |");
        else
            System.out.print("       |   |");
        if(f[4] == 1)
            System.out.print("   O   |\n\t\t  |");
        else if(f[4] == 2)
            System.out.print("       |\n\t\t  |");
        else if(f[4] == 3)
            System.out.print("   O   |\n\t\t  |");
        else if(f[4] == 4)
            System.out.print("       |\n\t\t  |");
        else if(f[4] == 5)
            System.out.print("   O   |\n\t\t  |");
        else
            System.out.print("       |\n\t\t  |");
        if(f[0] == 1)
            System.out.print("       |   |");
        else if(f[0] == 2)
            System.out.print(" O     |   |");
        else if(f[0] == 3)
            System.out.print("     O |   |");
        else if(f[0] == 4)
            System.out.print(" O   O |   |");
        else if(f[0] == 5)
            System.out.print(" O   O |   |");
        else
            System.out.print(" O O O |   |");
        if(f[1] == 1)
            System.out.print("       |   |");
        else if(f[1] == 2)
            System.out.print(" O     |   |");
        else if(f[1] == 3)
            System.out.print("     O |   |");
        else if(f[1] == 4)
            System.out.print(" O   O |   |");
        else if(f[1] == 5)
            System.out.print(" O   O |   |");
        else
            System.out.print(" O O O |   |");
        if(f[2] == 1)
            System.out.print("       |   |");
        else if(f[2] == 2)
            System.out.print(" O     |   |");
        else if(f[2] == 3)
            System.out.print("     O |   |");
        else if(f[2] == 4)
            System.out.print(" O   O |   |");
        else if(f[2] == 5)
            System.out.print(" O   O |   |");
        else
            System.out.print(" O O O |   |");
        if(f[3] == 1)
            System.out.print("       |   |");
        else if(f[3] == 2)
            System.out.print(" O     |   |");
        else if(f[3] == 3)
            System.out.print("     O |   |");
        else if(f[3] == 4)
            System.out.print(" O   O |   |");
        else if(f[3] == 5)
            System.out.print(" O   O |   |");
        else
            System.out.print(" O O O |   |");
        if(f[4] == 1)
            System.out.println("       |");
        else if(f[4] == 2)
            System.out.println(" O     |");
        else if(f[4] == 3)
            System.out.println("     O |");
        else if(f[4] == 4)
            System.out.println(" O   O |");
        else if(f[4] == 5)
            System.out.println(" O   O |");
        else
            System.out.println(" O O O |");
        if(o[0] == true)
            System.out.print("\t\t| +-------+ ");
        else
            System.out.print("\t\t  +-------+ ");
        if(o[0] == true || o[1] == true)
            System.out.print("| +-------+ ");
        else
            System.out.print("  +-------+ ");
        if(o[1] == true || o[2] == true)
            System.out.print("| +-------+ ");
        else
            System.out.print("  +-------+ ");
        if(o[2] == true || o[3] == true)
            System.out.print("| +-------+ ");
        else
            System.out.print("  +-------+ ");
        if(o[3] == true || o[4] == true)
            System.out.print("| +-------+ ");
        else
            System.out.print("  +-------+ ");
        if(o[4] == true)
            System.out.println("|");
        else
            System.out.println("");
        if(o[0] == true)
            System.out.print("\t\t+--       --");
        else
            System.out.print("\t\t            ");
        if(o[0] == true || o[1] == true)
            System.out.print("+");
        else
            System.out.print(" ");
        if(o[1] == true)
            System.out.print("--       --");
        else
            System.out.print("           ");
        if(o[1] == true || o[2] == true)
            System.out.print("+");
        else
            System.out.print(" ");
        if(o[2] == true)
            System.out.print("--       --");
        else
            System.out.print("           ");
        if(o[2] == true || o[3] == true)
            System.out.print("+");
        else
            System.out.print(" ");
        if(o[3] == true)
            System.out.print("--       --");
        else
            System.out.print("           ");
        if(o[3] == true || o[4] == true)
            System.out.print("+");
        else
            System.out.print(" ");
        if(o[4] == true)
            System.out.println("--       --+");
        else
            System.out.println("");
    }
    public void calculate(int a[]) {
        byte b, c, d, g, h, i;
        for(b = 0; b <= 10; b++)
            e[b] = -10;
        if(a[0] == -10) {
            e[0] = 0;
            for(c = 0; c < 5; c++)
                if(f[c] == 1)
                    e[0]++;
        }
        if(a[1] == -10) {
            e[1] = 0;
            for(c = 0; c < 5; c++)
                if(f[c] == 2)
                    e[1] += 2;
        }
        if(a[2] == -10) {
            e[2] = 0;
            for(c = 0; c < 5; c++)
                if(f[c] == 3)
                    e[2] += 3;
        }
        if(a[3] == -10) {
            e[3] = 0;
            for(c = 0; c < 5; c++)
                if(f[c] == 4)
                    e[3] += 4;
        }
        if(a[4] == -10) {
            e[4] = 0;
            for(c = 0; c < 5; c++)
                if(f[c] == 5)
                    e[4] += 5;
        }
        if(a[5] == -10) {
            e[5] = 0;
            for(c = 0; c < 5; c++)
                if(f[c] == 6)
                    e[5] += 6;
        }
        if(a[6] == -10) {
            e[6] = 0;
            for(c = 0; c < 3; c++) {
                g = 1;
                for(d = 0; d < 5; d++)
                    if(f[d] == f[c] && d != c)
                        g++;
                if(g >= 3) {
                    for(d = 0; d < 5; d++)
                        e[6] += f[d];
                    break;
                }
            }
        }
        if(a[7] == -10) {
            e[7] = 0;
            for(c = 0; c < 2; c++) {
                g = 1;
                for(d = 0; d < 5; d++)
                    if(f[d] == f[c] && d != c)
                        g++;
                if(g >= 4) {
                    for(d = 0; d < 5; d++)
                        e[7] += f[d];
                    break;
                }
            }
        }
        if(a[8] == -10) {
            e[8] = 0;
            for(c = 0; c < 3; c++) {
                g = 1;
                for(d = 0; d < 5; d++)
                    if(f[d] == f[c] && d != c)
                        g++;
                if(g == 3) {
                    i = 1;
                    for(h = 0; h < 4; h++)
                        if(f[h] != f[c])
                            break;
                    for(d = 0; d < 5; d++)
                        if(f[d] == f[h] && d != h)
                            i++;
                    if(i == 2)
                        e[8] = 25;
                    break;
                }
            }
        }
        if(a[9] == -10) {
            e[9] = 0;
            c = 100;
            for(d = 0; d < 5; d++)
                if(c > f[d])
                    c = (byte)f[d];
            if(c <= 2)
                for(d = 0; d < 5; d++)
                    if(f[d] - c == 1) {
                        c = (byte)f[d];
                        for(d = 0; d < 5; d++)
                            if(f[d] - c == 1) {
                                c = (byte)f[d];
                                for(d = 0; d < 5; d++)
                                    if(f[d] - c == 1) {
                                        c = (byte)f[d];
                                        for(d = 0; d < 5; d++)
                                            if(f[d] - c == 1)
                                                e[9] = 40;
                                    }
                            }
                    }
        }
        if(a[10] == -10) {
            e[10] = 0;
            if(f[0] == f[1] && f[1] == f[2] && f[2] == f[3] && f[3] == f[4])
                e[10] = 50;
        }
    }
    public long[] computerMind(int a) {
        long b[] = {6, 6, 6, 6, 6, 6};
        int c[] = {0, 0, 0, 0, 0, 0};
        int d = 0, e = 0, g;
        boolean f[] = {false, false, false, false, false};
        if(a == 0) {
            for(a = 0; a < 5; a++) {
                if(this.f[a] == 1)
                    c[0]++;
                else if(this.f[a] == 2)
                    c[1]++;
                else if(this.f[a] == 3)
                    c[2]++;
                else if(this.f[a] == 4)
                    c[3]++;
                else if(this.f[a] == 5)
                    c[4]++;
                else if(this.f[a] == 6)
                    c[5]++;
            }
            for(a = 0; a < 6; a++)
                if(c[a] > d) {
                    d = c[a];
                    e = a;
                }
            for(a = 0; a < 5; a++)
                if(c[a] != c[e])
                    for(d = 0; d < 6; d++)
                        if(b[d] == 6) {
                            b[d] = a + 1;
                            break;
                        }
        }
        else {
            d = 6;
            for(e = 0; e < 5; e++)
                if(this.f[e] < d)
                    d = this.f[e];
            for(e = 0; d != this.f[e]; e++) {}
            f[e] = true;
            for(e = 1; e <= ((d == 1 || d == 2) ? 4 : 6 - d); e++)
                for(g = 0; g < 5; g++)
                    if(this.f[g] - d == e) {
                        f[g] = true;
                        break;
                    }
            for(a = 0; a < 5; a++)
                if(f[a] == false)
                    for(e = 0; e < 6; e++)
                        if(b[d] == 6) {
                            b[d] = a + 1;
                            break;
                        }
        }
        return b;
    }
    public void computer()throws InterruptedException {
        long a, e = 0, g, h, i[] = new long[6];
        byte b, c, d, j, k = 0;
        char f;
        try {
            g = h = 0;
            System.out.println("\t\t\t\t\t\t             YAZY");
            System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Enter your name: ");
            this.k = br.readLine();
            l = "Computer";
            System.out.println("\n\t\t\t\tPLAYER 1:\t\t\t\tPLAYER 2:");
            System.out.println("\t\t\t\t"+ this.k +"\t\tVS\t\t"+ l);
            System.out.print("\nEnter any number to start: ");
            a = Long.parseLong(br.readLine());
            System.out.print('\u000C');
            for(b = 0; b < 22; b++) {
                System.out.println("\t\t\t\t\t\t             YAZY");
                System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("\t\t\t\t\t       +-----------+------+------+");
                System.out.print("\t\t\t\t\t       |     1     |");
                if(this.a[0] == -10)
                    System.out.print("      |");
                else if(this.a[0] < 10)
                    System.out.print("  0"+ this.a[0] +"  |");
                else
                    System.out.print("  "+ this.a[0] +"  |");
                if(this.b[0] == -10)
                    System.out.println("      |");
                else if(this.b[0] < 10)
                    System.out.println("  0"+ this.b[0] +"  |");
                else
                    System.out.println("  "+ this.b[0] +"  |");
                System.out.println("\t\t\t\t\t       +-----------+------+------+");
                System.out.print("\t\t\t\t\t       |     2     |");
                if(this.a[1] == -10)
                    System.out.print("      |");
                else if(this.a[1] < 10)
                    System.out.print("  0"+ this.a[1] +"  |");
                else
                    System.out.print("  "+ this.a[1] +"  |");
                if(this.b[1] == -10)
                    System.out.println("      |");
                else if(this.b[1] < 10)
                    System.out.println("  0"+ this.b[1] +"  |");
                else
                    System.out.println("  "+ this.b[1] +"  |");
                System.out.println("\t\t\t\t\t       +-----------+------+------+");
                System.out.print("\t\t\t\t\t       |     3     |");
                if(this.a[2] == -10)
                    System.out.print("      |");
                else if(this.a[2] < 10)
                    System.out.print("  0"+ this.a[2] +"  |");
                else
                    System.out.print("  "+ this.a[2] +"  |");
                if(this.b[2] == -10)
                    System.out.println("      |");
                else if(this.b[2] < 10)
                    System.out.println("  0"+ this.b[2] +"  |");
                else
                    System.out.println("  "+ this.b[2] +"  |");
                System.out.println("\t\t\t\t\t       +-----------+------+------+");
                System.out.print("\t\t\t\t\t       |     4     |");
                if(this.a[3] == -10)
                    System.out.print("      |");
                else if(this.a[3] < 10)
                    System.out.print("  0"+ this.a[3] +"  |");
                else
                    System.out.print("  "+ this.a[3] +"  |");
                if(this.b[3] == -10)
                    System.out.println("      |");
                else if(this.b[3] < 10)
                    System.out.println("  0"+ this.b[3] +"  |");
                else
                    System.out.println("  "+ this.b[3] +"  |");
                System.out.println("\t\t\t\t\t       +-----------+------+------+");
                System.out.print("\t\t\t\t\t       |     5     |");
                if(this.a[4] == -10)
                    System.out.print("      |");
                else if(this.a[4] < 10)
                    System.out.print("  0"+ this.a[4] +"  |");
                else
                    System.out.print("  "+ this.a[4] +"  |");
                if(this.b[4] == -10)
                    System.out.println("      |");
                else if(this.b[4] < 10)
                    System.out.println("  0"+ this.b[4] +"  |");
                else
                    System.out.println("  "+ this.b[4] +"  |");
                System.out.println("\t\t\t\t\t       +-----------+------+------+");
                System.out.print("\t\t\t\t\t       |     6     |");
                if(this.a[5] == -10)
                    System.out.print("      |");
                else if(this.a[5] < 10)
                    System.out.print("  0"+ this.a[5] +"  |");
                else
                    System.out.print("  "+ this.a[5] +"  |");
                if(this.b[5] == -10)
                    System.out.println("      |");
                else if(this.b[5] < 10)
                    System.out.println("  0"+ this.b[5] +"  |");
                else
                    System.out.println("  "+ this.b[5] +"  |");
                System.out.println("\t\t\t\t\t       +-----------+------+------+");
                System.out.print("\t\t\t\t\t       |   X X X   |");
                if(this.a[6] == -10)
                    System.out.print("      |");
                else if(this.a[6] < 10)
                    System.out.print("  0"+ this.a[6] +"  |");
                else
                    System.out.print("  "+ this.a[6] +"  |");
                if(this.b[6] == -10)
                    System.out.println("      |");
                else if(this.b[6] < 10)
                    System.out.println("  0"+ this.b[6] +"  |");
                else
                    System.out.println("  "+ this.b[6] +"  |");
                System.out.println("\t\t\t\t\t       +-----------+------+------+");
                System.out.print("\t\t\t\t\t       |  X X X X  |");
                if(this.a[7] == -10)
                    System.out.print("      |");
                else if(this.a[7] < 10)
                    System.out.print("  0"+ this.a[7] +"  |");
                else
                    System.out.print("  "+ this.a[7] +"  |");
                if(this.b[7] == -10)
                    System.out.println("      |");
                else if(this.b[7] < 10)
                    System.out.println("  0"+ this.b[7] +"  |");
                else
                    System.out.println("  "+ this.b[7] +"  |");
                System.out.println("\t\t\t\t\t       +-----------+------+------+");
                System.out.print("\t\t\t\t\t       | X X X O O |");
                if(this.a[8] == -10)
                    System.out.print("      |");
                else if(this.a[8] < 10)
                    System.out.print("  0"+ this.a[8] +"  |");
                else
                    System.out.print("  "+ this.a[8] +"  |");
                if(this.b[8] == -10)
                    System.out.println("      |");
                else if(this.b[8] < 10)
                    System.out.println("  0"+ this.b[8] +"  |");
                else
                    System.out.println("  "+ this.b[8] +"  |");
                System.out.println("\t\t\t\t\t       +-----------+------+------+");
                System.out.print("\t\t\t\t\t       | X O + * # |");
                if(this.a[9] == -10)
                    System.out.print("      |");
                else if(this.a[9] < 10)
                    System.out.print("  0"+ this.a[9] +"  |");
                else
                    System.out.print("  "+ this.a[9] +"  |");
                if(this.b[9] == -10)
                    System.out.println("      |");
                else if(this.b[9] < 10)
                    System.out.println("  0"+ this.b[9] +"  |");
                else
                    System.out.println("  "+ this.b[9] +"  |");
                System.out.println("\t\t\t\t\t       +-----------+------+------+");
                System.out.print("\t\t\t\t\t       | X X X X X |");
                if(this.a[10] == -10)
                    System.out.print("      |");
                else if(this.a[10] < 10)
                    System.out.print("  0"+ this.a[10] +"  |");
                else
                    System.out.print("  "+ this.a[10] +"  |");
                if(this.b[10] == -10)
                    System.out.println("      |");
                else if(this.b[10] < 10)
                    System.out.println("  0"+ this.b[10] +"  |");
                else
                    System.out.println("  "+ this.b[10] +"  |");
                System.out.println("\t\t\t\t\t       +-----------+------+------+");
                System.out.print("\t\t\t\t\t       |   TOTAL   |");
                if(g < 10)
                    System.out.print("  0"+ g +"  |");
                else if(g < 100)
                    System.out.print("  "+ g +"  |");
                else
                    System.out.print(" "+ g +"  |");
                if(h < 10)
                    System.out.println("  0"+ h +"  |");
                else if(h < 100)
                    System.out.println("  "+ h +"  |");
                else
                    System.out.println(" "+ h +"  |");
                System.out.println("\t\t\t\t\t       +-----------+------+------+");
                a = 0;
                if(b % 2 == 0) {
                    System.out.println("\nTurn for "+ this.k +" to move.");
                    for(c = 0; c < 3 && a != 2; c++) {
                        if(c == 0) {
                            System.out.print("Enter any number to roll dice: ");
                            e = Long.parseLong(br.readLine());
                            for(d = 0; d < 5; d++)
                                this.f[d] = (int)(Math.random() * 6.0) + 1;
                            System.out.println("\nYour dice are as follows: ");
                            System.out.println("\t\t   DICE  1     DICE  2     DICE  3     DICE  4     DICE  5");
                            dice();
                            calculate(this.a);
                            System.out.println("\nYour possible score for now are as follows:");
                            for(a = 0; a < 11; a++) {
                                f = (char)((int)a + 65);
                                if(this.a[(int)a] == -10)
                                    System.out.print("\t"+ f);
                            }
                            System.out.print("\n");
                            for(a = 0; a < 11; a++)
                                if(this.a[(int)a] == -10)
                                    System.out.print("\t"+ this.e[(int)a]);
                        }
                        else {
                            System.out.println("\nChoose any one of the following:");
                            System.out.println("    1 - Roll dice");
                            System.out.println("    2 - Put markings");
                            System.out.print("\tEnter your choice: ");
                            a = Long.parseLong(br.readLine());
                            if(a != 1 && a != 2)
                                while(a != 1 && a != 2) {
                                    System.out.print("Choose among the given options: ");
                                    a = Long.parseLong(br.readLine());
                                }
                            if(a == 1) {
                                System.out.println("\nEnter the dice number that you want to stop rolling further.");
                                System.out.println("Re-enter the number to make the dice roll again.");
                                System.out.println("Enter \'6\' if you have finished and you want to roll the dice.");
                                while(true) {
                                    e = Long.parseLong(br.readLine());
                                    if(e != 1 && e != 2 && e != 3 && e != 4 && e != 5 && e != 6)
                                        while(e != 1 && e != 2 && e != 3 && e != 4 && e != 5 && e != 6) {
                                            System.out.print("Only numbers 1 to 6 is acceptable: ");
                                            e = Long.parseLong(br.readLine());
                                            continue;
                                        }
                                    else if(e == 6)
                                        break;
                                    else {
                                        if(o[(int)(e - 1)] == false)
                                            o[(int)(e - 1)] = true;
                                        else
                                            o[(int)(e - 1)] = false;
                                    }
                                }
                                for(d = 0; d < 5; d++)
                                    if(o[d] == false)
                                        this.f[d] = (int)(Math.random() * 6.0) + 1;
                                System.out.println("\nYour dice are as follows: ");
                                System.out.println("\t\t   DICE  1     DICE  2     DICE  3     DICE  4     DICE  5");
                                dice();
                                calculate(this.a);
                                System.out.println("\nYour possible score for now are as follows:");
                                for(a = 0; a < 11; a++) {
                                    f = (char)((int)a + 65);
                                    if(this.a[(int)a] == -10)
                                        System.out.print("\t"+ f);
                                }
                                System.out.print("\n");
                                for(a = 0; a < 11; a++)
                                    if(this.a[(int)a] == -10)
                                        System.out.print("\t"+ this.e[(int)a]);
                            }
                            else if(a == 2)
                                break;
                        }
                    }
                    System.out.print("\nEnter the character: ");
                    f = br.readLine().charAt(0);
                    while(true) {
                        if((f == 'A' || f == 'a') && this.a[0] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'B' || f == 'b') && this.a[1] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'C' || f == 'c') && this.a[2] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'D' || f == 'd') && this.a[3] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'E' || f == 'e') && this.a[4] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'F' || f == 'f') && this.a[5] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'G' || f == 'g') && this.a[6] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'H' || f == 'h') && this.a[7] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'I' || f == 'i') && this.a[8] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'J' || f == 'j') && this.a[9] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'K' || f == 'k') && this.a[10] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f < 65 || f > 75) && (f < 97 || f > 107))
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else
                            break;
                        f = br.readLine().charAt(0);
                    }
                    if(f == 'A' || f == 'a')
                        this.a[0] = this.e[0];
                    else if(f == 'B' || f == 'b')
                        this.a[1] = this.e[1];
                    else if(f == 'C' || f == 'c')
                        this.a[2] = this.e[2];
                    else if(f == 'D' || f == 'd')
                        this.a[3] = this.e[3];
                    else if(f == 'E' || f == 'e')
                        this.a[4] = this.e[4];
                    else if(f == 'F' || f == 'f')
                        this.a[5] = this.e[5];
                    else if(f == 'G' || f == 'g')
                        this.a[6] = this.e[6];
                    else if(f == 'H' || f == 'h')
                        this.a[7] = this.e[7];
                    else if(f == 'I' || f == 'i')
                        this.a[8] = this.e[8];
                    else if(f == 'J' || f == 'j')
                        this.a[9] = this.e[9];
                    else if(f == 'K' || f == 'k')
                        this.a[10] = this.e[10];
                    g = h = 0;
                    for(c = 0; c <= 10; c++) {
                        if(this.a[c] != -10)
                            g += this.a[c];
                        if(this.b[c] != -10)
                            h += this.b[c];
                    }
                    for(c = 0; c < 5; c++)
                        o[c] = false;
                    System.out.print('\u000C');
                }
                else {
                    System.out.println("\nTurn for "+ l +" to move.");
                    for(c = 0; c < 3 && a != 2; c++) {
                        if(c == 0) {
                            System.out.print("Enter any number to roll dice: ");
                            e = (long)(Math.random() * 11.0);
                            Thread.sleep(1000);
                            System.out.println(e);
                            for(d = 0; d < 5; d++)
                                this.f[d] = (int)(Math.random() * 6.0) + 1;
                            System.out.println("\nYour dice are as follows: ");
                            System.out.println("\t\t   DICE  1     DICE  2     DICE  3     DICE  4     DICE  5");
                            dice();
                            calculate(this.b);
                            System.out.println("\nYour possible score for now are as follows:");
                            for(a = 0; a < 11; a++) {
                                f = (char)((int)a + 65);
                                if(this.b[(int)a] == -10)
                                    System.out.print("\t"+ f);
                            }
                            System.out.print("\n");
                            for(a = 0; a < 11; a++)
                                if(this.b[(int)a] == -10)
                                    System.out.print("\t"+ this.e[(int)a]);
                        }
                        else {
                            System.out.println("\nChoose any one of the following:");
                            System.out.println("    1 - Roll dice");
                            System.out.println("    2 - Put markings");
                            System.out.print("\tEnter your choice: ");
                            if(this.e[6] == -10 && this.e[7] == -10 && this.e[8] == -10 && this.e[9] == -10 && this.e[10] == -10)
                                a = 1;
                            else
                                a = 2;
                            Thread.sleep(2000);
                            System.out.println(a);
                            if(a == 1) {
                                System.out.println("\nEnter the dice number that you want to stop rolling further.");
                                System.out.println("Re-enter the number to make the dice roll again.");
                                System.out.println("Enter \'6\' if you have finished and you want to roll the dice.");
                                if(this.c != this.b) {
                                    if(this.b[9] == -10)
                                        k = (byte)(Math.random() * 2.0);
                                    else
                                        k = 0;
                                    this.c = this.b;
                                }
                                i = computerMind((int)k);
                                d = 0;
                                Thread.sleep(1000);
                                do {
                                    Thread.sleep(1000);
                                    System.out.println(i[d]);
                                    if(i[d] != 6) {
                                        if(o[(int)(i[d] - 1)] == false)
                                            o[(int)(i[d] - 1)] = true;
                                        else
                                            o[(int)(i[d] - 1)] = false;
                                    }
                                }
                                while(i[d] != 6);
                                for(d = 0; d < 5; d++)
                                    if(o[d] == false)
                                        this.f[d] = (int)(Math.random() * 6.0) + 1;
                                System.out.println("\nYour dice are as follows: ");
                                System.out.println("\t\t   DICE  1     DICE  2     DICE  3     DICE  4     DICE  5");
                                dice();
                                calculate(this.b);
                                System.out.println("\nYour possible score for now are as follows:");
                                for(a = 0; a < 11; a++) {
                                    f = (char)((int)a + 65);
                                    if(this.b[(int)a] == -10)
                                        System.out.print("\t"+ f);
                                }
                                System.out.print("\n");
                                for(a = 0; a < 11; a++)
                                    if(this.b[(int)a] == -10)
                                        System.out.print("\t"+ this.e[(int)a]);
                            }
                            else if(a == 2)
                                break;
                        }
                    }
                    System.out.print("\nEnter the character: ");
                    j = -10;
                    f = 'A';
                    for(d = 0; d < 11; d++)
                        if(j < this.e[d] && this.b[d] == -10) {
                            j = (byte)this.e[d];
                            f = (char)((int)d + 65);
                        }
                    Thread.sleep(2000);
                    System.out.println(f);
                    if(f == 'A' || f == 'a')
                        this.b[0] = this.e[0];
                    else if(f == 'B' || f == 'b')
                        this.b[1] = this.e[1];
                    else if(f == 'C' || f == 'c')
                        this.b[2] = this.e[2];
                    else if(f == 'D' || f == 'd')
                        this.b[3] = this.e[3];
                    else if(f == 'E' || f == 'e')
                        this.b[4] = this.e[4];
                    else if(f == 'F' || f == 'f')
                        this.b[5] = this.e[5];
                    else if(f == 'G' || f == 'g')
                        this.b[6] = this.e[6];
                    else if(f == 'H' || f == 'h')
                        this.b[7] = this.e[7];
                    else if(f == 'I' || f == 'i')
                        this.b[8] = this.e[8];
                    else if(f == 'J' || f == 'j')
                        this.b[9] = this.e[9];
                    else if(f == 'K' || f == 'k')
                        this.b[10] = this.e[10];
                    g = h = 0;
                    for(c = 0; c <= 10; c++) {
                        if(this.a[c] != -10)
                            g += this.a[c];
                        if(this.b[c] != -10)
                            h += this.b[c];
                    }
                    for(c = 0; c < 5; c++)
                        o[c] = false;
                    System.out.print('\u000C');
                }
            }
            System.out.println("\t\t\t\t\t\t             YAZY");
            System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("WINNER: ");
            if(g > h)
                System.out.println(this.k);
            else if(h > g)
                System.out.println(l);
            else
                System.out.println(this.k +" and "+ l);
            System.out.println("\nPoints of "+ this.k +": "+ g);
            System.out.println("Points of "+ l +": "+ h);
            System.out.println("Enter any number to return back to the main menu: ");
            a = Long.parseLong(br.readLine());
            System.out.print('\u000C');
        }
        catch(Exception ex) {
            System.out.println("\nInvalid input!");
            System.out.println("Exception: "+ ex);
            System.out.print("Please restart the program to interact.");
        }
    }
    public void twoPlayers() {
        long a, e = 0;
        byte b, c, d;
        char f;
        try {
            g = h = 0;
            System.out.println("\t\t\t\t\t\t             YAZY");
            System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Enter the full name of player 1: ");
            k = br.readLine();
            System.out.print("Enter the full name of player 2: ");
            l = br.readLine();
            System.out.println("\n\t\t\t\tPLAYER 1:\t\t\t\tPLAYER 2:");
            System.out.println("\t\t\t\t"+ k +"\t\tVS\t\t"+ l);
            System.out.print("\nEnter any number to start: ");
            a = Long.parseLong(br.readLine());
            System.out.print('\u000C');
            for(b = 0; b < 22; b++) {
                System.out.println("\t\t\t\t\t\t             YAZY");
                System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("\t\t\t\t\t       +-----------+------+------+");
                System.out.print("\t\t\t\t\t       |     1     |");
                if(this.a[0] == -10)
                    System.out.print("      |");
                else if(this.a[0] < 10)
                    System.out.print("  0"+ this.a[0] +"  |");
                else
                    System.out.print("  "+ this.a[0] +"  |");
                if(this.b[0] == -10)
                    System.out.println("      |");
                else if(this.b[0] < 10)
                    System.out.println("  0"+ this.b[0] +"  |");
                else
                    System.out.println("  "+ this.b[0] +"  |");
                System.out.println("\t\t\t\t\t       +-----------+------+------+");
                System.out.print("\t\t\t\t\t       |     2     |");
                if(this.a[1] == -10)
                    System.out.print("      |");
                else if(this.a[1] < 10)
                    System.out.print("  0"+ this.a[1] +"  |");
                else
                    System.out.print("  "+ this.a[1] +"  |");
                if(this.b[1] == -10)
                    System.out.println("      |");
                else if(this.b[1] < 10)
                    System.out.println("  0"+ this.b[1] +"  |");
                else
                    System.out.println("  "+ this.b[1] +"  |");
                System.out.println("\t\t\t\t\t       +-----------+------+------+");
                System.out.print("\t\t\t\t\t       |     3     |");
                if(this.a[2] == -10)
                    System.out.print("      |");
                else if(this.a[2] < 10)
                    System.out.print("  0"+ this.a[2] +"  |");
                else
                    System.out.print("  "+ this.a[2] +"  |");
                if(this.b[2] == -10)
                    System.out.println("      |");
                else if(this.b[2] < 10)
                    System.out.println("  0"+ this.b[2] +"  |");
                else
                    System.out.println("  "+ this.b[2] +"  |");
                System.out.println("\t\t\t\t\t       +-----------+------+------+");
                System.out.print("\t\t\t\t\t       |     4     |");
                if(this.a[3] == -10)
                    System.out.print("      |");
                else if(this.a[3] < 10)
                    System.out.print("  0"+ this.a[3] +"  |");
                else
                    System.out.print("  "+ this.a[3] +"  |");
                if(this.b[3] == -10)
                    System.out.println("      |");
                else if(this.b[3] < 10)
                    System.out.println("  0"+ this.b[3] +"  |");
                else
                    System.out.println("  "+ this.b[3] +"  |");
                System.out.println("\t\t\t\t\t       +-----------+------+------+");
                System.out.print("\t\t\t\t\t       |     5     |");
                if(this.a[4] == -10)
                    System.out.print("      |");
                else if(this.a[4] < 10)
                    System.out.print("  0"+ this.a[4] +"  |");
                else
                    System.out.print("  "+ this.a[4] +"  |");
                if(this.b[4] == -10)
                    System.out.println("      |");
                else if(this.b[4] < 10)
                    System.out.println("  0"+ this.b[4] +"  |");
                else
                    System.out.println("  "+ this.b[4] +"  |");
                System.out.println("\t\t\t\t\t       +-----------+------+------+");
                System.out.print("\t\t\t\t\t       |     6     |");
                if(this.a[5] == -10)
                    System.out.print("      |");
                else if(this.a[5] < 10)
                    System.out.print("  0"+ this.a[5] +"  |");
                else
                    System.out.print("  "+ this.a[5] +"  |");
                if(this.b[5] == -10)
                    System.out.println("      |");
                else if(this.b[5] < 10)
                    System.out.println("  0"+ this.b[5] +"  |");
                else
                    System.out.println("  "+ this.b[5] +"  |");
                System.out.println("\t\t\t\t\t       +-----------+------+------+");
                System.out.print("\t\t\t\t\t       |   X X X   |");
                if(this.a[6] == -10)
                    System.out.print("      |");
                else if(this.a[6] < 10)
                    System.out.print("  0"+ this.a[6] +"  |");
                else
                    System.out.print("  "+ this.a[6] +"  |");
                if(this.b[6] == -10)
                    System.out.println("      |");
                else if(this.b[6] < 10)
                    System.out.println("  0"+ this.b[6] +"  |");
                else
                    System.out.println("  "+ this.b[6] +"  |");
                System.out.println("\t\t\t\t\t       +-----------+------+------+");
                System.out.print("\t\t\t\t\t       |  X X X X  |");
                if(this.a[7] == -10)
                    System.out.print("      |");
                else if(this.a[7] < 10)
                    System.out.print("  0"+ this.a[7] +"  |");
                else
                    System.out.print("  "+ this.a[7] +"  |");
                if(this.b[7] == -10)
                    System.out.println("      |");
                else if(this.b[7] < 10)
                    System.out.println("  0"+ this.b[7] +"  |");
                else
                    System.out.println("  "+ this.b[7] +"  |");
                System.out.println("\t\t\t\t\t       +-----------+------+------+");
                System.out.print("\t\t\t\t\t       | X X X O O |");
                if(this.a[8] == -10)
                    System.out.print("      |");
                else if(this.a[8] < 10)
                    System.out.print("  0"+ this.a[8] +"  |");
                else
                    System.out.print("  "+ this.a[8] +"  |");
                if(this.b[8] == -10)
                    System.out.println("      |");
                else if(this.b[8] < 10)
                    System.out.println("  0"+ this.b[8] +"  |");
                else
                    System.out.println("  "+ this.b[8] +"  |");
                System.out.println("\t\t\t\t\t       +-----------+------+------+");
                System.out.print("\t\t\t\t\t       | X O + * # |");
                if(this.a[9] == -10)
                    System.out.print("      |");
                else if(this.a[9] < 10)
                    System.out.print("  0"+ this.a[9] +"  |");
                else
                    System.out.print("  "+ this.a[9] +"  |");
                if(this.b[9] == -10)
                    System.out.println("      |");
                else if(this.b[9] < 10)
                    System.out.println("  0"+ this.b[9] +"  |");
                else
                    System.out.println("  "+ this.b[9] +"  |");
                System.out.println("\t\t\t\t\t       +-----------+------+------+");
                System.out.print("\t\t\t\t\t       | X X X X X |");
                if(this.a[10] == -10)
                    System.out.print("      |");
                else if(this.a[10] < 10)
                    System.out.print("  0"+ this.a[10] +"  |");
                else
                    System.out.print("  "+ this.a[10] +"  |");
                if(this.b[10] == -10)
                    System.out.println("      |");
                else if(this.b[10] < 10)
                    System.out.println("  0"+ this.b[10] +"  |");
                else
                    System.out.println("  "+ this.b[10] +"  |");
                System.out.println("\t\t\t\t\t       +-----------+------+------+");
                System.out.print("\t\t\t\t\t       |   TOTAL   |");
                if(g < 10)
                    System.out.print("  0"+ g +"  |");
                else if(g < 100)
                    System.out.print("  "+ g +"  |");
                else
                    System.out.print(" "+ g +"  |");
                if(h < 10)
                    System.out.println("  0"+ h +"  |");
                else if(h < 100)
                    System.out.println("  "+ h +"  |");
                else
                    System.out.println(" "+ h +"  |");
                System.out.println("\t\t\t\t\t       +-----------+------+------+");
                a = 0;
                if(b % 2 == 0) {
                    System.out.println("\nTurn for "+ k +" to move.");
                    for(c = 0; c < 3 && a != 2; c++) {
                        if(c == 0) {
                            System.out.print("Enter any number to roll dice: ");
                            e = Long.parseLong(br.readLine());
                            for(d = 0; d < 5; d++)
                                this.f[d] = (int)(Math.random() * 6.0) + 1;
                            System.out.println("\nYour dice are as follows: ");
                            System.out.println("\t\t   DICE  1     DICE  2     DICE  3     DICE  4     DICE  5");
                            dice();
                            calculate(this.a);
                            System.out.println("\nYour possible score for now are as follows:");
                            for(a = 0; a < 11; a++) {
                                f = (char)((int)a + 65);
                                if(this.a[(int)a] == -10)
                                    System.out.print("\t"+ f);
                            }
                            System.out.print("\n");
                            for(a = 0; a < 11; a++)
                                if(this.a[(int)a] == -10)
                                    System.out.print("\t"+ this.e[(int)a]);
                        }
                        else {
                            System.out.println("\nChoose any one of the following:");
                            System.out.println("    1 - Roll dice");
                            System.out.println("    2 - Put markings");
                            System.out.print("\tEnter your choice: ");
                            a = Long.parseLong(br.readLine());
                            if(a != 1 && a != 2)
                                while(a != 1 && a != 2) {
                                    System.out.print("Choose among the given options: ");
                                    a = Long.parseLong(br.readLine());
                                }
                            if(a == 1) {
                                System.out.println("\nEnter the dice number that you want to stop rolling further.");
                                System.out.println("Re-enter the number to make the dice roll again.");
                                System.out.println("Enter \'6\' if you have finished and you want to roll the dice.");
                                while(true) {
                                    e = Long.parseLong(br.readLine());
                                    if(e != 1 && e != 2 && e != 3 && e != 4 && e != 5 && e != 6)
                                        while(e != 1 && e != 2 && e != 3 && e != 4 && e != 5 && e != 6) {
                                            System.out.print("Only numbers 1 to 6 is acceptable: ");
                                            e = Long.parseLong(br.readLine());
                                            continue;
                                        }
                                    else if(e == 6)
                                        break;
                                    else {
                                        if(o[(int)(e - 1)] == false)
                                            o[(int)(e - 1)] = true;
                                        else
                                            o[(int)(e - 1)] = false;
                                    }
                                }
                                for(d = 0; d < 5; d++)
                                    if(o[d] == false)
                                        this.f[d] = (int)(Math.random() * 6.0) + 1;
                                System.out.println("\nYour dice are as follows: ");
                                System.out.println("\t\t   DICE  1     DICE  2     DICE  3     DICE  4     DICE  5");
                                dice();
                                calculate(this.a);
                                System.out.println("\nYour possible score for now are as follows:");
                                for(a = 0; a < 11; a++) {
                                    f = (char)((int)a + 65);
                                    if(this.a[(int)a] == -10)
                                        System.out.print("\t"+ f);
                                }
                                System.out.print("\n");
                                for(a = 0; a < 11; a++)
                                    if(this.a[(int)a] == -10)
                                        System.out.print("\t"+ this.e[(int)a]);
                            }
                            else if(a == 2)
                                break;
                        }
                    }
                    System.out.print("\nEnter the character: ");
                    f = br.readLine().charAt(0);
                    while(true) {
                        if((f == 'A' || f == 'a') && this.a[0] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'B' || f == 'b') && this.a[1] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'C' || f == 'c') && this.a[2] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'D' || f == 'd') && this.a[3] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'E' || f == 'e') && this.a[4] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'F' || f == 'f') && this.a[5] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'G' || f == 'g') && this.a[6] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'H' || f == 'h') && this.a[7] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'I' || f == 'i') && this.a[8] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'J' || f == 'j') && this.a[9] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'K' || f == 'k') && this.a[10] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f < 65 || f > 75) && (f < 97 || f > 107))
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else
                            break;
                        f = br.readLine().charAt(0);
                    }
                    if(f == 'A' || f == 'a')
                        this.a[0] = this.e[0];
                    else if(f == 'B' || f == 'b')
                        this.a[1] = this.e[1];
                    else if(f == 'C' || f == 'c')
                        this.a[2] = this.e[2];
                    else if(f == 'D' || f == 'd')
                        this.a[3] = this.e[3];
                    else if(f == 'E' || f == 'e')
                        this.a[4] = this.e[4];
                    else if(f == 'F' || f == 'f')
                        this.a[5] = this.e[5];
                    else if(f == 'G' || f == 'g')
                        this.a[6] = this.e[6];
                    else if(f == 'H' || f == 'h')
                        this.a[7] = this.e[7];
                    else if(f == 'I' || f == 'i')
                        this.a[8] = this.e[8];
                    else if(f == 'J' || f == 'j')
                        this.a[9] = this.e[9];
                    else if(f == 'K' || f == 'k')
                        this.a[10] = this.e[10];
                    g = h = 0;
                    for(c = 0; c <= 10; c++) {
                        if(this.a[c] != -10)
                            g += this.a[c];
                        if(this.b[c] != -10)
                            h += this.b[c];
                    }
                    for(c = 0; c < 5; c++)
                        o[c] = false;
                    System.out.print('\u000C');
                }
                else {
                    System.out.println("\nTurn for "+ l +" to move.");
                    for(c = 0; c < 3 && a != 2; c++) {
                        if(c == 0) {
                            System.out.print("Enter any number to roll dice: ");
                            e = Long.parseLong(br.readLine());
                            for(d = 0; d < 5; d++)
                                this.f[d] = (int)(Math.random() * 6.0) + 1;
                            System.out.println("\nYour dice are as follows: ");
                            System.out.println("\t\t   DICE  1     DICE  2     DICE  3     DICE  4     DICE  5");
                            dice();
                            calculate(this.b);
                            System.out.println("\nYour possible score for now are as follows:");
                            for(a = 0; a < 11; a++) {
                                f = (char)((int)a + 65);
                                if(this.b[(int)a] == -10)
                                    System.out.print("\t"+ f);
                            }
                            System.out.print("\n");
                            for(a = 0; a < 11; a++)
                                if(this.b[(int)a] == -10)
                                    System.out.print("\t"+ this.e[(int)a]);
                        }
                        else {
                            System.out.println("\nChoose any one of the following:");
                            System.out.println("    1 - Roll dice");
                            System.out.println("    2 - Put markings");
                            System.out.print("\tEnter your choice: ");
                            a = Long.parseLong(br.readLine());
                            if(a != 1 && a != 2)
                                while(a != 1 && a != 2) {
                                    System.out.print("Choose among the given options: ");
                                    a = Long.parseLong(br.readLine());
                                }
                            if(a == 1) {
                                System.out.println("\nEnter the dice number that you want to stop rolling further.");
                                System.out.println("Re-enter the number to make the dice roll again.");
                                System.out.println("Enter \'6\' if you have finished and you want to roll the dice.");
                                while(true) {
                                    e = Long.parseLong(br.readLine());
                                    if(e != 1 && e != 2 && e != 3 && e != 4 && e != 5 && e != 6)
                                        while(e != 1 && e != 2 && e != 3 && e != 4 && e != 5 && e != 6) {
                                            System.out.print("Only numbers 1 to 6 is acceptable: ");
                                            e = Long.parseLong(br.readLine());
                                            continue;
                                        }
                                    else if(e == 6)
                                        break;
                                    else {
                                        if(o[(int)(e - 1)] == false)
                                            o[(int)(e - 1)] = true;
                                        else
                                            o[(int)(e - 1)] = false;
                                    }
                                }
                                for(d = 0; d < 5; d++)
                                    if(o[d] == false)
                                        this.f[d] = (int)(Math.random() * 6.0) + 1;
                                System.out.println("\nYour dice are as follows: ");
                                System.out.println("\t\t   DICE  1     DICE  2     DICE  3     DICE  4     DICE  5");
                                dice();
                                calculate(this.b);
                                System.out.println("\nYour possible score for now are as follows:");
                                for(a = 0; a < 11; a++) {
                                    f = (char)((int)a + 65);
                                    if(this.b[(int)a] == -10)
                                        System.out.print("\t"+ f);
                                }
                                System.out.print("\n");
                                for(a = 0; a < 11; a++)
                                    if(this.b[(int)a] == -10)
                                        System.out.print("\t"+ this.e[(int)a]);
                            }
                            else if(a == 2)
                                break;
                        }
                    }
                    System.out.print("\nEnter the character: ");
                    f = br.readLine().charAt(0);
                    while(true) {
                        if((f == 'A' || f == 'a') && this.b[0] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'B' || f == 'b') && this.b[1] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'C' || f == 'c') && this.b[2] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'D' || f == 'd') && this.b[3] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'E' || f == 'e') && this.b[4] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'F' || f == 'f') && this.b[5] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'G' || f == 'g') && this.b[6] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'H' || f == 'h') && this.b[7] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'I' || f == 'i') && this.b[8] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'J' || f == 'j') && this.b[9] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'K' || f == 'k') && this.b[10] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f < 65 || f > 75) && (f < 97 || f > 107))
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else
                            break;
                        f = br.readLine().charAt(0);
                    }
                    if(f == 'A' || f == 'a')
                        this.b[0] = this.e[0];
                    else if(f == 'B' || f == 'b')
                        this.b[1] = this.e[1];
                    else if(f == 'C' || f == 'c')
                        this.b[2] = this.e[2];
                    else if(f == 'D' || f == 'd')
                        this.b[3] = this.e[3];
                    else if(f == 'E' || f == 'e')
                        this.b[4] = this.e[4];
                    else if(f == 'F' || f == 'f')
                        this.b[5] = this.e[5];
                    else if(f == 'G' || f == 'g')
                        this.b[6] = this.e[6];
                    else if(f == 'H' || f == 'h')
                        this.b[7] = this.e[7];
                    else if(f == 'I' || f == 'i')
                        this.b[8] = this.e[8];
                    else if(f == 'J' || f == 'j')
                        this.b[9] = this.e[9];
                    else if(f == 'K' || f == 'k')
                        this.b[10] = this.e[10];
                    g = h = 0;
                    for(c = 0; c <= 10; c++) {
                        if(this.a[c] != -10)
                            g += this.a[c];
                        if(this.b[c] != -10)
                            h += this.b[c];
                    }
                    for(c = 0; c < 5; c++)
                        o[c] = false;
                    System.out.print('\u000C');
                }
            }
            System.out.println("\t\t\t\t\t\t             YAZY");
            System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("WINNER: ");
            if(g > h)
                System.out.println(k);
            else if(h > g)
                System.out.println(l);
            else
                System.out.println(k +" and "+ l);
            System.out.println("\nPoints of "+ k +": "+ g);
            System.out.println("Points of "+ l +": "+ h);
            System.out.println("Enter any number to return back to the main menu: ");
            a = Long.parseLong(br.readLine());
            System.out.print('\u000C');
        }
        catch(Exception ex) {
            System.out.println("\nInvalid input!");
            System.out.println("Exception: "+ ex);
            System.out.print("Please restart the program to interact.");
        }
    }
    public void threePlayers() {
        long a, e = 0;
        byte b, c, d;
        char f;
        try {
            g = h = i = 0;
            System.out.println("\t\t\t\t\t\t             YAZY");
            System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Enter the full name of player 1: ");
            k = br.readLine();
            System.out.print("Enter the full name of player 2: ");
            l = br.readLine();
            System.out.print("Enter the full name of player 3: ");
            m = br.readLine();
            System.out.println("\n\t\tPLAYER 1:\t\t\t\tPLAYER 2:\t\t\t\tPLAYER 3:");
            System.out.println("\t\t"+ k +"\t\tVS\t\t"+ l +"\t\tVS\t\t"+ m);
            System.out.print("\nEnter any number to start: ");
            a = Long.parseLong(br.readLine());
            System.out.print('\u000C');
            for(b = 0; b < 33; b++) {
                System.out.println("\t\t\t\t\t\t             YAZY");
                System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("\t\t\t\t\t    +-----------+------+------+------+");
                System.out.print("\t\t\t\t\t    |     1     |");
                if(this.a[0] == -10)
                    System.out.print("      |");
                else if(this.a[0] < 10)
                    System.out.print("  0"+ this.a[0] +"  |");
                else
                    System.out.print("  "+ this.a[0] +"  |");
                if(this.b[0] == -10)
                    System.out.print("      |");
                else if(this.b[0] < 10)
                    System.out.print("  0"+ this.b[0] +"  |");
                else
                    System.out.print("  "+ this.b[0] +"  |");
                if(this.c[0] == -10)
                    System.out.println("      |");
                else if(this.c[0] < 10)
                    System.out.println("  0"+ this.c[0] +"  |");
                else
                    System.out.println("  "+ this.c[0] +"  |");
                System.out.println("\t\t\t\t\t    +-----------+------+------+------+");
                System.out.print("\t\t\t\t\t    |     2     |");
                if(this.a[1] == -10)
                    System.out.print("      |");
                else if(this.a[1] < 10)
                    System.out.print("  0"+ this.a[1] +"  |");
                else
                    System.out.print("  "+ this.a[1] +"  |");
                if(this.b[1] == -10)
                    System.out.print("      |");
                else if(this.b[1] < 10)
                    System.out.print("  0"+ this.b[1] +"  |");
                else
                    System.out.print("  "+ this.b[1] +"  |");
                if(this.c[1] == -10)
                    System.out.println("      |");
                else if(this.c[1] < 10)
                    System.out.println("  0"+ this.c[1] +"  |");
                else
                    System.out.println("  "+ this.c[1] +"  |");
                System.out.println("\t\t\t\t\t    +-----------+------+------+------+");
                System.out.print("\t\t\t\t\t    |     3     |");
                if(this.a[2] == -10)
                    System.out.print("      |");
                else if(this.a[2] < 10)
                    System.out.print("  0"+ this.a[2] +"  |");
                else
                    System.out.print("  "+ this.a[2] +"  |");
                if(this.b[2] == -10)
                    System.out.print("      |");
                else if(this.b[2] < 10)
                    System.out.print("  0"+ this.b[2] +"  |");
                else
                    System.out.print("  "+ this.b[2] +"  |");
                if(this.c[2] == -10)
                    System.out.println("      |");
                else if(this.c[2] < 10)
                    System.out.println("  0"+ this.c[2] +"  |");
                else
                    System.out.println("  "+ this.c[2] +"  |");
                System.out.println("\t\t\t\t\t    +-----------+------+------+------+");
                System.out.print("\t\t\t\t\t    |     4     |");
                if(this.a[3] == -10)
                    System.out.print("      |");
                else if(this.a[3] < 10)
                    System.out.print("  0"+ this.a[3] +"  |");
                else
                    System.out.print("  "+ this.a[3] +"  |");
                if(this.b[3] == -10)
                    System.out.print("      |");
                else if(this.b[3] < 10)
                    System.out.print("  0"+ this.b[3] +"  |");
                else
                    System.out.print("  "+ this.b[3] +"  |");
                if(this.c[3] == -10)
                    System.out.println("      |");
                else if(this.c[3] < 10)
                    System.out.println("  0"+ this.c[3] +"  |");
                else
                    System.out.println("  "+ this.c[3] +"  |");
                System.out.println("\t\t\t\t\t    +-----------+------+------+------+");
                System.out.print("\t\t\t\t\t    |     5     |");
                if(this.a[4] == -10)
                    System.out.print("      |");
                else if(this.a[4] < 10)
                    System.out.print("  0"+ this.a[4] +"  |");
                else
                    System.out.print("  "+ this.a[4] +"  |");
                if(this.b[4] == -10)
                    System.out.print("      |");
                else if(this.b[4] < 10)
                    System.out.print("  0"+ this.b[4] +"  |");
                else
                    System.out.print("  "+ this.b[4] +"  |");
                if(this.c[4] == -10)
                    System.out.println("      |");
                else if(this.c[4] < 10)
                    System.out.println("  0"+ this.c[4] +"  |");
                else
                    System.out.println("  "+ this.c[4] +"  |");
                System.out.println("\t\t\t\t\t    +-----------+------+------+------+");
                System.out.print("\t\t\t\t\t    |     6     |");
                if(this.a[5] == -10)
                    System.out.print("      |");
                else if(this.a[5] < 10)
                    System.out.print("  0"+ this.a[5] +"  |");
                else
                    System.out.print("  "+ this.a[5] +"  |");
                if(this.b[5] == -10)
                    System.out.print("      |");
                else if(this.b[5] < 10)
                    System.out.print("  0"+ this.b[5] +"  |");
                else
                    System.out.print("  "+ this.b[5] +"  |");
                if(this.c[5] == -10)
                    System.out.println("      |");
                else if(this.c[5] < 10)
                    System.out.println("  0"+ this.c[5] +"  |");
                else
                    System.out.println("  "+ this.c[5] +"  |");
                System.out.println("\t\t\t\t\t    +-----------+------+------+------+");
                System.out.print("\t\t\t\t\t    |   X X X   |");
                if(this.a[6] == -10)
                    System.out.print("      |");
                else if(this.a[6] < 10)
                    System.out.print("  0"+ this.a[6] +"  |");
                else
                    System.out.print("  "+ this.a[6] +"  |");
                if(this.b[6] == -10)
                    System.out.print("      |");
                else if(this.b[6] < 10)
                    System.out.print("  0"+ this.b[6] +"  |");
                else
                    System.out.print("  "+ this.b[6] +"  |");
                if(this.c[6] == -10)
                    System.out.println("      |");
                else if(this.c[6] < 10)
                    System.out.println("  0"+ this.c[6] +"  |");
                else
                    System.out.println("  "+ this.c[6] +"  |");
                System.out.println("\t\t\t\t\t    +-----------+------+------+------+");
                System.out.print("\t\t\t\t\t    |  X X X X  |");
                if(this.a[7] == -10)
                    System.out.print("      |");
                else if(this.a[7] < 10)
                    System.out.print("  0"+ this.a[7] +"  |");
                else
                    System.out.print("  "+ this.a[7] +"  |");
                if(this.b[7] == -10)
                    System.out.print("      |");
                else if(this.b[7] < 10)
                    System.out.print("  0"+ this.b[7] +"  |");
                else
                    System.out.print("  "+ this.b[7] +"  |");
                if(this.c[7] == -10)
                    System.out.println("      |");
                else if(this.c[7] < 10)
                    System.out.println("  0"+ this.c[7] +"  |");
                else
                    System.out.println("  "+ this.c[7] +"  |");
                System.out.println("\t\t\t\t\t    +-----------+------+------+------+");
                System.out.print("\t\t\t\t\t    | X X X O O |");
                if(this.a[8] == -10)
                    System.out.print("      |");
                else if(this.a[8] < 10)
                    System.out.print("  0"+ this.a[8] +"  |");
                else
                    System.out.print("  "+ this.a[8] +"  |");
                if(this.b[8] == -10)
                    System.out.print("      |");
                else if(this.b[8] < 10)
                    System.out.print("  0"+ this.b[8] +"  |");
                else
                    System.out.print("  "+ this.b[8] +"  |");
                if(this.c[8] == -10)
                    System.out.println("      |");
                else if(this.c[8] < 10)
                    System.out.println("  0"+ this.c[8] +"  |");
                else
                    System.out.println("  "+ this.c[8] +"  |");
                System.out.println("\t\t\t\t\t    +-----------+------+------+------+");
                System.out.print("\t\t\t\t\t    | X O + * # |");
                if(this.a[9] == -10)
                    System.out.print("      |");
                else if(this.a[9] < 10)
                    System.out.print("  0"+ this.a[9] +"  |");
                else
                    System.out.print("  "+ this.a[9] +"  |");
                if(this.b[9] == -10)
                    System.out.print("      |");
                else if(this.b[9] < 10)
                    System.out.print("  0"+ this.b[9] +"  |");
                else
                    System.out.print("  "+ this.b[9] +"  |");
                if(this.c[9] == -10)
                    System.out.println("      |");
                else if(this.c[9] < 10)
                    System.out.println("  0"+ this.c[9] +"  |");
                else
                    System.out.println("  "+ this.c[9] +"  |");
                System.out.println("\t\t\t\t\t    +-----------+------+------+------+");
                System.out.print("\t\t\t\t\t    | X X X X X |");
                if(this.a[10] == -10)
                    System.out.print("      |");
                else if(this.a[10] < 10)
                    System.out.print("  0"+ this.a[10] +"  |");
                else
                    System.out.print("  "+ this.a[10] +"  |");
                if(this.b[10] == -10)
                    System.out.print("      |");
                else if(this.b[10] < 10)
                    System.out.print("  0"+ this.b[10] +"  |");
                else
                    System.out.print("  "+ this.b[10] +"  |");
                if(this.c[10] == -10)
                    System.out.println("      |");
                else if(this.c[10] < 10)
                    System.out.println("  0"+ this.c[10] +"  |");
                else
                    System.out.println("  "+ this.c[10] +"  |");
                System.out.println("\t\t\t\t\t    +-----------+------+------+------+");
                System.out.print("\t\t\t\t\t    |   TOTAL   |");
                if(g < 10)
                    System.out.print("  0"+ g +"  |");
                else if(g < 100)
                    System.out.print("  "+ g +"  |");
                else
                    System.out.print(" "+ g +"  |");
                if(h < 10)
                    System.out.print("  0"+ h +"  |");
                else if(h < 100)
                    System.out.print("  "+ h +"  |");
                else
                    System.out.print(" "+ h +"  |");
                if(i < 10)
                    System.out.println("  0"+ i +"  |");
                else if(i < 100)
                    System.out.println("  "+ i +"  |");
                else
                    System.out.println(" "+ i +"  |");
                System.out.println("\t\t\t\t\t    +-----------+------+------+------+");
                a = 0;
                if(b % 3 == 0) {
                    System.out.println("\nTurn for "+ k +" to move.");
                    for(c = 0; c < 3 && a != 2; c++) {
                        if(c == 0) {
                            System.out.print("Enter any number to roll dice: ");
                            e = Long.parseLong(br.readLine());
                            for(d = 0; d < 5; d++)
                                this.f[d] = (int)(Math.random() * 6.0) + 1;
                            System.out.println("\nYour dice are as follows: ");
                            System.out.println("\t\t   DICE  1     DICE  2     DICE  3     DICE  4     DICE  5");
                            dice();
                            calculate(this.a);
                            System.out.println("\n\nYour possible score for now are as follows:");
                            for(a = 0; a < 11; a++) {
                                f = (char)((int)a + 65);
                                if(this.a[(int)a] == -10)
                                    System.out.print("\t"+ f);
                            }
                            System.out.print("\n");
                            for(a = 0; a < 11; a++)
                                if(this.a[(int)a] == -10)
                                    System.out.print("\t"+ this.e[(int)a]);
                        }
                        else {
                            System.out.println("\nChoose any one of the following:");
                            System.out.println("    1 - Roll dice");
                            System.out.println("    2 - Put markings");
                            System.out.print("\tEnter your choice: ");
                            a = Long.parseLong(br.readLine());
                            if(a != 1 && a != 2)
                                while(a != 1 && a != 2) {
                                    System.out.print("Choose among the given options: ");
                                    a = Long.parseLong(br.readLine());
                                }
                            if(a == 1) {
                                System.out.println("\nEnter the dice number that you want to stop rolling further.");
                                System.out.println("Re-enter the number to make the dice roll again.");
                                System.out.println("Enter \'6\' if you have finished and you want to roll the dice.");
                                while(true) {
                                    e = Long.parseLong(br.readLine());
                                    if(e != 1 && e != 2 && e != 3 && e != 4 && e != 5 && e != 6)
                                        while(e != 1 && e != 2 && e != 3 && e != 4 && e != 5 && e != 6) {
                                            System.out.print("Only numbers 1 to 6 is acceptable: ");
                                            e = Long.parseLong(br.readLine());
                                            continue;
                                        }
                                    else if(e == 6)
                                        break;
                                    else {
                                        if(o[(int)(e - 1)] == false)
                                            o[(int)(e - 1)] = true;
                                        else
                                            o[(int)(e - 1)] = false;
                                    }
                                }
                                for(d = 0; d < 5; d++)
                                    if(o[d] == false)
                                        this.f[d] = (int)(Math.random() * 6.0) + 1;
                                System.out.println("\nYour dice are as follows: ");
                                System.out.println("\t\t   DICE  1     DICE  2     DICE  3     DICE  4     DICE  5");
                                dice();
                                calculate(this.a);
                                System.out.println("\n\nYour possible score for now are as follows:");
                                for(a = 0; a < 11; a++) {
                                    f = (char)((int)a + 65);
                                    if(this.a[(int)a] == -10)
                                        System.out.print("\t"+ f);
                                }
                                System.out.print("\n");
                                for(a = 0; a < 11; a++)
                                    if(this.a[(int)a] == -10)
                                        System.out.print("\t"+ this.e[(int)a]);
                            }
                            else if(a == 2)
                                break;
                        }
                    }
                    System.out.print("\nEnter the character: ");
                    f = br.readLine().charAt(0);
                    while(true) {
                        if((f == 'A' || f == 'a') && this.a[0] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'B' || f == 'b') && this.a[1] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'C' || f == 'c') && this.a[2] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'D' || f == 'd') && this.a[3] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'E' || f == 'e') && this.a[4] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'F' || f == 'f') && this.a[5] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'G' || f == 'g') && this.a[6] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'H' || f == 'h') && this.a[7] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'I' || f == 'i') && this.a[8] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'J' || f == 'j') && this.a[9] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'K' || f == 'k') && this.a[10] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f < 65 || f > 75) && (f < 97 || f > 107))
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else
                            break;
                        f = br.readLine().charAt(0);
                    }
                    if(f == 'A' || f == 'a')
                        this.a[0] = this.e[0];
                    else if(f == 'B' || f == 'b')
                        this.a[1] = this.e[1];
                    else if(f == 'C' || f == 'c')
                        this.a[2] = this.e[2];
                    else if(f == 'D' || f == 'd')
                        this.a[3] = this.e[3];
                    else if(f == 'E' || f == 'e')
                        this.a[4] = this.e[4];
                    else if(f == 'F' || f == 'f')
                        this.a[5] = this.e[5];
                    else if(f == 'G' || f == 'g')
                        this.a[6] = this.e[6];
                    else if(f == 'H' || f == 'h')
                        this.a[7] = this.e[7];
                    else if(f == 'I' || f == 'i')
                        this.a[8] = this.e[8];
                    else if(f == 'J' || f == 'j')
                        this.a[9] = this.e[9];
                    else if(f == 'K' || f == 'k')
                        this.a[10] = this.e[10];
                    g = h = i = 0;
                    for(c = 0; c <= 10; c++) {
                        if(this.a[c] != -10)
                            g += this.a[c];
                        if(this.b[c] != -10)
                            h += this.b[c];
                        if(this.c[c] != -10)
                            i += this.c[c];
                    }
                    for(c = 0; c < 5; c++)
                        o[c] = false;
                    System.out.print('\u000C');
                }
                else if(b % 3 == 1) {
                    System.out.println("\nTurn for "+ l +" to move.");
                    for(c = 0; c < 3 && a != 2; c++) {
                        if(c == 0) {
                            System.out.print("Enter any number to roll dice: ");
                            e = Long.parseLong(br.readLine());
                            for(d = 0; d < 5; d++)
                                this.f[d] = (int)(Math.random() * 6.0) + 1;
                            System.out.println("\nYour dice are as follows: ");
                            System.out.println("\t\t   DICE  1     DICE  2     DICE  3     DICE  4     DICE  5");
                            dice();
                            calculate(this.b);
                            System.out.println("\n\nYour possible score for now are as follows:");
                            for(a = 0; a < 11; a++) {
                                f = (char)((int)a + 65);
                                if(this.b[(int)a] == -10)
                                    System.out.print("\t"+ f);
                            }
                            System.out.print("\n");
                            for(a = 0; a < 11; a++)
                                if(this.b[(int)a] == -10)
                                    System.out.print("\t"+ this.e[(int)a]);
                        }
                        else {
                            System.out.println("\nChoose any one of the following:");
                            System.out.println("    1 - Roll dice");
                            System.out.println("    2 - Put markings");
                            System.out.print("\tEnter your choice: ");
                            a = Long.parseLong(br.readLine());
                            if(a != 1 && a != 2)
                                while(a != 1 && a != 2) {
                                    System.out.print("Choose among the given options: ");
                                    a = Long.parseLong(br.readLine());
                                }
                            if(a == 1) {
                                System.out.println("\nEnter the dice number that you want to stop rolling further.");
                                System.out.println("Re-enter the number to make the dice roll again.");
                                System.out.println("Enter \'6\' if you have finished and you want to roll the dice.");
                                while(true) {
                                    e = Long.parseLong(br.readLine());
                                    if(e != 1 && e != 2 && e != 3 && e != 4 && e != 5 && e != 6)
                                        while(e != 1 && e != 2 && e != 3 && e != 4 && e != 5 && e != 6) {
                                            System.out.print("Only numbers 1 to 6 is acceptable: ");
                                            e = Long.parseLong(br.readLine());
                                            continue;
                                        }
                                    else if(e == 6)
                                        break;
                                    else {
                                        if(o[(int)(e - 1)] == false)
                                            o[(int)(e - 1)] = true;
                                        else
                                            o[(int)(e - 1)] = false;
                                    }
                                }
                                for(d = 0; d < 5; d++)
                                    if(o[d] == false)
                                        this.f[d] = (int)(Math.random() * 6.0) + 1;
                                System.out.println("\nYour dice are as follows: ");
                                System.out.println("\t\t   DICE  1     DICE  2     DICE  3     DICE  4     DICE  5");
                                dice();
                                calculate(this.b);
                                System.out.println("\n\nYour possible score for now are as follows:");
                                for(a = 0; a < 11; a++) {
                                    f = (char)((int)a + 65);
                                    if(this.b[(int)a] == -10)
                                        System.out.print("\t"+ f);
                                }
                                System.out.print("\n");
                                for(a = 0; a < 11; a++)
                                    if(this.b[(int)a] == -10)
                                        System.out.print("\t"+ this.e[(int)a]);
                            }
                            else if(a == 2)
                                break;
                        }
                    }
                    System.out.print("\nEnter the character: ");
                    f = br.readLine().charAt(0);
                    while(true) {
                        if((f == 'A' || f == 'a') && this.b[0] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'B' || f == 'b') && this.b[1] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'C' || f == 'c') && this.b[2] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'D' || f == 'd') && this.b[3] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'E' || f == 'e') && this.b[4] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'F' || f == 'f') && this.b[5] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'G' || f == 'g') && this.b[6] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'H' || f == 'h') && this.b[7] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'I' || f == 'i') && this.b[8] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'J' || f == 'j') && this.b[9] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'K' || f == 'k') && this.b[10] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f < 65 || f > 75) && (f < 97 || f > 107))
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else
                            break;
                        f = br.readLine().charAt(0);
                    }
                    if(f == 'A' || f == 'a')
                        this.b[0] = this.e[0];
                    else if(f == 'B' || f == 'b')
                        this.b[1] = this.e[1];
                    else if(f == 'C' || f == 'c')
                        this.b[2] = this.e[2];
                    else if(f == 'D' || f == 'd')
                        this.b[3] = this.e[3];
                    else if(f == 'E' || f == 'e')
                        this.b[4] = this.e[4];
                    else if(f == 'F' || f == 'f')
                        this.b[5] = this.e[5];
                    else if(f == 'G' || f == 'g')
                        this.b[6] = this.e[6];
                    else if(f == 'H' || f == 'h')
                        this.b[7] = this.e[7];
                    else if(f == 'I' || f == 'i')
                        this.b[8] = this.e[8];
                    else if(f == 'J' || f == 'j')
                        this.b[9] = this.e[9];
                    else if(f == 'K' || f == 'k')
                        this.b[10] = this.e[10];
                    g = h = i = 0;
                    for(c = 0; c <= 10; c++) {
                        if(this.a[c] != -10)
                            g += this.a[c];
                        if(this.b[c] != -10)
                            h += this.b[c];
                        if(this.c[c] != -10)
                            i += this.c[c];
                    }
                    for(c = 0; c < 5; c++)
                        o[c] = false;
                    System.out.print('\u000C');
                }
                else {
                    System.out.println("\nTurn for "+ m +" to move.");
                    for(c = 0; c < 3 && a != 2; c++) {
                        if(c == 0) {
                            System.out.print("Enter any number to roll dice: ");
                            e = Long.parseLong(br.readLine());
                            for(d = 0; d < 5; d++)
                                this.f[d] = (int)(Math.random() * 6.0) + 1;
                            System.out.println("\nYour dice are as follows: ");
                            System.out.println("\t\t   DICE  1     DICE  2     DICE  3     DICE  4     DICE  5");
                            dice();
                            calculate(this.c);
                            System.out.println("\n\nYour possible score for now are as follows:");
                            for(a = 0; a < 11; a++) {
                                f = (char)((int)a + 65);
                                if(this.c[(int)a] == -10)
                                    System.out.print("\t"+ f);
                            }
                            System.out.print("\n");
                            for(a = 0; a < 11; a++)
                                if(this.c[(int)a] == -10)
                                    System.out.print("\t"+ this.e[(int)a]);
                        }
                        else {
                            System.out.println("\nChoose any one of the following:");
                            System.out.println("    1 - Roll dice");
                            System.out.println("    2 - Put markings");
                            System.out.print("\tEnter your choice: ");
                            a = Long.parseLong(br.readLine());
                            if(a != 1 && a != 2)
                                while(a != 1 && a != 2) {
                                    System.out.print("Choose among the given options: ");
                                    a = Long.parseLong(br.readLine());
                                }
                            if(a == 1) {
                                System.out.println("\nEnter the dice number that you want to stop rolling further.");
                                System.out.println("Re-enter the number to make the dice roll again.");
                                System.out.println("Enter \'6\' if you have finished and you want to roll the dice.");
                                while(true) {
                                    e = Long.parseLong(br.readLine());
                                    if(e != 1 && e != 2 && e != 3 && e != 4 && e != 5 && e != 6)
                                        while(e != 1 && e != 2 && e != 3 && e != 4 && e != 5 && e != 6) {
                                            System.out.print("Only numbers 1 to 6 is acceptable: ");
                                            e = Long.parseLong(br.readLine());
                                            continue;
                                        }
                                    else if(e == 6)
                                        break;
                                    else {
                                        if(o[(int)(e - 1)] == false)
                                            o[(int)(e - 1)] = true;
                                        else
                                            o[(int)(e - 1)] = false;
                                    }
                                }
                                for(d = 0; d < 5; d++)
                                    if(o[d] == false)
                                        this.f[d] = (int)(Math.random() * 6.0) + 1;
                                System.out.println("\nYour dice are as follows: ");
                                System.out.println("\t\t   DICE  1     DICE  2     DICE  3     DICE  4     DICE  5");
                                dice();
                                calculate(this.c);
                                System.out.println("\n\nYour possible score for now are as follows:");
                                for(a = 0; a < 11; a++) {
                                    f = (char)((int)a + 65);
                                    if(this.c[(int)a] == -10)
                                        System.out.print("\t"+ f);
                                }
                                System.out.print("\n");
                                for(a = 0; a < 11; a++)
                                    if(this.c[(int)a] == -10)
                                        System.out.print("\t"+ this.e[(int)a]);
                            }
                            else if(a == 2)
                                break;
                        }
                    }
                    System.out.print("\nEnter the character: ");
                    f = br.readLine().charAt(0);
                    while(true) {
                        if((f == 'A' || f == 'a') && this.c[0] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'B' || f == 'b') && this.c[1] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'C' || f == 'c') && this.c[2] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'D' || f == 'd') && this.c[3] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'E' || f == 'e') && this.c[4] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'F' || f == 'f') && this.c[5] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'G' || f == 'g') && this.c[6] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'H' || f == 'h') && this.c[7] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'I' || f == 'i') && this.c[8] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'J' || f == 'j') && this.c[9] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'K' || f == 'k') && this.c[10] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f < 65 || f > 75) && (f < 97 || f > 107))
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else
                            break;
                        f = br.readLine().charAt(0);
                    }
                    if(f == 'A' || f == 'a')
                        this.c[0] = this.e[0];
                    else if(f == 'B' || f == 'b')
                        this.c[1] = this.e[1];
                    else if(f == 'C' || f == 'c')
                        this.c[2] = this.e[2];
                    else if(f == 'D' || f == 'd')
                        this.c[3] = this.e[3];
                    else if(f == 'E' || f == 'e')
                        this.c[4] = this.e[4];
                    else if(f == 'F' || f == 'f')
                        this.c[5] = this.e[5];
                    else if(f == 'G' || f == 'g')
                        this.c[6] = this.e[6];
                    else if(f == 'H' || f == 'h')
                        this.c[7] = this.e[7];
                    else if(f == 'I' || f == 'i')
                        this.c[8] = this.e[8];
                    else if(f == 'J' || f == 'j')
                        this.c[9] = this.e[9];
                    else if(f == 'K' || f == 'k')
                        this.c[10] = this.e[10];
                    g = h = i = 0;
                    for(c = 0; c <= 10; c++) {
                        if(this.a[c] != -10)
                            g += this.a[c];
                        if(this.b[c] != -10)
                            h += this.b[c];
                        if(this.c[c] != -10)
                            i += this.c[c];
                    }
                    for(c = 0; c < 5; c++)
                        o[c] = false;
                    System.out.print('\u000C');
                }
            }
            System.out.println("\t\t\t\t\t\t             YAZY");
            System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("WINNER: ");
            if(g > h && g > i)
                System.out.println(k);
            else if(h > g && h > i)
                System.out.println(l);
            else if(i > g && i > h)
                System.out.println(m);
            else if(g == h && h > i)
                System.out.println(k +" and "+ l);
            else if(g == i && i > h)
                System.out.println(k +" and "+ m);
            else if(h == i && i > g)
                System.out.println(l +" and "+ m);
            else
                System.out.println(k +", "+ l +" and "+ m);
            System.out.println("\nPoints of "+ k +": "+ g);
            System.out.println("Points of "+ l +": "+ h);
            System.out.println("Points of "+ m +": "+ i);
            System.out.println("Enter any number to return back to the main menu: ");
            a = Long.parseLong(br.readLine());
            System.out.print('\u000C');
        }
        catch(Exception ex) {
            System.out.println("\nInvalid input!");
            System.out.println("Exception: "+ ex);
            System.out.print("Please restart the program to interact.");
        }
    }
    public void fourPlayers() {
        long a, e = 0;
        byte b, c, d;
        char f;
        try {
            g = h = i = j = 0;
            System.out.println("\t\t\t\t\t\t             YAZY");
            System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Enter the full name of player 1: ");
            k = br.readLine();
            System.out.print("Enter the full name of player 2: ");
            l = br.readLine();
            System.out.print("Enter the full name of player 3: ");
            m = br.readLine();
            System.out.print("Enter the full name of player 4: ");
            n = br.readLine();
            System.out.println("\n\tPLAYER 1:\t\t\tPLAYER 2:\t\t\tPLAYER 3:\t\t\tPLAYER 4:");
            System.out.println("\t"+ k +"\t\tVS\t"+ l +"\t\tVS\t"+ m +"\t\tVS\t"+ n);
            System.out.print("\nEnter any number to start: ");
            a = Long.parseLong(br.readLine());
            System.out.print('\u000C');
            for(b = 0; b < 44; b++) {
                System.out.println("\t\t\t\t\t\t             YAZY");
                System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("\t\t\t\t\t+-----------+------+------+------+------+");
                System.out.print("\t\t\t\t\t|     1     |");
                if(this.a[0] == -10)
                    System.out.print("      |");
                else if(this.a[0] < 10)
                    System.out.print("  0"+ this.a[0] +"  |");
                else
                    System.out.print("  "+ this.a[0] +"  |");
                if(this.b[0] == -10)
                    System.out.print("      |");
                else if(this.b[0] < 10)
                    System.out.print("  0"+ this.b[0] +"  |");
                else
                    System.out.print("  "+ this.b[0] +"  |");
                if(this.c[0] == -10)
                    System.out.print("      |");
                else if(this.c[0] < 10)
                    System.out.print("  0"+ this.c[0] +"  |");
                else
                    System.out.print("  "+ this.c[0] +"  |");
                if(this.d[0] == -10)
                    System.out.println("      |");
                else if(this.d[0] < 10)
                    System.out.println("  0"+ this.d[0] +"  |");
                else
                    System.out.println("  "+ this.d[0] +"  |");
                System.out.println("\t\t\t\t\t+-----------+------+------+------+------+");
                System.out.print("\t\t\t\t\t|     2     |");
                if(this.a[1] == -10)
                    System.out.print("      |");
                else if(this.a[1] < 10)
                    System.out.print("  0"+ this.a[1] +"  |");
                else
                    System.out.print("  "+ this.a[1] +"  |");
                if(this.b[1] == -10)
                    System.out.print("      |");
                else if(this.b[1] < 10)
                    System.out.print("  0"+ this.b[1] +"  |");
                else
                    System.out.print("  "+ this.b[1] +"  |");
                if(this.c[1] == -10)
                    System.out.print("      |");
                else if(this.c[1] < 10)
                    System.out.print("  0"+ this.c[1] +"  |");
                else
                    System.out.print("  "+ this.c[1] +"  |");
                if(this.d[1] == -10)
                    System.out.println("      |");
                else if(this.d[1] < 10)
                    System.out.println("  0"+ this.d[1] +"  |");
                else
                    System.out.println("  "+ this.d[1] +"  |");
                System.out.println("\t\t\t\t\t+-----------+------+------+------+------+");
                System.out.print("\t\t\t\t\t|     3     |");
                if(this.a[2] == -10)
                    System.out.print("      |");
                else if(this.a[2] < 10)
                    System.out.print("  0"+ this.a[2] +"  |");
                else
                    System.out.print("  "+ this.a[2] +"  |");
                if(this.b[2] == -10)
                    System.out.print("      |");
                else if(this.b[2] < 10)
                    System.out.print("  0"+ this.b[2] +"  |");
                else
                    System.out.print("  "+ this.b[2] +"  |");
                if(this.c[2] == -10)
                    System.out.print("      |");
                else if(this.c[2] < 10)
                    System.out.print("  0"+ this.c[2] +"  |");
                else
                    System.out.print("  "+ this.c[2] +"  |");
                if(this.d[2] == -10)
                    System.out.println("      |");
                else if(this.d[2] < 10)
                    System.out.println("  0"+ this.d[2] +"  |");
                else
                    System.out.println("  "+ this.d[2] +"  |");
                System.out.println("\t\t\t\t\t+-----------+------+------+------+------+");
                System.out.print("\t\t\t\t\t|     4     |");
                if(this.a[3] == -10)
                    System.out.print("      |");
                else if(this.a[3] < 10)
                    System.out.print("  0"+ this.a[3] +"  |");
                else
                    System.out.print("  "+ this.a[3] +"  |");
                if(this.b[3] == -10)
                    System.out.print("      |");
                else if(this.b[3] < 10)
                    System.out.print("  0"+ this.b[3] +"  |");
                else
                    System.out.print("  "+ this.b[3] +"  |");
                if(this.c[3] == -10)
                    System.out.print("      |");
                else if(this.c[3] < 10)
                    System.out.print("  0"+ this.c[3] +"  |");
                else
                    System.out.print("  "+ this.c[3] +"  |");
                if(this.d[3] == -10)
                    System.out.println("      |");
                else if(this.d[3] < 10)
                    System.out.println("  0"+ this.d[3] +"  |");
                else
                    System.out.println("  "+ this.d[3] +"  |");
                System.out.println("\t\t\t\t\t+-----------+------+------+------+------+");
                System.out.print("\t\t\t\t\t|     5     |");
                if(this.a[4] == -10)
                    System.out.print("      |");
                else if(this.a[4] < 10)
                    System.out.print("  0"+ this.a[4] +"  |");
                else
                    System.out.print("  "+ this.a[4] +"  |");
                if(this.b[4] == -10)
                    System.out.print("      |");
                else if(this.b[4] < 10)
                    System.out.print("  0"+ this.b[4] +"  |");
                else
                    System.out.print("  "+ this.b[4] +"  |");
                if(this.c[4] == -10)
                    System.out.print("      |");
                else if(this.c[4] < 10)
                    System.out.print("  0"+ this.c[4] +"  |");
                else
                    System.out.print("  "+ this.c[4] +"  |");
                if(this.d[4] == -10)
                    System.out.println("      |");
                else if(this.d[4] < 10)
                    System.out.println("  0"+ this.d[4] +"  |");
                else
                    System.out.println("  "+ this.d[4] +"  |");
                System.out.println("\t\t\t\t\t+-----------+------+------+------+------+");
                System.out.print("\t\t\t\t\t|     6     |");
                if(this.a[5] == -10)
                    System.out.print("      |");
                else if(this.a[5] < 10)
                    System.out.print("  0"+ this.a[5] +"  |");
                else
                    System.out.print("  "+ this.a[5] +"  |");
                if(this.b[5] == -10)
                    System.out.print("      |");
                else if(this.b[5] < 10)
                    System.out.print("  0"+ this.b[5] +"  |");
                else
                    System.out.print("  "+ this.b[5] +"  |");
                if(this.c[5] == -10)
                    System.out.print("      |");
                else if(this.c[5] < 10)
                    System.out.print("  0"+ this.c[5] +"  |");
                else
                    System.out.print("  "+ this.c[5] +"  |");
                if(this.d[5] == -10)
                    System.out.println("      |");
                else if(this.d[5] < 10)
                    System.out.println("  0"+ this.d[5] +"  |");
                else
                    System.out.println("  "+ this.d[5] +"  |");
                System.out.println("\t\t\t\t\t+-----------+------+------+------+------+");
                System.out.print("\t\t\t\t\t|   X X X   |");
                if(this.a[6] == -10)
                    System.out.print("      |");
                else if(this.a[6] < 10)
                    System.out.print("  0"+ this.a[6] +"  |");
                else
                    System.out.print("  "+ this.a[6] +"  |");
                if(this.b[6] == -10)
                    System.out.print("      |");
                else if(this.b[6] < 10)
                    System.out.print("  0"+ this.b[6] +"  |");
                else
                    System.out.print("  "+ this.b[6] +"  |");
                if(this.c[6] == -10)
                    System.out.print("      |");
                else if(this.c[6] < 10)
                    System.out.print("  0"+ this.c[6] +"  |");
                else
                    System.out.print("  "+ this.c[6] +"  |");
                if(this.d[6] == -10)
                    System.out.println("      |");
                else if(this.d[6] < 10)
                    System.out.println("  0"+ this.d[6] +"  |");
                else
                    System.out.println("  "+ this.d[6] +"  |");
                System.out.println("\t\t\t\t\t+-----------+------+------+------+------+");
                System.out.print("\t\t\t\t\t|  X X X X  |");
                if(this.a[7] == -10)
                    System.out.print("      |");
                else if(this.a[7] < 10)
                    System.out.print("  0"+ this.a[7] +"  |");
                else
                    System.out.print("  "+ this.a[7] +"  |");
                if(this.b[7] == -10)
                    System.out.print("      |");
                else if(this.b[7] < 10)
                    System.out.print("  0"+ this.b[7] +"  |");
                else
                    System.out.print("  "+ this.b[7] +"  |");
                if(this.c[7] == -10)
                    System.out.print("      |");
                else if(this.c[7] < 10)
                    System.out.print("  0"+ this.c[7] +"  |");
                else
                    System.out.print("  "+ this.c[7] +"  |");
                if(this.d[7] == -10)
                    System.out.println("      |");
                else if(this.d[7] < 10)
                    System.out.println("  0"+ this.d[7] +"  |");
                else
                    System.out.println("  "+ this.d[7] +"  |");
                System.out.println("\t\t\t\t\t+-----------+------+------+------+------+");
                System.out.print("\t\t\t\t\t| X X X O O |");
                if(this.a[8] == -10)
                    System.out.print("      |");
                else if(this.a[8] < 10)
                    System.out.print("  0"+ this.a[8] +"  |");
                else
                    System.out.print("  "+ this.a[8] +"  |");
                if(this.b[8] == -10)
                    System.out.print("      |");
                else if(this.b[8] < 10)
                    System.out.print("  0"+ this.b[8] +"  |");
                else
                    System.out.print("  "+ this.b[8] +"  |");
                if(this.c[8] == -10)
                    System.out.print("      |");
                else if(this.c[8] < 10)
                    System.out.print("  0"+ this.c[8] +"  |");
                else
                    System.out.print("  "+ this.c[8] +"  |");
                if(this.d[8] == -10)
                    System.out.println("      |");
                else if(this.d[8] < 10)
                    System.out.println("  0"+ this.d[8] +"  |");
                else
                    System.out.println("  "+ this.d[8] +"  |");
                System.out.println("\t\t\t\t\t+-----------+------+------+------+------+");
                System.out.print("\t\t\t\t\t| X O + * # |");
                if(this.a[9] == -10)
                    System.out.print("      |");
                else if(this.a[9] < 10)
                    System.out.print("  0"+ this.a[9] +"  |");
                else
                    System.out.print("  "+ this.a[9] +"  |");
                if(this.b[9] == -10)
                    System.out.print("      |");
                else if(this.b[9] < 10)
                    System.out.print("  0"+ this.b[9] +"  |");
                else
                    System.out.print("  "+ this.b[9] +"  |");
                if(this.c[9] == -10)
                    System.out.print("      |");
                else if(this.c[9] < 10)
                    System.out.print("  0"+ this.c[9] +"  |");
                else
                    System.out.print("  "+ this.c[9] +"  |");
                if(this.d[9] == -10)
                    System.out.println("      |");
                else if(this.d[9] < 10)
                    System.out.println("  0"+ this.d[9] +"  |");
                else
                    System.out.println("  "+ this.d[9] +"  |");
                System.out.println("\t\t\t\t\t+-----------+------+------+------+------+");
                System.out.print("\t\t\t\t\t| X X X X X |");
                if(this.a[10] == -10)
                    System.out.print("      |");
                else if(this.a[10] < 10)
                    System.out.print("  0"+ this.a[10] +"  |");
                else
                    System.out.print("  "+ this.a[10] +"  |");
                if(this.b[10] == -10)
                    System.out.print("      |");
                else if(this.b[10] < 10)
                    System.out.print("  0"+ this.b[10] +"  |");
                else
                    System.out.print("  "+ this.b[10] +"  |");
                if(this.c[10] == -10)
                    System.out.print("      |");
                else if(this.c[10] < 10)
                    System.out.print("  0"+ this.c[10] +"  |");
                else
                    System.out.print("  "+ this.c[10] +"  |");
                if(this.d[10] == -10)
                    System.out.println("      |");
                else if(this.d[10] < 10)
                    System.out.println("  0"+ this.d[10] +"  |");
                else
                    System.out.println("  "+ this.d[10] +"  |");
                System.out.println("\t\t\t\t\t+-----------+------+------+------+------+");
                System.out.print("\t\t\t\t\t|   TOTAL   |");
                if(g < 10)
                    System.out.print("  0"+ g +"  |");
                else if(g < 100)
                    System.out.print("  "+ g +"  |");
                else
                    System.out.print(" "+ g +"  |");
                if(h < 10)
                    System.out.print("  0"+ h +"  |");
                else if(h < 100)
                    System.out.print("  "+ h +"  |");
                else
                    System.out.print(" "+ h +"  |");
                if(i < 10)
                    System.out.print("  0"+ i +"  |");
                else if(i < 100)
                    System.out.print("  "+ i +"  |");
                else
                    System.out.print(" "+ i +"  |");
                if(j < 10)
                    System.out.println("  0"+ j +"  |");
                else if(j < 100)
                    System.out.println("  "+ j +"  |");
                else
                    System.out.println(" "+ j +"  |");
                System.out.println("\t\t\t\t\t+-----------+------+------+------+------+");
                a = 0;
                if(b % 4 == 0) {
                    System.out.println("\nTurn for "+ k +" to move.");
                    for(c = 0; c < 3 && a != 2; c++) {
                        if(c == 0) {
                            System.out.print("Enter any number to roll dice: ");
                            e = Long.parseLong(br.readLine());
                            for(d = 0; d < 5; d++)
                                this.f[d] = (int)(Math.random() * 6.0) + 1;
                            System.out.println("\nYour dice are as follows: ");
                            System.out.println("\t\t   DICE  1     DICE  2     DICE  3     DICE  4     DICE  5");
                            dice();
                            calculate(this.a);
                            System.out.println("\n\nYour possible score for now are as follows:");
                            for(a = 0; a < 11; a++) {
                                f = (char)((int)a + 65);
                                if(this.a[(int)a] == -10)
                                    System.out.print("\t"+ f);
                            }
                            System.out.print("\n");
                            for(a = 0; a < 11; a++)
                                if(this.a[(int)a] == -10)
                                    System.out.print("\t"+ this.e[(int)a]);
                        }
                        else {
                            System.out.println("\nChoose any one of the following:");
                            System.out.println("    1 - Roll dice");
                            System.out.println("    2 - Put markings");
                            System.out.print("\tEnter your choice: ");
                            a = Long.parseLong(br.readLine());
                            if(a != 1 && a != 2)
                                while(a != 1 && a != 2) {
                                    System.out.print("Choose among the given options: ");
                                    a = Long.parseLong(br.readLine());
                                }
                            if(a == 1) {
                                System.out.println("\nEnter the dice number that you want to stop rolling further.");
                                System.out.println("Re-enter the number to make the dice roll again.");
                                System.out.println("Enter \'6\' if you have finished and you want to roll the dice.");
                                while(true) {
                                    e = Long.parseLong(br.readLine());
                                    if(e != 1 && e != 2 && e != 3 && e != 4 && e != 5 && e != 6)
                                        while(e != 1 && e != 2 && e != 3 && e != 4 && e != 5 && e != 6) {
                                            System.out.print("Only numbers 1 to 6 is acceptable: ");
                                            e = Long.parseLong(br.readLine());
                                            continue;
                                        }
                                    else if(e == 6)
                                        break;
                                    else {
                                        if(o[(int)(e - 1)] == false)
                                            o[(int)(e - 1)] = true;
                                        else
                                            o[(int)(e - 1)] = false;
                                    }
                                }
                                for(d = 0; d < 5; d++)
                                    if(o[d] == false)
                                        this.f[d] = (int)(Math.random() * 6.0) + 1;
                                System.out.println("\nYour dice are as follows: ");
                                System.out.println("\t\t   DICE  1     DICE  2     DICE  3     DICE  4     DICE  5");
                                dice();
                                calculate(this.a);
                                System.out.println("\n\nYour possible score for now are as follows:");
                                for(a = 0; a < 11; a++) {
                                    f = (char)((int)a + 65);
                                    if(this.a[(int)a] == -10)
                                        System.out.print("\t"+ f);
                                }
                                System.out.print("\n");
                                for(a = 0; a < 11; a++)
                                    if(this.a[(int)a] == -10)
                                        System.out.print("\t"+ this.e[(int)a]);
                            }
                            else if(a == 2)
                                break;
                        }
                    }
                    System.out.print("\nEnter the character: ");
                    f = br.readLine().charAt(0);
                    while(true)
                    {
                        if((f == 'A' || f == 'a') && this.a[0] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'B' || f == 'b') && this.a[1] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'C' || f == 'c') && this.a[2] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'D' || f == 'd') && this.a[3] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'E' || f == 'e') && this.a[4] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'F' || f == 'f') && this.a[5] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'G' || f == 'g') && this.a[6] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'H' || f == 'h') && this.a[7] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'I' || f == 'i') && this.a[8] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'J' || f == 'j') && this.a[9] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'K' || f == 'k') && this.a[10] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f < 65 || f > 75) && (f < 97 || f > 107))
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else
                            break;
                        f = br.readLine().charAt(0);
                    }
                    if(f == 'A' || f == 'a')
                        this.a[0] = this.e[0];
                    else if(f == 'B' || f == 'b')
                        this.a[1] = this.e[1];
                    else if(f == 'C' || f == 'c')
                        this.a[2] = this.e[2];
                    else if(f == 'D' || f == 'd')
                        this.a[3] = this.e[3];
                    else if(f == 'E' || f == 'e')
                        this.a[4] = this.e[4];
                    else if(f == 'F' || f == 'f')
                        this.a[5] = this.e[5];
                    else if(f == 'G' || f == 'g')
                        this.a[6] = this.e[6];
                    else if(f == 'H' || f == 'h')
                        this.a[7] = this.e[7];
                    else if(f == 'I' || f == 'i')
                        this.a[8] = this.e[8];
                    else if(f == 'J' || f == 'j')
                        this.a[9] = this.e[9];
                    else if(f == 'K' || f == 'k')
                        this.a[10] = this.e[10];
                    g = h = i = j = 0;
                    for(c = 0; c <= 10; c++) {
                        if(this.a[c] != -10)
                            g += this.a[c];
                        if(this.b[c] != -10)
                            h += this.b[c];
                        if(this.c[c] != -10)
                            i += this.c[c];
                        if(this.d[c] != -10)
                            j += this.d[c];
                    }
                    for(c = 0; c < 5; c++)
                        o[c] = false;
                    System.out.print('\u000C');
                }
                else if(b % 4 == 1) {
                    System.out.println("\nTurn for "+ l +" to move.");
                    for(c = 0; c < 3 && a != 2; c++) {
                        if(c == 0) {
                            System.out.print("Enter any number to roll dice: ");
                            e = Long.parseLong(br.readLine());
                            for(d = 0; d < 5; d++)
                                this.f[d] = (int)(Math.random() * 6.0) + 1;
                            System.out.println("\nYour dice are as follows: ");
                            System.out.println("\t\t   DICE  1     DICE  2     DICE  3     DICE  4     DICE  5");
                            dice();
                            calculate(this.b);
                            System.out.println("\n\nYour possible score for now are as follows:");
                            for(a = 0; a < 11; a++) {
                                f = (char)((int)a + 65);
                                if(this.b[(int)a] == -10)
                                    System.out.print("\t"+ f);
                            }
                            System.out.print("\n");
                            for(a = 0; a < 11; a++)
                                if(this.b[(int)a] == -10)
                                    System.out.print("\t"+ this.e[(int)a]);
                        }
                        else {
                            System.out.println("\nChoose any one of the following:");
                            System.out.println("    1 - Roll dice");
                            System.out.println("    2 - Put markings");
                            System.out.print("\tEnter your choice: ");
                            a = Long.parseLong(br.readLine());
                            if(a != 1 && a != 2)
                                while(a != 1 && a != 2) {
                                    System.out.print("Choose among the given options: ");
                                    a = Long.parseLong(br.readLine());
                                }
                            if(a == 1) {
                                System.out.println("\nEnter the dice number that you want to stop rolling further.");
                                System.out.println("Re-enter the number to make the dice roll again.");
                                System.out.println("Enter \'6\' if you have finished and you want to roll the dice.");
                                while(true) {
                                    e = Long.parseLong(br.readLine());
                                    if(e != 1 && e != 2 && e != 3 && e != 4 && e != 5 && e != 6)
                                        while(e != 1 && e != 2 && e != 3 && e != 4 && e != 5 && e != 6) {
                                            System.out.print("Only numbers 1 to 6 is acceptable: ");
                                            e = Long.parseLong(br.readLine());
                                            continue;
                                        }
                                    else if(e == 6)
                                        break;
                                    else {
                                        if(o[(int)(e - 1)] == false)
                                            o[(int)(e - 1)] = true;
                                        else
                                            o[(int)(e - 1)] = false;
                                    }
                                }
                                for(d = 0; d < 5; d++)
                                    if(o[d] == false)
                                        this.f[d] = (int)(Math.random() * 6.0) + 1;
                                System.out.println("\nYour dice are as follows: ");
                                System.out.println("\t\t   DICE  1     DICE  2     DICE  3     DICE  4     DICE  5");
                                dice();
                                calculate(this.b);
                                System.out.println("\n\nYour possible score for now are as follows:");
                                for(a = 0; a < 11; a++) {
                                    f = (char)((int)a + 65);
                                    if(this.b[(int)a] == -10)
                                        System.out.print("\t"+ f);
                                }
                                System.out.print("\n");
                                for(a = 0; a < 11; a++)
                                    if(this.b[(int)a] == -10)
                                        System.out.print("\t"+ this.e[(int)a]);
                            }
                            else if(a == 2)
                                break;
                        }
                    }
                    System.out.print("\nEnter the character: ");
                    f = br.readLine().charAt(0);
                    while(true) {
                        if((f == 'A' || f == 'a') && this.b[0] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'B' || f == 'b') && this.b[1] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'C' || f == 'c') && this.b[2] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'D' || f == 'd') && this.b[3] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'E' || f == 'e') && this.b[4] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'F' || f == 'f') && this.b[5] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'G' || f == 'g') && this.b[6] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'H' || f == 'h') && this.b[7] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'I' || f == 'i') && this.b[8] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'J' || f == 'j') && this.b[9] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'K' || f == 'k') && this.b[10] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f < 65 || f > 75) && (f < 97 || f > 107))
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else
                            break;
                        f = br.readLine().charAt(0);
                    }
                    if(f == 'A' || f == 'a')
                        this.b[0] = this.e[0];
                    else if(f == 'B' || f == 'b')
                        this.b[1] = this.e[1];
                    else if(f == 'C' || f == 'c')
                        this.b[2] = this.e[2];
                    else if(f == 'D' || f == 'd')
                        this.b[3] = this.e[3];
                    else if(f == 'E' || f == 'e')
                        this.b[4] = this.e[4];
                    else if(f == 'F' || f == 'f')
                        this.b[5] = this.e[5];
                    else if(f == 'G' || f == 'g')
                        this.b[6] = this.e[6];
                    else if(f == 'H' || f == 'h')
                        this.b[7] = this.e[7];
                    else if(f == 'I' || f == 'i')
                        this.b[8] = this.e[8];
                    else if(f == 'J' || f == 'j')
                        this.b[9] = this.e[9];
                    else if(f == 'K' || f == 'k')
                        this.b[10] = this.e[10];
                    g = h = i = j = 0;
                    for(c = 0; c <= 10; c++) {
                        if(this.a[c] != -10)
                            g += this.a[c];
                        if(this.b[c] != -10)
                            h += this.b[c];
                        if(this.c[c] != -10)
                            i += this.c[c];
                        if(this.d[c] != -10)
                            j += this.d[c];
                    }
                    for(c = 0; c < 5; c++)
                        o[c] = false;
                    System.out.print('\u000C');
                }
                else if(b % 4 == 2) {
                    System.out.println("\nTurn for "+ m +" to move.");
                    for(c = 0; c < 3 && a != 2; c++) {
                        if(c == 0) {
                            System.out.print("Enter any number to roll dice: ");
                            e = Long.parseLong(br.readLine());
                            for(d = 0; d < 5; d++)
                                this.f[d] = (int)(Math.random() * 6.0) + 1;
                            System.out.println("\nYour dice are as follows: ");
                            System.out.println("\t\t   DICE  1     DICE  2     DICE  3     DICE  4     DICE  5");
                            dice();
                            calculate(this.c);
                            System.out.println("\n\nYour possible score for now are as follows:");
                            for(a = 0; a < 11; a++) {
                                f = (char)((int)a + 65);
                                if(this.c[(int)a] == -10)
                                    System.out.print("\t"+ f);
                            }
                            System.out.print("\n");
                            for(a = 0; a < 11; a++)
                                if(this.c[(int)a] == -10)
                                    System.out.print("\t"+ this.e[(int)a]);
                        }
                        else {
                            System.out.println("\nChoose any one of the following:");
                            System.out.println("    1 - Roll dice");
                            System.out.println("    2 - Put markings");
                            System.out.print("\tEnter your choice: ");
                            a = Long.parseLong(br.readLine());
                            if(a != 1 && a != 2)
                                while(a != 1 && a != 2) {
                                    System.out.print("Choose among the given options: ");
                                    a = Long.parseLong(br.readLine());
                                }
                            if(a == 1) {
                                System.out.println("\nEnter the dice number that you want to stop rolling further.");
                                System.out.println("Re-enter the number to make the dice roll again.");
                                System.out.println("Enter \'6\' if you have finished and you want to roll the dice.");
                                while(true) {
                                    e = Long.parseLong(br.readLine());
                                    if(e != 1 && e != 2 && e != 3 && e != 4 && e != 5 && e != 6)
                                        while(e != 1 && e != 2 && e != 3 && e != 4 && e != 5 && e != 6) {
                                            System.out.print("Only numbers 1 to 6 is acceptable: ");
                                            e = Long.parseLong(br.readLine());
                                            continue;
                                        }
                                    else if(e == 6)
                                        break;
                                    else {
                                        if(o[(int)(e - 1)] == false)
                                            o[(int)(e - 1)] = true;
                                        else
                                            o[(int)(e - 1)] = false;
                                    }
                                }
                                for(d = 0; d < 5; d++)
                                    if(o[d] == false)
                                        this.f[d] = (int)(Math.random() * 6.0) + 1;
                                System.out.println("\nYour dice are as follows: ");
                                System.out.println("\t\t   DICE  1     DICE  2     DICE  3     DICE  4     DICE  5");
                                dice();
                                calculate(this.c);
                                System.out.println("\n\nYour possible score for now are as follows:");
                                for(a = 0; a < 11; a++) {
                                    f = (char)((int)a + 65);
                                    if(this.c[(int)a] == -10)
                                        System.out.print("\t"+ f);
                                }
                                System.out.print("\n");
                                for(a = 0; a < 11; a++)
                                    if(this.c[(int)a] == -10)
                                        System.out.print("\t"+ this.e[(int)a]);
                            }
                            else if(a == 2)
                                break;
                        }
                    }
                    System.out.print("\nEnter the character: ");
                    f = br.readLine().charAt(0);
                    while(true) {
                        if((f == 'A' || f == 'a') && this.c[0] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'B' || f == 'b') && this.c[1] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'C' || f == 'c') && this.c[2] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'D' || f == 'd') && this.c[3] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'E' || f == 'e') && this.c[4] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'F' || f == 'f') && this.c[5] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'G' || f == 'g') && this.c[6] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'H' || f == 'h') && this.c[7] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'I' || f == 'i') && this.c[8] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'J' || f == 'j') && this.c[9] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'K' || f == 'k') && this.c[10] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f < 65 || f > 75) && (f < 97 || f > 107))
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else
                            break;
                        f = br.readLine().charAt(0);
                    }
                    if(f == 'A' || f == 'a')
                        this.c[0] = this.e[0];
                    else if(f == 'B' || f == 'b')
                        this.c[1] = this.e[1];
                    else if(f == 'C' || f == 'c')
                        this.c[2] = this.e[2];
                    else if(f == 'D' || f == 'd')
                        this.c[3] = this.e[3];
                    else if(f == 'E' || f == 'e')
                        this.c[4] = this.e[4];
                    else if(f == 'F' || f == 'f')
                        this.c[5] = this.e[5];
                    else if(f == 'G' || f == 'g')
                        this.c[6] = this.e[6];
                    else if(f == 'H' || f == 'h')
                        this.c[7] = this.e[7];
                    else if(f == 'I' || f == 'i')
                        this.c[8] = this.e[8];
                    else if(f == 'J' || f == 'j')
                        this.c[9] = this.e[9];
                    else if(f == 'K' || f == 'k')
                        this.c[10] = this.e[10];
                    g = h = i = j = 0;
                    for(c = 0; c <= 10; c++) {
                        if(this.a[c] != -10)
                            g += this.a[c];
                        if(this.b[c] != -10)
                            h += this.b[c];
                        if(this.c[c] != -10)
                            i += this.c[c];
                        if(this.d[c] != -10)
                            j += this.d[c];
                    }
                    for(c = 0; c < 5; c++)
                        o[c] = false;
                    System.out.print('\u000C');
                }
                else {
                    System.out.println("\nTurn for "+ n +" to move.");
                    for(c = 0; c < 3 && a != 2; c++) {
                        if(c == 0) {
                            System.out.print("Enter any number to roll dice: ");
                            e = Long.parseLong(br.readLine());
                            for(d = 0; d < 5; d++)
                                this.f[d] = (int)(Math.random() * 6.0) + 1;
                            System.out.println("\nYour dice are as follows: ");
                            System.out.println("\t\t   DICE  1     DICE  2     DICE  3     DICE  4     DICE  5");
                            dice();
                            calculate(this.d);
                            System.out.println("\n\nYour possible score for now are as follows:");
                            for(a = 0; a < 11; a++) {
                                f = (char)((int)a + 65);
                                if(this.d[(int)a] == -10)
                                    System.out.print("\t"+ f);
                            }
                            System.out.print("\n");
                            for(a = 0; a < 11; a++)
                                if(this.d[(int)a] == -10)
                                    System.out.print("\t"+ this.e[(int)a]);
                        }
                        else {
                            System.out.println("\nChoose any one of the following:");
                            System.out.println("    1 - Roll dice");
                            System.out.println("    2 - Put markings");
                            System.out.print("\tEnter your choice: ");
                            a = Long.parseLong(br.readLine());
                            if(a != 1 && a != 2)
                                while(a != 1 && a != 2) {
                                    System.out.print("Choose among the given options: ");
                                    a = Long.parseLong(br.readLine());
                                }
                            if(a == 1) {
                                System.out.println("\nEnter the dice number that you want to stop rolling further.");
                                System.out.println("Re-enter the number to make the dice roll again.");
                                System.out.println("Enter \'6\' if you have finished and you want to roll the dice.");
                                while(true) {
                                    e = Long.parseLong(br.readLine());
                                    if(e != 1 && e != 2 && e != 3 && e != 4 && e != 5 && e != 6)
                                        while(e != 1 && e != 2 && e != 3 && e != 4 && e != 5 && e != 6) {
                                            System.out.print("Only numbers 1 to 6 is acceptable: ");
                                            e = Long.parseLong(br.readLine());
                                            continue;
                                        }
                                    else if(e == 6)
                                        break;
                                    else {
                                        if(o[(int)(e - 1)] == false)
                                            o[(int)(e - 1)] = true;
                                        else
                                            o[(int)(e - 1)] = false;
                                    }
                                }
                                for(d = 0; d < 5; d++)
                                    if(o[d] == false)
                                        this.f[d] = (int)(Math.random() * 6.0) + 1;
                                System.out.println("\nYour dice are as follows: ");
                                System.out.println("\t\t   DICE  1     DICE  2     DICE  3     DICE  4     DICE  5");
                                dice();
                                calculate(this.d);
                                System.out.println("\n\nYour possible score for now are as follows:");
                                for(a = 0; a < 11; a++) {
                                    f = (char)((int)a + 65);
                                    if(this.d[(int)a] == -10)
                                        System.out.print("\t"+ f);
                                }
                                System.out.print("\n");
                                for(a = 0; a < 11; a++)
                                    if(this.d[(int)a] == -10)
                                        System.out.print("\t"+ this.e[(int)a]);
                            }
                            else if(a == 2)
                                break;
                        }
                    }
                    System.out.print("\nEnter the character: ");
                    f = br.readLine().charAt(0);
                    while(true) {
                        if((f == 'A' || f == 'a') && this.d[0] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'B' || f == 'b') && this.d[1] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'C' || f == 'c') && this.d[2] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'D' || f == 'd') && this.d[3] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'E' || f == 'e') && this.d[4] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'F' || f == 'f') && this.d[5] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'G' || f == 'g') && this.d[6] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'H' || f == 'h') && this.d[7] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'I' || f == 'i') && this.d[8] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'J' || f == 'j') && this.d[9] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'K' || f == 'k') && this.d[10] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f < 65 || f > 75) && (f < 97 || f > 107))
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else
                            break;
                        f = br.readLine().charAt(0);
                    }
                    if(f == 'A' || f == 'a')
                        this.d[0] = this.e[0];
                    else if(f == 'B' || f == 'b')
                        this.d[1] = this.e[1];
                    else if(f == 'C' || f == 'c')
                        this.d[2] = this.e[2];
                    else if(f == 'D' || f == 'd')
                        this.d[3] = this.e[3];
                    else if(f == 'E' || f == 'e')
                        this.d[4] = this.e[4];
                    else if(f == 'F' || f == 'f')
                        this.d[5] = this.e[5];
                    else if(f == 'G' || f == 'g')
                        this.d[6] = this.e[6];
                    else if(f == 'H' || f == 'h')
                        this.d[7] = this.e[7];
                    else if(f == 'I' || f == 'i')
                        this.d[8] = this.e[8];
                    else if(f == 'J' || f == 'j')
                        this.d[9] = this.e[9];
                    else if(f == 'K' || f == 'k')
                        this.d[10] = this.e[10];
                    g = h = i = j = 0;
                    for(c = 0; c <= 10; c++) {
                        if(this.a[c] != -10)
                            g += this.a[c];
                        if(this.b[c] != -10)
                            h += this.b[c];
                        if(this.c[c] != -10)
                            i += this.c[c];
                        if(this.d[c] != -10)
                            j += this.d[c];
                    }
                    for(c = 0; c < 5; c++)
                        o[c] = false;
                    System.out.print('\u000C');
                }
            }
            System.out.println("\t\t\t\t\t\t             YAZY");
            System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("WINNER: ");
            if(g > h && g > i && g > j)
                System.out.println(k);
            else if(h > g && h > i && h > j)
                System.out.println(l);
            else if(i > g && i > h && i > j)
                System.out.println(m);
            else if(j > g && j > h && j > i)
                System.out.println(n);
            else if(g == h && h > i && h > j)
                System.out.println(k +" and "+ l);
            else if(g == i && i > h && i > j)
                System.out.println(k +" and "+ m);
            else if(g == j && j > h && j > i)
                System.out.println(k +" and "+ n);
            else if(h == i && i > g && i > j)
                System.out.println(l +" and "+ m);
            else if(h == j && j > g && j > i)
                System.out.println(l +" and "+ n);
            else if(i == j && j > g && j > h)
                System.out.println(m +" and "+ n);
            else if(g == h && h == i && i > j)
                System.out.println(k +", "+ l +" and "+ m);
            else if(g == h && h == j && j > i)
                System.out.println(k +", "+ l +" and "+ n);
            else if(g == i && i == j && j > h)
                System.out.println(k +", "+ m +" and "+ n);
            else if(h == i && i == j && j > g)
                System.out.println(l +", "+ m +" and "+ n);
            else
                System.out.println(k +", "+ l +", "+ m +" and "+ n);
            System.out.println("\nPoints of "+ k +": "+ g);
            System.out.println("Points of "+ l +": "+ h);
            System.out.println("Points of "+ m +": "+ i);
            System.out.println("Points of "+ n +": "+ j);
            System.out.println("Enter any number to return back to the main menu: ");
            a = Long.parseLong(br.readLine());
            System.out.print('\u000C');
        }
        catch(Exception ex) {
            System.out.println("\nInvalid input!");
            System.out.println("Exception: "+ ex);
            System.out.print("Please restart the program to interact.");
        }
    }
    public void team() {
        long a, e = 0;
        byte b, c, d;
        char f;
        try {
            g = h = 0;
            System.out.println("\t\t\t\t\t\t             YAZY");
            System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Enter the full name of player 1 of team 1: ");
            k = br.readLine();
            System.out.print("Enter the full name of player 1 of team 2: ");
            l = br.readLine();
            System.out.print("Enter the full name of player 2 of team 1: ");
            m = br.readLine();
            System.out.print("Enter the full name of player 2 of team 2: ");
            n = br.readLine();
            System.out.println("\n\t\t\t\tTEAM 1:\t\t\t\t\tTEAM 2:");
            System.out.println("\t\t\t\t"+ k +"\t\tVS\t\t"+ l);
            System.out.println("\t\t\t\t"+ m +"\t\tVS\t\t"+ n);
            System.out.print("\nEnter any number to start: ");
            a = Long.parseLong(br.readLine());
            System.out.print('\u000C');
            for(b = 0; b < 44; b++) {
                System.out.println("\t\t\t\t\t\t             YAZY");
                System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("\t\t\t\t\t+-----------+------+------+------+------+");
                System.out.print("\t\t\t\t\t|     1     |");
                if(this.a[0] == -10)
                    System.out.print("      |");
                else if(this.a[0] < 10)
                    System.out.print("  0"+ this.a[0] +"  |");
                else
                    System.out.print("  "+ this.a[0] +"  |");
                if(this.c[0] == -10)
                    System.out.print("      |");
                else if(this.c[0] < 10)
                    System.out.print("  0"+ this.c[0] +"  |");
                else
                    System.out.print("  "+ this.c[0] +"  |");
                if(this.b[0] == -10)
                    System.out.print("      |");
                else if(this.b[0] < 10)
                    System.out.print("  0"+ this.b[0] +"  |");
                else
                    System.out.print("  "+ this.b[0] +"  |");
                if(this.d[0] == -10)
                    System.out.println("      |");
                else if(this.d[0] < 10)
                    System.out.println("  0"+ this.d[0] +"  |");
                else
                    System.out.println("  "+ this.d[0] +"  |");
                System.out.println("\t\t\t\t\t+-----------+------+------+------+------+");
                System.out.print("\t\t\t\t\t|     2     |");
                if(this.a[1] == -10)
                    System.out.print("      |");
                else if(this.a[1] < 10)
                    System.out.print("  0"+ this.a[1] +"  |");
                else
                    System.out.print("  "+ this.a[1] +"  |");
                if(this.c[1] == -10)
                    System.out.print("      |");
                else if(this.c[1] < 10)
                    System.out.print("  0"+ this.c[1] +"  |");
                else
                    System.out.print("  "+ this.c[1] +"  |");
                if(this.b[1] == -10)
                    System.out.print("      |");
                else if(this.b[1] < 10)
                    System.out.print("  0"+ this.b[1] +"  |");
                else
                    System.out.print("  "+ this.b[1] +"  |");
                if(this.d[1] == -10)
                    System.out.println("      |");
                else if(this.d[1] < 10)
                    System.out.println("  0"+ this.d[1] +"  |");
                else
                    System.out.println("  "+ this.d[1] +"  |");
                System.out.println("\t\t\t\t\t+-----------+------+------+------+------+");
                System.out.print("\t\t\t\t\t|     3     |");
                if(this.a[2] == -10)
                    System.out.print("      |");
                else if(this.a[2] < 10)
                    System.out.print("  0"+ this.a[2] +"  |");
                else
                    System.out.print("  "+ this.a[2] +"  |");
                if(this.c[2] == -10)
                    System.out.print("      |");
                else if(this.c[2] < 10)
                    System.out.print("  0"+ this.c[2] +"  |");
                else
                    System.out.print("  "+ this.c[2] +"  |");
                if(this.b[2] == -10)
                    System.out.print("      |");
                else if(this.b[2] < 10)
                    System.out.print("  0"+ this.b[2] +"  |");
                else
                    System.out.print("  "+ this.b[2] +"  |");
                if(this.d[2] == -10)
                    System.out.println("      |");
                else if(this.d[2] < 10)
                    System.out.println("  0"+ this.d[2] +"  |");
                else
                    System.out.println("  "+ this.d[2] +"  |");
                System.out.println("\t\t\t\t\t+-----------+------+------+------+------+");
                System.out.print("\t\t\t\t\t|     4     |");
                if(this.a[3] == -10)
                    System.out.print("      |");
                else if(this.a[3] < 10)
                    System.out.print("  0"+ this.a[3] +"  |");
                else
                    System.out.print("  "+ this.a[3] +"  |");
                if(this.c[3] == -10)
                    System.out.print("      |");
                else if(this.c[3] < 10)
                    System.out.print("  0"+ this.c[3] +"  |");
                else
                    System.out.print("  "+ this.c[3] +"  |");
                if(this.b[3] == -10)
                    System.out.print("      |");
                else if(this.b[3] < 10)
                    System.out.print("  0"+ this.b[3] +"  |");
                else
                    System.out.print("  "+ this.b[3] +"  |");
                if(this.d[3] == -10)
                    System.out.println("      |");
                else if(this.d[3] < 10)
                    System.out.println("  0"+ this.d[3] +"  |");
                else
                    System.out.println("  "+ this.d[3] +"  |");
                System.out.println("\t\t\t\t\t+-----------+------+------+------+------+");
                System.out.print("\t\t\t\t\t|     5     |");
                if(this.a[4] == -10)
                    System.out.print("      |");
                else if(this.a[4] < 10)
                    System.out.print("  0"+ this.a[4] +"  |");
                else
                    System.out.print("  "+ this.a[4] +"  |");
                if(this.c[4] == -10)
                    System.out.print("      |");
                else if(this.c[4] < 10)
                    System.out.print("  0"+ this.c[4] +"  |");
                else
                    System.out.print("  "+ this.c[4] +"  |");
                if(this.b[4] == -10)
                    System.out.print("      |");
                else if(this.b[4] < 10)
                    System.out.print("  0"+ this.b[4] +"  |");
                else
                    System.out.print("  "+ this.b[4] +"  |");
                if(this.d[4] == -10)
                    System.out.println("      |");
                else if(this.d[4] < 10)
                    System.out.println("  0"+ this.d[4] +"  |");
                else
                    System.out.println("  "+ this.d[4] +"  |");
                System.out.println("\t\t\t\t\t+-----------+------+------+------+------+");
                System.out.print("\t\t\t\t\t|     6     |");
                if(this.a[5] == -10)
                    System.out.print("      |");
                else if(this.a[5] < 10)
                    System.out.print("  0"+ this.a[5] +"  |");
                else
                    System.out.print("  "+ this.a[5] +"  |");
                if(this.c[5] == -10)
                    System.out.print("      |");
                else if(this.c[5] < 10)
                    System.out.print("  0"+ this.c[5] +"  |");
                else
                    System.out.print("  "+ this.c[5] +"  |");
                if(this.b[5] == -10)
                    System.out.print("      |");
                else if(this.b[5] < 10)
                    System.out.print("  0"+ this.b[5] +"  |");
                else
                    System.out.print("  "+ this.b[5] +"  |");
                if(this.d[5] == -10)
                    System.out.println("      |");
                else if(this.d[5] < 10)
                    System.out.println("  0"+ this.d[5] +"  |");
                else
                    System.out.println("  "+ this.d[5] +"  |");
                System.out.println("\t\t\t\t\t+-----------+------+------+------+------+");
                System.out.print("\t\t\t\t\t|   X X X   |");
                if(this.a[6] == -10)
                    System.out.print("      |");
                else if(this.a[6] < 10)
                    System.out.print("  0"+ this.a[6] +"  |");
                else
                    System.out.print("  "+ this.a[6] +"  |");
                if(this.c[6] == -10)
                    System.out.print("      |");
                else if(this.c[6] < 10)
                    System.out.print("  0"+ this.c[6] +"  |");
                else
                    System.out.print("  "+ this.c[6] +"  |");
                if(this.b[6] == -10)
                    System.out.print("      |");
                else if(this.b[6] < 10)
                    System.out.print("  0"+ this.b[6] +"  |");
                else
                    System.out.print("  "+ this.b[6] +"  |");
                if(this.d[6] == -10)
                    System.out.println("      |");
                else if(this.d[6] < 10)
                    System.out.println("  0"+ this.d[6] +"  |");
                else
                    System.out.println("  "+ this.d[6] +"  |");
                System.out.println("\t\t\t\t\t+-----------+------+------+------+------+");
                System.out.print("\t\t\t\t\t|  X X X X  |");
                if(this.a[7] == -10)
                    System.out.print("      |");
                else if(this.a[7] < 10)
                    System.out.print("  0"+ this.a[7] +"  |");
                else
                    System.out.print("  "+ this.a[7] +"  |");
                if(this.c[7] == -10)
                    System.out.print("      |");
                else if(this.c[7] < 10)
                    System.out.print("  0"+ this.c[7] +"  |");
                else
                    System.out.print("  "+ this.c[7] +"  |");
                if(this.b[7] == -10)
                    System.out.print("      |");
                else if(this.b[7] < 10)
                    System.out.print("  0"+ this.b[7] +"  |");
                else
                    System.out.print("  "+ this.b[7] +"  |");
                if(this.d[7] == -10)
                    System.out.println("      |");
                else if(this.d[7] < 10)
                    System.out.println("  0"+ this.d[7] +"  |");
                else
                    System.out.println("  "+ this.d[7] +"  |");
                System.out.println("\t\t\t\t\t+-----------+------+------+------+------+");
                System.out.print("\t\t\t\t\t| X X X O O |");
                if(this.a[8] == -10)
                    System.out.print("      |");
                else if(this.a[8] < 10)
                    System.out.print("  0"+ this.a[8] +"  |");
                else
                    System.out.print("  "+ this.a[8] +"  |");
                if(this.c[8] == -10)
                    System.out.print("      |");
                else if(this.c[8] < 10)
                    System.out.print("  0"+ this.c[8] +"  |");
                else
                    System.out.print("  "+ this.c[8] +"  |");
                if(this.b[8] == -10)
                    System.out.print("      |");
                else if(this.b[8] < 10)
                    System.out.print("  0"+ this.b[8] +"  |");
                else
                    System.out.print("  "+ this.b[8] +"  |");
                if(this.d[8] == -10)
                    System.out.println("      |");
                else if(this.d[8] < 10)
                    System.out.println("  0"+ this.d[8] +"  |");
                else
                    System.out.println("  "+ this.d[8] +"  |");
                System.out.println("\t\t\t\t\t+-----------+------+------+------+------+");
                System.out.print("\t\t\t\t\t| X O + * # |");
                if(this.a[9] == -10)
                    System.out.print("      |");
                else if(this.a[9] < 10)
                    System.out.print("  0"+ this.a[9] +"  |");
                else
                    System.out.print("  "+ this.a[9] +"  |");
                if(this.c[9] == -10)
                    System.out.print("      |");
                else if(this.c[9] < 10)
                    System.out.print("  0"+ this.c[9] +"  |");
                else
                    System.out.print("  "+ this.c[9] +"  |");
                if(this.b[9] == -10)
                    System.out.print("      |");
                else if(this.b[9] < 10)
                    System.out.print("  0"+ this.b[9] +"  |");
                else
                    System.out.print("  "+ this.b[9] +"  |");
                if(this.d[9] == -10)
                    System.out.println("      |");
                else if(this.d[9] < 10)
                    System.out.println("  0"+ this.d[9] +"  |");
                else
                    System.out.println("  "+ this.d[9] +"  |");
                System.out.println("\t\t\t\t\t+-----------+------+------+------+------+");
                System.out.print("\t\t\t\t\t| X X X X X |");
                if(this.a[10] == -10)
                    System.out.print("      |");
                else if(this.a[10] < 10)
                    System.out.print("  0"+ this.a[10] +"  |");
                else
                    System.out.print("  "+ this.a[10] +"  |");
                if(this.c[10] == -10)
                    System.out.print("      |");
                else if(this.c[10] < 10)
                    System.out.print("  0"+ this.c[10] +"  |");
                else
                    System.out.print("  "+ this.c[10] +"  |");
                if(this.b[10] == -10)
                    System.out.print("      |");
                else if(this.b[10] < 10)
                    System.out.print("  0"+ this.b[10] +"  |");
                else
                    System.out.print("  "+ this.b[10] +"  |");
                if(this.d[10] == -10)
                    System.out.println("      |");
                else if(this.d[10] < 10)
                    System.out.println("  0"+ this.d[10] +"  |");
                else
                    System.out.println("  "+ this.d[10] +"  |");
                System.out.println("\t\t\t\t\t+-----------+-------------+-------------+");
                System.out.print("\t\t\t\t\t|   TOTAL   |");
                if(g < 10)
                    System.out.print("     00"+ g +"     |");
                else if(g < 100)
                    System.out.print("     0"+ g +"     |");
                else
                    System.out.print("     "+ g +"     |");
                if(h < 10)
                    System.out.println("     00"+ h +"     |");
                else if(h < 100)
                    System.out.println("     0"+ h +"     |");
                else
                    System.out.println("     "+ h +"     |");
                System.out.println("\t\t\t\t\t+-----------+-------------+-------------+");
                a = 0;
                if(b % 4 == 0) {
                    System.out.println("\nTurn for "+ k +" to move.");
                    for(c = 0; c < 3 && a != 2; c++) {
                        if(c == 0) {
                            System.out.print("Enter any number to roll dice: ");
                            e = Long.parseLong(br.readLine());
                            for(d = 0; d < 5; d++)
                                this.f[d] = (int)(Math.random() * 6.0) + 1;
                            System.out.println("\nYour dice are as follows: ");
                            System.out.println("\t\t   DICE  1     DICE  2     DICE  3     DICE  4     DICE  5");
                            dice();
                            calculate(this.a);
                            System.out.println("\n\nYour possible score for now are as follows:");
                            for(a = 0; a < 11; a++) {
                                f = (char)((int)a + 65);
                                if(this.a[(int)a] == -10)
                                    System.out.print("\t"+ f);
                            }
                            System.out.print("\n");
                            for(a = 0; a < 11; a++)
                                if(this.a[(int)a] == -10)
                                    System.out.print("\t"+ this.e[(int)a]);
                        }
                        else {
                            System.out.println("\nChoose any one of the following:");
                            System.out.println("    1 - Roll dice");
                            System.out.println("    2 - Put markings");
                            System.out.print("\tEnter your choice: ");
                            a = Long.parseLong(br.readLine());
                            if(a != 1 && a != 2)
                                while(a != 1 && a != 2) {
                                    System.out.print("Choose among the given options: ");
                                    a = Long.parseLong(br.readLine());
                                }
                            if(a == 1) {
                                System.out.println("\nEnter the dice number that you want to stop rolling further.");
                                System.out.println("Re-enter the number to make the dice roll again.");
                                System.out.println("Enter \'6\' if you have finished and you want to roll the dice.");
                                while(true) {
                                    e = Long.parseLong(br.readLine());
                                    if(e != 1 && e != 2 && e != 3 && e != 4 && e != 5 && e != 6)
                                        while(e != 1 && e != 2 && e != 3 && e != 4 && e != 5 && e != 6) {
                                            System.out.print("Only numbers 1 to 6 is acceptable: ");
                                            e = Long.parseLong(br.readLine());
                                            continue;
                                        }
                                    else if(e == 6)
                                        break;
                                    else {
                                        if(o[(int)(e - 1)] == false)
                                            o[(int)(e - 1)] = true;
                                        else
                                            o[(int)(e - 1)] = false;
                                    }
                                }
                                for(d = 0; d < 5; d++)
                                    if(o[d] == false)
                                        this.f[d] = (int)(Math.random() * 6.0) + 1;
                                System.out.println("\nYour dice are as follows: ");
                                System.out.println("\t\t   DICE  1     DICE  2     DICE  3     DICE  4     DICE  5");
                                dice();
                                calculate(this.a);
                                System.out.println("\n\nYour possible score for now are as follows:");
                                for(a = 0; a < 11; a++) {
                                    f = (char)((int)a + 65);
                                    if(this.a[(int)a] == -10)
                                        System.out.print("\t"+ f);
                                }
                                System.out.print("\n");
                                for(a = 0; a < 11; a++)
                                    if(this.a[(int)a] == -10)
                                        System.out.print("\t"+ this.e[(int)a]);
                            }
                            else if(a == 2)
                                break;
                        }
                    }
                    System.out.print("\nEnter the character: ");
                    f = br.readLine().charAt(0);
                    while(true) {
                        if((f == 'A' || f == 'a') && this.a[0] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'B' || f == 'b') && this.a[1] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'C' || f == 'c') && this.a[2] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'D' || f == 'd') && this.a[3] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'E' || f == 'e') && this.a[4] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'F' || f == 'f') && this.a[5] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'G' || f == 'g') && this.a[6] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'H' || f == 'h') && this.a[7] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'I' || f == 'i') && this.a[8] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'J' || f == 'j') && this.a[9] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'K' || f == 'k') && this.a[10] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f < 65 || f > 75) && (f < 97 || f > 107))
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else
                            break;
                        f = br.readLine().charAt(0);
                    }
                    if(f == 'A' || f == 'a')
                        this.a[0] = this.e[0];
                    else if(f == 'B' || f == 'b')
                        this.a[1] = this.e[1];
                    else if(f == 'C' || f == 'c')
                        this.a[2] = this.e[2];
                    else if(f == 'D' || f == 'd')
                        this.a[3] = this.e[3];
                    else if(f == 'E' || f == 'e')
                        this.a[4] = this.e[4];
                    else if(f == 'F' || f == 'f')
                        this.a[5] = this.e[5];
                    else if(f == 'G' || f == 'g')
                        this.a[6] = this.e[6];
                    else if(f == 'H' || f == 'h')
                        this.a[7] = this.e[7];
                    else if(f == 'I' || f == 'i')
                        this.a[8] = this.e[8];
                    else if(f == 'J' || f == 'j')
                        this.a[9] = this.e[9];
                    else if(f == 'K' || f == 'k')
                        this.a[10] = this.e[10];
                    g = h = 0;
                    for(c = 0; c <= 10; c++) {
                        if(this.a[c] != -10)
                            g += this.a[c];
                        if(this.b[c] != -10)
                            h += this.b[c];
                        if(this.c[c] != -10)
                            g += this.c[c];
                        if(this.d[c] != -10)
                            h += this.d[c];
                    }
                    for(c = 0; c < 5; c++)
                        o[c] = false;
                    System.out.print('\u000C');
                }
                else if(b % 4 == 1) {
                    System.out.println("\nTurn for "+ l +" to move.");
                    for(c = 0; c < 3 && a != 2; c++) {
                        if(c == 0) {
                            System.out.print("Enter any number to roll dice: ");
                            e = Long.parseLong(br.readLine());
                            for(d = 0; d < 5; d++)
                                this.f[d] = (int)(Math.random() * 6.0) + 1;
                            System.out.println("\nYour dice are as follows: ");
                            System.out.println("\t\t   DICE  1     DICE  2     DICE  3     DICE  4     DICE  5");
                            dice();
                            calculate(this.b);
                            System.out.println("\n\nYour possible score for now are as follows:");
                            for(a = 0; a < 11; a++) {
                                f = (char)((int)a + 65);
                                if(this.b[(int)a] == -10)
                                    System.out.print("\t"+ f);
                            }
                            System.out.print("\n");
                            for(a = 0; a < 11; a++)
                                if(this.b[(int)a] == -10)
                                    System.out.print("\t"+ this.e[(int)a]);
                        }
                        else {
                            System.out.println("\nChoose any one of the following:");
                            System.out.println("    1 - Roll dice");
                            System.out.println("    2 - Put markings");
                            System.out.print("\tEnter your choice: ");
                            a = Long.parseLong(br.readLine());
                            if(a != 1 && a != 2)
                                while(a != 1 && a != 2) {
                                    System.out.print("Choose among the given options: ");
                                    a = Long.parseLong(br.readLine());
                                }
                            if(a == 1) {
                                System.out.println("\nEnter the dice number that you want to stop rolling further.");
                                System.out.println("Re-enter the number to make the dice roll again.");
                                System.out.println("Enter \'6\' if you have finished and you want to roll the dice.");
                                while(true) {
                                    e = Long.parseLong(br.readLine());
                                    if(e != 1 && e != 2 && e != 3 && e != 4 && e != 5 && e != 6)
                                        while(e != 1 && e != 2 && e != 3 && e != 4 && e != 5 && e != 6) {
                                            System.out.print("Only numbers 1 to 6 is acceptable: ");
                                            e = Long.parseLong(br.readLine());
                                            continue;
                                        }
                                    else if(e == 6)
                                        break;
                                    else {
                                        if(o[(int)(e - 1)] == false)
                                            o[(int)(e - 1)] = true;
                                        else
                                            o[(int)(e - 1)] = false;
                                    }
                                }
                                for(d = 0; d < 5; d++)
                                    if(o[d] == false)
                                        this.f[d] = (int)(Math.random() * 6.0) + 1;
                                System.out.println("\nYour dice are as follows: ");
                                System.out.println("\t\t   DICE  1     DICE  2     DICE  3     DICE  4     DICE  5");
                                dice();
                                calculate(this.b);
                                System.out.println("\n\nYour possible score for now are as follows:");
                                for(a = 0; a < 11; a++) {
                                    f = (char)((int)a + 65);
                                    if(this.b[(int)a] == -10)
                                        System.out.print("\t"+ f);
                                }
                                System.out.print("\n");
                                for(a = 0; a < 11; a++)
                                    if(this.b[(int)a] == -10)
                                        System.out.print("\t"+ this.e[(int)a]);
                            }
                            else if(a == 2)
                                break;
                        }
                    }
                    System.out.print("\nEnter the character: ");
                    f = br.readLine().charAt(0);
                    while(true) {
                        if((f == 'A' || f == 'a') && this.b[0] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'B' || f == 'b') && this.b[1] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'C' || f == 'c') && this.b[2] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'D' || f == 'd') && this.b[3] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'E' || f == 'e') && this.b[4] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'F' || f == 'f') && this.b[5] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'G' || f == 'g') && this.b[6] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'H' || f == 'h') && this.b[7] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'I' || f == 'i') && this.b[8] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'J' || f == 'j') && this.b[9] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'K' || f == 'k') && this.b[10] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f < 65 || f > 75) && (f < 97 || f > 107))
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else
                            break;
                        f = br.readLine().charAt(0);
                    }
                    if(f == 'A' || f == 'a')
                        this.b[0] = this.e[0];
                    else if(f == 'B' || f == 'b')
                        this.b[1] = this.e[1];
                    else if(f == 'C' || f == 'c')
                        this.b[2] = this.e[2];
                    else if(f == 'D' || f == 'd')
                        this.b[3] = this.e[3];
                    else if(f == 'E' || f == 'e')
                        this.b[4] = this.e[4];
                    else if(f == 'F' || f == 'f')
                        this.b[5] = this.e[5];
                    else if(f == 'G' || f == 'g')
                        this.b[6] = this.e[6];
                    else if(f == 'H' || f == 'h')
                        this.b[7] = this.e[7];
                    else if(f == 'I' || f == 'i')
                        this.b[8] = this.e[8];
                    else if(f == 'J' || f == 'j')
                        this.b[9] = this.e[9];
                    else if(f == 'K' || f == 'k')
                        this.b[10] = this.e[10];
                    g = h = 0;
                    for(c = 0; c <= 10; c++) {
                        if(this.a[c] != -10)
                            g += this.a[c];
                        if(this.b[c] != -10)
                            h += this.b[c];
                        if(this.c[c] != -10)
                            g += this.c[c];
                        if(this.d[c] != -10)
                            h += this.d[c];
                    }
                    for(c = 0; c < 5; c++)
                        o[c] = false;
                    System.out.print('\u000C');
                }
                else if(b % 4 == 2) {
                    System.out.println("\nTurn for "+ m +" to move.");
                    for(c = 0; c < 3 && a != 2; c++) {
                        if(c == 0) {
                            System.out.print("Enter any number to roll dice: ");
                            e = Long.parseLong(br.readLine());
                            for(d = 0; d < 5; d++)
                                this.f[d] = (int)(Math.random() * 6.0) + 1;
                            System.out.println("\nYour dice are as follows: ");
                            System.out.println("\t\t   DICE  1     DICE  2     DICE  3     DICE  4     DICE  5");
                            dice();
                            calculate(this.c);
                            System.out.println("\n\nYour possible score for now are as follows:");
                            for(a = 0; a < 11; a++) {
                                f = (char)((int)a + 65);
                                if(this.c[(int)a] == -10)
                                    System.out.print("\t"+ f);
                            }
                            System.out.print("\n");
                            for(a = 0; a < 11; a++)
                                if(this.c[(int)a] == -10)
                                    System.out.print("\t"+ this.e[(int)a]);
                        }
                        else {
                            System.out.println("\nChoose any one of the following:");
                            System.out.println("    1 - Roll dice");
                            System.out.println("    2 - Put markings");
                            System.out.print("\tEnter your choice: ");
                            a = Long.parseLong(br.readLine());
                            if(a != 1 && a != 2)
                                while(a != 1 && a != 2) {
                                    System.out.print("Choose among the given options: ");
                                    a = Long.parseLong(br.readLine());
                                }
                            if(a == 1) {
                                System.out.println("\nEnter the dice number that you want to stop rolling further.");
                                System.out.println("Re-enter the number to make the dice roll again.");
                                System.out.println("Enter \'6\' if you have finished and you want to roll the dice.");
                                while(true) {
                                    e = Long.parseLong(br.readLine());
                                    if(e != 1 && e != 2 && e != 3 && e != 4 && e != 5 && e != 6)
                                        while(e != 1 && e != 2 && e != 3 && e != 4 && e != 5 && e != 6) {
                                            System.out.print("Only numbers 1 to 6 is acceptable: ");
                                            e = Long.parseLong(br.readLine());
                                            continue;
                                        }
                                    else if(e == 6)
                                        break;
                                    else {
                                        if(o[(int)(e - 1)] == false)
                                            o[(int)(e - 1)] = true;
                                        else
                                            o[(int)(e - 1)] = false;
                                    }
                                }
                                for(d = 0; d < 5; d++)
                                    if(o[d] == false)
                                        this.f[d] = (int)(Math.random() * 6.0) + 1;
                                System.out.println("\nYour dice are as follows: ");
                                System.out.println("\t\t   DICE  1     DICE  2     DICE  3     DICE  4     DICE  5");
                                dice();
                                calculate(this.c);
                                System.out.println("\n\nYour possible score for now are as follows:");
                                for(a = 0; a < 11; a++) {
                                    f = (char)((int)a + 65);
                                    if(this.c[(int)a] == -10)
                                        System.out.print("\t"+ f);
                                }
                                System.out.print("\n");
                                for(a = 0; a < 11; a++)
                                    if(this.c[(int)a] == -10)
                                        System.out.print("\t"+ this.e[(int)a]);
                            }
                            else if(a == 2)
                                break;
                        }
                    }
                    System.out.print("\nEnter the character: ");
                    f = br.readLine().charAt(0);
                    while(true) {
                        if((f == 'A' || f == 'a') && this.c[0] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'B' || f == 'b') && this.c[1] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'C' || f == 'c') && this.c[2] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'D' || f == 'd') && this.c[3] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'E' || f == 'e') && this.c[4] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'F' || f == 'f') && this.c[5] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'G' || f == 'g') && this.c[6] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'H' || f == 'h') && this.c[7] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'I' || f == 'i') && this.c[8] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'J' || f == 'j') && this.c[9] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'K' || f == 'k') && this.c[10] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f < 65 || f > 75) && (f < 97 || f > 107))
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else
                            break;
                        f = br.readLine().charAt(0);
                    }
                    if(f == 'A' || f == 'a')
                        this.c[0] = this.e[0];
                    else if(f == 'B' || f == 'b')
                        this.c[1] = this.e[1];
                    else if(f == 'C' || f == 'c')
                        this.c[2] = this.e[2];
                    else if(f == 'D' || f == 'd')
                        this.c[3] = this.e[3];
                    else if(f == 'E' || f == 'e')
                        this.c[4] = this.e[4];
                    else if(f == 'F' || f == 'f')
                        this.c[5] = this.e[5];
                    else if(f == 'G' || f == 'g')
                        this.c[6] = this.e[6];
                    else if(f == 'H' || f == 'h')
                        this.c[7] = this.e[7];
                    else if(f == 'I' || f == 'i')
                        this.c[8] = this.e[8];
                    else if(f == 'J' || f == 'j')
                        this.c[9] = this.e[9];
                    else if(f == 'K' || f == 'k')
                        this.c[10] = this.e[10];
                    g = h = 0;
                    for(c = 0; c <= 10; c++) {
                        if(this.a[c] != -10)
                            g += this.a[c];
                        if(this.b[c] != -10)
                            h += this.b[c];
                        if(this.c[c] != -10)
                            g += this.c[c];
                        if(this.d[c] != -10)
                            h += this.d[c];
                    }
                    for(c = 0; c < 5; c++)
                        o[c] = false;
                    System.out.print('\u000C');
                }
                else {
                    System.out.println("\nTurn for "+ n +" to move.");
                    for(c = 0; c < 3 && a != 2; c++) {
                        if(c == 0) {
                            System.out.print("Enter any number to roll dice: ");
                            e = Long.parseLong(br.readLine());
                            for(d = 0; d < 5; d++)
                                this.f[d] = (int)(Math.random() * 6.0) + 1;
                            System.out.println("\nYour dice are as follows: ");
                            System.out.println("\t\t   DICE  1     DICE  2     DICE  3     DICE  4     DICE  5");
                            dice();
                            calculate(this.d);
                            System.out.println("\n\nYour possible score for now are as follows:");
                            for(a = 0; a < 11; a++) {
                                f = (char)((int)a + 65);
                                if(this.d[(int)a] == -10)
                                    System.out.print("\t"+ f);
                            }
                            System.out.print("\n");
                            for(a = 0; a < 11; a++)
                                if(this.d[(int)a] == -10)
                                    System.out.print("\t"+ this.e[(int)a]);
                        }
                        else {
                            System.out.println("\nChoose any one of the following:");
                            System.out.println("    1 - Roll dice");
                            System.out.println("    2 - Put markings");
                            System.out.print("\tEnter your choice: ");
                            a = Long.parseLong(br.readLine());
                            if(a != 1 && a != 2)
                                while(a != 1 && a != 2) {
                                    System.out.print("Choose among the given options: ");
                                    a = Long.parseLong(br.readLine());
                                }
                            if(a == 1) {
                                System.out.println("\nEnter the dice number that you want to stop rolling further.");
                                System.out.println("Re-enter the number to make the dice roll again.");
                                System.out.println("Enter \'6\' if you have finished and you want to roll the dice.");
                                while(true) {
                                    e = Long.parseLong(br.readLine());
                                    if(e != 1 && e != 2 && e != 3 && e != 4 && e != 5 && e != 6)
                                        while(e != 1 && e != 2 && e != 3 && e != 4 && e != 5 && e != 6) {
                                            System.out.print("Only numbers 1 to 6 is acceptable: ");
                                            e = Long.parseLong(br.readLine());
                                            continue;
                                        }
                                    else if(e == 6)
                                        break;
                                    else {
                                        if(o[(int)(e - 1)] == false)
                                            o[(int)(e - 1)] = true;
                                        else
                                            o[(int)(e - 1)] = false;
                                    }
                                }
                                for(d = 0; d < 5; d++)
                                    if(o[d] == false)
                                        this.f[d] = (int)(Math.random() * 6.0) + 1;
                                System.out.println("\nYour dice are as follows: ");
                                System.out.println("\t\t   DICE  1     DICE  2     DICE  3     DICE  4     DICE  5");
                                dice();
                                calculate(this.d);
                                System.out.println("\n\nYour possible score for now are as follows:");
                                for(a = 0; a < 11; a++) {
                                    f = (char)((int)a + 65);
                                    if(this.d[(int)a] == -10)
                                        System.out.print("\t"+ f);
                                }
                                System.out.print("\n");
                                for(a = 0; a < 11; a++)
                                    if(this.d[(int)a] == -10)
                                        System.out.print("\t"+ this.e[(int)a]);
                            }
                            else if(a == 2)
                                break;
                        }
                    }
                    System.out.print("\nEnter the character: ");
                    f = br.readLine().charAt(0);
                    while(true) {
                        if((f == 'A' || f == 'a') && this.d[0] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'B' || f == 'b') && this.d[1] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'C' || f == 'c') && this.d[2] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'D' || f == 'd') && this.d[3] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'E' || f == 'e') && this.d[4] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'F' || f == 'f') && this.d[5] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'G' || f == 'g') && this.d[6] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'H' || f == 'h') && this.d[7] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'I' || f == 'i') && this.d[8] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'J' || f == 'j') && this.d[9] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f == 'K' || f == 'k') && this.d[10] != -10)
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else if((f < 65 || f > 75) && (f < 97 || f > 107))
                            System.out.print("You are supposed to enter any character among the given options: ");
                        else
                            break;
                        f = br.readLine().charAt(0);
                    }
                    if(f == 'A' || f == 'a')
                        this.d[0] = this.e[0];
                    else if(f == 'B' || f == 'b')
                        this.d[1] = this.e[1];
                    else if(f == 'C' || f == 'c')
                        this.d[2] = this.e[2];
                    else if(f == 'D' || f == 'd')
                        this.d[3] = this.e[3];
                    else if(f == 'E' || f == 'e')
                        this.d[4] = this.e[4];
                    else if(f == 'F' || f == 'f')
                        this.d[5] = this.e[5];
                    else if(f == 'G' || f == 'g')
                        this.d[6] = this.e[6];
                    else if(f == 'H' || f == 'h')
                        this.d[7] = this.e[7];
                    else if(f == 'I' || f == 'i')
                        this.d[8] = this.e[8];
                    else if(f == 'J' || f == 'j')
                        this.d[9] = this.e[9];
                    else if(f == 'K' || f == 'k')
                        this.d[10] = this.e[10];
                    g = h = 0;
                    for(c = 0; c <= 10; c++) {
                        if(this.a[c] != -10)
                            g += this.a[c];
                        if(this.b[c] != -10)
                            h += this.b[c];
                        if(this.c[c] != -10)
                            g += this.c[c];
                        if(this.d[c] != -10)
                            h += this.d[c];
                    }
                    for(c = 0; c < 5; c++)
                        o[c] = false;
                    System.out.print('\u000C');
                }
            }
            System.out.println("\t\t\t\t\t\t             YAZY");
            System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("WINNER: ");
            if(g > h)
                System.out.println(k +" and "+ m);
            else if(h > g)
                System.out.println(l +" and "+ n);
            else
                System.out.println(k +", "+ m +", "+ l +" and "+ n);
            System.out.println("\nPoints of "+ k +" and "+ m +": "+ g);
            System.out.println("Points of "+ l +" and "+ n +": "+ h);
            System.out.println("Enter any number to return back to the main menu: ");
            a = Long.parseLong(br.readLine());
            System.out.print('\u000C');
        }
        catch(Exception ex) {
            System.out.println("\nInvalid input!");
            System.out.println("Exception: "+ ex);
            System.out.print("Please restart the program to interact.");
        }
    }
    public static void display()throws IOException, InterruptedException {
        YazyInstructions yzi = new YazyInstructions();
        Yazy yz = new Yazy();
        yzi.display();
        yz.game();
    }
    public void instructions()throws IOException {
        YazyInstructions yzi = new YazyInstructions();
        yzi.instructions();
        game();
    }
    public void game()throws IOException {
        long a;
        try {
            System.out.println("\t\t\t\t\t\t             YAZY");
            System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Select a game mode:");
            System.out.println("    1 - Single-player (against computer)");
            System.out.println("    2 - Multi-player (require atleast 2 people)");
            System.out.println("    3 - Team-player (require four people)");
            System.out.println("    4 - Read instructions again");
            System.out.println("    5 - Exit");
            System.out.print("\tEnter your choice: ");
            a = Long.parseLong(br.readLine());
            if(a != 1 && a != 2 && a != 3 && a != 4 && a != 5)
                while(a != 1 && a != 2 && a != 3 && a != 4 && a != 5) {
                    System.out.println("\nChoose among the options mentioned above.");
                    System.out.print("Enter your choice: ");
                    a = Long.parseLong(br.readLine());
                }
            System.out.print('\u000C');
            if(a == 1)
                computer();
            else if(a == 2) {
                System.out.println("\t\t\t\t\t\t             YAZY");
                System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Choose the total number of players:");
                System.out.println("    1 - Two players");
                System.out.println("    2 - Three players");
                System.out.println("    3 - Four players");
                System.out.println("    4 - Back");
                System.out.print("\tEnter your choice: ");
                a = Long.parseLong(br.readLine());
                if(a != 1 && a != 2 && a != 3 && a != 4)
                    while(a != 1 && a != 2 && a != 3 && a != 4) {
                        System.out.println("\nChoose among the options mentioned above.");
                        System.out.print("Enter your choice: ");
                        a = Long.parseLong(br.readLine());
                    }
                System.out.print('\u000C');
                if(a == 1)
                    twoPlayers();
                else if(a == 2)
                    threePlayers();
                else if(a == 3)
                    fourPlayers();
                else
                    game();
            }
            else if(a == 3)
                team();
            else if(a == 4)
                instructions();
            else
                System.exit(0);
        }
        catch(Exception ex) {
            System.out.println("\nAn error ocured!");
            System.out.println("Exception: "+ ex);
            System.out.println("Please restart the program to interact.");
        }
    }
}