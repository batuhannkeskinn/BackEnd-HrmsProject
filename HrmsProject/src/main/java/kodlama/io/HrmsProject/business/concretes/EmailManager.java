package kodlama.io.HrmsProject.business.concretes;

import org.springframework.stereotype.Service;

import kodlama.io.HrmsProject.business.absracts.EmailService;
import kodlama.io.HrmsProject.core.entities.User;
import kodlama.io.HrmsProject.core.utilities.result.Result;
import kodlama.io.HrmsProject.core.utilities.result.SuccessResult;


	@Service
	public class EmailManager implements EmailService {

		

		@Override
		public Result sendEmail(User user) {
			return new SuccessResult(user.getEmail() + " adresine e-posta gönderildi."
			);
		}

	}

