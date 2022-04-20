package kodlama.io.Hrmss.dataAcces.concretes;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Hrmss.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle, Integer> {
	JobTitle geyByTitle(String title);
}
