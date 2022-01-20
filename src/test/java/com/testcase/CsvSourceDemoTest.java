package test.java.com.testcase;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @description: Author:Gnepx
 * @Date:2022-01-19 23:01
 */




public class CsvSourceDemoTest {

    @ParameterizedTest
    @CsvSource({"哈利","赫敏"})
    void CsvSourceDemo(String name){
        System.out.println("name");



    }
}
