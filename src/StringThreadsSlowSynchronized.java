//class PrintStringThread extends Thread {
//    private static synchronized void fakePrintLn(String s) {
//        for (int i = 0; i < s.length(); ++i) {
//            System.out.print(s.charAt(i));
//        }
//        System.out.println();
//    }
//
//    PrintStringThread(String s) {
//        super(s);
//    }
//    @Override
//    public void run() {
//        for (int i = 1; i <= 100000; ++i) {
//            fakePrintLn(getName() + " " + i);
//        }
//    }
//}
//
//public class StringThreadsSlowSynchronized {
//    public static void main(String[] args) {
//        String[] array = {"hello", "world", "other"};
//        for (String s: array) {
//            PrintStringThread pst = new PrintStringThread(s);
//            pst.start();
//        }
//    }
//}