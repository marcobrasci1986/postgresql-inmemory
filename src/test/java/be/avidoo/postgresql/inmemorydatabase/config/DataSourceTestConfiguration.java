package be.avidoo.postgresql.inmemorydatabase.config;

import com.opentable.db.postgres.embedded.EmbeddedPostgres;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * https://www.programcreek.com/java-api-examples/?code=zalando-nakadi/nakadi-producer-spring-boot-starter/nakadi-producer-spring-boot-starter-master/nakadi*-producer-spring-boot-starter/src/test/java/org/zalando/nakadiproducer/config/EmbeddedDataSourceConfig.java
 * <p>
 * https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-testing.html#boot-features-testing-spring-boot-applications-detecting-config
 * This class needs to be imported in the Testclasses that needs an inmemory Postgres
 */
@TestConfiguration
public class DataSourceTestConfiguration {

    @Bean
    public DataSource dataSource() throws IOException {
        return embeddedPostgres().getPostgresDatabase();
    }

    @Bean
    public EmbeddedPostgres embeddedPostgres() throws IOException {
        return EmbeddedPostgres.start();
    }
}
