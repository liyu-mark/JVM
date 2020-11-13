package heap;

import java.util.ArrayList;
import java.util.List;

public class GcArgs {

    /**
     * - -XX：+PrintFlagsInitial：查看所有的参数的默认初始值
     * - -XX：+PrintFlagsFinal：查看所有的参数的最终值（可能会存在修改，不再是初始值）
     * - -Xms：初始堆空间内存（默认为物理内存的1/64）
     * - -Xmx：最大堆空间内存（默认为物理内存的1/4）
     * - -Xmn：设置新生代的大小。（初始值及最大值）
     * - -XX:NewRatio：配置新生代与老年代在堆结构的占比
     * - -XX:SurvivorRatio：设置新生代中Eden和S0/S1空间的比例
     * - -XX:MaxTenuringThreshold：设置新生代垃圾的最大年龄
     * - -XX：+PrintGCDetails：输出详细的GC处理日志
     *   - 打印gc简要信息：①-Xx：+PrintGC  ② - verbose:gc
     * - -XX:HandlePromotionFalilure：是否设置空间分配担保
     *
     *  TLAB thread local allocation buffer 线程缓冲区
     *  每个线程都有单独的缓存区 没有的话进行加锁机制来确保数据的一致性  UseTLAB 默认大小为Eden区的 1%
     *
     *  -Xms12m -Xmx12m -XX:+PrintGCDetails
     *
     *  10m = 1:2 = 4m:8m =
     *
     *
     *  [GC (Allocation Failure) [PSYoungGen: 2978K->496K(3584K)] 2978K->1236K(11776K), 0.0009653 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
     *  Allocation Failure 表明本次引起GC的原因是因为在年轻代中没有足够的空间能够存储新的数据了。
     *  Ergonomics 自适应调节策略
     *  2978K->496K(3584K) GC前内存->GC后内存（新生区总大小）
     *  2978K->1236K(11776K) GC前堆内存->GC后堆内存（JVM堆总大小）
     *  0.0009653 secs GC耗时
     *  Times: user=0.00 sys=0.00, real=0.00 secs GC用户耗时 GC系统耗时 GC实际耗时
     */
    public static void main(String[] args) throws InterruptedException {
        //Thread.sleep(1000000);
        int i = 0;
        try {
            List<String> list = new ArrayList<>();
            String a = "liyu";
            while(true) {
                list.add(a);
                a = a + a;
                i++;
            }
        }catch (Exception e) {
            e.getStackTrace();
        }
    }

}
