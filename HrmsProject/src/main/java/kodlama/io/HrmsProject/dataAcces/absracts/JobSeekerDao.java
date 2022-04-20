package kodlama.io.HrmsProject.dataAcces.absracts;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.HrmsProject.entities.concretes.JobSeeker;



public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer>{
List<JobSeeker> getByUserActivation_IsActivated(boolean isActivated);
JobSeeker getByIdentityNumber (String identityNumber);
}
