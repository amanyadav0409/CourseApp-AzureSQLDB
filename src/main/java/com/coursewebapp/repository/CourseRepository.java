package com.coursewebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coursewebapp.entity.CourseEntity;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity,Integer>
{
    public void deleteByCname(String cname);
}
