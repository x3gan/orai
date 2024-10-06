import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.synchronizedList;

public class CommonListSynchronizedList {

    private static List<Integer> intList = synchronizedList(new ArrayList<>());

    private static class Odd extends Thread {
        public void run() {
            for (int i = 1; i < 100000; i += 2) {
                intList.add(i);
            }
        }
    }

    private static class Even extends Thread {
        public void run() {
            for (int i = 2; i < 100000; i += 2) {
                intList.add(i);
            }
        }
    }

    public static void main(String[] args) {
        Odd odd = new Odd();
        Even even = new Even();
        odd.start();
        even.start();
        try {
            odd.join();
            even.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Length of the list: " + intList.size());
    }
}