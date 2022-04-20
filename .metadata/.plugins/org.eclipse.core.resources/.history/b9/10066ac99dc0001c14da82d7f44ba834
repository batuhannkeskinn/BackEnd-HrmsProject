package kodlama.io.Hrmss.entities.concretes;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Inheritance(strategy = InheritanceType.JOINED)
@EqualsAndHashCode(callSuper = false)
	@Table(name = "cv")
	public class Cv {
		 @Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
		    @Column(name = "id")
		    private int id;
		 
		 @Column(name = "creation_date")
		 private LocalDateTime creationDate;
		 
		 @OneToOne
		 @JoinColumn(name="job_seeker_id")
		 private JobSeeker jobSeeker;
		 
		 @JsonIgnore//dikkat!
		   @OneToOne
		   @JoinColumn(name="cover_letter_id")
		 private ConverLetter converLetter;
		 
		 @JsonIgnore
		 @OneToMany(mappedBy = "cv")
		 private List<Education> educations;
		 
		 @JsonIgnore
		 @OneToMany(mappedBy = "cv")
		 private List<Experience> experiences;
		 
		 @JsonIgnore
		 @OneToMany(mappedBy = "cv")
		 private List<School> schools;
		 
		 
		 
		 public Cv(JobSeeker jobSeeker) {
			 this.setJobSeeker(jobSeeker);
		 }
		 

}