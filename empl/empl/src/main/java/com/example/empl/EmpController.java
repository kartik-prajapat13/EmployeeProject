
package com.example.empl;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
// import org.hibernate.mapping.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class EmpController {

    // List<Employee> employees = new ArrayList<>();

    // EmployeeService employeeService = new EmployeeServiceImpl();

    // ---- Dependency Injection - IOC container make objects -------
    @Autowired // not compulsarily needed
    private EmployeeService employeeService; // --- after check remove it

    @GetMapping("employees") // For reading

    public List<Employee> getAllEmployee() {

        return employeeService.readEmployee();
    }

    @PostMapping("employees") // For creating
    public String createEmployee(@RequestBody Employee employee) {
        // TODO: process POST request
        return employeeService.createEmployee(employee);
        // employees.add(employee);

    }

    @DeleteMapping("employees/{id}") // Path Variable
    public String deleteEmployee(@PathVariable Long id) {
        if (employeeService.deleteEmployee(id))
            return "Delete Successfully";
        return "Not Found";
    }

    @PutMapping("employees/{id}")
    public String putMethodName(@PathVariable Long id, @RequestBody Employee employee) {
        // TODO: process PUT request

        return employeeService.updateEmployee(id, employee);
    }

}
