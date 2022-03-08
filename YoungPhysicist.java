import java.util.Scanner;
public class YoungPhysicist {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] forceVector = new int[3];

        int n = sc.nextInt(), a;
        while (n-- != 0) {
            for (int i = 0; i < 3; ++i) {
                a = sc.nextInt();
                forceVector[i] += a;
            }
        }
        if (forceVector[0] == 0 && forceVector[1] == 0 && forceVector[2] == 0)
            System.out.print ("YES");
        else
            System.out.print("NO");

    }
}
