package kodlama.io.HrmsProject.dataAcces.absracts;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CityDao extends JpaRepository<kodlama.io.HrmsProject.entities.concretes.City, Integer> {

}
