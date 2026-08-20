package English.BuckshotRoulette;
public class BulletGeneration {
    public static int[] main() throws InterruptedException {
        int[] a = new int[(int) (Math.random() * 9.0) + 2];
        int b, c;
        BulletGeneration bg = new BulletGeneration();
        for (b = 0; b < a.length; b++)
            a[b] = -1;
        b = c = (int) (Math.random() * a.length);
        while (b == c)
            c = (int) (Math.random() * a.length);
        a[b] = 0;
        a[c] = 1;
        for (b = 0; b < a.length; b++)
            if (a[b] == -1)
                a[b] = (int) (Math.random() * 2.0);
        bg.display(a);
        return a;
    }
    public void display(int[] a) throws InterruptedException {
        int b, c = 0, d = 0, e, f, g;
        String h;
        for (b = 0; b < a.length; b++) {
            if (a[b] == 0)
                c++;
            else
                d++;
        }
        h = Integer.toString(d) + " LIVE(S), "+ Integer.toString(c) +" BLANK(S)";
        System.out.println("\t\t\t\t\t\t      BUCKSHOT ROULETTE");
        System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Thread.sleep(1000);
        for (b = 1; b <= a.length; b++) {
            Thread.sleep(500);
            System.out.print('\u000C');
            System.out.println("\t\t\t\t\t\t      BUCKSHOT ROULETTE");
            System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\n\n\n");
            for (e = 1; e <= 7; e++) {
                System.out.print("                       ");
                for (g = 10; a.length < g; g--)
                    System.out.print("    ");
                for (f = 1; f <= b; f++) {
                    if (e == 1 || e == 3 || e == 7)
                        System.out.print("+-----+ ");
                    else if (e == 2)
                        System.out.print("|     | ");
                    else {
                        if (f <= d)
                            System.out.print("||||||| ");
                        else
                            System.out.print("|     | ");
                    }
                }
                System.out.print("\n");
            }
        }
        Thread.sleep(1000);
        System.out.print("\n\t\t\t\t\t\t    ");
        for (e = 0; e < h.length(); e++) {
            System.out.print(h.charAt(e));
            Thread.sleep(250);
        }
        Thread.sleep(3000);
        System.out.print('\u000C');
    }
}