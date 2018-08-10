package functionInterface;

/***
 * @Author: jiyang
 * @Date: 2018-08-09 16:37
 */
public class Test {

    public static void main(String[] args) {
        GreetingService greetingService = message -> System.out.println(message);

        GreetingService greetingService2 = message -> System.out.println(message + "1");

        Test test = new Test();
        // lambda 表达式
        test.testRun("hello", (hello) -> System.out.println("hello function interface"));
        // 方法引用
        test.testRun("aa", test::methodFoo);

    }

    public void testRun(String message, Foo foo) {
        System.out.println(message);
        foo.run(message);
    }

    public void methodFoo(String k) {
        System.out.println(k);
    }
}
