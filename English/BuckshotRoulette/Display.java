package English.BuckshotRoulette;
public class Display {
    public static void fourPlayers(int[] a, int[] b, int[] c, int[] d, int x, String[] y, int[] z) {
        int i;
        System.out.println("\t\t\t\t\t\t      BUCKSHOT ROULETTE");
        System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("\n");
        System.out.println("                                  P   L   A   Y   E   R       1");
        System.out.println("        +---------------------+-----------------+-----------------+---------------------+");
        System.out.println("        | O                   |                 |                 |                   O |");
        System.out.print("        |   O");
        if (a[1] == 0 || a[1] == 1 || a[1] == 2 || a[1] == 7 || a[1] == 8 || a[1] == 10)
            System.out.print("                 |");
        else if (a[1] == 3)
            System.out.print("      Burner     |");
        else if (a[1] == 4)
            System.out.print("     Cigarette   |");
        else if (a[1] == 5)
            System.out.print("      Expired    |");
        else if (a[1] == 6)
            System.out.print("        Hand     |");
        else if (a[1] == 9)
            System.out.print("    Magnifying   |");
        if (a[2] == 0 || a[2] == 1 || a[2] == 2 || a[2] == 7 || a[2] == 8 || a[2] == 10)
            System.out.print("                 |");
        else if (a[2] == 3)
            System.out.print("      Burner     |");
        else if (a[2] == 4)
            System.out.print("    Cigarette    |");
        else if (a[2] == 5)
            System.out.print("     Expired     |");
        else if (a[2] == 6)
            System.out.print("       Hand      |");
        else if (a[2] == 9)
            System.out.print("    Magnifying   |");
        if (a[3] == 0 || a[3] == 1 || a[3] == 2 || a[3] == 7 || a[3] == 8 || a[3] == 10)
            System.out.print("                 |");
        else if (a[3] == 3)
            System.out.print("      Burner     |");
        else if (a[3] == 4)
            System.out.print("    Cigarette    |");
        else if (a[3] == 5)
            System.out.print("     Expired     |");
        else if (a[3] == 6)
            System.out.print("      Hand       |");
        else if (a[3] == 9)
            System.out.print("   Magnifying    |");
        if (a[4] == 0 || a[4] == 1 || a[4] == 2 || a[4] == 7 || a[4] == 8 || a[4] == 10)
            System.out.println("                 O   |");
        else if (a[4] == 3)
            System.out.println("     Burner      O   |");
        else if (a[4] == 4)
            System.out.println("   Cigarette     O   |");
        else if (a[4] == 5)
            System.out.println("    Expired      O   |");
        else if (a[4] == 6)
            System.out.println("     Hand        O   |");
        else if (a[4] == 9)
            System.out.println("   Magnifying    O   |");
        System.out.print("        |     O");
        if (a[1] == 0)
            System.out.print("               |");
        else if (a[1] == 1)
            System.out.print("   Adrenaline  |");
        else if (a[1] == 2)
            System.out.print("      Beer     |");
        else if (a[1] == 3)
            System.out.print("     Phone     |");
        else if (a[1] == 4)
            System.out.print("      Pack     |");
        else if (a[1] == 5)
            System.out.print("    Medicine   |");
        else if (a[1] == 6)
            System.out.print("       Saw     |");
        else if (a[1] == 7)
            System.out.print("    Inverter   |");
        else if (a[1] == 8)
            System.out.print("     Jammer    |");
        else if (a[1] == 9)
            System.out.print("     Glass     |");
        else if (a[1] == 10)
            System.out.print("     Remote    |");
        if (a[2] == 0)
            System.out.print("                 |");
        else if (a[2] == 1)
            System.out.print("    Adrenaline   |");
        else if (a[2] == 2)
            System.out.print("       Beer      |");
        else if (a[2] == 3)
            System.out.print("       Phone     |");
        else if (a[2] == 4)
            System.out.print("       Pack      |");
        else if (a[2] == 5)
            System.out.print("     Medicine    |");
        else if (a[2] == 6)
            System.out.print("        Saw      |");
        else if (a[2] == 7)
            System.out.print("     Inverter    |");
        else if (a[2] == 8)
            System.out.print("      Jammer     |");
        else if (a[2] == 9)
            System.out.print("      Glass      |");
        else if (a[2] == 10)
            System.out.print("      Remote     |");
        if (a[3] == 0)
            System.out.print("                 |");
        else if (a[3] == 1)
            System.out.print("    Adrenaline   |");
        else if (a[3] == 2)
            System.out.print("       Beer      |");
        else if (a[3] == 3)
            System.out.print("      Phone      |");
        else if (a[3] == 4)
            System.out.print("      Pack       |");
        else if (a[3] == 5)
            System.out.print("    Medicine     |");
        else if (a[3] == 6)
            System.out.print("      Saw        |");
        else if (a[3] == 7)
            System.out.print("    Inverter     |");
        else if (a[3] == 8)
            System.out.print("     Jammer      |");
        else if (a[3] == 9)
            System.out.print("      Glass      |");
        else if (a[3] == 10)
            System.out.print("     Remote      |");
        if (a[4] == 0)
            System.out.println("               O     |");
        else if (a[4] == 1)
            System.out.println("  Adrenaline   O     |");
        else if (a[4] == 2)
            System.out.println("     Beer      O     |");
        else if (a[4] == 3)
            System.out.println("     Phone     O     |");
        else if (a[4] == 4)
            System.out.println("     Pack      O     |");
        else if (a[4] == 5)
            System.out.println("   Medicine    O     |");
        else if (a[4] == 6)
            System.out.println("     Saw       O     |");
        else if (a[4] == 7)
            System.out.println("   Inverter    O     |");
        else if (a[4] == 8)
            System.out.println("    Jammer     O     |");
        else if (a[4] == 9)
            System.out.println("     Glass     O     |");
        else if (a[4] == 10)
            System.out.println("    Remote     O     |");
        System.out.println("        |       O             |                 |                 |             O       |");
        System.out.println("        |         O ==========+====+============+============+====+========== O         |");
        System.out.print("        |");
        if (b[1] == 4)
            System.out.print("   Ciga  | O              |            |            |              O |");
        else if (b[1] == 9)
            System.out.print("  Magni  | O              |            |            |              O |");
        else
            System.out.print("         | O              |            |            |              O |");
        if (d[1] == 4)
            System.out.println("  Ciga   |");
        else if (d[1] == 9)
            System.out.println("  Magni  |");
        else
            System.out.println("         |");
        System.out.print("        |");
        if (b[1] == 0 || b[1] == 2 || b[1] == 7 || b[1] == 8 || b[1] == 10)
            System.out.print("         |");
        else if (b[1] == 1)
            System.out.print("  Adren  |");
        else if (b[1] == 3)
            System.out.print("  Burner |");
        else if (b[1] == 4)
            System.out.print("  rette  |");
        else if (b[1] == 5)
            System.out.print(" Expired |");
        else if (b[1] == 6)
            System.out.print("   Hand  |");
        else if (b[1] == 9)
            System.out.print("  fying  |");
        if (a[5] == 0 || a[5] == 2 || a[5] == 7 || a[5] == 8 || a[5] == 10)
            System.out.print("   O            |");
        else if (a[5] == 1)
            System.out.print("   O Adrenaline |");
        else if (a[5] == 3)
            System.out.print("   O    Burner  |");
        else if (a[5] == 4)
            System.out.print("   O  Cigarette |");
        else if (a[5] == 5)
            System.out.print("   O   Expired  |");
        else if (a[5] == 6)
            System.out.print("   O     Hand   |");
        else if (a[5] == 9)
            System.out.print("   O Magnifying |");
        if(a[6] == 0 || a[6] == 1 || a[6] == 2 || a[6] == 7 || a[6] == 8 || a[6] == 10)
            System.out.print("            |");
        else if (a[6] == 3)
            System.out.print("   Burner   |");
        else if (a[6] == 4)
            System.out.print("  Cigarette |");
        else if (a[6] == 5)
            System.out.print("  Expired   |");
        else if (a[6] == 6)
            System.out.print("    Hand    |");
        else if (a[6] == 9)
            System.out.print(" Magnifying |");
        if(a[7] == 0 || a[7] == 1 || a[7] == 2 || a[7] == 7 || a[7] == 8 || a[7] == 10)
            System.out.print("            |");
        else if (a[7] == 3)
            System.out.print("   Burner   |");
        else if (a[7] == 4)
            System.out.print(" Cigarette  |");
        else if (a[7] == 5)
            System.out.print("   Expired  |");
        else if (a[7] == 6)
            System.out.print("    Hand    |");
        else if (a[7] == 9)
            System.out.print(" Magnifying |");
        if(a[8] == 0 || a[8] == 2 || a[8] == 7 || a[8] == 8 || a[8] == 10)
            System.out.print("            O   |");
        else if (a[8] == 1)
            System.out.print(" Adrenaline O   |");
        else if (a[8] == 3)
            System.out.print("  Burner    O   |");
        else if (a[8] == 4)
            System.out.print(" Cigarette  O   |");
        else if (a[8] == 5)
            System.out.print("  Expired   O   |");
        else if (a[8] == 6)
            System.out.print("   Hand     O   |");
        else if (a[8] == 9)
            System.out.print(" Magnifying O   |");
        if (d[1] == 0 || d[1] == 2 || d[1] == 7 || d[1] == 8 || d[1] == 10)
            System.out.println("         |");
        else if (d[1] == 1)
            System.out.println("  Adren  |");
        else if (d[1] == 3)
            System.out.println(" Burner  |");
        else if (d[1] == 4)
            System.out.println("  rette  |");
        else if (d[1] == 5)
            System.out.println(" Expired |");
        else if (d[1] == 6)
            System.out.println("  Hand   |");
        else if (d[1] == 9)
            System.out.println("  fying  |");
        System.out.print("        |");
        if (b[1] == 0)
            System.out.print("         |");
        else if (b[1] == 1)
            System.out.print("  aline  |");
        else if (b[1] == 2)
            System.out.print("   Beer  |");
        else if (b[1] == 3)
            System.out.print("  Phone  |");
        else if (b[1] == 4)
            System.out.print("   Pack  |");
        else if (b[1] == 5)
            System.out.print(" Medicine|");
        else if (b[1] == 6)
            System.out.print("    Saw  |");
        else if (b[1] == 7)
            System.out.print(" Inverter|");
        else if (b[1] == 8)
            System.out.print("  Jammer |");
        else if (b[1] == 9)
            System.out.print("  Glass  |");
        else if (b[1] == 10)
            System.out.print("  Remote |");
        if (a[5] == 0 || a[5] == 1)
            System.out.print("     O          |");
        else if (a[5] == 2)
            System.out.print("     O   Beer   |");
        else if (a[5] == 3)
            System.out.print("     O   Phone  |");
        else if (a[5] == 4)
            System.out.print("     O   Pack   |");
        else if (a[5] == 5)
            System.out.print("     O Medicine |");
        else if (a[5] == 6)
            System.out.print("     O    Saw   |");
        else if (a[5] == 7)
            System.out.print("     O Inverter |");
        else if (a[5] == 8)
            System.out.print("     O  Jammer  |");
        else if (a[5] == 9)
            System.out.print("     O   Glass  |");
        else if (a[5] == 10)
            System.out.print("     O  Remote  |");
        if (a[6] == 0)
            System.out.print("            |");
        else if (a[6] == 1)
            System.out.print(" Adrenaline |");
        else if (a[6] == 2)
            System.out.print("    Beer    |");
        else if (a[6] == 3)
            System.out.print("    Phone   |");
        else if (a[6] == 4)
            System.out.print("    Pack    |");
        else if (a[6] == 5)
            System.out.print("  Medicine  |");
        else if (a[6] == 6)
            System.out.print("     Saw    |");
        else if (a[6] == 7)
            System.out.print("  Inverter  |");
        else if (a[6] == 8)
            System.out.print("   Jammer   |");
        else if (a[6] == 9)
            System.out.print("    Glass   |");
        else if (a[6] == 10)
            System.out.print("   Remote   |");
        if (a[7] == 0)
            System.out.print("            |");
        else if (a[7] == 1)
            System.out.print(" Adrenaline |");
        else if (a[7] == 2)
            System.out.print("    Beer    |");
        else if (a[7] == 3)
            System.out.print("   Phone    |");
        else if (a[7] == 4)
            System.out.print("    Pack    |");
        else if (a[7] == 5)
            System.out.print("  Medicine  |");
        else if (a[7] == 6)
            System.out.print("    Saw     |");
        else if (a[7] == 7)
            System.out.print("  Inverter  |");
        else if (a[7] == 8)
            System.out.print("   Jammer   |");
        else if (a[7] == 9)
            System.out.print("   Glass    |");
        else if (a[7] == 10)
            System.out.print("   Remote   |");
        if (a[8] == 0 || a[8] == 1)
            System.out.print("          O     |");
        else if (a[8] == 2)
            System.out.print("   Beer   O     |");
        else if (a[8] == 3)
            System.out.print("  Phone   O     |");
        else if (a[8] == 4)
            System.out.print("   Pack   O     |");
        else if (a[8] == 5)
            System.out.print(" Medicine O     |");
        else if (a[8] == 6)
            System.out.print("   Saw    O     |");
        else if (a[8] == 7)
            System.out.print(" Inverter O     |");
        else if (a[8] == 8)
            System.out.print("  Jammer  O     |");
        else if (a[8] == 9)
            System.out.print("  Glass   O     |");
        else if (a[8] == 10)
            System.out.print("  Remote  O     |");
        if (d[1] == 0)
            System.out.println("         |");
        else if (d[1] == 1)
            System.out.println("  aline  |");
        else if (d[1] == 2)
            System.out.println("  Beer   |");
        else if (d[1] == 3)
            System.out.println("  Phone  |");
        else if (d[1] == 4)
            System.out.println("  Pack   |");
        else if (d[1] == 5)
            System.out.println("Medicine |");
        else if (d[1] == 6)
            System.out.println("  Saw    |");
        else if (d[1] == 7)
            System.out.println("Inverter |");
        else if (d[1] == 8)
            System.out.println(" Jammer  |");
        else if (d[1] == 9)
            System.out.println("  Glass  |");
        else if (d[1] == 10)
            System.out.println(" Remote  |");
        System.out.println("        |         |       O        |            |            |        O       |         |");
        System.out.print("        |         |");
        if (b[5] == 4)
            System.out.print("   Ciga  O -----+------------+------------+----- O");
        else if (b[5] == 9)
            System.out.print("  Magni  O -----+------------+------------+----- O");
        else
            System.out.print("         O -----+------------+------------+----- O");
        if (d[5] == 4)
            System.out.print("  Ciga   |         |");
        else if (d[5] == 9)
            System.out.print("  Magni  |         |");
        else
            System.out.print("         |         |");
        System.out.println("\tPLAYER 1:");
        System.out.print("        +=========+");
        if (b[5] == 0 || b[5] == 2 || b[5] == 7 || b[5] == 8 || b[5] == 10)
            System.out.print("         |");
        else if (b[5] == 1)
            System.out.print("  Adren  |");
        else if (b[5] == 3)
            System.out.print("  Burner |");
        else if (b[5] == 4)
            System.out.print("  rette  |");
        else if (b[5] == 5)
            System.out.print(" Expired |");
        else if (b[5] == 6)
            System.out.print("   Hand  |");
        else if (b[5] == 9)
            System.out.print("  fying  |");
        if (x == 0)
            System.out.print("             +------+                  |");
        else if (x == 2)
            System.out.print("                 +||                   |");
        else
            System.out.print("                                       |");
        if (d[5] == 0 || d[5] == 2 || d[5] == 7 || d[5] == 8 || d[5] == 10)
            System.out.print("         +=========+");
        else if (d[5] == 1)
            System.out.print("  Adren  +=========+");
        else if (d[5] == 3)
            System.out.print(" Burner  +=========+");
        else if (d[5] == 4)
            System.out.print("  rette  +=========+");
        else if (d[5] == 5)
            System.out.print(" Expired +=========+");
        else if (d[5] == 6)
            System.out.print("  Hand   +=========+");
        else if (d[5] == 9)
            System.out.print("  fying  +=========+");
        System.out.println("\t"+ y[0]);
        System.out.print("      P |         |");
        if (b[5] == 0)
            System.out.print("         |");
        else if (b[5] == 1)
            System.out.print("  aline  |");
        else if (b[5] == 2)
            System.out.print("   Beer  |");
        else if (b[5] == 3)
            System.out.print("  Phone  |");
        else if (b[5] == 4)
            System.out.print("   Pack  |");
        else if (b[5] == 5)
            System.out.print(" Medicine|");
        else if (b[5] == 6)
            System.out.print("    Saw  |");
        else if (b[5] == 7)
            System.out.print(" Inverter|");
        else if (b[5] == 8)
            System.out.print("  Jammer |");
        else if (b[5] == 9)
            System.out.print("  Glass  |");
        else if (b[5] == 10)
            System.out.print("  Remote |");
        if (x == 0)
            System.out.print("              \\     |                  |");
        else if (x == 2)
            System.out.print("                  ||                   |");
        else
            System.out.print("                                       |");
        if (d[5] == 0)
            System.out.print("         |         | p");
        else if (d[5] == 1)
            System.out.print("  aline  |         | p");
        else if (d[5] == 2)
            System.out.print("  Beer   |         | p");
        else if (d[5] == 3)
            System.out.print("  Phone  |         | p");
        else if (d[5] == 4)
            System.out.print("  Pack   |         | p");
        else if (d[5] == 5)
            System.out.print("Medicine |         | p");
        else if (d[5] == 6)
            System.out.print("  Saw    |         | p");
        else if (d[5] == 7)
            System.out.print("Inverter |         | p");
        else if (d[5] == 8)
            System.out.print(" Jammer  |         | p");
        else if (d[5] == 9)
            System.out.print("  Glass  |         | p");
        else if (d[5] == 10)
            System.out.print(" Remote  |         | p");
        System.out.print("\t");
        if (z[0] == 0)
            System.out.print('\u2620');
        else
            for (i = 1; i <= z[0]; i++)
                System.out.print('\u2665' +" ");
        System.out.print("\n        |         |         |");
        if (x == 0)
            System.out.println("               \\    |                  |         |         |");
        else if (x == 2)
            System.out.println("                  ||                   |         |         |");
        else
            System.out.println("                                       |         |         |");
        System.out.print("      L |");
        if (b[2] == 4)
            System.out.print("   Ciga  +=========+");
        else if (b[2] == 9)
            System.out.print("  Magni  +=========+");
        else
            System.out.print("         +=========+");
        if (x == 0)
            System.out.print("                \\   |                  +=========+");
        else if (x == 2)
            System.out.print("                  ||                   +=========+");
        else
            System.out.print("                                       +=========+");
        if (d[2] == 4)
            System.out.print("  Ciga   | L");
        else if (d[2] == 9)
            System.out.print("  Magni  | L");
        else
            System.out.print("         | L");
        System.out.println("\tPLAYER 2:");
        System.out.print("        |");
        if (b[2] == 0 || b[2] == 2 || b[2] == 7 || b[2] == 8 || b[2] == 10)
            System.out.print("         |");
        else if (b[2] == 1)
            System.out.print("  Adren  |");
        else if (b[2] == 3)
            System.out.print("  Burner |");
        else if (b[2] == 4)
            System.out.print("  rette  |");
        else if (b[2] == 5)
            System.out.print(" Expired |");
        else if (b[2] == 6)
            System.out.print("   Hand  |");
        else if (b[2] == 9)
            System.out.print("  fying  |");
        if (b[6] == 4)
            System.out.print("   Ciga  |");
        else if (b[6] == 9)
            System.out.print("  Magni  |");
        else
            System.out.print("         |");
        if (x == 0)
            System.out.print("                +\\  |++                |");
        else if (x == 2)
            System.out.print("                  ||                   |");
        else
            System.out.print("                                       |");
        if (d[6] == 4)
            System.out.print("  Ciga   |");
        else if (d[6] == 9)
            System.out.print("  Magni  |");
        else
            System.out.print("         |");
        if (d[2] == 0 || d[2] == 2 || d[2] == 7 || d[2] == 8 || d[2] == 10)
            System.out.print("         |");
        else if (d[2] == 1)
            System.out.print("  Adren  |");
        else if (d[2] == 3)
            System.out.print(" Burner  |");
        else if (d[2] == 4)
            System.out.print("  rette  |");
        else if (d[2] == 5)
            System.out.print(" Expired |");
        else if (d[2] == 6)
            System.out.print("  Hand   |");
        else if (d[2] == 9)
            System.out.print("  fying  |");
        System.out.println("\t"+ y[1]);
        System.out.print("      A |");
        if (b[2] == 0)
            System.out.print("         |");
        else if (b[2] == 1)
            System.out.print("  aline  |");
        else if (b[2] == 2)
            System.out.print("   Beer  |");
        else if (b[2] == 3)
            System.out.print("  Phone  |");
        else if (b[2] == 4)
            System.out.print("   Pack  |");
        else if (b[2] == 5)
            System.out.print(" Medicine|");
        else if (b[2] == 6)
            System.out.print("    Saw  |");
        else if (b[2] == 7)
            System.out.print(" Inverter|");
        else if (b[2] == 8)
            System.out.print("  Jammer |");
        else if (b[2] == 9)
            System.out.print("  Glass  |");
        else if (b[2] == 10)
            System.out.print("  Remote |");
        if (b[6] == 0 || b[6] == 2 || b[6] == 7 || b[6] == 8 || b[6] == 10)
            System.out.print("         |");
        else if (b[6] == 1)
            System.out.print("  Adren  |");
        else if (b[6] == 3)
            System.out.print("  Burner |");
        else if (b[6] == 4)
            System.out.print("  rette  |");
        else if (b[6] == 5)
            System.out.print(" Expired |");
        else if (b[6] == 6)
            System.out.print("   Hand  |");
        else if (b[6] == 9)
            System.out.print("  fying  |");
        if (x == 0)
            System.out.print("                | \\ |||                |");
        else if (x == 1)
            System.out.print("                                       |");
        else if (x == 2)
            System.out.print("                  ||                   |");
        else if (x == 3)
            System.out.print("                                +----+ |");
        if (d[6] == 0 || d[6] == 2 || d[6] == 7 || d[6] == 8 || d[6] == 10)
            System.out.print("         |");
        else if (d[6] == 1)
            System.out.print("  Adren  |");
        else if (d[6] == 3)
            System.out.print(" Burner  |");
        else if (d[6] == 4)
            System.out.print("  rette  |");
        else if (d[6] == 5)
            System.out.print(" Expired |");
        else if (d[6] == 6)
            System.out.print("  Hand   |");
        else if (d[6] == 9)
            System.out.print("  fying  |");
        if (d[2] == 0)
            System.out.print("         | A");
        else if (d[2] == 1)
            System.out.print("  aline  | A");
        else if (d[2] == 2)
            System.out.print("  Beer   | A");
        else if (d[2] == 3)
            System.out.print("  Phone  | A");
        else if (d[2] == 4)
            System.out.print("  Pack   | A");
        else if (d[2] == 5)
            System.out.print("Medicine | A");
        else if (d[2] == 6)
            System.out.print("  Saw    | A");
        else if (d[2] == 7)
            System.out.print("Inverter | A");
        else if (d[2] == 8)
            System.out.print(" Jammer  | A");
        else if (d[2] == 9)
            System.out.print("  Glass  | A");
        else if (d[2] == 10)
            System.out.print(" Remote  | A");
        System.out.print("\t");
        if (z[1] == 0)
            System.out.print('\u2620');
        else
            for (i = 1; i <= z[1]; i++)
                System.out.print('\u2665' +" ");
        System.out.print("\n        |         |");
        if (b[6] == 0)
            System.out.print("         |");
        else if (b[6] == 1)
            System.out.print("  aline  |");
        else if (b[6] == 2)
            System.out.print("   Beer  |");
        else if (b[6] == 3)
            System.out.print("  Phone  |");
        else if (b[6] == 4)
            System.out.print("   Pack  |");
        else if (b[6] == 5)
            System.out.print(" Medicine|");
        else if (b[6] == 6)
            System.out.print("    Saw  |");
        else if (b[6] == 7)
            System.out.print(" Inverter|");
        else if (b[6] == 8)
            System.out.print("  Jammer |");
        else if (b[6] == 9)
            System.out.print("  Glass  |");
        else if (b[6] == 10)
            System.out.print("  Remote |");
        if (x == 0)
            System.out.print("                |/| +=O                |");
        else if (x == 1)
            System.out.print("                                       |");
        else if (x == 2)
            System.out.print("                  |++                  |");
        else if (x == 3)
            System.out.print("                         +----/      | |");
        if (d[6] == 0)
            System.out.println("         |         |");
        else if (d[6] == 1)
            System.out.println("  aline  |         |");
        else if (d[6] == 2)
            System.out.println("  Beer   |         |");
        else if (d[6] == 3)
            System.out.println("  Phone  |         |");
        else if (d[6] == 4)
            System.out.println("  Pack   |         |");
        else if (d[6] == 5)
            System.out.println("Medicine |         |");
        else if (d[6] == 6)
            System.out.println("  Saw    |         |");
        else if (d[6] == 7)
            System.out.println("Inverter |         |");
        else if (d[6] == 8)
            System.out.println(" Jammer  |         |");
        else if (d[6] == 9)
            System.out.println("  Glass  |         |");
        else if (d[6] == 10)
            System.out.println(" Remote  |         |");
        System.out.print("      Y |         |         |");
        if (x == 0)
            System.out.println("                +-| |||                |         |         | Y");
        else if (x == 1)
            System.out.println("          ====O====                 +  |         |         | Y");
        else if (x == 2)
            System.out.println("                ++| |                  |         |         | Y");
        else if (x == 3)
            System.out.println("               +---------+--V        | |         |         | Y");
        System.out.print("        +=========+=========+");
        if (x == 0)
            System.out.print("                  | |||                +=========+=========+");
        else if (x == 1)
            System.out.print(" +------------+--------+============== +=========+=========+");
        else if (x == 2)
            System.out.print("                ||| |                  +=========+=========+");
        else if (x == 3)
            System.out.print(" ==============+--------+------------+ +=========+=========+");
        System.out.println("\tPLAYER 3:");
        System.out.print("      E |         |         |");
        if (x == 0)
            System.out.print("                  | |++                |         |         | E");
        else if (x == 1)
            System.out.print(" |        A--+---------+               |         |         | E");
        else if (x == 2)
            System.out.print("                ||| |-+                |         |         | E");
        else if (x == 3)
            System.out.print("  +                 ====O====          |         |         | E");
        System.out.println("\t"+ y[2]);
        System.out.print("        |         |");
        if (b[7] == 0)
            System.out.print("         |");
        else if (b[7] == 1)
            System.out.print("  Adren  |");
        else if (b[7] == 2)
            System.out.print("   Beer  |");
        else if (b[7] == 3)
            System.out.print("  Burner |");
        else if (b[7] == 4)
            System.out.print("   Ciga  |");
        else if (b[7] == 5)
            System.out.print(" Expired |");
        else if (b[7] == 6)
            System.out.print("   Hand  |");
        else if (b[7] == 7)
            System.out.print(" Inverter|");
        else if (b[7] == 8)
            System.out.print("  Jammer |");
        else if (b[7] == 9)
            System.out.print("  Magni  |");
        else if (b[7] == 10)
            System.out.print("  Remote |");
        if (x == 0)
            System.out.print("                  ++|                  |");
        else if (x == 1)
            System.out.print(" |      /----+                         |");
        else if (x == 2)
            System.out.print("                O=+ |/|                |");
        else if (x == 3)
            System.out.print("                                       |");
        if (d[7] == 0)
            System.out.print("         |         |");
        else if (d[7] == 1)
            System.out.print("  Adren  |         |");
        else if (d[7] == 2)
            System.out.print("  Beer   |         |");
        else if (d[7] == 3)
            System.out.print(" Burner  |         |");
        else if (d[7] == 4)
            System.out.print("  Ciga   |         |");
        else if (d[7] == 5)
            System.out.print(" Expired |         |");
        else if (d[7] == 6)
            System.out.print("  Hand   |         |");
        else if (d[7] == 7)
            System.out.print("Inverter |         |");
        else if (d[7] == 8)
            System.out.print(" Jammer  |         |");
        else if (d[7] == 9)
            System.out.print("  Magni  |         |");
        else if (d[7] == 10)
            System.out.print(" Remote  |         |");
        System.out.print("\t");
        if (z[2] == 0)
            System.out.print('\u2620');
        else
            for (i = 1; i <= z[2]; i++)
                System.out.print('\u2665' +" ");
        System.out.print("\n      R |");
        if (b[3] == 0)
            System.out.print("         |");
        else if (b[3] == 1)
            System.out.print("  Adren  |");
        else if (b[3] == 2)
            System.out.print("   Beer  |");
        else if (b[3] == 3)
            System.out.print("  Burner |");
        else if (b[3] == 4)
            System.out.print("   Ciga  |");
        else if (b[3] == 5)
            System.out.print(" Expired |");
        else if (b[3] == 6)
            System.out.print("   Hand  |");
        else if (b[3] == 7)
            System.out.print(" Inverter|");
        else if (b[3] == 8)
            System.out.print("  Jammer |");
        else if (b[3] == 9)
            System.out.print("  Magni  |");
        else if (b[3] == 10)
            System.out.print("  Remote |");
        if (b[7] == 0 || b[7] == 2 || b[7] == 7 || b[7] == 8 || b[7] == 10)
            System.out.print("         |");
        else if (b[7] == 1)
            System.out.print("  aline  |");
        else if (b[7] == 3)
            System.out.print("  Phone  |");
        else if (b[7] == 4)
            System.out.print("  rette  |");
        else if (b[7] == 5)
            System.out.print(" Medicine|");
        else if (b[7] == 6)
            System.out.print("    Saw  |");
        else if (b[7] == 9)
            System.out.print("  fying  |");
        if (x == 0)
            System.out.print("                   ||                  |");
        else if (x == 1)
            System.out.print(" +----+                                |");
        else if (x == 2)
            System.out.print("                ||| \\ |                |");
        else if (x == 3)
            System.out.print("                                       |");
        if (d[7] == 0 || d[7] == 2 || d[7] == 7 || d[7] == 8 || d[7] == 10)
            System.out.print("         |");
        else if (d[7] == 1)
            System.out.print("  aline  |");
        else if (d[7] == 3)
            System.out.print("  Phone  |");
        else if (d[7] == 4)
            System.out.print("  rette  |");
        else if (d[7] == 5)
            System.out.print("Medicine |");
        else if (d[7] == 6)
            System.out.print("  Saw    |");
        else if (d[7] == 9)
            System.out.print("  fying  |");
        if (d[3] == 0)
            System.out.println("         | R");
        else if (d[3] == 1)
            System.out.println("  Adren  | R");
        else if (d[3] == 2)
            System.out.println("  Beer   | R");
        else if (d[3] == 3)
            System.out.println(" Burner  | R");
        else if (d[3] == 4)
            System.out.println("  Ciga   | R");
        else if (d[3] == 5)
            System.out.println(" Expired | R");
        else if (d[3] == 6)
            System.out.println("  Hand   | R");
        else if (d[3] == 7)
            System.out.println("Inverter | R");
        else if (d[3] == 8)
            System.out.println(" Jammer  | R");
        else if (d[3] == 9)
            System.out.println("  Magni  | R");
        else if (d[3] == 10)
            System.out.println(" Remote  | R");
        System.out.print("        |");
        if (b[3] == 0 || b[3] == 2 || b[3] == 7 || b[3] == 8 || b[3] == 10)
            System.out.print("         |");
        else if (b[3] == 1)
            System.out.print("  aline  |");
        else if (b[3] == 3)
            System.out.print("  Phone  |");
        else if (b[3] == 4)
            System.out.print("  rette  |");
        else if (b[3] == 5)
            System.out.print(" Medicine|");
        else if (b[3] == 6)
            System.out.print("    Saw  |");
        else if (b[3] == 9)
            System.out.print("  fying  |");
        if (b[7] == 4)
            System.out.print("   Pack  |");
        else if (b[7] == 9)
            System.out.print("  Glass  |");
        else
            System.out.print("         |");
        if (x == 0)
            System.out.print("                   ||                  |");
        else if (x == 2)
            System.out.print("                ++|  \\+                |");
        else
            System.out.print("                                       |");
        if (d[7] == 4)
            System.out.print("  Pack   |");
        else if (d[7] == 9)
            System.out.print("  Glass  |");
        else
            System.out.print("         |");
        if (d[3] == 0 || d[3] == 2 || d[3] == 7 || d[3] == 8 || d[3] == 10)
            System.out.println("         |");
        else if (d[3] == 1)
            System.out.println("  aline  |");
        else if (d[3] == 3)
            System.out.println("  Phone  |");
        else if (d[3] == 4)
            System.out.println("  rette  |");
        else if (d[3] == 5)
            System.out.println("Medicine |");
        else if (d[3] == 6)
            System.out.println("  Saw    |");
        else if (d[3] == 9)
            System.out.println("  fying  |");
        System.out.print("        |");
        if (b[3] == 4)
            System.out.print("   Pack  +=========+");
        else if (b[3] == 9)
            System.out.print("  Glass  +=========+");
        else
            System.out.print("         +=========+");
        if (x == 0)
            System.out.print("                   ||                  +=========+");
        else if (x == 2)
            System.out.print("                  |   \\                +=========+");
        else
            System.out.print("                                       +=========+");
        if (d[3] == 4)
            System.out.print("  Pack   |");
        else if (d[3] == 9)
            System.out.print("  Glass  |");
        else
            System.out.print("         |");
        System.out.println("\tPLAYER 4:");
        System.out.print("      2 |         |         |");
        if (x == 0)
            System.out.print("                   ||                  |         |         | 4");
        else if (x == 2)
            System.out.print("                  |    \\               |         |         | 4");
        else
            System.out.print("                                       |         |         | 4");
        System.out.println("\t"+ y[3]);
        System.out.print("        +=========+");
        if (b[8] == 0)
            System.out.print("         |");
        else if (b[8] == 1)
            System.out.print("  Adren  |");
        else if (b[8] == 2)
            System.out.print("   Beer  |");
        else if (b[8] == 3)
            System.out.print("  Burner |");
        else if (b[8] == 4)
            System.out.print("   Ciga  |");
        else if (b[8] == 5)
            System.out.print(" Expired |");
        else if (b[8] == 6)
            System.out.print("   Hand  |");
        else if (b[8] == 7)
            System.out.print(" Inverter|");
        else if (b[8] == 8)
            System.out.print("  Jammer |");
        else if (b[8] == 9)
            System.out.print("  Magni  |");
        else if (b[8] == 10)
            System.out.print("  Remote |");
        if (x == 0)
            System.out.print("                   ||                  |");
        else if (x == 2)
            System.out.print("                  |     \\              |");
        else
            System.out.print("                                       |");
        if (d[8] == 0)
            System.out.print("         +=========+");
        else if (d[8] == 1)
            System.out.print("  Adren  +=========+");
        else if (d[8] == 2)
            System.out.print("  Beer   +=========+");
        else if (d[8] == 3)
            System.out.print(" Burner  +=========+");
        else if (d[8] == 4)
            System.out.print("  Ciga   +=========+");
        else if (d[8] == 5)
            System.out.print(" Expired +=========+");
        else if (d[8] == 6)
            System.out.print("  Hand   +=========+");
        else if (d[8] == 7)
            System.out.print("Inverter +=========+");
        else if (d[8] == 8)
            System.out.print(" Jammer  +=========+");
        else if (d[8] == 9)
            System.out.print("  Magni  +=========+");
        else if (d[8] == 10)
            System.out.print(" Remote  +=========+");
        System.out.print("\t");
        if (z[3] == 0)
            System.out.print('\u2620');
        else
            for (i = 1; i <= z[3]; i++)
                System.out.print('\u2665' +" ");
        System.out.print("\n        |         |");
        if (b[8] == 0 || b[8] == 2 || b[8] == 7 || b[8] == 8 || b[8] == 10)
            System.out.print("         |");
        else if (b[8] == 1)
            System.out.print("  aline  |");
        else if (b[8] == 3)
            System.out.print("  Phone  |");
        else if (b[8] == 4)
            System.out.print("  rette  |");
        else if (b[8] == 5)
            System.out.print(" Medicine|");
        else if (b[8] == 6)
            System.out.print("    Saw  |");
        else if (b[8] == 9)
            System.out.print("  fying  |");
        if (x == 0)
            System.out.print("                   ||+                 |");
        else if (x == 2)
            System.out.print("                  +------+             |");
        else
            System.out.print("                                       |");
        if (d[8] == 0 || d[8] == 2 || d[8] == 7 || d[8] == 8 || d[8] == 10)
            System.out.println("         |         |");
        else if (d[8] == 1)
            System.out.println("  aline  |         |");
        else if (d[8] == 3)
            System.out.println("  Phone  |         |");
        else if (d[8] == 4)
            System.out.println("  rette  |         |");
        else if (d[8] == 5)
            System.out.println("Medicine |         |");
        else if (d[8] == 6)
            System.out.println("  Saw    |         |");
        else if (d[8] == 9)
            System.out.println("  fying  |         |");
        System.out.print("        |         |");
        if (b[8] == 4)
            System.out.print("   Pack  O -----+------------+------------+----- O");
        else if (b[8] == 9)
            System.out.print("  Glass  O -----+------------+------------+----- O");
        else
            System.out.print("         O -----+------------+------------+----- O");
        if (d[8] == 4)
            System.out.println("  Pack   |         |");
        else if (d[8] == 9)
            System.out.println("  Glass  |         |");
        else
            System.out.println("         |         |");
        System.out.print("        |");
        if (b[4] == 0)
            System.out.print("         |       O        |            |            |        O       |");
        else if (b[4] == 1)
            System.out.print("  Adren  |       O        |            |            |        O       |");
        else if (b[4] == 2)
            System.out.print("   Beer  |       O        |            |            |        O       |");
        else if (b[4] == 3)
            System.out.print("  Burner |       O        |            |            |        O       |");
        else if (b[4] == 4)
            System.out.print("   Ciga  |       O        |            |            |        O       |");
        else if (b[4] == 5)
            System.out.print(" Expired |       O        |            |            |        O       |");
        else if (b[4] == 6)
            System.out.print("   Hand  |       O        |            |            |        O       |");
        else if (b[4] == 7)
            System.out.print(" Inverter|       O        |            |            |        O       |");
        else if (b[4] == 8)
            System.out.print("  Jammer |       O        |            |            |        O       |");
        else if (b[4] == 9)
            System.out.print("  Magni  |       O        |            |            |        O       |");
        else if (b[4] == 10)
            System.out.print("  Remote |       O        |            |            |        O       |");
        if (d[4] == 0)
            System.out.println("         |");
        else if (d[4] == 1)
            System.out.println("  Adren  |");
        else if (d[4] == 2)
            System.out.println("  Beer   |");
        else if (d[4] == 3)
            System.out.println(" Burner  |");
        else if (d[4] == 4)
            System.out.println("  Ciga   |");
        else if (d[4] == 5)
            System.out.println(" Expired |");
        else if (d[4] == 6)
            System.out.println("  Hand   |");
        else if (d[4] == 7)
            System.out.println("Inverter |");
        else if (d[4] == 8)
            System.out.println(" Jammer  |");
        else if (d[4] == 9)
            System.out.println("  Magni  |");
        else if (d[4] == 10)
            System.out.println(" Remote  |");
        System.out.print("        |");
        if (b[4] == 0 || b[4] == 2 || b[4] == 7 || b[4] == 8 || b[4] == 10)
            System.out.print("         |     O");
        else if (b[4] == 1)
            System.out.print("  aline  |     O");
        else if (b[4] == 3)
            System.out.print("  Phone  |     O");
        else if (b[4] == 4)
            System.out.print("  rette  |     O");
        else if (b[4] == 5)
            System.out.print(" Medicine|     O");
        else if (b[4] == 6)
            System.out.print("    Saw  |     O");
        else if (b[4] == 9)
            System.out.print("  fying  |     O");
        if (c[5] == 0 || c[5] == 1)
            System.out.print("          |");
        else if (c[5] == 2)
            System.out.print("   Beer   |");
        else if (c[5] == 3)
            System.out.print("  Burner  |");
        else if (c[5] == 4)
            System.out.print(" Cigarette|");
        else if (c[5] == 5)
            System.out.print("  Expired |");
        else if (c[5] == 6)
            System.out.print("   Hand   |");
        else if (c[5] == 7)
            System.out.print(" Inverter |");
        else if (c[5] == 8)
            System.out.print("  Jammer  |");
        else if (c[5] == 9)
            System.out.print("Magnifying|");
        else if (c[5] == 10)
            System.out.print("  Remote  |");
        if (c[6] == 0)
            System.out.print("            |");
        else if (c[6] == 1)
            System.out.print(" Adrenaline |");
        else if (c[6] == 2)
            System.out.print("    Beer    |");
        else if (c[6] == 3)
            System.out.print("   Burner   |");
        else if (c[6] == 4)
            System.out.print("  Cigarette |");
        else if (c[6] == 5)
            System.out.print("   Expired  |");
        else if (c[6] == 6)
            System.out.print("    Hand    |");
        else if (c[6] == 7)
            System.out.print("  Inverter  |");
        else if (c[6] == 8)
            System.out.print("   Jammer   |");
        else if (c[6] == 9)
            System.out.print(" Magnifying |");
        else if (c[6] == 10)
            System.out.print("   Remote   |");
        if (c[7] == 0)
            System.out.print("            |");
        else if (c[7] == 1)
            System.out.print(" Adrenaline |");
        else if (c[7] == 2)
            System.out.print("    Beer    |");
        else if (c[7] == 3)
            System.out.print("   Burner   |");
        else if (c[7] == 4)
            System.out.print(" Cigarette  |");
        else if (c[7] == 5)
            System.out.print("  Expired   |");
        else if (c[7] == 6)
            System.out.print("    Hand    |");
        else if (c[7] == 7)
            System.out.print("  Inverter  |");
        else if (c[7] == 8)
            System.out.print("   Jammer   |");
        else if (c[7] == 9)
            System.out.print(" Magnifying |");
        else if (c[7] == 10)
            System.out.print("   Remote   |");
        if (c[8] == 0 || c[8] == 1)
            System.out.print("          O     |");
        else if (c[8] == 2)
            System.out.print("   Beer   O     |");
        else if (c[8] == 3)
            System.out.print("  Burner  O     |");
        else if (c[8] == 4)
            System.out.print("Cigarette O     |");
        else if (c[8] == 5)
            System.out.print(" Expired  O     |");
        else if (c[8] == 6)
            System.out.print("   Hand   O     |");
        else if (c[8] == 7)
            System.out.print(" Inverter O     |");
        else if (c[8] == 8)
            System.out.print("  Jammer  O     |");
        else if (c[8] == 9)
            System.out.print("MagnifyingO     |");
        else if (c[8] == 10)
            System.out.print("  Remote  O     |");
        if (d[4] == 0 || d[4] == 2 || d[4] == 7 || d[4] == 8 || d[4] == 10)
            System.out.println("         |");
        else if (d[4] == 1)
            System.out.println("  aline  |");
        else if (d[4] == 3)
            System.out.println("  Phone  |");
        else if (d[4] == 4)
            System.out.println("  rette  |");
        else if (d[4] == 5)
            System.out.println("Medicine |");
        else if (d[4] == 6)
            System.out.println("  Saw    |");
        else if (d[4] == 9)
            System.out.println("  fying  |");
        System.out.print("        |");
        if (b[4] == 4)
            System.out.print("   Pack  |   O");
        else if (b[4] == 9)
            System.out.print("  Glass  |   O");
        else
            System.out.print("         |   O");
        if (c[5] == 0 || c[5] == 2 || c[5] == 7 || c[5] == 8 || c[5] == 10)
            System.out.print("            |");
        else if (c[5] == 1)
            System.out.print(" Adrenaline |");
        else if (c[5] == 3)
            System.out.print("    Phone   |");
        else if (c[5] == 4)
            System.out.print("      Pack  |");
        else if (c[5] == 5)
            System.out.print("   Medicine |");
        else if (c[5] == 6)
            System.out.print("      Saw   |");
        else if (c[5] == 9)
            System.out.print("      Glass |");
        if(c[6] == 0 || c[6] == 1 || c[6] == 2 || c[6] == 7 || c[6] == 8 || c[6] == 10)
            System.out.print("            |");
        else if (c[6] == 3)
            System.out.print("    Phone   |");
        else if (c[6] == 4)
            System.out.print("    Pack    |");
        else if (c[6] == 5)
            System.out.print("  Medicine  |");
        else if (c[6] == 6)
            System.out.print("     Saw    |");
        else if (c[6] == 9)
            System.out.print("    Glass   |");
        if(c[7] == 0 || c[7] == 1 || c[7] == 2 || c[7] == 7 || c[7] == 8 || c[7] == 10)
            System.out.print("            |");
        else if (c[7] == 3)
            System.out.print("   Phone    |");
        else if (c[7] == 4)
            System.out.print("    Pack    |");
        else if (c[7] == 5)
            System.out.print("  Medicine  |");
        else if (c[7] == 6)
            System.out.print("    Saw     |");
        else if (c[7] == 9)
            System.out.print("   Glass    |");
        if (c[8] == 0 || c[8] == 2 || c[8] == 7 || c[8] == 8 || c[8] == 10)
            System.out.print("            O   |");
        else if (c[8] == 1)
            System.out.print(" Adrenaline O   |");
        else if (c[8] == 3)
            System.out.print("   Phone    O   |");
        else if (c[8] == 4)
            System.out.print("  Pack      O   |");
        else if (c[8] == 5)
            System.out.print(" Medicine   O   |");
        else if (c[8] == 6)
            System.out.print("   Saw      O   |");
        else if (c[8] == 9)
            System.out.print(" Glass      O   |");
        if (d[4] == 4)
            System.out.println("  Pack   |");
        else if (d[4] == 9)
            System.out.println("  Glass  |");
        else
            System.out.println("         |");
        System.out.println("        |         | O              |            |            |              O |         |");
        System.out.println("        |         O ==========+====+============+============+====+========== O         |");
        System.out.println("        |       O             |                 |                 |             O       |");
        System.out.print("        |     O");
        if (c[1] == 0)
            System.out.print("               |");
        else if (c[1] == 1)
            System.out.print("   Adrenaline  |");
        else if (c[1] == 2)
            System.out.print("      Beer     |");
        else if (c[1] == 3)
            System.out.print("     Burner    |");
        else if (c[1] == 4)
            System.out.print("   Cigarette   |");
        else if (c[1] == 5)
            System.out.print("    Expired    |");
        else if (c[1] == 6)
            System.out.print("      Hand     |");
        else if (c[1] == 7)
            System.out.print("    Inverter   |");
        else if (c[1] == 8)
            System.out.print("     Jammer    |");
        else if (c[1] == 9)
            System.out.print("   Magnifying  |");
        else if (c[1] == 10)
            System.out.print("     Remote    |");
        if (c[2] == 0)
            System.out.print("                 |");
        else if (c[2] == 1)
            System.out.print("    Adrenaline   |");
        else if (c[2] == 2)
            System.out.print("       Beer      |");
        else if (c[2] == 3)
            System.out.print("      Burner     |");
        else if (c[2] == 4)
            System.out.print("    Cigarette    |");
        else if (c[2] == 5)
            System.out.print("     Expired     |");
        else if (c[2] == 6)
            System.out.print("       Hand      |");
        else if (c[2] == 7)
            System.out.print("     Inverter    |");
        else if (c[2] == 8)
            System.out.print("      Jammer     |");
        else if (c[2] == 9)
            System.out.print("    Magnifying   |");
        else if (c[2] == 10)
            System.out.print("      Remote     |");
        if (c[3] == 0)
            System.out.print("                 |");
        else if (c[3] == 1)
            System.out.print("   Adrenaline    |");
        else if (c[3] == 2)
            System.out.print("      Beer       |");
        else if (c[3] == 3)
            System.out.print("     Burner      |");
        else if (c[3] == 4)
            System.out.print("    Cigarette    |");
        else if (c[3] == 5)
            System.out.print("     Expired     |");
        else if (c[3] == 6)
            System.out.print("      Hand       |");
        else if (c[3] == 7)
            System.out.print("    Inverter     |");
        else if (c[3] == 8)
            System.out.print("     Jammer      |");
        else if (c[3] == 9)
            System.out.print("   Magnifying    |");
        else if (c[3] == 10)
            System.out.print("     Remote      |");
        if (c[4] == 0)
            System.out.println("               O     |");
        else if (c[4] == 1)
            System.out.println("  Adrenaline   O     |");
        else if (c[4] == 2)
            System.out.println("     Beer      O     |");
        else if (c[4] == 3)
            System.out.println("    Burner     O     |");
        else if (c[4] == 4)
            System.out.println("   Cigarette   O     |");
        else if (c[4] == 5)
            System.out.println("    Expired    O     |");
        else if (c[4] == 6)
            System.out.println("     Hand      O     |");
        else if (c[4] == 7)
            System.out.println("   Inverter    O     |");
        else if (c[4] == 8)
            System.out.println("    Jammer     O     |");
        else if (c[4] == 9)
            System.out.println("  Magnifying   O     |");
        else if (c[4] == 10)
            System.out.println("    Remote     O     |");
        System.out.print("        |   O");
        if (c[1] == 0 || c[1] == 1 || c[1] == 2 || c[1] == 7 || c[1] == 8 || c[1] == 10)
            System.out.print("                 |");
        else if (c[1] == 3)
            System.out.print("        Phone    |");
        else if (c[1] == 4)
            System.out.print("        Pack     |");
        else if (c[1] == 5)
            System.out.print("      Medicine   |");
        else if (c[1] == 6)
            System.out.print("         Saw     |");
        else if (c[1] == 9)
            System.out.print("        Glass    |");
        if (c[2] == 0 || c[2] == 1 || c[2] == 2 || c[2] == 7 || c[2] == 8 || c[2] == 10)
            System.out.print("                 |");
        else if (c[2] == 3)
            System.out.print("       Phone     |");
        else if (c[2] == 4)
            System.out.print("       Pack      |");
        else if (c[2] == 5)
            System.out.print("     Medicine    |");
        else if (c[2] == 6)
            System.out.print("        Saw      |");
        else if (c[2] == 9)
            System.out.print("      Glass      |");
        if (c[3] == 0 || c[3] == 1 || c[3] == 2 || c[3] == 7 || c[3] == 8 || c[3] == 10)
            System.out.print("                 |");
        else if (c[3] == 3)
            System.out.print("     Phone       |");
        else if (c[3] == 4)
            System.out.print("      Pack       |");
        else if (c[3] == 5)
            System.out.print("    Medicine     |");
        else if (c[3] == 6)
            System.out.print("      Saw        |");
        else if (c[3] == 9)
            System.out.print("      Glass      |");
        if (c[4] == 0 || c[4] == 1 || c[4] == 2 || c[4] == 7 || c[4] == 8 || c[4] == 10)
            System.out.println("                 O   |");
        else if (c[4] == 3)
            System.out.println("    Phone        O   |");
        else if (c[4] == 4)
            System.out.println("     Pack        O   |");
        else if (c[4] == 5)
            System.out.println("   Medicine      O   |");
        else if (c[4] == 6)
            System.out.println("     Saw         O   |");
        else if (c[4] == 9)
            System.out.println("    Glass        O   |");
        System.out.println("        | O                   |                 |                 |                   O |");
        System.out.println("        +---------------------+-----------------+-----------------+---------------------+");
        System.out.println("                                  P   L   A   Y   E   R       3");
    }
    public static void twoPlayers(int[] a, int[] b, int x, String[] y, int[] z) {
        int i;
        System.out.println("\t\t\t\t\t\t      BUCKSHOT ROULETTE");
        System.out.println("\t\t\t\t\t\t created by SS GAMING STUDIOS");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("\n");
        System.out.println("                                  P   L   A   Y   E   R       1");
        System.out.println("        +---------------------------------------+---------------------------------------+");
        System.out.println("        | O                                     |                                     O |");
        System.out.print("        |   O");
        if (a[1] == 0 || a[1] == 1 || a[1] == 2 || a[1] == 7 || a[1] == 8 || a[1] == 10)
            System.out.print("                 |");
        else if (a[1] == 3)
            System.out.print("               Burner              |");
        else if (a[1] == 4)
            System.out.print("              Cigarette            |");
        else if (a[1] == 5)
            System.out.print("               Expired             |");
        else if (a[1] == 6)
            System.out.print("                Hand               |");
        else if (a[1] == 9)
            System.out.print("             Magnifying            |");
        if (a[4] == 0 || a[4] == 1 || a[4] == 2 || a[4] == 7 || a[4] == 8 || a[4] == 10)
            System.out.println("                                   O   |");
        else if (a[4] == 3)
            System.out.println("              Burner               O   |");
        else if (a[4] == 4)
            System.out.println("            Cigarette              O   |");
        else if (a[4] == 5)
            System.out.println("             Expired               O   |");
        else if (a[4] == 6)
            System.out.println("               Hand                O   |");
        else if (a[4] == 9)
            System.out.println("            Magnifying             O   |");
        System.out.print("        |     O");
        if (a[1] == 0)
            System.out.print("                                 |");
        else if (a[1] == 1)
            System.out.print("            Adrenaline           |");
        else if (a[1] == 2)
            System.out.print("               Beer              |");
        else if (a[1] == 3)
            System.out.print("              Phone              |");
        else if (a[1] == 4)
            System.out.print("               Pack              |");
        else if (a[1] == 5)
            System.out.print("             Medicine            |");
        else if (a[1] == 6)
            System.out.print("               Saw               |");
        else if (a[1] == 7)
            System.out.print("             Inverter            |");
        else if (a[1] == 8)
            System.out.print("              Jammer             |");
        else if (a[1] == 9)
            System.out.print("              Glass              |");
        else if (a[1] == 10)
            System.out.print("              Remote             |");
        if (a[4] == 0)
            System.out.println("                                 O     |");
        else if (a[4] == 1)
            System.out.println("           Adrenaline            O     |");
        else if (a[4] == 2)
            System.out.println("              Beer               O     |");
        else if (a[4] == 3)
            System.out.println("              Phone              O     |");
        else if (a[4] == 4)
            System.out.println("              Pack               O     |");
        else if (a[4] == 5)
            System.out.println("            Medicine             O     |");
        else if (a[4] == 6)
            System.out.println("               Saw               O     |");
        else if (a[4] == 7)
            System.out.println("            Inverter             O     |");
        else if (a[4] == 8)
            System.out.println("             Jammer              O     |");
        else if (a[4] == 9)
            System.out.println("              Glass              O     |");
        else if (a[4] == 10)
            System.out.println("             Remote              O     |");
        System.out.println("        |       O                               |                               O       |");
        System.out.println("        |         O ============================+============================ O         |");
        System.out.println("        |         | O                           |                           O |         |");
    }
}
/*
                                                P   L   A   Y   E   R       1
                      +---------------------+-----------------+-----------------+---------------------+
                      | O                   |                 |                 |                   O |
                      |   O    Magnifying   |    Magnifying   |                 |                 O   |
                      |     O     Glass     |      Glass      |                 |               O     |
                      |       O             |                 |                 |             O       |
                      |         O ==========+====+============+============+====+========== O         |
                      |  Magni  | O              |            |            |              O |         |
                      |  fying  |   O Magnifying | Magnifying |            |            O   |         |
                      |  Glass  |     O   Glass  |    Glass   |            |          O     |         |
                      |         |       O        |            |            |        O       |         |
                      |         |         O -----+------------+------------+----- O  Magni  |         |
                      +=========+         |                 +||                   |  fying  +=========+
                    P |         |         |                  ||                   |  Glass  |         | p
                      |         |         |                  ||                   |         |         |
                    L |         +=========+                  ||                   +=========+         | L
                      | Expired |         |                  ||                   |         |         |
                    A | Medicine|         |                  ||                   |         |         | A                                +----+
                      |         |         |                  |++                  |         |         |                           +----/      |
                    Y |         |         |                ++| |                  |         |         | Y               +---------+--V        |
                      +=========+=========+                ||| |                  +=========+=========+   ==============+--------+------------+
                    E |         |         |                ||| |-+                |         |         | E  +                 ====O====         
                      |         |         |                O=+ |/|                |         |         |
                    R |         |         |                ||| \ |                |         |         | R
                      |         |         |                ++|  \+                |         |         |
                      |         +=========+                  |   \                +=========+         |
                    2 |         |         |                  |    \               |         |         | 4
                      +=========+         |                  |     \              |         +=========+
                      |         |         |                  +------+             |         |         |
                      |         |         O -----+------------+------------+----- O         |         |
                      |  Magni  |       O        |            |            |        O       |         |
                      |  fying  |     O Cigarette|            |            |          O     |         |
                      |  Glass  |   O    Pack    |            |            |            O   |         |
                      |         | O              |            |            |              O |         |
                      |         O ==========+====+============+============+====+========== O         |
                      |       O             |                 |                 |             O       |
                      |     O               |                 |                 |               O     |
                      |   O                 |                 |                 |                 O   |
                      | O                   |                 |                 |                   O |
                      +---------------------+-----------------+-----------------+---------------------+
                                                P   L   A   Y   E   R       3
                                                P   L   A   Y   E   R       1
                      +---------------------------------------+---------------------------------------+
                      | O                                     |                                     O |
                      |   O               Burner              |                                   O   |
                      |     O              Glass              |                                 O     |
                      |       O                               |                               O       |
                      |         O ============================+============================ O         |
                      |         | O                           |                           O |         |
                      |         |   O                         |                         O   |         |
                      |         |     O                       |                       O     |         |
                      |         |       O                     |                     O       |         |
                      |         |         O ------------------+------------------ O         |         |
                      |  Magni  |         |                 +||                   |         |         |
                      |  fying  |         |                  ||                   |         |         |  
                      |  Glass  |         |                  ||                   |         |         |
                      |         |         |                  ||                   |         |         |  
                      |         |         |                  ||                   |         |         |
                      |         |         |                  ||                   |         |         |                                  +----+
                      |         |         |                  |++                  |         |         |                           +----/      |
                      |         |         |                ++| |                  |         |         |                 +---------+--V        |
                      +=========+=========+                ||| |                  +=========+=========+   ==============+--------+------------+
                      |         |         |                ||| |-+                |         |         |    +                 ====O====         
                      |         |         |                O=+ |/|                |         |         |
                      |         |         |                ||| \ |                |         |         |  
                      |         |         |                ++|  \+                |         |         |
                      |         |         |                  |   \                |         |         |
                      |         |         |                  |    \               |         |         |  
                      |         |         |                  |     \              |         |         |
                      |         |         |                  +------+             |         |         |
                      |         |         O ------------------+------------------ O         |         |
                      |         |       O                     |                     O       |         |
                      |         |     O                       |                       O     |         |
                      |         |   O                         |                         O   |         |
                      |         | O                           |                           O |         |
                      |         O ============================+============================ O         |
                      |       O                               |                               O       |
                      |     O                                 |                                 O     |
                      |   O                                   |                                   O   |
                      | O                                     |                                     O |
                      +---------------------------------------+---------------------------------------+
                                                P   L   A   Y   E   R       2
*/