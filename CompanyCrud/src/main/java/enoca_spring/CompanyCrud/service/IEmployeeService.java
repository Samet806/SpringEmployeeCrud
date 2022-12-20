package enoca_spring.CompanyCrud.service;

import enoca_spring.CompanyCrud.model.Employee;

import java.util.List;

public interface IEmployeeService {
    public List<Employee> getAllEmployee();
    public Employee getById(long id);
    public void saveOrUpdate(Employee employee);
    public void deleteEmployee(Long id);
}
