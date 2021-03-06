package kodlama.io.HrmsProject.entities.dto;

import java.time.LocalDateTime;
import java.util.List;

import kodlama.io.HrmsProject.entities.concretes.ConverLetter;
import kodlama.io.HrmsProject.entities.concretes.Education;
import kodlama.io.HrmsProject.entities.concretes.Experience;
import kodlama.io.HrmsProject.entities.concretes.JobSeeker;
import kodlama.io.HrmsProject.entities.concretes.School;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CvDto {
public CvDto(int id2, LocalDateTime creationDate2, JobSeeker jobSeeker2, ConverLetter converLetter,
			List<Education> data, List<Experience> data2) {
		// TODO Auto-generated constructor stub
	}
private int id;
private JobSeeker jobSeeker;
private LocalDateTime creationDate;
private ConverLetter converLetten;
private List<School> schools;
private List<Experience> experiences;
private List<Education> educations;



}