package heap;

public class HeapDemo1 {

    /**
     * -Xms10m -Xmx10m
     * -X 参数(设置堆内存 新生区+老年区)
     * ms memory start
     * mx memory max
     * -XX:+PrintGCDetails
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
