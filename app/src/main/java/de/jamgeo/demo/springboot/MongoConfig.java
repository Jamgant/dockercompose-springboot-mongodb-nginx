package de.jamgeo.demo.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.logging.Logger;


@EnableMongoRepositories
@Configuration
public class MongoConfig  {
    private final Logger logger = Logger.getLogger(this.getClass().getName());

    @Autowired
    private
    MongoDbFactory mongoDatabaseFactory;


    @Bean
    public MongoTemplate mongoTemplate(){
        logger.info("MongoTemplate using DB: " + mongoDatabaseFactory.getDb().getName());
        return new MongoTemplate(mongoDatabaseFactory);
    }




}
