package kodlama.io.HrmsProject.business.absracts;

import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import kodlama.io.HrmsProject.core.entities.User;
import kodlama.io.HrmsProject.core.utilities.result.DataResult;

public interface UserService  {
	
	DataResult<List<User>> getAll();
	DataResult<User> getById(int id);
	DataResult<User> getByEmail(String email);
}
