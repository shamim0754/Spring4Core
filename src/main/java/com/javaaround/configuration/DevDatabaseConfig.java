package com.javaaround.configuration;
 
import javax.sql.DataSource;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.context.annotation.PropertySource;
 
@Profile("Development")
@Configuration
@PropertySource(value = { "classpath:application.properties" })
public class DevDatabaseConfig implements DatabaseConfig {
    @Autowired
    private Environment env;

    @Override
    @Bean
    public DataSource createDataSource() {
        System.out.println("Creating DEV database");
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        /*
         * Set MySQL specific properties for Development Environment
         */
        dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
        dataSource.setUrl(env.getProperty("jdbc.url"));
        dataSource.setUsername(env.getProperty("jdbc.username"));
        dataSource.setPassword(env.getProperty("jdbc.password"));
        return dataSource;
    }
 
}