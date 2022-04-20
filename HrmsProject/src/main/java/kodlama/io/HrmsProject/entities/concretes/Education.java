package kodlama.io.HrmsProject.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "educations")
public class Education {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
   
	@Column(name = "school_name")
	private String schoolName;
	
	@Column(name = "department")
	private String department;
	
   @Column(name= "degree")
   private String degree;

    @Column(name = "started_year")
    
    private LocalDate startedYear;

    @Column(name = "graduated_year")
    private LocalDate graduatedYear;
    
    @ManyToOne
    @JoinColumn(name="cv_id")
    private Cv cv;
    
    
    
}
