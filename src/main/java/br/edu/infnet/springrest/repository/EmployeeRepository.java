package br.edu.infnet.springrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.springrest.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}