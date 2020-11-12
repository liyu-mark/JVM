package classloader;

public class ClassLoaderTest {

    /**
     * 加载-链接（1、验证 2、准备 3、解析）-初始化
     * 准备阶段：
     * final: 在该阶段已经被显式初始化
     * static:在该阶段被赋值初始值 即 a=0
     * 实例变量:在该阶段不会赋值
     *
     * 初始化时进行赋值 初始化阶段就是执行类构造器法<clinit>（）的过程
     * 初始化阶段就是对static变量及static代码块进行初始化 clinit == class init 类的初始化
     * init == 实例初始化
     *
     */

    private static int a = 1;

    /*static {
        a = 3;
    }*/
    private int b=2;
    public static void main(String[] args) {
        int a=2;
    }

}
