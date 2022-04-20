package kodlama.io.Hrmss.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Hrmss.business.abstracts.EmployeeService;
import kodlama.io.Hrmss.core.utilities.result.DataResult;
import kodlama.io.Hrmss.core.utilities.result.Result;
import kodlama.io.Hrmss.entities.concretes.Employee;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin//dikkkkattt !!!
public class EmployeeController {
private EmployeeService employeeService;

@Autowired
public EmployeeController(EmployeeService employeeService) {
	
	this.employeeService = employeeService;
}
	@GetMapping("/getAll")
	public DataResult<List<Employee>> getAll(){
		return employeeService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody Employee employee) {
		return this.employeeService.add(employee);
	}
}
