package com.concon.repository;


import com.concon.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface UserRepository extends MongoRepository<User,String> {

}
