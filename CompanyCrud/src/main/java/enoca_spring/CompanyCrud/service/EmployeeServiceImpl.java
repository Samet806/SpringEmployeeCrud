package enoca_spring.CompanyCrud.service;
import enoca_spring.CompanyCrud.model.Employee;
import enoca_spring.CompanyCrud.repostory.IEmployeeRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    IEmployeeRepostory repostory;
    @Override
    public List<Employee> getAllEmployee() {
        return (List<Employee>)repostory.findAll();
    }
    @Override
    public Employee getById(long id) {
        return repostory.findById(id).get();
    }
    @Override
    public void saveOrUpdate(Employee employee) {
        repostory.save(employee);
    }
    @Override
    public void deleteEmployee(Long id) {
      repostory.deleteById(id);
    }
}
