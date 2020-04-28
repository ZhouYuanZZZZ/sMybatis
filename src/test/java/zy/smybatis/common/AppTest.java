package zy.smybatis.common;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import zy.smybatis.utils.GeneratorApp;

import java.io.InputStream;
import java.net.URL;

public class AppTest {

    @Test
    public void testSqlSessionFactory(){
        String resource = "mybatis-config.xml";
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        InputStream resourceAsStream = this.getClass().getResourceAsStream("/"+resource);
        SqlSessionFactory sqlSessionFactory = builder.build(resourceAsStream);

        System.out.println(sqlSessionFactory);
    }
}
