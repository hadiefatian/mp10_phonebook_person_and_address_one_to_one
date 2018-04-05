package at.refugeescode.mp10_phonebook_person_and_address_one_to_one.controller;

import at.refugeescode.mp10_phonebook_person_and_address_one_to_one.persistance.model.Address;
import at.refugeescode.mp10_phonebook_person_and_address_one_to_one.persistance.model.Person;
import at.refugeescode.mp10_phonebook_person_and_address_one_to_one.persistance.repository.PersonRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class PersonsEndpoint {

    private PersonRepository personRepository;

    public PersonsEndpoint(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    @GetMapping
    List<Person> findAll() {
        return personRepository.findAll();
    }

    @PostMapping
    Person person(@RequestBody Person person) {
        return personRepository.save(person);
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id) {
        personRepository.deleteById(id);
    }
    
}
