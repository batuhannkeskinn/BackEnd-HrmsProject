package kodlama.io.Hrmss.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

@Table(name = "cover_letters")
public class ConverLetter {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
		private int id;
	
	   @Column(name="name")
	   private String name;
	   
	   @Column(name = "content")
		private String content;
	   
	   @ManyToOne
	   @JoinColumn(name="job_seeker_id")
	   private JobSeeker jobSeeker;
	   
	   @OneToOne(mappedBy = "converLetter")
		private Cv cv;
	    
	    
	}

