package com.emirzatest.crudemo.repo;

import com.example.todoapp.models.Crudemo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repo
public interface CrudemoRepo extends MongoRepository<Todocrudemo, String> {

}
