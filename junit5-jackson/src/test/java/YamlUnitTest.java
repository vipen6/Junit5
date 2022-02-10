import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.peng.entity.OrderLine;
import com.peng.entity.OrderList;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;

/**
 * @description: Author:Gnepx
 * @Date:2022-02-10 22:20
 */
public class YamlUnitTest {

    //直接声明数据结构
    @Test
    void listTest() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        //对应的解析类型声明
        TypeReference<List<HashMap<String,Object>>> typeReference =
                new TypeReference<List<HashMap<String, Object>>>() {
                    @Override
                    public Type getType() {
                        return super.getType();
                    }
                };

        List<HashMap<String, Object>> list =
                objectMapper.readValue(
                        new File("src/test/resource/orderlist.yaml"),
                        typeReference
                );
        System.out.println(list);
    }

    //实体类声明
    @Test
    void orderlistTest() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());

        //添加下面这行防止报错com.fasterxml.jackson.databind.exc.InvalidDefinitionException: Java 8 date/time type `java.time.LocalDate` not supported by default: add Module "com.fasterxml.jackson.datatype:jackson-datatype-jsr310" to enable handling
        objectMapper.findAndRegisterModules();//为了正常的处理我们声明的日期
        //功能上等价的便捷方法： mapper.registerModules(mapper.findModules());
        //我们需要使用 findAndRegisterModules方法，以便 Jackson正确处理我们的日期
        //Jackson也可以自动搜索所有模块，不需要我们手动注册

        TypeReference<List<OrderList>> typeReference =
                new TypeReference<List<OrderList>>() {
                };
        List<OrderList> orderLists = objectMapper.readValue(new File("src/test/resource/orderlist.yaml"), typeReference);
        System.out.println(orderLists);
    }


    //实体类的成员变量与key一一对应

    @Test
    void orderLineTest() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        TypeReference<List<OrderLine>> typeReference =
                new TypeReference<List<OrderLine>>() {
                };
        objectMapper.findAndRegisterModules();

        List<OrderLine> orderLines = objectMapper.readValue(new File("src/test/resource/orderlist.yaml"), typeReference);

        System.out.println(orderLines);
    }

}
