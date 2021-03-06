package kodlama.io.HrmsProject.business.absracts;

import kodlama.io.HrmsProject.core.utilities.result.Result;
import kodlama.io.HrmsProject.entities.concretes.Employee;
import kodlama.io.HrmsProject.entities.concretes.Employer;
import kodlama.io.HrmsProject.entities.concretes.JobSeeker;

public interface AdminService {
	Result registerEmployee(Employee employee , String confirmPassword);
	Result registerJobSeeker(JobSeeker jobSeeker, String confirmPassword);
	Result registerEmployer(Employer employer , String confirmPassword);
}
