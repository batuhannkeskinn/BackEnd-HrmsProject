package kodlama.io.Hrmss.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Hrmss.business.abstracts.JobSeekerService;
import kodlama.io.Hrmss.core.utilities.result.DataResult;
import kodlama.io.Hrmss.core.utilities.result.Result;
import kodlama.io.Hrmss.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/jobSeeker")
//@CrossOrigin//kontrol et !!!!
public class JobSeekerController {
	private JobSeekerService jobSeekerService;

	public JobSeekerController(JobSeekerService jobSeekerService) {
		
		this.jobSeekerService = jobSeekerService;
	}
	@GetMapping("/getAll")
	public DataResult<List<JobSeeker>> getAll(){
		return jobSeekerService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody JobSeeker jobSeeker) {
		return this.jobSeekerService.add(jobSeeker);
	}
	
}
