package kodlama.io.HrmsProject.dataAcces.absracts;



import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.HrmsProject.entities.concretes.Cv;


public interface CvDao extends JpaRepository<Cv, Integer>{
	
	Cv getByJobSeeker_Id(int jobSeekerId);
	Cv getByConverLetter_Id(int coverLetterId);
}

