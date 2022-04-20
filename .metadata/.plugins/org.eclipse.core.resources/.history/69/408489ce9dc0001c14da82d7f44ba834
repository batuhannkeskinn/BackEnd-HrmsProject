package kodlama.io.Hrmss.business.abstracts;


import java.util.List;

import kodlama.io.Hrmss.core.utilities.result.DataResult;
import kodlama.io.Hrmss.core.utilities.result.Result;
import kodlama.io.Hrmss.entities.concretes.Cv;
import kodlama.io.Hrmss.entities.dto.CvDto;

public interface CvService extends BaseEntityService<Cv> {
Result addConverLetterToCv(int cvId , int coverLetterId);
Result deleteCoverLetterFromCv(int cvId);
DataResult<List<CvDto>> getAllCvDetailsByActivatedJobSeeker();
DataResult<Cv> getByJobSeekerId(int jobSeekerId);
DataResult<CvDto> getCvDetailsByJobSeekerId(int jobSeekerId);
}
