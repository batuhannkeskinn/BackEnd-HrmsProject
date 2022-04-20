package kodlama.io.Hrmss.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import kodlama.io.Hrmss.core.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name ="user_id" , referencedColumnName = "id")
@Entity
@Table(name = "employers")
public class Employer extends User{
	
	@NotNull(message = "Şirket İsmi boş bırakılamaz.")
	@Column(name ="company_name")
	private String companyName;
	
	@NotNull(message ="WebSite alanı boş bırakılamaz.")
	@Column(name = "company_web")
	private String companyWeb;
	
	@NotNull(message ="telefon numarası alanı boş bırakılamaz.")
	@Column(name = "phone_no")
	private String phoneNo;
	
	@NotNull(message ="Password Kısmı boş bırakılamaz")
	private String passwordRepeat;
}
