package heap;

public class HeapData {

    /**
     * -Xms -Xmx -XX:+PrintGCDetails
     * Runtime代表运行时数据区 包括（虚拟机栈，本地方法栈，程序计数器，堆，方法区）
     * 默认Xms为本地内存的 1/64  Xmx为本地内存的 1/4
     * 查看内存使用情况 jstat -gc pid
     * 默认配置 Xms=Xmx=600m 增大扩容时需要消耗性能资源  Xms=Xmx=伊甸园区+幸存者0/幸存者1+老年区  因为垃圾回收算法默认只有一个幸存者区使用
     */
    public static void main(String[] args) {
        //获取运行时数据区
        Runtime runtime = Runtime.getRuntime();
        long initMemory = runtime.totalMemory()/1024/1024;
        long maxMemory = runtime.maxMemory()/1024/1024;
        System.out.println("-Xms"+initMemory+"M");
        System.out.println("-Xmx"+maxMemory+"M");

    }
    /**
     * -Xms575M
     * -Xmx575M
     * Heap
     *  PSYoungGen（新生区）      total 179200K, used 12288K [0x00000000f3800000, 0x0000000100000000, 0x0000000100000000)
     *   eden space 153600K, 8% used [0x00000000f3800000,0x00000000f44001b8,0x00000000fce00000)
     *   from space 25600K, 0% used [0x00000000fe700000,0x00000000fe700000,0x0000000100000000)
     *   to   space 25600K, 0% used [0x00000000fce00000,0x00000000fce00000,0x00000000fe700000)
     *  ParOldGen  （老年区）     total 409600K, used 0K [0x00000000da800000, 0x00000000f3800000, 0x00000000f3800000)
     *   object space 409600K, 0% used [0x00000000da800000,0x00000000da800000,0x00000000f3800000)
     *  Metaspace  （元空间）    used 3462K, capacity 4496K, committed 4864K, reserved 1056768K
     *   class space    used 381K, capacity 388K, committed 512K, reserved 1048576K
     *
     *   Xms=-Xmx=575M  <==>  eden+(from+to)/2+ParOldGen
     */

}
