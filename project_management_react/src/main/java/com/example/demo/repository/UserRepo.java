package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Users;
@Repository
public interface UserRepo extends JpaRepository<Users, Integer>{
	@Query(value="select * from users where username=:uname", nativeQuery = true)
	public Users getUName(@Param("uname") String uname);
}
