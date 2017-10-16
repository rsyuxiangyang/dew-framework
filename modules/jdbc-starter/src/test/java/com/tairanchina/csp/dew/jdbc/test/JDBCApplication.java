package com.tairanchina.csp.dew.jdbc.test;


import com.tairanchina.csp.dew.core.DewBootApplication;
import com.tairanchina.csp.dew.jdbc.DewJDBCAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackageClasses = DewJDBCAutoConfiguration.class)
public class JDBCApplication extends DewBootApplication {

    @Autowired
    private  DewJDBCAutoConfiguration dewJDBCAutoConfiguration;

    public static void main(String[] args) {
        new SpringApplicationBuilder(JDBCApplication.class).run(args);
    }
}