package com.srv.springbootkubernetesspringmysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srv.springbootkubernetesspringmysql.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
