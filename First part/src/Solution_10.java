package src;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Solution_10 {
//добавьте классы Goose и Dragon тут

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //add your code here
        if (n == 1 || n == 0){
            return "1";
        }
        return BigDecimal.valueOf(n).multiply(new BigDecimal(factorial(n-1))).toString();
    }
}
