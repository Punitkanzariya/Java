//  Write  a  program  to  create  two  threads, 
//  one  thread  will  print  odd  numbers  and  the 
//  second  thread  will  print  even  numbers 
//  between 1 to 20 numbers. 

 class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(100); // Sleep to simulate delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(100); // Sleep to simulate delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class EvenOddThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        // Start the threads
        oddThread.start();
        evenThread.start();
    }
}
