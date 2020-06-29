package com.yococoy.mongo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

public class Staff {
	
	@Id
	String id;
	String name;
	int age;
	List<String> skills=new ArrayList<>();
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	
	public Staff() {
		
	}

}
