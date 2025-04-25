package com.coursewebapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coursewebapp.entity.CourseEntity;
import com.coursewebapp.repository.CourseRepository;

@RestController
@RequestMapping("/tech")
public class Homecontroller 
{
    @Autowired
    private CourseRepository courseRepository;
    
    
    // create an course record
    
    @PostMapping("/addcourse")
    public String addcourse(@RequestBody CourseEntity courseEntity)
    {
    	courseRepository.save(courseEntity);
    	return "Successfully added";
    }
    
    // display an course
    
    @GetMapping("/getcourse")
    public List<CourseEntity> getcourse()
    {
    	List <CourseEntity> list= courseRepository.findAll();
    	return list;
    }
    
    // update  an record
    @PutMapping("/update")
     public String updatecourse(@RequestBody CourseEntity courseEntity)
     {
    	courseRepository.save(courseEntity);
    	return "Successfully updated";
     }
    
    @GetMapping("/course")
    public String course()
    {
    	//List <CourseEntity> list= courseRepository.findAll();
    	return "hello";
    }
    
    
    @DeleteMapping("/delete/{id}")
    public String delCourse(@PathVariable Integer id)
    {
    	courseRepository.deleteById(id);
    	return "Deleted ";
    }
    
    @DeleteMapping("/delete/{cname}")
    public String delCourse(@PathVariable String cname)
    {
    	courseRepository.deleteByCname(cname);
    	return "Deleted ";
    }
     
    @DeleteMapping("/deletedcourse")
    public String delete(@RequestParam Integer id)
    {
    	courseRepository.deleteById(id);
    	return "Successfully deleted";
    }
    
    
    
    
    
    
    
}
