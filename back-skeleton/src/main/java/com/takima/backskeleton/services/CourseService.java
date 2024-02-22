package com.takima.backskeleton.services;

import com.takima.backskeleton.dao.CourseDao;
import com.takima.backskeleton.models.Course;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CourseService {
    private final CourseDao courseDao;

    public List<Course> findAll() {
        return courseDao.findAll();
    }
}
