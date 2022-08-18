package demo.testemsbackend.controller;

import demo.testemsbackend.exception.ResouceNotFoundException;
import demo.testemsbackend.model.Employee;
import demo.testemsbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // this class becomes to handel all rest calls
@RequestMapping("api/v1/employee")// base url for all rest Apis
//this is Spring MVC rest controller
public class EmployeeController{

    @Autowired
    private EmployeeRepository employeeRepository;

    //get All employee/Listing of all employees
    @GetMapping
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    //Creation of a new employee
    @PostMapping
    public Employee createEmployeeUser (@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }


    //get/Display of a single employee
    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable  long id){
        Employee employee=employeeRepository.findById(id).orElseThrow(() -> new ResouceNotFoundException("Employee not Found:with this id:" + id));
    return ResponseEntity.ok(employee);
    }
   //Update of an existing employee
   @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee( @PathVariable long id,@RequestBody Employee employeeDetails){
        Employee updateEmployee=employeeRepository.findById(id).orElseThrow(()->new ResouceNotFoundException("Employee not Exits with id:" +id));
        updateEmployee.setFirstName(employeeDetails.getFirstName());
        updateEmployee.setLastName(employeeDetails.getLastName());
        updateEmployee.setDateOfBirth(employeeDetails.getDateOfBirth());
        updateEmployee.setDepartment(employeeDetails.getDepartment());
        employeeRepository.save(updateEmployee);
        return ResponseEntity.ok(updateEmployee);

    }
   //Deletion of an existing employee
    @DeleteMapping("{id}")
   public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id){
        Employee employee=employeeRepository.findById(id).orElseThrow(()->new ResouceNotFoundException("Employee Not Exist with id:"+id));
        employeeRepository.delete(employee);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

}
