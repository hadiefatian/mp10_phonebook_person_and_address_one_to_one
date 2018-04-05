package at.refugeescode.mp10_phonebook_person_and_address_one_to_one.persistance.repository;

import at.refugeescode.mp10_phonebook_person_and_address_one_to_one.persistance.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {

    Optional<Person> findByName(String Name);
}
