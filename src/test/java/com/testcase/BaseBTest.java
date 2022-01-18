package test.java.com.testcase;

import org.junit.jupiter.api.*;

/**
 * @description: Author:Gnepx
 * @Date:2022-01-18 23:08
 */

//BaseBTest 继承 BaseATest
    //为什么没有变化，因为子类所有的方法名 都和 父类一样
    //如果解决：使子类都方法名和父类不一致
    //结果：在执行子类都过程中，父类都所有的带@Test@Beforeall AfterAll BeforeEach AfterEach注解方法也执行类

    //执行顺序：
    //用例执行顺序：1/2/3（父类） --》 3/4 子类
    //ALL执行顺序，beforeAAll -->beforeBAll --> afterBALl --> afterAAll：1。父类优先级更高，2。先开始的后结束，3。所有用例开始前后，执行
    //EACH的顺序，同ALl基本一致。1。父类优先级更高，2。先开始的后结束，不一致在于 在每个用例开始结束前后执行

    //先执行
public class BaseBTest extends BaseATest{

    @BeforeAll
    static void beforeBAll(){
        System.out.println("BaseBTest---beforeAAll");
    }

    @AfterAll
    static void afterBAll(){
        System.out.println("BaseBTest---afterAAll");
    }

    @BeforeEach
     void beforeBEach(){
        System.out.println("BaseBTest---beforeAEach");
    }


    @AfterEach
    void afterBEach(){
        System.out.println("BaseBTest---afterAEach");
    }

    @Test
    void baseB01(){
        System.out.println("BaseBTest---baseB01测试用例");
    }

    @Test
    void baseB02(){
        System.out.println("BaseBTest---baseB02测试用例");
    }

}
