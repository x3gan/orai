//class Numbers implements Runnable {
//    @Override
//    public void run() {
//        for (int i = 1; i <= 1000; ++i) {
//            System.out.print(i + ",");
//            try {
//                Thread.sleep(5);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//                break;
//            }
//        }
//    }
//}
//
//class NumbersAndNegatedNumbers implements Runnable {
//    @Override
//    public void run() {
//        for (int i = 1; i <= 1000; ++i) {
//            System.out.print(i + "," + -i + ",");
//            try {
//                Thread.sleep(5);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//                break;
//            }
//        }
//    }
//}
//
//public class ThreadSleep {
//    public static void main(String[] args) {
//        Thread numbers = new Thread(new Numbers());
//        Thread numbersAndNegatedNumbers = new Thread(new NumbersAndNegatedNumbers());
//        numbers.start();
//        numbersAndNegatedNumbers.start();
//        try {
//            numbers.join();
//            numbersAndNegatedNumbers.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Ready.");
//    }
//}