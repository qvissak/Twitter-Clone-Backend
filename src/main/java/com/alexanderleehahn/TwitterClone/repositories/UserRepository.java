package com.alexanderleehahn.TwitterClone.repositories;

import com.alexanderleehahn.TwitterClone.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
