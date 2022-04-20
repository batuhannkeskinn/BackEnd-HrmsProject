package kodlama.io.HrmsProject.entities.concretes;

import java.time.LocalDate;

import javax.persistence.*;


import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import kodlama.io.HrmsProject.core.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@PrimaryKeyJoinColumn(name = "user_id" , referencedColumnName = "id")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "job_seekers")
public class JobSeeker extends User {
	
	
	
	@Column(name = "first_name" )
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "identity_number")
	private String identityNumber;
	
	@Column(name = "birth_of_year")
	private LocalDate birthOfYear;
	
	
	@JsonIgnore
	@OneToOne(mappedBy = "user")
	private UserActivation userActivation;
	
 
    
}

