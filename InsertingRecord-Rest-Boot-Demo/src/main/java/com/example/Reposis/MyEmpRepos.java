package com.example.Reposis;

import org.springframework.data.repository.CrudRepository;

import com.example.Entity.Civil;

public interface MyEmpRepos extends CrudRepository<Civil,Integer> {

}
