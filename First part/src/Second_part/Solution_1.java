package src.Second_part;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution_1 {
    public static volatile boolean cancel = true;
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
       cancel = false;
    }

    public static class TestThread implements Runnable {
        public void run() {
            while (cancel) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
