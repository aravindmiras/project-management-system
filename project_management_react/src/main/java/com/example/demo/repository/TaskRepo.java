package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Tasks;
@Repository
public interface TaskRepo extends JpaRepository<Tasks, Integer>{

}
