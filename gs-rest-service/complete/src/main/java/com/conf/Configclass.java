package com.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Created by dada on 17-4-13.
 */
@Configuration
public class Configclass {
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataSource.setUrl("jdbc:oracle:thin:@10.100.28.200:1521/unicom");
        dataSource.setUsername("unicomidmp");
        dataSource.setPassword("broadtech");
        return dataSource;
    }
}
