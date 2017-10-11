package com.example.uploadapi.Repo;

import com.example.uploadapi.entity.File;
import org.springframework.data.repository.CrudRepository;

public interface FileRepo extends CrudRepository<File, Integer> {

}
