package kodlama.io.HrmsProject.dataAcces.absracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.HrmsProject.entities.concretes.ConverLetter;


public interface ConverLetterDao extends JpaRepository<ConverLetter, Integer> {
List<ConverLetter> getByJobSeeker_Id(int jobSeekerId);
}