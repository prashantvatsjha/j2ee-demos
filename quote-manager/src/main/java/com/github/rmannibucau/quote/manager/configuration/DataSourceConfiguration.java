package com.github.rmannibucau.quote.manager.configuration;

import javax.annotation.sql.DataSourceDefinition;

@DataSourceDefinition(
        name = "java:app/jdbc/quote_manager",
        className = "com.mysql.jdbc.Driver",
        url = "jdbc:mysql://localhost:3306/quote_manager?autoReconnect=true&useSSL=false",
        user = "root",
        password = "prashant"
)
public class DataSourceConfiguration {
}
