package kodlama.io.Hrmss.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Hrmss.business.abstracts.JobPositionService;
import kodlama.io.Hrmss.core.utilities.result.DataResult;
import kodlama.io.Hrmss.core.utilities.result.Result;
import kodlama.io.Hrmss.core.utilities.result.SuccessDataResult;
import kodlama.io.Hrmss.core.utilities.result.SuccessResult;
import kodlama.io.Hrmss.dataAcces.concretes.JobPositionDao;
import kodlama.io.Hrmss.entities.concretes.JobPosition;
@Service
public class JobPositionManager implements JobPositionService{
	private JobPositionDao jobPositionDao;
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(),"Data Listelendi");
	}

	@Override
	public Result add(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult("Ekleme Başarılı");
	}

}
