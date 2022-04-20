package kodlama.io.Hrmss.business.abstracts;



import java.util.List;

import kodlama.io.Hrmss.core.utilities.result.DataResult;
import kodlama.io.Hrmss.core.utilities.result.Result;
import kodlama.io.Hrmss.entities.concretes.JobSeeker;

public interface JobSeekerService extends BaseEntityService<JobSeeker>{
	
	Result activate (String code);
	
	DataResult<List<JobSeeker>> getAllByIsActivated(boolean isActivated);
	DataResult<JobSeeker> getByIdentityNumber(String identityNumber);
    
    
}
