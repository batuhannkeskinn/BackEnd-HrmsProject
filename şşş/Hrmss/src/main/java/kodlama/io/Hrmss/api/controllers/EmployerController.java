package kodlama.io.Hrmss.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Hrmss.business.abstracts.EmployerService;
import kodlama.io.Hrmss.core.utilities.result.DataResult;
import kodlama.io.Hrmss.core.utilities.result.Result;
import kodlama.io.Hrmss.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employer")
public class EmployerController {
	private EmployerService employerService;
	@Autowired
	public EmployerController(EmployerService employerService) {
	
		this.employerService = employerService;
		
	}
	@GetMapping("/getAll")
	public DataResult<List<Employer>> getAll(){
		return employerService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody Employer employer) {
		return this.employerService.add(employer);
	}
}
