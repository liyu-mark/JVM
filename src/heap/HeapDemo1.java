package heap;

public class HeapDemo1 {

    /**
     * -Xms10m -Xmx10m
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
