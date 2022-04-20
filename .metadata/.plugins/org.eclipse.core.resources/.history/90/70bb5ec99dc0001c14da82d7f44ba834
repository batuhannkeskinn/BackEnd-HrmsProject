package kodlama.io.Hrmss.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Hrmss.business.abstracts.CvService;
import kodlama.io.Hrmss.business.abstracts.JobSeekerService;
import kodlama.io.Hrmss.business.abstracts.UserActivationService;
import kodlama.io.Hrmss.business.abstracts.UserService;
import kodlama.io.Hrmss.business.check.UserCheckService;
import kodlama.io.Hrmss.core.utilities.result.DataResult;
import kodlama.io.Hrmss.core.utilities.result.Result;
import kodlama.io.Hrmss.dataAcces.concretes.JobSeekerDao;
import kodlama.io.Hrmss.entities.concretes.Cv;
import kodlama.io.Hrmss.entities.concretes.JobSeeker;
import kodlama.io.Hrmss.entities.concretes.UserActivation;
@Service
public class JobSeekerManager implements JobSeekerService {
 private JobSeekerDao jobSeekerDao;
 private CvService cvService;
 private UserService userService;
 private UserActivationService activationService;
 private UserCheckService userCheckService;
 

@Autowired
public JobSeekerManager(JobSeekerDao jobSeekerDao, CvService cvService, UserService userService,
		UserActivationService activationService, UserCheckService userCheckService) {
	super();
	this.jobSeekerDao = jobSeekerDao;
	this.cvService = cvService;
	this.userService = userService;
	this.activationService = activationService;
	this.userCheckService = userCheckService;
}




	@Override
	public Result add(JobSeeker jobSeeker) {
		jobSeekerDao.save(jobSeeker);
		cvService.add(new Cv(jobSeeker));
		return null;
		
	}





	@Override
	public Result update(JobSeeker entity) {
		// TODO Auto-generated method stub
		return null;
	}





	@Override
	public Result delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}





	@Override
	public DataResult<List<JobSeeker>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}





	@Override
	public DataResult<JobSeeker> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}





	@Override
	public DataResult<JobSeeker> getByIdentityNumber(String identityNumber) {
		// TODO Auto-generated method stub
		return null;
	}





	@Override
	public Result activate(String code) {
		// TODO Auto-generated method stub
		return null;
	}





	@Override
	public DataResult<List<JobSeeker>> getAllByIsActivated(boolean isActivated) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

	
	

	

}
