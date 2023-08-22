package com.lion772.cruddemo.DAO;

import com.lion772.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository(value = "mysql")
public class StudentDaoImpl implements StudentDAO {
    // define field for entity manager
    private EntityManager entityManager;

    // inject entity manager using constructor injection
    @Autowired
    public StudentDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional // add this decorator since we're performing an update in database
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public Student[] findAll() {
        return new Student[0];
    }

    @Override
    public Student findByLastName(String lastName) {
        return null;
    }

    @Override
    public void update(Student updatedStudent) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void deleteAll() {

    }
}
