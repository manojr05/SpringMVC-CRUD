package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import repository.Employee;
import service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@GetMapping("loadEmployee")
	public ModelAndView loadEmployee() {
		return service.loadEmployee();
	}

	@PostMapping("saveEmployee")
	public ModelAndView saveEmployee(@ModelAttribute Employee employee, @RequestParam String date) {
		return service.saveEmployee(employee, date);
	}

	@GetMapping("getAllEmployee")
	public ModelAndView getAll() {
		return service.getAll();
	}

	@GetMapping("delete")
	public ModelAndView deleteEmployee(@RequestParam int id) {
		return service.deleteEmployee(id);
	}

	@GetMapping("LoadById")
	public ModelAndView loadEmpById() {
		return service.loadEmpById();
	}

	@GetMapping("getById")
	public ModelAndView getById(@RequestParam int id) {
		return service.getById(id);
	}

	@GetMapping("edit")
	public ModelAndView loadEditView(@RequestParam int id) {
		return service.loadEditView(id);
	}

	@PostMapping("SaveEdit")
	public ModelAndView saveEdit(@ModelAttribute("emp") Employee employee, @RequestParam String date) {
		return service.saveEdit(employee,date);
	}
}
