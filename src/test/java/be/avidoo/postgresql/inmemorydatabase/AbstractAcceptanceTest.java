package be.avidoo.postgresql.inmemorydatabase;

import be.avidoo.postgresql.inmemorydatabase.config.DataSourceTestConfiguration;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Import(DataSourceTestConfiguration.class)
public abstract class AbstractAcceptanceTest {
}
