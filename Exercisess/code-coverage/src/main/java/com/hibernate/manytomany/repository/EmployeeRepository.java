package com.hibernate.manytomany.repository;

import com.hibernate.manytomany.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    List<Employee> findByLastname(String lastname);
}
