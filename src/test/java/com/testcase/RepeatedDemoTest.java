package com.testcase;

import org.junit.jupiter.api.RepeatedTest;

/**
 * @description: Author:Gnepx
 * @Date:2022-01-20 23:49
 */


//重复测试


public class RepeatedDemoTest {

//    @Test//如果加上Test注解，则会多执行一次
    @RepeatedTest(5)//通过@RepeatedTest注解，实现重复执行5次，
    void repeatedDemo(){
        System.out.println("重复测试1");
    }

//在name="" 中，所有多{}中都是变量，其他的都是固定的格式
    //// value 表示要重复几次
//    // displayName 对应执行用例的displayname，
//    // currentRepetition 第几次重复
//    // totalRepetitions 代表总共要重复的次数
    @RepeatedTest(value = 3,name = "{displayName} {currentRepetition}/{totalRepetitions}")
    void repeatedDemo02(){
        System.out.println("重复测试02");
    }

}
