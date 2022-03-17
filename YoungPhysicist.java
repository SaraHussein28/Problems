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
    public String solve (int n, int[][] arr) {
        int[] forceVector = new int[3];

        int a;
       for (int j = 0; j < n; j++) {
            for (int i = 0; i < 3; ++i) {
                a = arr[j][i];
                forceVector[i] += a;
            }
        }
        if (forceVector[0] == 0 && forceVector[1] == 0 && forceVector[2] == 0)
            return ("YES");
        else
           return("NO");

    }

}

