package be.avidoo.postgresql.inmemorydatabase.repository;

import be.avidoo.postgresql.inmemorydatabase.AbstractAcceptanceTest;
import be.avidoo.postgresql.inmemorydatabase.model.Person;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PersonRepositoryTest extends AbstractAcceptanceTest {

    @Autowired
    ApplicationContext applicationContext;
    @Autowired
    private PersonRepository repository;

    @Test
    public void TEST_SHOULD_LOAD_CONTEXT() {
        assertThat(applicationContext).isNotNull();
    }

    @Test
    public void TEST_SHOULD_INSERT_DATA() {
        Person person1 = Person.builder()
                .firstname("Lebron")
                .lastname("James")
                .birthdate(LocalDate.of(1986, Month.APRIL, 22))
                .build();

        Person person2 = Person.builder()
                .firstname("Eden")
                .lastname("Hazdard")
                .birthdate(LocalDate.of(1980, Month.AUGUST, 17))
                .build();


        List<Person> beforeCreate = repository.findAll();
        assertThat(beforeCreate.size(), is(0));

        repository.save(person1);
        repository.save(person2);

        List<Person> afterCreate = repository.findAll();
        assertThat(afterCreate.size(), is(2));
    }

}
