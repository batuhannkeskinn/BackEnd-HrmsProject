package kodlama.io.HrmsProject.business.absracts;

import kodlama.io.HrmsProject.core.entities.User;
import kodlama.io.HrmsProject.core.utilities.result.Result;

public interface EmailService {
	Result sendEmail(User user);
}
