package kodlama.io.Hrmss.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Hrmss.business.abstracts.EmployeeService;
import kodlama.io.Hrmss.core.utilities.result.DataResult;
import kodlama.io.Hrmss.core.utilities.result.Result;
import kodlama.io.Hrmss.core.utilities.result.SuccessDataResult;
import kodlama.io.Hrmss.core.utilities.result.SuccessResult;
import kodlama.io.Hrmss.dataAcces.concretes.EmployeeDao;
import kodlama.io.Hrmss.entities.concretes.Employee;
@Service
public class EmployeeManager implements EmployeeService {
 private EmployeeDao employeeDao;
	
 public EmployeeManager(EmployeeDao employeeDao) {
	
	this.employeeDao = employeeDao;
}

	

	@Override
	public Result add(Employee employee) {
		employeeDao.save(employee);
		return new SuccessResult("Sistem personeli Ekleme Başarılı");
	}

	@Override
	public Result update(Employee entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<Employee> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
@Override
	public DataResult<List<Employee>> getAll() {
		return new SuccessDataResult<List<Employee>>(employeeDao.findAll());
	}
}
