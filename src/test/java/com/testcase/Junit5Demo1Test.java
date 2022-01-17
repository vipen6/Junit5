package test.java.com.testcase;


import org.junit.jupiter.api.*;
@DisplayName("Junit5Demo类")
public class Junit5Demo1Test {

    @BeforeAll
    //需要使用静态的
    public static void before(){
        System.out.println("before");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("beforeEach");
    }

    @Test
    @DisplayName("fun测试方法")
    @RepeatedTest(5) //循环执行5次
    //junit5,相比junit4，这里可以不使用修饰符
    void fun(){
        System.out.println("fun");
    }

    @Test
    @Disabled//忽略，通junit4的 igrone
    @DisplayName("fun1测试方法")
    void fun1(){
        System.out.println("fun1");
    }


    @AfterEach
    public void afterEach(){
        System.out.println("afterEach");
    }

    @AfterAll
    public static void after(){
        System.out.println("after");
    }
}
