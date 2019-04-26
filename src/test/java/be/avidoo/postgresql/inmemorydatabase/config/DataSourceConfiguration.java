package be.avidoo.postgresql.inmemorydatabase.config;

import com.opentable.db.postgres.embedded.EmbeddedPostgres;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;
import java.io.IOException;

@Profile("test")
@Configuration
public class DataSourceConfiguration {
    @Bean
    DataSource dataSource() throws IOException {
        return embeddedPostgres().getPostgresDatabase();
    }

    @Bean
    EmbeddedPostgres embeddedPostgres() throws IOException {
        return EmbeddedPostgres.start();
    }
}
