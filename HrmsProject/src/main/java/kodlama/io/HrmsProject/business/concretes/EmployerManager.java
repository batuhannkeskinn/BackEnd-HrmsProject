package kodlama.io.HrmsProject.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.HrmsProject.business.absracts.EmployeeService;
import kodlama.io.HrmsProject.business.absracts.EmployerService;
import kodlama.io.HrmsProject.business.absracts.UpdatedEmployerService;
import kodlama.io.HrmsProject.business.absracts.UserActivationService;
import kodlama.io.HrmsProject.business.absracts.UserService;
import kodlama.io.HrmsProject.core.utilities.result.DataResult;
import kodlama.io.HrmsProject.core.utilities.result.ErrorResult;
import kodlama.io.HrmsProject.core.utilities.result.Result;
import kodlama.io.HrmsProject.core.utilities.result.SuccessDataResult;
import kodlama.io.HrmsProject.core.utilities.result.SuccessResult;
import kodlama.io.HrmsProject.dataAcces.absracts.EmployerDao;
import kodlama.io.HrmsProject.entities.concretes.Employer;


@Service
public class EmployerManager implements EmployerService {
	private EmployerDao employerdao;
	private UserService userService;
	private UserActivationService activationService;
	private EmployeeService employeeService;
	private UpdatedEmployerService updateEmployerService;
	
	@Autowired
	public EmployerManager(EmployerDao employerdao, UserService userService, UserActivationService activationService,
			EmployeeService employeeService, UpdatedEmployerService updateEmployerService) {
		super();
		this.employerdao = employerdao;
		this.userService = userService;
		this.activationService = activationService;
		this.employeeService = employeeService;
		this.updateEmployerService = updateEmployerService;
	}

	@Override
	public Result add(Employer employer) {
		validateEmloyer(employer);
	}

	@Override
	public Result update(Employer employer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<Employer> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result activate(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result confirm(int employerId, int companyStaffId, int userConfirmationTypeId, boolean isConfirmed) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Employer>> getAllOnesThatWaitingForAccountConfirmation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Employer>> getAllOnesThatWaitingForUpdateConfirmation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Employer>> getAllByIsActivated(boolean isActivated) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Employer>> getAllByIsConfirmedAndUserConfirmationTypeId(boolean isConfirmed,
			int userConfirmationTypeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Employer>> getAllByIsConfirmedAndUserConfirmationTypeIdSortedByCompanyName(
			boolean isConfirmed, int userConfirmationTypeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<Employer> getOneThatWaitingForUpdateConfirmationById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

private Result validateEmployer(Employer employer) {
		
		if (employer.getEmail() == null || employer.getPassword() == null || employer.getCompanyName() == null || employer.getCompanyWeb() == null || employer.getPhoneNo() == null ) {
			return new ErrorResult("Lütfen boş alanları doldurunuz.");
		}

		if (!checkIfEmailExists(employer.getEmail())) {
			return new ErrorResult("Girilen e-posta adresi başka bir hesaba aittir.");
		}

		if (!checkIfDomainsMatch(employer.getWebAddress(), employer.getEmail())) {
			return new ErrorResult("Web adresi ile e-posta aynı alan adına sahip olmalıdır.");
		}

		return null;
	}

	

}

