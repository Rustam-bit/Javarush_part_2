package src;


import java.io.File;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Solution_9 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine(), s2 = scanner.nextLine();
        Integer a = Integer.parseInt(s1), b = Integer.parseInt(s2);
        System.out.println(gcd(a,b));
    }
    public static int gcd(int a,int b) {
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
