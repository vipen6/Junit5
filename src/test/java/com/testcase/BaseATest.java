package test.java.com.testcase;

import org.junit.jupiter.api.*;

/**
 * @description: Author:Gnepx
 * @Date:2022-01-18 23:08
 */
public class BaseATest {

    @BeforeAll
    static void beforeAAll(){
        System.out.println("BaseATest---beforeAAll");
    }

    @AfterAll
    static void afterAAll(){
        System.out.println("BaseATest---afterAAll");
    }

    @BeforeEach
     void beforeAEach(){
        System.out.println("BaseATest---beforeAEach");
    }


    @AfterEach
    void afterAEach(){
        System.out.println("BaseATest---afterAEach");
    }

    @Test
    void baseA01(){
        System.out.println("BaseATest---baseA01测试用例");
    }

    @Test
    void baseA02(){
        System.out.println("BaseATest---baseA02测试用例");
    }

}
