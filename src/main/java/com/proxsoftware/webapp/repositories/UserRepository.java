package com.proxsoftware.webapp.repositories;

import com.proxsoftware.webapp.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface UserRepository extends MongoRepository<User, BigInteger> {
    User findOneByUsername(String name);

}
