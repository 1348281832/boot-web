package com.aman.boot.bootweb;

import com.alibaba.druid.pool.DruidDataSource;
import com.aman.boot.bootweb.Bean.Student;
import com.aman.boot.bootweb.Mapper.StudentMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

@Slf4j
@SpringBootTest
class BootWebApplicationTests {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private DataSource dataSource;
    @Autowired
    private StudentMapper studentMapper;

    @Test
    void contextLoads() {
        List list = jdbcTemplate.queryForList("select * from Student");
        for (Object o : list) {
            System.out.println(o);
        }

        log.info("数据类型:{}", dataSource.getClass());
    }

    @Test
    public void testStudent() {
        Student student=studentMapper.selectById("10001");
        System.out.println(student);
    }


//pull github test1//push githubtest 2
}
