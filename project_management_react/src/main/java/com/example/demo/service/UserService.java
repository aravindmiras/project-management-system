package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Projects;
import com.example.demo.entity.Users;
import com.example.demo.repository.ProjectRepo;
import com.example.demo.repository.TaskRepo;
import com.example.demo.repository.UserRepo;

@Service
public class UserService {
	@Autowired
	UserRepo ur;
	@Autowired
	TaskRepo tr;
	@Autowired
	ProjectRepo pr;
	
	public Users save(Users data) {
		return ur.save(data);
	}
	public Users getUName(String uname) {
		return ur.getUName(uname);
	}
	public Users findById(int id) {
		return ur.findById(id).orElse(null);
	}
	public List<Users> getem(){
		return ur.findAll();
	}
	
	public Users addproject(int userid, Users data) {
		Users prev=ur.findById(userid).orElseThrow();
		
		if(data.getName()!=null) {
			prev.setName(data.getName());
		}
		if(data.getUsername()!=null) {
			prev.setUsername(data.getUsername());
		}
		if(data.getEmailid()!=null) {
			prev.setEmailid(data.getEmailid());
		}
		if(data.getProfile()!=null) {
			prev.setProfile(data.getProfile());
		}
		if(data.getTheme()!=null) {
			prev.setTheme(data.getTheme());
		}
		if(data.getRole()!=null) {
			prev.setRole(data.getRole());
		}
		if(data.getBio()!=null) {
			prev.setBio(data.getBio());
		}
		if(data.getProject()!=null) {
			prev.setProject(data.getProject());
		}
		
		return ur.save(prev);
	}
	
	public Projects addtask(int projectid, Projects data) {
		Projects prev=pr.findById(projectid).orElseThrow();
		if(data.getProjectname()!=null) {
			prev.setProjectname(data.getProjectname());
		}
		if(data.getDesci()!=null) {
			prev.setDesci(data.getDesci());
		}
		if(data.getDomain()!=null) {
			prev.setDomain(data.getDomain());
		}
		if(data.getDeadline()!=null) {
			prev.setDeadline(data.getDeadline());
		}
		if(data.getTarget()!=null) {
			prev.setTarget(data.getTarget());
		}
		if(data.getLogo()!=null) {
			prev.setLogo(data.getLogo());
		}
		if(data.getCompetitor()!=null) {
			prev.setCompetitor(data.getCompetitor());
		}
		if(data.getTask()!=null) {
			prev.setTask(data.getTask());
		}
		return pr.save(prev);
	}
	public void deletebyid(int id) {
		ur.deleteById(id);
	}
	public Projects getpid(int id) {
		return pr.getpid(id);
	}
	public Users addProj(Users data) {
		return ur.save(data);
	}
//	public Tasks updateTasks(int taskid, Tasks data) {
//		Tasks exp=tr.findById(taskid).orElseThrow();
//		
//		if(data.getTaskname()!=null) {
//			exp.setTaskname(data.getTaskname());
//		}
//		if(data.getTaskdescription()!=null) {
//			exp.setTaskdescription(data.getTaskdescription());
//		}
//		if(data.getPriority()!=null) {
//			exp.setPriority(data.getPriority());
//		}
//		if(data.getStatus()!=null) {
//			exp.setStatus(data.getStatus());
//		}
//		if(data.getDeadline()!=null) {
//			exp.setDeadline(data.getDeadline());
//		}
//		return tr.save(exp);
//	}
}
