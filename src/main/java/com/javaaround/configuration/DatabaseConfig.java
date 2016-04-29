package com.javaaround.configuration;
 
import javax.sql.DataSource;
 
public interface DatabaseConfig {
 
    DataSource createDataSource();
     
}