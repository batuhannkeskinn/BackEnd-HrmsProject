package kodlama.io.HrmsProject.business.absracts;



import java.util.List;

import kodlama.io.HrmsProject.core.utilities.result.DataResult;
import kodlama.io.HrmsProject.core.utilities.result.Result;
import kodlama.io.HrmsProject.entities.concretes.Cv;
import kodlama.io.HrmsProject.entities.dto.CvDto;



public interface CvService extends BaseEntityService<Cv> {
Result addConverLetterToCv(int cvId , int coverLetterId);
Result deleteCoverLetterFromCv(int cvId);
DataResult<List<CvDto>> getAllCvDetailsByActivatedJobSeeker();
DataResult<Cv> getByJobSeekerId(int jobSeekerId);
DataResult<CvDto> getCvDetailsByJobSeekerId(int jobSeekerId);
}

