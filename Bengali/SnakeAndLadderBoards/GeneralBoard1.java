/*
 *             +--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+
 *             |        |        | S      |        |        |        |        |        | S    +-+-->     |
 *             |  100 +-+-> 99   | | 98   |   97   |   96   |   95   |   94   |   93   | | 92 | |   91   |
 *             +------+-+--------+-+------+--------+--------+--------+--------+--------+-+----+-+--------+
 *             |      | |        | |      |     <--+--------+--------+--------+-+      | |    | |        |
 *             |   81 | |   82   | | 83   |   84   |   85   |   86   | S 87   | | 88   | | 89 | |   90   |
 *             +------+-+--------+-+------+--------+--------+--------+-+------+-+------+-+----+-+--------+
 *             |      L |     <--+-+      |        |        |        | |      | |   <--+-+    L |        |
 *             |   80   |   79   |   78   |   77   |   76   |   75   | | 74   | | 73   |   72   |   71   |
 *             +--------+--------+--------+--------+--------+--------+-+------+-+------+--------+--------+
 *             |        |      S |        | S      |        |        | |   <--+-|------+--------|-+      |
 *             |   61   |   62 | |   63   | | 64   |   65   |   66   | | 67   | | 68   |   69   | | 70   |
 *             +--------+------+-+--------+-+------+--------+--------+-+------+-+------+--------+-+------+
 *             |     <--+------|-+--------+-+      |        |        | |    S | |      |        | L      |
 *             |   60   |   59 | |   58   |   57   |   56   |   55   | | 54 | | | 53   |   52   |   51   |
 *             +--------+------+-+--------+--------+--------+--------+-+----+-+-+------+--------+--------+
 *             |      +-+-->   | |        |        |        |        | |    | | |      |        |        |
 *             |   41 | |   42 | |   43   |   44   |   45   |   46   | | 47 | | | 48   |   49   |   50   |
 *             +------+-+------+-+--------+--------+--------+--------+-+----+-+-+------+--------+--------+
 *             |      | |      | |        |        |     <--+--------+-+    | | |      |      +-+-->     |
 *             |   40 | |   39 | |   38   |   37   |   36   |   35   |   34 V | | 33   |   32 | |   31   |
 *             +------+-+------+-+--------+--------+--------+--------+--------+-+------+------+-+--------+
 *             |      L |      | |        |        |        |        |        | L      |      | |        |
 *             |   21   |   22 | |   23   |   24   |   25   |   26   |   27   |   28   |   29 | |   30   |
 *             +--------+------+-+--------+--------+--------+--------+--------+--------+------+-+--------+
 *             |        |      | |        | +------+--------+--------+-->     |        |      | |        |
 *             |   20   |   19 V |   18   | | 17 S |   16   |   15   |   14   |   13   |   12 | |   11   |
 *             +--------+--------+--------+-+----|-+--------+--------+--------+--------+------+-+--------+
 *             |        |        |        | L    +-+--------+--------+-->     |        |      L |        |
 *             |    1   |    2   |    3   |    4   |    5   |    6   |    7   |    8   |    9   |   10   |
 *             +--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+
 */
