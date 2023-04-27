package service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import repository.Employee;
import repository.EmployeeRepository;

@Component
public class EmployeeService {

	@Autowired
	EmployeeRepository repository;

	@Autowired
	Employee employee;

	public ModelAndView loadEmployee() {
		ModelAndView view = new ModelAndView("InsertData.jsp");
		view.addObject("employee", employee);
		return view;
	}

	public ModelAndView saveEmployee(@ModelAttribute Employee employee, @RequestParam String date) {
		employee.setDob(Date.valueOf(date));
		ModelAndView andView = new ModelAndView("HomePage.jsp");
		andView.addObject("message", "Data Added to DataBase");
		repository.save(employee);
		return andView;
	}

	public ModelAndView getAll() {
		ModelAndView andView = new ModelAndView();
		List<Employee> all = repository.getAll();
		if (all.size() == 0) {
			andView.setViewName("HomePage.jsp");
			andView.addObject("msg","DataBase is Empty");
		} else {
			andView.setViewName("FetchAll.jsp");
			andView.addObject("list", all);
		}
		return andView;
	}

	public ModelAndView deleteEmployee(int id) {
		ModelAndView andView = new ModelAndView();
		repository.deleteEmployee(id);
		List<Employee> all = repository.getAll();
		if (all.size() == 0) {
			andView.setViewName("HomePage.jsp");
			andView.addObject("msg","DataBase is Empty");
		} else {
			andView.setViewName("FetchAll.jsp");
			andView.addObject("list", repository.getAll());
			andView.addObject("msg", "Data Deleted Successfully..");
		}
		return andView;
	}

	public ModelAndView loadEmpById() {
		ModelAndView view = new ModelAndView("FetchById.jsp");
		return view;
	}
	
	public ModelAndView getById(int id) {
		ModelAndView andView = new ModelAndView();
		Employee byID = repository.getByID(id);
		if(byID==null) {
			andView.setViewName("HomePage.jsp");
			andView.addObject("msgg","No Data Found");
		}else {
			andView.setViewName("FetchAll.jsp");
			List<Employee> list=new ArrayList<>();
			list.add(byID);
			andView.addObject("list",list);
		}
		return andView;
	}
	
	
	public ModelAndView loadEditView(int id) {
		ModelAndView andView = new ModelAndView("EditView.jsp");
		andView.addObject("obj",repository.getByID(id));
		return andView;
	}

	public ModelAndView saveEdit(Employee employee, String date) {
		employee.setDob(Date.valueOf(date));
		ModelAndView andView = new ModelAndView("HomePage.jsp");
		andView.addObject("message", "Data Updated Successfully");
		repository.updateEmployee(employee);
		return andView;
	}
	
	
	

}
