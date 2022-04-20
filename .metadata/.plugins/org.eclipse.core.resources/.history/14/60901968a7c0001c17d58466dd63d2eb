package kodlama.io.HrmsProject.business.absracts;

import java.util.List;

import kodlama.io.HrmsProject.core.utilities.result.DataResult;
import kodlama.io.HrmsProject.core.utilities.result.Result;
import kodlama.io.HrmsProject.entities.concretes.JobSeeker;

public interface JobSeekerService extends BaseEntityService<JobSeeker>{
	
	Result activate (String code);
	
	DataResult<List<JobSeeker>> getAllByIsActivated(boolean isActivated);
	DataResult<JobSeeker> getByIdentityNumber(String identityNumber);
    
    
}