package Bengali.SnakeAndLadderBoards;
public class GeneralBoard1 {
    public void main(int r, int g, int y, int b) {
        System.out.println("\t\t\t\t\t\t                     "+ (char)(2488) + (char)(2494) + (char)(2474) +" "+ (char)(2488) + (char)(2495) + (char)(2433) + (char)(2524) + (char)(2495));
        System.out.println("\t\t\t\t\t\t SS GAMING STUDIOS -"+ (char)(2470) + (char)(2509) + (char)(2476) + (char)(2494) + (char)(2480) + (char)(2494) +" "+ (char)(2472) + (char)(2495) + (char)(2480) + (char)(2509) + (char)(2478) + (char)(2495) + (char)(2468));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("                   +--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+\n                   |");
            if(r == 100)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 100)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 100)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 100)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 99)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 99)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 99)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 99)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 98)
                System.out.print('\u24C7');
            else
                System.out.print(" S");
            if(g == 98)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 98)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 98)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 97)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 97)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 97)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 97)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 96)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 96)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 96)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 96)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 95)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 95)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 95)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 95)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 94)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 94)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 94)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 94)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 93)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 93)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 93)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 93)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 92)
                System.out.print('\u24C7');
            else
                System.out.print(" S");
            if(g == 92)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 92)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 92)
                System.out.print('\u24B7' +"+");
            else
                System.out.print("+-+");
            if(r == 91)
                System.out.print('\u24C7');
            else
                System.out.print("--");
            if(g == 91)
                System.out.print('\u24BC');
            else
                System.out.print("> ");
            if(y == 91)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 91)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            System.out.print("\n                   |  100 +-+-> 99   | | 98   |   97   |   96   |   95   |   94   |   93   | | 92 | |   91   |\n                   +------+-+--------+-+------+--------+--------+--------+--------+--------+-+----+-+--------+\n                   |");
            if(r == 81)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 81)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 81)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 81)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("| |");
            if(r == 82)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 82)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 82)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 82)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 83)
                System.out.print('\u24C7');
            else
                System.out.print(" |");
            if(g == 83)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 83)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 83)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 84)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 84)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 84)
                System.out.print('\u24CE');
            else
                System.out.print(" <");
            if(b == 84)
                System.out.print('\u24B7' +"+");
            else
                System.out.print("--+");
            if(r == 85)
                System.out.print('\u24C7');
            else
                System.out.print("--");
            if(g == 85)
                System.out.print('\u24BC');
            else
                System.out.print("--");
            if(y == 85)
                System.out.print('\u24CE');
            else
                System.out.print("--");
            if(b == 85)
                System.out.print('\u24B7' +"+");
            else
                System.out.print("--+");
            if(r == 86)
                System.out.print('\u24C7');
            else
                System.out.print("--");
            if(g == 86)
                System.out.print('\u24BC');
            else
                System.out.print("--");
            if(y == 86)
                System.out.print('\u24CE');
            else
                System.out.print("--");
            if(b == 86)
                System.out.print('\u24B7' +"+");
            else
                System.out.print("--+");
            if(r == 87)
                System.out.print('\u24C7');
            else
                System.out.print("--");
            if(g == 87)
                System.out.print('\u24BC');
            else
                System.out.print("--");
            if(y == 87)
                System.out.print('\u24CE');
            else
                System.out.print("--");
            if(b == 87)
                System.out.print('\u24B7' +"+");
            else
                System.out.print("--+");
            if(r == 88)
                System.out.print('\u24C7');
            else
                System.out.print("-+");
            if(g == 88)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 88)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 88)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 89)
                System.out.print('\u24C7');
            else
                System.out.print(" |");
            if(g == 89)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 89)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 89)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("| |");
            if(r == 90)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 90)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 90)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 90)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            System.out.print("\n                   |   81 | |   82   | | 83   |   84   |   85   |   86   | S 87   | | 88   | | 89 | |   90   |\n                   +------+-+--------+-+------+--------+--------+--------+-+------+-+------+-+----+-+--------+\n                   |");
            if(r == 80)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 80)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 80)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 80)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("L |");
            if(r == 79)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 79)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 79)
                System.out.print('\u24CE');
            else
                System.out.print(" <");
            if(b == 79)
                System.out.print('\u24B7' +"+");
            else
                System.out.print("--+");
            if(r == 78)
                System.out.print('\u24C7');
            else
                System.out.print("-+");
            if(g == 78)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 78)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 78)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 77)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 77)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 77)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 77)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 76)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 76)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 76)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 76)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 75)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 75)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 75)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 75)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 74)
                System.out.print('\u24C7');
            else
                System.out.print(" |");
            if(g == 74)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 74)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 74)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 73)
                System.out.print('\u24C7');
            else
                System.out.print(" |");
            if(g == 73)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 73)
                System.out.print('\u24CE');
            else
                System.out.print(" <");
            if(b == 73)
                System.out.print('\u24B7' +"+");
            else
                System.out.print("--+");
            if(r == 72)
                System.out.print('\u24C7');
            else
                System.out.print("-+");
            if(g == 72)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 72)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 72)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("L |");
            if(r == 71)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 71)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 71)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 71)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            System.out.print("\n                   |   80   |   79   |   78   |   77   |   76   |   75   | | 74   | | 73   |   72   |   71   |\n                   +--------+--------+--------+--------+--------+--------+-+------+-+------+--------+--------+\n                   |");
            if(r == 61)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 61)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 61)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 61)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 62)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 62)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 62)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 62)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("S |");
            if(r == 63)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 63)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 63)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 63)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 64)
                System.out.print('\u24C7');
            else
                System.out.print(" S");
            if(g == 64)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 64)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 64)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 65)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 65)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 65)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 65)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 66)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 66)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 66)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 66)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 67)
                System.out.print('\u24C7');
            else
                System.out.print(" |");
            if(g == 67)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 67)
                System.out.print('\u24CE');
            else
                System.out.print(" <");
            if(b == 67)
                System.out.print('\u24B7' +"+");
            else
                System.out.print("--+");
            if(r == 68)
                System.out.print('\u24C7');
            else
                System.out.print("-|");
            if(g == 68)
                System.out.print('\u24BC');
            else
                System.out.print("--");
            if(y == 68)
                System.out.print('\u24CE');
            else
                System.out.print("--");
            if(b == 68)
                System.out.print('\u24B7' +"+");
            else
                System.out.print("--+");
            if(r == 69)
                System.out.print('\u24C7');
            else
                System.out.print("--");
            if(g == 69)
                System.out.print('\u24BC');
            else
                System.out.print("--");
            if(y == 69)
                System.out.print('\u24CE');
            else
                System.out.print("--");
            if(b == 69)
                System.out.print('\u24B7' +"+");
            else
                System.out.print("--+");
            if(r == 70)
                System.out.print('\u24C7');
            else
                System.out.print("-+");
            if(g == 70)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 70)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 70)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            System.out.print("\n                   |   61   |   62 | |   63   | | 64   |   65   |   66   | | 67   | | 68   |   69   | | 70   |\n                   +--------+------+-+--------+-+------+--------+--------+-+------+-+------+--------+-+------+\n                   |");
            if(r == 60)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 60)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 60)
                System.out.print('\u24CE');
            else
                System.out.print(" <");
            if(b == 60)
                System.out.print('\u24B7' +"+");
            else
                System.out.print("--+");
            if(r == 59)
                System.out.print('\u24C7');
            else
                System.out.print("--");
            if(g == 59)
                System.out.print('\u24BC');
            else
                System.out.print("--");
            if(y == 59)
                System.out.print('\u24CE');
            else
                System.out.print("--");
            if(b == 59)
                System.out.print('\u24B7' +"+");
            else
                System.out.print("|-+");
            if(r == 58)
                System.out.print('\u24C7');
            else
                System.out.print("--");
            if(g == 58)
                System.out.print('\u24BC');
            else
                System.out.print("--");
            if(y == 58)
                System.out.print('\u24CE');
            else
                System.out.print("--");
            if(b == 58)
                System.out.print('\u24B7' +"+");
            else
                System.out.print("--+");
            if(r == 57)
                System.out.print('\u24C7');
            else
                System.out.print("-+");
            if(g == 57)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 57)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 57)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 56)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 56)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 56)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 56)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 55)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 55)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 55)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 55)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 54)
                System.out.print('\u24C7');
            else
                System.out.print(" |");
            if(g == 54)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 54)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 54)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("S |");
            if(r == 53)
                System.out.print('\u24C7');
            else
                System.out.print(" |");
            if(g == 53)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 53)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 53)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 52)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 52)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 52)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 52)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 51)
                System.out.print('\u24C7');
            else
                System.out.print(" L");
            if(g == 51)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 51)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 51)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            System.out.print("\n                   |   60   |   59 | |   58   |   57   |   56   |   55   | | 54 | | | 53   |   52   |   51   |\n                   +--------+------+-+--------+--------+--------+--------+-+----+-+-+------+--------+--------+\n                   |");
            if(r == 41)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 41)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 41)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 41)
                System.out.print('\u24B7' +"+");
            else
                System.out.print("+-+");
            if(r == 42)
                System.out.print('\u24C7');
            else
                System.out.print("--");
            if(g == 42)
                System.out.print('\u24BC');
            else
                System.out.print("> ");
            if(y == 42)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 42)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("| |");
            if(r == 43)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 43)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 43)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 43)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 44)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 44)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 44)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 44)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 45)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 45)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 45)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 45)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 46)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 46)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 46)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 46)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 47)
                System.out.print('\u24C7');
            else
                System.out.print(" |");
            if(g == 47)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 47)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 47)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("| |");
            if(r == 48)
                System.out.print('\u24C7');
            else
                System.out.print(" |");
            if(g == 48)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 48)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 48)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 49)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 49)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 49)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 49)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 50)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 50)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 50)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 50)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            System.out.print("\n                   |   41 | |   42 | |   43   |   44   |   45   |   46   | | 47 | | | 48   |   49   |   50   |\n                   +------+-+------+-+--------+--------+--------+--------+-+----+-+-+------+--------+--------+\n                   |");
            if(r == 40)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 40)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 40)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 40)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("| |");
            if(r == 39)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 39)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 39)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 39)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("| |");
            if(r == 38)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 38)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 38)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 38)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 37)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 37)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 37)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 37)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 36)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 36)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 36)
                System.out.print('\u24CE');
            else
                System.out.print(" <");
            if(b == 36)
                System.out.print('\u24B7' +"+");
            else
                System.out.print("--+");
            if(r == 35)
                System.out.print('\u24C7');
            else
                System.out.print("--");
            if(g == 35)
                System.out.print('\u24BC');
            else
                System.out.print("--");
            if(y == 35)
                System.out.print('\u24CE');
            else
                System.out.print("--");
            if(b == 35)
                System.out.print('\u24B7' +"+");
            else
                System.out.print("--+");
            if(r == 34)
                System.out.print('\u24C7');
            else
                System.out.print("-+");
            if(g == 34)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 34)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 34)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("| |");
            if(r == 33)
                System.out.print('\u24C7');
            else
                System.out.print(" |");
            if(g == 33)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 33)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 33)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 32)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 32)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 32)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 32)
                System.out.print('\u24B7' +"+");
            else
                System.out.print("+-+");
            if(r == 31)
                System.out.print('\u24C7');
            else
                System.out.print("--");
            if(g == 31)
                System.out.print('\u24BC');
            else
                System.out.print("> ");
            if(y == 31)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 31)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            System.out.print("\n                   |   40 | |   39 | |   38   |   37   |   36   |   35   |   34 V | | 33   |   32 | |   31   |\n                   +------+-+------+-+--------+--------+--------+--------+--------+-+------+------+-+--------+\n                   |");
            if(r == 21)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 21)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 21)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 21)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("L |");
            if(r == 22)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 22)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 22)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 22)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("| |");
            if(r == 23)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 23)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 23)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 23)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 24)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 24)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 24)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 24)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 25)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 25)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 25)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 25)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 26)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 26)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 26)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 26)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 27)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 27)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 27)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 27)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 28)
                System.out.print('\u24C7');
            else
                System.out.print(" L");
            if(g == 28)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 28)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 28)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 29)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 29)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 29)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 29)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("| |");
            if(r == 30)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 30)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 30)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 30)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            System.out.print("\n                   |   21   |   22 | |   23   |   24   |   25   |   26   |   27   |   28   |   29 | |   30   |\n                   +--------+------+-+--------+--------+--------+--------+--------+--------+------+-+--------+\n                   |");
            if(r == 20)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 20)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 20)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 20)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 19)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 19)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 19)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 19)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("| |");
            if(r == 18)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 18)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 18)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 18)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 17)
                System.out.print('\u24C7');
            else
                System.out.print(" +");
            if(g == 17)
                System.out.print('\u24BC');
            else
                System.out.print("--");
            if(y == 17)
                System.out.print('\u24CE');
            else
                System.out.print("--");
            if(b == 17)
                System.out.print('\u24B7' +"+");
            else
                System.out.print("--+");
            if(r == 16)
                System.out.print('\u24C7');
            else
                System.out.print("--");
            if(g == 16)
                System.out.print('\u24BC');
            else
                System.out.print("--");
            if(y == 16)
                System.out.print('\u24CE');
            else
                System.out.print("--");
            if(b == 16)
                System.out.print('\u24B7' +"+");
            else
                System.out.print("--+");
            if(r == 15)
                System.out.print('\u24C7');
            else
                System.out.print("--");
            if(g == 15)
                System.out.print('\u24BC');
            else
                System.out.print("--");
            if(y == 15)
                System.out.print('\u24CE');
            else
                System.out.print("--");
            if(b == 15)
                System.out.print('\u24B7' +"+");
            else
                System.out.print("--+");
            if(r == 14)
                System.out.print('\u24C7');
            else
                System.out.print("--");
            if(g == 14)
                System.out.print('\u24BC');
            else
                System.out.print("> ");
            if(y == 14)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 14)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 13)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 13)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 13)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 13)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 12)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 12)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 12)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 12)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("| |");
            if(r == 11)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 11)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 11)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 11)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            System.out.print("\n                   |   20   |   19 V |   18   | | 17 S |   16   |   15   |   14   |   13   |   12 | |   11   |\n                   +--------+--------+--------+-+----|-+--------+--------+--------+--------+------+-+--------+\n                   |");
            if(r == 1)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 1)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 1)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 1)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 2)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 2)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 2)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 2)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 3)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 3)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 3)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 3)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 4)
                System.out.print('\u24C7');
            else
                System.out.print(" L");
            if(g == 4)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 4)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 4)
                System.out.print('\u24B7' +"+");
            else
                System.out.print("+-+");
            if(r == 5)
                System.out.print('\u24C7');
            else
                System.out.print("--");
            if(g == 5)
                System.out.print('\u24BC');
            else
                System.out.print("--");
            if(y == 5)
                System.out.print('\u24CE');
            else
                System.out.print("--");
            if(b == 5)
                System.out.print('\u24B7' +"+");
            else
                System.out.print("--+");
            if(r == 6)
                System.out.print('\u24C7');
            else
                System.out.print("--");
            if(g == 6)
                System.out.print('\u24BC');
            else
                System.out.print("--");
            if(y == 6)
                System.out.print('\u24CE');
            else
                System.out.print("--");
            if(b == 6)
                System.out.print('\u24B7' +"+");
            else
                System.out.print("--+");
            if(r == 7)
                System.out.print('\u24C7');
            else
                System.out.print("--");
            if(g == 7)
                System.out.print('\u24BC');
            else
                System.out.print("> ");
            if(y == 7)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 7)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 8)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 8)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 8)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 8)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            if(r == 9)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 9)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 9)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 9)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("L |");
            if(r == 10)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 10)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 10)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 10)
                System.out.print('\u24B7' +"|");
            else
                System.out.print("  |");
            System.out.print("\n                   |    1   |    2   |    3   |    4   |    5   |    6   |    7   |    8   |    9   |   10   |\n                   +--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+\n                    ");
            if(r == 0)
                System.out.print('\u24C7');
            else
                System.out.print("  ");
            if(g == 0)
                System.out.print('\u24BC');
            else
                System.out.print("  ");
            if(y == 0)
                System.out.print('\u24CE');
            else
                System.out.print("  ");
            if(b == 0)
                System.out.print('\u24B7');
    }
}
