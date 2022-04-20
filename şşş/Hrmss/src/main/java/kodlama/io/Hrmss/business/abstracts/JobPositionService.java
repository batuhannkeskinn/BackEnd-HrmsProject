package kodlama.io.Hrmss.business.abstracts;

import java.util.List;

import kodlama.io.Hrmss.core.utilities.result.DataResult;
import kodlama.io.Hrmss.core.utilities.result.Result;
import kodlama.io.Hrmss.entities.concretes.JobPosition;

public interface JobPositionService {
 DataResult<List<JobPosition>>getAll();
 Result add(JobPosition jobPosition);
 
}
