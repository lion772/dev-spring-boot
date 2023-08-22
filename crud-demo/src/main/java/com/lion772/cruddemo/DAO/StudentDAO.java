package com.lion772.cruddemo.DAO;

import com.lion772.cruddemo.entity.Student;

public interface StudentDAO {

     void save(Student theStudent);

     Student findById(Integer id);

     Student[] findAll();

     Student findByLastName(String lastName);

     void update(Student updatedStudent);

     void delete(int id);

     void deleteAll();

}
