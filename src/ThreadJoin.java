//public class ThreadJoin {
//    public static void main(String args[]){
//        Thread numbers = new Thread(new Numbers());
//        Thread negativeNumbers = new Thread(new NegativeNumbers());
//        numbers.start();
//        negativeNumbers.start();
//
//        try {
//            numbers.join();
//            negativeNumbers.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//
//        }
//
//        System.out.println("Ready.");
//
//
//    }
//}
//
//class Numbers implements Runnable {
//    @Override public void run(){
//        for (int i = 1; i <= 1000; ++i){
//            System.out.print(i + ",");
//        }
//    }
//}
//
//class NegativeNumbers implements Runnable{
//    @Override public void run(){
//        for (int i = 1; i <= 1000; ++i){
//            System.out.print(i + "," + -i + ",");
//        }
//    }
//}