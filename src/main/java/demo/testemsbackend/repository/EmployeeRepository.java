package demo.testemsbackend.repository;

import demo.testemsbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

//@Repository
public interface EmployeeRepository extends JpaRepository <Employee,Long>{
}
//  this Employee Repository gets  All Crud Database Methods  to interact wih DB