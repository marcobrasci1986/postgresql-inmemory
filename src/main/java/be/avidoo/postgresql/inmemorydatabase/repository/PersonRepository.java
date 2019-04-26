package be.avidoo.postgresql.inmemorydatabase.repository;


import be.avidoo.postgresql.inmemorydatabase.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
