package kodlama.io.Hrmss.business.abstracts;

import java.util.List;

import kodlama.io.Hrmss.core.utilities.result.DataResult;
import kodlama.io.Hrmss.entities.concretes.UserActivation;

public interface UserActivationService extends BaseEntityService<UserActivation>{
 DataResult<UserActivation> getByCode(String code);
 DataResult<UserActivation> getByUserId(int userId);
 DataResult<List<UserActivation>> getAllByIsActivated(Boolean isActivated);
}
