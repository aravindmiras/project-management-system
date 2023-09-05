package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Projects;
@Repository
public interface ProjectRepo extends JpaRepository<Projects, Integer> {
	@Query(value="select * from projects where projectid=:uname", nativeQuery = true)
	public Projects getpid(@Param("uname") int uid);
}
