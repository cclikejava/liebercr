package com.cc.test;

import java.util.*;
//静态引入
import static net.mindview.util.Print.*;
import static java.lang.System.out;

/**
 * 操作符  在java中数据是通过使用操作符来决定的
 */
public class App1 {


    public static void main(String[] args) {

        App1 app =new App1();
        app.test2();
    }

    /**
     * 静态引入的使用一般我们导入一个类都用 import com.....ClassName;而静态导入是这样：
     * import static com.....ClassName.*;这里的多了个static，还有就是类名ClassName后
     * 面多了个 .*，意思是导入这个类里的静态方法。当然，也可以只导入某个静态方法，只要把 .*
     * 换成静态方法名就行了.然后在这个类中，就可以直接用方法名调用静态方法，而不必用ClassName.
     * 方法名 的方式来调用
     */
    public void test1() {
        System.out.println(".....");
        out.println("fff");
        print("hello It's ");
        print(new Date());
    }

    /**
     * java操作符 优先级
     * +
     * -
     * *
     * /
     */
    public void test2() {

        int x = 3, y = 2, z = 1;
        int a = x + y - 2 / 2 + z;
        int b = x + (y - 2) / (z + 2);
        System.out.println("a=" + a + ",b=" + b);
    }
}
