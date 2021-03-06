package kodlama.io.HrmsProject.business.concretes;

import java.util.List;

import kodlama.io.HrmsProject.business.absracts.UpdatedEmployerService;
import kodlama.io.HrmsProject.core.utilities.result.DataResult;
import kodlama.io.HrmsProject.core.utilities.result.Result;
import kodlama.io.HrmsProject.core.utilities.result.SuccessDataResult;
import kodlama.io.HrmsProject.core.utilities.result.SuccessResult;
import kodlama.io.HrmsProject.dataAcces.absracts.UpdatedEmployerDao;
import kodlama.io.HrmsProject.entities.concretes.UpdatedEmployer;

public class UpdatedEmployerManager implements UpdatedEmployerService{
	private UpdatedEmployerDao updatedEmployerDao;
	public UpdatedEmployerManager(UpdatedEmployerDao employerDao) {
		super();
		this.updatedEmployerDao = employerDao;
	}

	@Override
	public Result add(UpdatedEmployer updatedEmployer) {
		updatedEmployerDao.save(updatedEmployer);
		return new SuccessResult("işveren eklendi!");
	}

	@Override
	public Result update(UpdatedEmployer updatedEmployer) {
		updatedEmployerDao.save(updatedEmployer);
		return new SuccessResult("işveren güncellendi!");
	}

	@Override
	public Result delete(int id) {
		updatedEmployerDao.deleteById(id);
		return new SuccessResult("Güncellenmiş işveren silindi.");
	}

	@Override
	public DataResult<List<UpdatedEmployer>> getAll() {
		return new SuccessDataResult<List<UpdatedEmployer>>(updatedEmployerDao.findAll());
	}

	@Override
	public DataResult<UpdatedEmployer> getById(int id) {
		return new SuccessDataResult<UpdatedEmployer>(updatedEmployerDao.getById(id));
	}

	@Override
	public DataResult<UpdatedEmployer> getByEmployerId(int employerId) {
		return new SuccessDataResult<UpdatedEmployer>(updatedEmployerDao.getByEmployer_Id(employerId));
	}

}
