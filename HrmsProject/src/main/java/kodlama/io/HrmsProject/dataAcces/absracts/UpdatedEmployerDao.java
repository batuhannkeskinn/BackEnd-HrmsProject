package kodlama.io.HrmsProject.dataAcces.absracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.HrmsProject.entities.concretes.UpdatedEmployer;

public interface UpdatedEmployerDao extends JpaRepository<UpdatedEmployer, Integer>{
	UpdatedEmployer getByEmployer_Id(int employerId);
}
