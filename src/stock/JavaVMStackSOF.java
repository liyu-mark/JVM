package stock;

public class JavaVMStackSOF {

    /**
     * stockoverflow 一般指的是栈溢出 栈是指虚拟机栈（栈帧==局部变量表+操作数栈+动态链接+返回参数）
     * JVM参数：-Xss128k
     */
    private int stackLength = -1;

    //通过递归调用造成StackOverFlowError
    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("Stack length:" + oom.stackLength);
            e.printStackTrace();
        }
    }

}
