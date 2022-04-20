package kodlama.io.HrmsProject.dataAcces.absracts;


import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.HrmsProject.entities.concretes.Employee;


public interface EmployeeDao extends JpaRepository<Employee,Integer> {
 
	Employee getByEmail(String mail);
}

