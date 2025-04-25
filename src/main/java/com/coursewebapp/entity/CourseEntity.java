package com.coursewebapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "course")
public class CourseEntity 

{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String cname;
	private String Description;
	private String value;
	
	
	
	
	@Override
	public String toString() {
		return "CourseEntity [id=" + id + ", cname=" + cname + ", Description=" + Description + ", value=" + value
				+ "]";
	}
	public CourseEntity() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public CourseEntity(int id, String cname, String description, String value) {
		super();
		this.id = id;
		this.cname = cname;
		Description = description;
		this.value = value;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
	
	
	
	
}
