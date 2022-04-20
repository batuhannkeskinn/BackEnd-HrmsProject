package kodlama.io.HrmsProject.dataAcces.absracts;


import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.HrmsProject.entities.concretes.Education;


public interface EducationDao extends JpaRepository<Education,Integer>{
	List<Education> getByCv_Id(int cvId);
	List<Education> getByCv_Id(int cvId, Sort sort);
	
}
