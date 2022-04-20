package kodlama.io.Hrmss.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import kodlama.io.Hrmss.business.abstracts.CvService;
import kodlama.io.Hrmss.core.utilities.result.DataResult;
import kodlama.io.Hrmss.core.utilities.result.Result;
import kodlama.io.Hrmss.entities.concretes.Cv;
@RequestMapping("/api/cv")
public class CvController  {
	private CvService cvService;
	
	
	@GetMapping("/getAll/Details")
	public DataResult<List<Cv>> getAll(){
		return this.cvService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Cv cv) {
		return this.cvService.add(cv);
	}
}
