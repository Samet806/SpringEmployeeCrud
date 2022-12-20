package enoca_spring.CompanyCrud.controller;

import enoca_spring.CompanyCrud.model.Employee;
import enoca_spring.CompanyCrud.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@EnableAutoConfiguration
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    IEmployeeService service;
    @PostMapping("/save")
    public Employee save(@RequestBody Employee employee)
    {
        service.saveOrUpdate(employee);
        return employee;
    }
    @GetMapping("/List")
    public List<Employee> list()
    {
        return service.getAllEmployee();
    }

}
