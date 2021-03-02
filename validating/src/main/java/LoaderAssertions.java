// validating/LoaderAssertions.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Using the class loader to enable assertions
// {ThrowsException}

public class LoaderAssertions {
    //方式一：决定在程序运行时启用断言assertion可以使用下面的 static 块来实现这一点，该语句位于系统的主类中：
    static {
        boolean assertionsEnabled = false;
        // Note intentional side effect of assignment:
        assert assertionsEnabled = true;
        if (!assertionsEnabled)
            throw new RuntimeException("Assertions disabled");
    }

    public static void main(String[] args) {
        //方式二：通过编程的方式通过链接到类加载器对象（ClassLoader）来控制断言。
        // 类加载器中有几种方法允许动态启用和禁用断言，其中 setDefaultAssertionStatus () ,
        // 它为之后加载的所有类设置断言状态。
        ClassLoader.getSystemClassLoader()
                .setDefaultAssertionStatus(true);
        new Loaded().go();
    }
}

class Loaded {
    public void go() {
        assert false : "Loaded.go()";
    }
}
/* Output:
___[ Error Output ]___
Exception in thread "main" java.lang.AssertionError:
Loaded.go()
        at Loaded.go(LoaderAssertions.java:15)
        at
LoaderAssertions.main(LoaderAssertions.java:9)
*/
