package com.example.TestApp.repository;

import com.example.TestApp.domain.Data;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Admin on 17.06.2017.
 */
public interface DataRepository extends CrudRepository<Data, Long> {
}
