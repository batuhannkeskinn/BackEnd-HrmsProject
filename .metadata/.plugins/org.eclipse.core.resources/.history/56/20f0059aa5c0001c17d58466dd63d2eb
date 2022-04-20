package kodlama.io.HrmsProject.dataAcces.absracts;


import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.HrmsProject.core.utilities.result.DataResult;
import kodlama.io.HrmsProject.entities.concretes.Employer;



public interface EmployerDao extends JpaRepository<Employer, Integer>{
	DataResult<Employer> getByPhoneNo(String phoneNo);
}
