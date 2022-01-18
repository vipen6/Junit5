package test.java.com.testcase;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @description: Author:Gnepx
 * @Date:2022-01-18 22:00
 */
public class AssertEqTest {
    @Test
    void duanyan01(){
        System.out.println("断言测试assertEqual实例01");
        //第一个参数是期望结果，第二个参数是实际结果对比两个参数是否相等
        assertEquals(2,1+1);
    }

    @Test
    void duanyan02(){
        System.out.println("断言测试assertTrue实例02,断言表达式为true");
        assertTrue(3>1);
    }

    @Test
    void duanyan03(){
        System.out.println("断言布尔类型");
        assertTrue(true);
    }

    @Test
    void duanyan04(){
        System.out.println("断言传值为空的场景，notnull");
        assertNotNull(null);

    }

    @Test
    void duanyan05(){
        System.out.println("断言传值不为空的场景");
        assertNotNull(1);
    }

    @Test
    void duanyan06(){
        //assertAll会对所有字段进行断言，并输出结果
        System.out.println("断言assertAll的场景");

        //第一个参数，是描述信息，代表这个分组断言是针对什么场景
        //也可以不传，就会有一个默认提示
        assertAll("All",
                ()->assertEquals(2,1+1),
                ()->assertEquals(3,1+1),
                ()->assertEquals(4,1+1));
    }

    @Test
    void duanyan07() throws InterruptedException {
        //第一个参数传递超时时间，Duration.ofSeconds(3) 代表3秒超时
        //第二个参数传递操作
        //第二个参数如果超出第一个参数设定的时间范围，那么就是超时，就会抛出异常
        //第一个参数只看它后面的，不看其他外面设定的时间

        sleep(4000);
        assertTimeout(Duration.ofSeconds(3),()->{
            sleep(1000);
        });
    }


}
