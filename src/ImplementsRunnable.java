//public class ImplementsRunnable {
//    public static void main(String args[]){
//        Thread numbers = new Thread(new Numbers());
//        Thread negativeNumbers = new Thread(new NegativeNumbers());
//        numbers.start();
//        negativeNumbers.start();
//
//    }
//}
//
//class Numbers implements Runnable {
//    @Override public void run(){
//        for (int i = 1; i <= 100000; ++i){
//            System.out.print(i + ",");
//        }
//    }
//}
//
//class NegativeNumbers implements Runnable{
//    @Override public void run(){
//        for (int i = 1; i <= 100000; ++i){
//            System.out.print(i + "," + -i + ",");
//        }
//    }
//}