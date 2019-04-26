package be.avidoo.postgresql.inmemorydatabase;

import be.avidoo.postgresql.inmemorydatabase.config.DataSourceConfiguration;
import com.opentable.db.postgres.embedded.LiquibasePreparer;
import com.opentable.db.postgres.junit.EmbeddedPostgresRules;
import com.opentable.db.postgres.junit.PreparedDbRule;
import com.opentable.db.postgres.junit.SingleInstancePostgresRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
@Import(DataSourceConfiguration.class)
public class InmemoryDatabaseApplicationTests {

    @Rule
    public SingleInstancePostgresRule pg = EmbeddedPostgresRules.singleInstance();

    @Rule
    public PreparedDbRule db =
            EmbeddedPostgresRules.preparedDatabase(
                    LiquibasePreparer.forClasspathLocation("db/liquibase-changelog.xml"));



    @Test
    public void contextLoads() {
    }




}
