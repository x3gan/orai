//public class ThreadInterrupt {
//    public static void main(String args[]){
//        Thread numbers = new Thread(new Numbers());
//        Thread negativeNumbers = new Thread(new NegativeNumbers());
//        numbers.start();
//        negativeNumbers.start();
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//
//        }
//        numbers.interrupt(); // megszakitja a szalon beluli sleepet
//        negativeNumbers.interrupt();
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
//            try {
//                Thread.sleep(5);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//                break;
//            }
//            System.out.print(i + ",");
//        }
//    }
//}
//
//class NegativeNumbers implements Runnable{
//    @Override public void run(){
//        for (int i = 1; i <= 1000; ++i){
//            try {
//                Thread.sleep(5);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//                break;
//            }
//            System.out.print(i + "," + -i + ",");
//        }
//    }
//}
//
//// illegal thread state exception, ha break utan ujrainditjuk, szal futasa egyszerhasznalatos, de metodusai elerhetoek