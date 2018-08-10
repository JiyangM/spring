package methodHandle;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/***
 *
 * 方法句柄 现代化的反射
 *
 * https://www.jianshu.com/p/bb0d8e2fa8f5
 *
 * @Author: jiyang
 * @Date: 2018-08-10 10:01
 */
public class MethodHandleTest {

    public int f1(String a) {
        System.out.println("f1:" + a);
        return 1;
    }

    public void f2() {
        System.out.println("f2");
    }

    public static void f3(int a) {
        System.out.println("f3");
    }

    public static void main(String[] args) throws Throwable {
        MethodType m1 = MethodType.methodType(int.class, String.class);
        MethodType m2 = MethodType.methodType(void.class);//没有参数，返回值是void的方法
        MethodType m3 = MethodType.methodType(void.class, int.class);

        MethodHandle f1 = MethodHandles.lookup().findVirtual(MethodHandleTest.class, "f1", m1);
        MethodHandle f2 = MethodHandles.lookup().findVirtual(MethodHandleTest.class, "f2", m2);
        MethodHandle f3 = MethodHandles.lookup().findStatic(MethodHandleTest.class, "f3", m3);

        MethodHandleTest methodHandleTest = new MethodHandleTest();
        f1.invoke(methodHandleTest, "a");
        f2.invoke(methodHandleTest);

        //使用invokeExact调用时，参数类型和返回值类型必须与方法签名的一致
        int a = (int) f1.invokeExact(methodHandleTest, "1234");

        f3.invoke(11);

    }
}
