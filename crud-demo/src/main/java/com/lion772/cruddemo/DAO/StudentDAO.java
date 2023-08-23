package com.lion772.cruddemo.DAO;

import com.lion772.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

     void save(Student theStudent);

     Student findById(Integer id);

     List<Student> findAll();

     List<Student> findByLastName(String lastName);

     void update(Student updatedStudent);

     void delete(int id);

     void deleteAll();

}
