package kodlama.io.Hrmss.dataAcces.concretes;


import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Hrmss.entities.concretes.Cv;

public interface CvDao extends JpaRepository<Cv, Integer>{
	
	Cv getByJobSeeker_Id(int jobSeekerId);
	Cv getByConverLetter_Id(int coverLetterId);
}
