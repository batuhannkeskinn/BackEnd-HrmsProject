package kodlama.io.Hrmss.dataAcces.concretes;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Hrmss.entities.concretes.Experience;

public interface ExperienceDao extends JpaRepository<Experience,Integer>{
	
	List<Experience> getByCv_Id(int cvId);
	List<Experience> getByCv_Id(int cvId, Sort sort);

}
