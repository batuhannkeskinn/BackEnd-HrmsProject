package kodlama.io.Hrmss.dataAcces.concretes;


import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Hrmss.core.utilities.result.DataResult;
import kodlama.io.Hrmss.entities.concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer>{
DataResult<JobSeeker> getByEmail(String email);
DataResult<JobSeeker> getByIdentityNumber(String identityNumber);

}
