package com.springrest.springrest.services;

//import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PutMapping;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	// List<Course> list;
	@Autowired
	private CourseDao courseDao;

	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(145, "core java course", "this course is java"));
//		list.add(new Course(146, "spring boot course", "this is spring course"));
	}

	// get all courses
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

	// get specific course by id
	@SuppressWarnings("deprecation")
	@Override
	public Course getCourse(long courseId) {
//		Course c=null;
//		for(Course course:list) {
//		if(course.getId()==courseId) 
//		{
//			
//			c=course;
//			break;
//		}
//	}
		return courseDao.getOne(courseId);
		//return courseDao.getById(courseId);
		//return courseDao.getReferenceById(courseId);
		}

	// add course
	public Course addCourse(Course course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}

	//update course
	public Course updateCourse(Course course) {
//		list.forEach(e->{
//			
//			if(e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		return course;

	}

	//delete course
	public void deleteCourse(Long parseLong) {
//		//list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
//		
		//@SuppressWarnings("deprecation")
		//Course c = courseDao.getById(parseLong);
		Course c = courseDao.getReferenceById(parseLong);
		courseDao.delete(c);
//	}

	}
}
