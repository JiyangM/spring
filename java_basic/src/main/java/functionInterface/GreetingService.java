package functionInterface;

/***
 *
 * 函数式接口，有且仅有一个抽象方法，Object的public方法除外。
 * https://www.zybuluo.com/changedi/note/616132 *
 * @FunctionalInterface 在编译时检查函数式接口的合法性
 * @Author: jiyang
 * @Date: 2018-08-09 16:35
 */
@FunctionalInterface
public interface GreetingService {

    void sayHello(String message);
}
