package com.testcase;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class LoginTest {
    private static HashMap<String,Object> dataMap = new HashMap<String, Object>();

    @Test
    void loginTest(){
        dataMap.put("login","登录成功");
        System.out.println(dataMap.get("login"));
    }

    @Nested
    class PayTest{
        @Test
        void payTest(){
            if (null != dataMap.get("buy")) {
                System.out.println("正在购买支付，请等待");
                System.out.println(dataMap.get("buy"));
            }else {
                System.out.println("你还未购买商品，快去购买吧");
            }
        }
    }


    @Nested//在一个类中，
    class BuyTest{

        @Test
        void buyTest(){
            if(dataMap.get("login").equals("登录成功")){
                System.out.println("登录成功啦，可以开始购买");
                dataMap.put("buy","购买了课程A");
            }else{
                System.out.println("你还未登录，请登录");
            }
        }
    }
}
