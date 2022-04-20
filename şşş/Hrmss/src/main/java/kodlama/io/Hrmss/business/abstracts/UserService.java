package kodlama.io.Hrmss.business.abstracts;

import java.util.List;

import kodlama.io.Hrmss.core.entities.User;
import kodlama.io.Hrmss.core.utilities.result.DataResult;
import kodlama.io.Hrmss.core.utilities.result.Result;

public interface UserService  {
	
	DataResult<List<User>> getAll();
	Result add(User user);
	DataResult<User> getByEmail(String email);
}
