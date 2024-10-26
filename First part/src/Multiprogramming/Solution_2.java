package src.Multiprogramming;

public class Solution_2 {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread {
        @Override
        public void run() {
            if (count > createdThreadCount){
                System.out.println(new GenerateThread());
            }
        }

        @Override
        public String toString() {
            return createdThreadCount +" "+ "created";
        }

        public GenerateThread() {
           // createdThreadCount++;
            super(Integer.toString(++createdThreadCount));
            start();

        }
    }
}
