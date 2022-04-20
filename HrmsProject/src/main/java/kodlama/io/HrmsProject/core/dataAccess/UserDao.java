package kodlama.io.HrmsProject.core.dataAccess;




import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.HrmsProject.core.entities.User;


public interface UserDao extends JpaRepository<User, Integer>{
	User getByEmail(String email);
	
}

