package com.concon;
import com.concon.entity.User;
import com.concon.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;


@RestController
@RequestMapping("user")
public class UserApi {
    @Autowired
    private UserRepository userRepository;
    @PostConstruct
    public void init(){
       User user=new User();
       user.setName("bbd");
       user.setId("U001");
       user.setVorname("ffff");
       userRepository.save(user);
    }

    @RequestMapping
    public  ResponseEntity<User> add(@RequestBody User user){
        return  ResponseEntity.ok(userRepository.save(user));
    }
    @GetMapping("/users")
    public  ResponseEntity<List<User>> users(){
        return  ResponseEntity.ok(userRepository.findAll());
    }
}
