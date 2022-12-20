package enoca_spring.CompanyCrud.repostory;

import enoca_spring.CompanyCrud.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface IEmployeeRepostory extends CrudRepository<Employee,Long> {
}
