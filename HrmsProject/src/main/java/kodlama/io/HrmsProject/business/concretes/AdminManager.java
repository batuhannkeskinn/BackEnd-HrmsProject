package kodlama.io.HrmsProject.business.concretes;

import kodlama.io.HrmsProject.business.absracts.AdminService;
import kodlama.io.HrmsProject.business.absracts.EmployeeService;
import kodlama.io.HrmsProject.business.absracts.EmployerService;
import kodlama.io.HrmsProject.business.absracts.JobSeekerService;
import kodlama.io.HrmsProject.core.entities.User;
import kodlama.io.HrmsProject.core.utilities.result.ErrorResult;
import kodlama.io.HrmsProject.core.utilities.result.Result;
import kodlama.io.HrmsProject.entities.concretes.Employee;
import kodlama.io.HrmsProject.entities.concretes.Employer;
import kodlama.io.HrmsProject.entities.concretes.JobSeeker;

public class AdminManager implements AdminService{
private EmployeeService employeeService;
private EmployerService employerService;
private JobSeekerService jobSeekerService;
	
	public AdminManager(EmployeeService employeeService, EmployerService employerService,
		JobSeekerService jobSeekerService) {
	super();
	this.employeeService = employeeService;
	this.employerService = employerService;
	this.jobSeekerService = jobSeekerService;
}

	@Override
	public Result registerEmployee(Employee user, String confirmPassword) {
		validateUser(user,confirmPassword);
		return employeeService.add(user);
	}

	@Override
	public Result registerJobSeeker(JobSeeker user, String confirmPassword) {
		validateUser(user, confirmPassword);
		return jobSeekerService.add(user);
	}

	@Override
	public Result registerEmployer(Employer user, String confirmPassword) {
		validateUser(user, confirmPassword);
		return employerService.add(user);
	}

	private boolean checkIfPasswordsMatch(String password,String confirmPassword) {
		boolean result = false;
		if(password.equals(confirmPassword)) {
			result = true;
		}
		return result;
	}
	
	private Result validateUser(User user , String confirmPassword) {
	if(!checkIfPasswordsMatch(user.getPassword(), confirmPassword)) {
		return new ErrorResult("Paralo Hatalı!");
	}
	return null;
	
}
}
