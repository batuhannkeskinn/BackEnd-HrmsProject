package kodlama.io.HrmsProject.business.absracts;

import java.util.List;

import kodlama.io.HrmsProject.core.utilities.result.DataResult;
import kodlama.io.HrmsProject.entities.concretes.UserActivation;

public interface UserActivationService extends BaseEntityService<UserActivation>{
	 DataResult<UserActivation> getByCode(String code);
	 DataResult<UserActivation> getByUserId(int userId);
	 DataResult<List<UserActivation>> getAllByIsActivated(Boolean isActivated);
	}
