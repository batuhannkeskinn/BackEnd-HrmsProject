package kodlama.io.HrmsProject.business.concretes;


import java.util.List;

import kodlama.io.HrmsProject.business.absracts.UserService;
import kodlama.io.HrmsProject.core.dataAccess.UserDao;
import kodlama.io.HrmsProject.core.entities.User;
import kodlama.io.HrmsProject.core.utilities.result.DataResult;
import kodlama.io.HrmsProject.core.utilities.result.SuccessDataResult;



public class UserManager implements UserService{
	private UserDao userDao;
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}



	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(userDao.findAll());
	}

	

	@Override
	public DataResult<User> getByEmail(String email) {
		return new SuccessDataResult<User>(userDao.getByEmail(email));
	}

	@Override
	public DataResult<User> getById(int id) {
		return new SuccessDataResult<User>(userDao.getById(id));
	}

}
