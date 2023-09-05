package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Projects;
import com.example.demo.entity.Users;
import com.example.demo.service.UserService;

@CrossOrigin
@RestController
public class UserController {
	@Autowired
	UserService us;
	
	@PostMapping("newuser")
	public Users save(@RequestBody Users data) {
		return us.save(data);
	}
	@GetMapping("getbyname/{username}")
	public Users openuser(@PathVariable String username) {
		return us.getUName(username);
	}
	@GetMapping("get/{id}")
	public Users openbyId(@PathVariable int id) {
		return us.findById(id);
	}
//	@PutMapping("put/{id}")
//	public Tasks updateTask(@PathVariable int id, @RequestBody Tasks data) {
//		return us.updateTasks(id, data);
//	}
	
	@GetMapping("getem")
	public List<Users>  getem(){
		return us.getem();
	}
	@PutMapping("{userid}/updateproject")
	public Users updateProject(@PathVariable int userid, @RequestBody Users data) {
		return us.addproject(userid, data);
	}
	@PostMapping("{userid}/addproject")
	public Users addProject(@RequestBody Users data) {
		return us.addProj(data);
	}
	@PutMapping("{projectid}/addtask")
	public Projects addTask(@PathVariable int projectid, @RequestBody Projects data) {
		return us.addtask(projectid, data);
	}
	@DeleteMapping("delete/{id}")
	public void deletebyid(@PathVariable int id) {
		us.deletebyid(id);
	}
	@GetMapping("getbyprojectid/{pid}")
	public Projects getbyprojectname(@PathVariable int pid) {
		return us.getpid(pid);
	}
}
