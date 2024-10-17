
import java.io.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution_4 {
    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();
        List<Integer> list = new ArrayList<>();
        try (
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedInputStream = new BufferedReader(fileReader)) {
            while (bufferedInputStream.ready()) {
                String s = bufferedInputStream.readLine();
                list.add(Integer.valueOf(s));
            }
            list.sort(((o1, o2) -> o1 - o2));
            list.stream().filter(s -> s % 2 == 0).forEach(System.out::println);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}