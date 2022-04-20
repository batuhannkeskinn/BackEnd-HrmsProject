package kodlama.io.Hrmss.dataAcces.concretes;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Hrmss.core.utilities.result.DataResult;
import kodlama.io.Hrmss.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer>{
	DataResult<Employer> getByPhoneNo(String phoneNo);
}
