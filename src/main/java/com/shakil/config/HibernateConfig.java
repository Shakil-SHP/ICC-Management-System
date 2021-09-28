package com.shakil.config;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@EnableJpaRepositories("com.shakil.repository")
@EnableTransactionManagement
public class HibernateConfig {

    private Properties getBuiltProperties(String propertyFileName) {
        Properties properties = new Properties();
        InputStream input = HibernateConfig.class
                .getClassLoader().getResourceAsStream(propertyFileName);
        try {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    @Bean(name = "dataSource")
    public  DriverManagerDataSource dataSource() {
        Properties settings = getBuiltProperties("hibernate.properties");
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(settings.getProperty("hibernate.connection.driver_class"));
        dataSource.setUrl(settings.getProperty("hibernate.connection.url"));     //MySQL Specific: +"?createDatabaseIfNotExist=true&autoReconnect=true&useSSL=false"
        dataSource.setUsername(settings.getProperty("hibernate.connection.username"));
        dataSource.setPassword(settings.getProperty("hibernate.connection.password"));
        return dataSource;
    }

    @Bean
    public LocalSessionFactoryBean sessionFactory(DataSource dataSource) {
        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
        Properties settings = getBuiltProperties("hibernate.properties");
        sessionFactoryBean.setDataSource(dataSource);
        sessionFactoryBean.setPackagesToScan("com.shakil.model");
        sessionFactoryBean.setHibernateProperties(settings);
        return sessionFactoryBean;
    }

    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        final JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory);
        return transactionManager;
    }

    @Bean
    public EntityManagerFactory entityManagerFactory(DataSource dataSource) {

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setGenerateDdl(true);
        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setJpaVendorAdapter(vendorAdapter);
        factory.setPackagesToScan("com.shakil.model");
        factory.setDataSource(dataSource);
        factory.afterPropertiesSet();

        return factory.getObject();
    }
}



