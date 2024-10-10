package br.com.fiap;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

@Configuration
public class MongoDbConfig extends AbstractMongoClientConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(MongoDbConfig.class);

    @Value("pessoal")
    private String database;

    @Value("mongodb+srv://Admin:Admin@cluster0.cinbx.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0")
    private String connectionsString;

    @Override
    protected String getDatabaseName() {
        return database;
    }

    @Bean
    public MongoClientSettings mongoClientSettings(){
        LOGGER.info("=> Creating the MongoClientSettings for MongoClient and MongoTemplate.");
        return MongoClientSettings.builder().applyConnectionString(new ConnectionString(connectionsString)).build();
    }

}
