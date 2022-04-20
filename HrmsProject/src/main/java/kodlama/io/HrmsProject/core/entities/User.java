package kodlama.io.HrmsProject.core.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@EqualsAndHashCode(callSuper = false)
@Table(name="users")
public class User {
	
	

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
private int id ;
@Email(message = "Lütfen geçerli bir e-posta adresi giriniz.")
@NotNull(message = "E-posta alanı boş geçilemez.")
@NotBlank(message = "E-posta alanı boş geçilemez.")
@Column(name = "email", unique = true)
private String email;
@NotNull(message = "Parola alanı boş geçilemez.")
@NotBlank(message = "Parola alanı boş geçilemez.")
@Column(name ="password")
private String password;


















}

