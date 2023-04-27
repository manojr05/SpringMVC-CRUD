package repository;

import java.util.List;
import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRepository {
	@Autowired
	EntityManager manager;

	public void save(Employee employee) {
		manager.getTransaction().begin();
		manager.persist(employee);
		manager.getTransaction().commit();

	}

	public List<Employee> getAll() {
		return manager.createQuery("select x from Employee x").getResultList();
	}

	public Employee getByID(int id) {
		return manager.find(Employee.class, id);
	}
	
	public void deleteEmployee(int id) {
		manager.getTransaction().begin();
		manager.remove(manager.find(Employee.class, id));
		manager.getTransaction().commit();
	}
	
	public void updateEmployee(Employee emp) {
		manager.getTransaction().begin();
		manager.merge(emp);
		manager.getTransaction().commit();
	}
	
}
