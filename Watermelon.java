import java.util.Scanner;

public class Watermelon {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 2 && a % 2 == 0)
            System.out.print("YES");
        else System.out.print("NO");
    }

    }
