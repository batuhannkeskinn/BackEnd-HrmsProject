package kodlama.io.HrmsProject.business.absracts;

import kodlama.io.HrmsProject.core.utilities.result.DataResult;
import kodlama.io.HrmsProject.entities.concretes.UpdatedEmployer;

public interface UpdatedEmployerService extends BaseEntityService<UpdatedEmployer> {
 DataResult<UpdatedEmployer> getByEmployerId(int employerId);
}
