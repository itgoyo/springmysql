package com.springMySql.springmysql.repository;

import com.springMySql.springmysql.dao.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}