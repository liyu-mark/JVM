package classloader;

/** jvm 加载顺序
 *  JavaTest程序的入口是public static void main，那么在调用这个main函数之前，需要执行类的加载过程，类加载成功后才会去调用main方法
 *  加载 链接 初始化 调用main
 *
 *
 * 第一步：在类加载过程的准备阶段，先对b进行系统的赋值，b = 0。
 * 第二步：在类加载过程的初始化阶段，执行<clinit>方法，那么先执行类变量的初始化，即：static JavaTest javaTest = new JavaTest();
 * 第三步：在第二步的时候，<clinit>正在执行，而且此时进行类对象的初始化，会去调用<init>方法，因此会首先执行非静态代码块：System.out.println("2")，
 * 然后执行非静态变量的初始化：a = 100 （此时的先后顺序依照代码编写的先后顺序），
 * 然后执行构造函数：System.out.println("3");System.out.println("a=" + a + ", b=" + b);此时a的值为100，b的值还是0，因为<cinit>还只执行到static JavaTest javaTest = new JavaTest();
 * 第四步：<init>方法已经执行完了，那么就接下来执行<cinit>剩余的部分，先执行类的静态代码块：System.out.println("2")，再执行类的静态变量初始化：static int b = 200。（此时的先后顺序依照代码编写的先后顺序）此时<cinit>方法就执行完成了。
 * 第五步：<clinit>和<init>方法都已经执行完成了，类已经加载完成，此时就是函数的调用了，JavaTest的函数入口是main()方法，因此会调用静态方法f1()：System.out.println("4"); 到此，整个程序就执行完成了。
 *
     2
     3
     a=100, b=0
     1
     4
 */
public class JavaTest {
    //加载 链接（验证、准备、解析） 初始化  执行完毕进行main函数的调用 1、clinit(对static变量及代码块进行初始化) ①static JavaTest javaTest = new JavaTest();调用实例init
    public static void main(String[] args){
        f1();
    }

    static JavaTest javaTest = new JavaTest();

    static {
        System.out.println("1");
    }

    {
        System.out.println("2");
    }

    JavaTest(){
        System.out.println("3");
        System.out.println("a=" + a + ", b=" + b);
    }

    public static void f1(){
        System.out.println("4");
    }

    int a = 100;
    static int b = 200;

}
