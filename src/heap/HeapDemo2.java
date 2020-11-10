package heap;

public class HeapDemo2 {

    /**
     * -Xms20m -Xmx20m
     * @param args
     */
    public static void main(String[] args) {
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread()+"end...");
    }

}
