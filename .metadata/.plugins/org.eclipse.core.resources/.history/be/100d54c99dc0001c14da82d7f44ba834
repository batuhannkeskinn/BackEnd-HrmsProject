package kodlama.io.Hrmss.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Hrmss.business.abstracts.JobPositionService;
import kodlama.io.Hrmss.core.utilities.result.DataResult;
import kodlama.io.Hrmss.core.utilities.result.Result;
import kodlama.io.Hrmss.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/JobPositions")
public class JobPositionController {
	
	@Autowired
	private JobPositionService jobPositionService;
	
	public JobPositionController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobPosition>>getAll(){
		return this.jobPositionService.getAll();
		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobPosition jobPositions) {
		return this.jobPositionService.add(jobPositions);
	}
	
}
