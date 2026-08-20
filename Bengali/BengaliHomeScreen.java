package Bengali;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class BengaliHomeScreen {
    public static void main(String[] args)throws IOException {
        int a;
        int[] b = {0, 0, 0, 0, 0, 0, 0, 0};
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            do {
                System.out.println("\t\t\t\t\t\t                         খেলা");
                System.out.println("\t\t\t\t\t\tSS GAMING STUDIOS দ্বারা নির্মিত");
                System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("আপনি কোন গেমটি খেলতে চান বাছুন:");
                System.out.println("        1   -   হ্যান্ড ক্রিকেট");
                System.out.println("        2   -   স্টোন পেপার সিজার");
                System.out.println("        3   -   টিক্ ট্যাক্ টো");
                System.out.println("        4   -   ফোর ডোর");
                System.out.println("        5   -   সাপ সিঁড়ি");
                System.out.println("        6   -   ইয়াজি");
                System.out.println("        7   -   বাহির");
                System.out.print("\tআপনার পছন্দ দিন: ");
                a = Byte.parseByte(br.readLine());
                System.out.print('\u000C');
                switch(a) {
                    case 5:
                        SnakeAndLadder.main(b[4]);
                        b[4]++;
                        break;
                    case 6:
                        Yazy.display();
                        break;
                }
            } while(a != 7);
        }
        catch(Exception ex) {
            System.out.print("\n"+ (char)(2437) + (char)(2476) + (char)(2504) + (char)(2471) +" "+ (char)(2439));
            System.out.println(""+ (char)(2472) + (char)(2474) + (char)(2497) + (char)(2463) +"!");
            System.out.print(""+ (char)(2437) + (char)(2472) + (char)(2497) + (char)(2455) + (char)(2509) + (char)(2480));
            System.out.print(""+ (char)(2489) +" "+ (char)(2453) + (char)(2480) + (char)(2503) +" "+ (char)(2474));
            System.out.print(""+ (char)(2497) + (char)(2472) + (char)(2480) + (char)(2494) + (char)(2527) +" ");
            System.out.print(""+ (char)(2474) + (char)(2509) + (char)(2480) + (char)(2507) + (char)(2455) + (char)(2509));
            System.out.print(""+ (char)(2480) + (char)(2494) + (char)(2478) + (char)(2463) + (char)(2495) +" ");
            System.out.print(""+ (char)(2458) + (char)(2494) + (char)(2482) + (char)(2497) +" "+ (char)(2453));
            System.out.println(""+ (char)(2480) + (char)(2497) + (char)(2472) +"...");
            System.out.print(ex);
        }
    }
}