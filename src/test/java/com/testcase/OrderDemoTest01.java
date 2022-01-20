package com.testcase;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * @description: Author:Gnepx
 * @Date:2022-01-20 22:44
 */
//用例执行顺序
//指定排序方式为通过Order注解排序，注意：需要和@Order注解结合使用
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//方式2：通过DisplayName进行排序，需要和@DisplayName注解结合
//方式3：随机排序
//    @TestMethodOrder(MethodOrderer.Random.class)

//方式4：通过方法名称进行排序
@TestMethodOrder(MethodOrderer.MethodName.class)
public class OrderDemoTest01 {

//    @DisplayName("4")
    @Test
//    @Order(4)
    void OrderDemo01(){
        System.out.println("第1条用例");
    }

//    @DisplayName("3")
    @Test
//    @Order(3)
    void OrderDemo02(){
        System.out.println("第2条用例");
    }

//    @DisplayName("2")
    @Test
//    @Order(2)
    void OrderDemo03(){
        System.out.println("第3条用例");
    }

//    @DisplayName("1")
    @Test
//    @Order(1)
    void OrderDemo04(){
        System.out.println("第4条用例");
    }

}
