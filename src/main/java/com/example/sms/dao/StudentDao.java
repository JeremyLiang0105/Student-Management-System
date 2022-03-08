package com.example.sms.dao;

import com.example.sms.model.Student;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

// DAO: Data Access Object, a object/interface, which is used to access data from database of data storage
public interface StudentDao {

    Optional<Student> selectStudentById(UUID id);

    List<Student> selectAllStudents();

    int insertStudent(Student student);

    int updateStudent(Student student);

    int deleteStudentById(UUID id);
}
