import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution_2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try (FileWriter outputStream = new FileWriter(scanner.nextLine(),true);
             BufferedWriter bufferedWriter = new BufferedWriter(outputStream)) {
            String s = scanner.nextLine();
            while (!s.equals("exit")) {
                bufferedWriter.write(s+"\n");
                s = scanner.nextLine();
            }
            if(s.equals("exit")){
                bufferedWriter.write(s);
            }
        }
    }
}