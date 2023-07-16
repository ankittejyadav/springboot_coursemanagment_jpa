package com.example.courseapidata.dataapi.course;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(){
        return (List<Course>) courseRepository.findAll();
    }

    public Course getCourse(String id){
        return courseRepository.findById(id).get();
    }

    public void addCourse(Course course){
        courseRepository.save(course);
    }

    public void updateCourse(String id, Course course){
        courseRepository.save(course); 
    }

    public void deleteCourse(String id){
        courseRepository.deleteById(id);
    }
}
