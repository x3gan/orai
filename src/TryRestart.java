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
//public class TryRestart {
//    public static void main(String[] args) {
//        Thread numbers = new Thread(new Numbers());
//        Thread numbersAndNegatedNumbers = new Thread(new NumbersAndNegatedNumbers());
//        numbers.start();
//        numbersAndNegatedNumbers.start();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        numbers.interrupt();
//        numbersAndNegatedNumbers.interrupt();
//        numbers.start();
//        numbersAndNegatedNumbers.start();
//    }
//}