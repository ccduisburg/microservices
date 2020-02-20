package controller;

import entity.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.PersonRepository;

import javax.annotation.PostConstruct;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RequiredArgsConstructor//personrepository constructer olusturmaya gerek kalmiyor
@RestController
@RequestMapping("/person")
public class PersonController {
    private final PersonRepository personRepository;
    @PostConstruct
    public void init(){
        Person user=new Person();
        user.setName("bbd");
        user.setVorname("ffff");
        user.setAdress("bbbb");
        user.setId("P0001");
        user.setGeburstdatum(Calendar.getInstance().getTime());
        personRepository.save(user);
    }

    @GetMapping("/{search}")
    public ResponseEntity<List<Person>> getPersons(@PathVariable String search){
        List<Person> personal=personRepository.getByCustomQuery(search);
        return ResponseEntity.ok(personal);
    }
    
}
