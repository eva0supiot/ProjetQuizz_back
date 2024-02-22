package com.takima.backskeleton.dto;

import com.takima.backskeleton.models.Course;
import com.takima.backskeleton.models.Major;
import lombok.Builder;
import lombok.Getter;

import java.time.Instant;
import java.util.List;
@Builder
@Getter
public class StudentDto {
    private String firstName;
    private String lastName;
    private Instant birthdate;
    private List<Course> courses;
    private Major major;
}
