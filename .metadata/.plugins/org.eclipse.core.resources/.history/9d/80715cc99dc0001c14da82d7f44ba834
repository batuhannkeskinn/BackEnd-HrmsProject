package kodlama.io.Hrmss.business.concretes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javassist.expr.NewArray;
import kodlama.io.Hrmss.business.abstracts.ConverLetterService;
import kodlama.io.Hrmss.business.abstracts.CvService;
import kodlama.io.Hrmss.business.abstracts.EducationService;
import kodlama.io.Hrmss.business.abstracts.ExperienceService;
import kodlama.io.Hrmss.core.utilities.result.DataResult;
import kodlama.io.Hrmss.core.utilities.result.Result;
import kodlama.io.Hrmss.core.utilities.result.SuccessDataResult;
import kodlama.io.Hrmss.core.utilities.result.SuccessResult;
import kodlama.io.Hrmss.dataAcces.concretes.CvDao;
import kodlama.io.Hrmss.entities.concretes.ConverLetter;
import kodlama.io.Hrmss.entities.concretes.Cv;
import kodlama.io.Hrmss.entities.dto.CvDto;

@Service
public class CvManager implements CvService {
	private CvDao cvDao;
	private ConverLetterService coverLetterService;
	private EducationService educationService;
	private ExperienceService experienceService;
	
	public CvManager(CvDao resumeDao, ConverLetterService coverLetterService, EducationService educationService,
			ExperienceService experienceService) {
		super();
		this.cvDao = cvDao;
		this.coverLetterService = coverLetterService;
		this.educationService = educationService;
		this.experienceService = experienceService;
	}

	@Override
	public Result add(Cv cv) {
		cv.setCreationDate(LocalDateTime.now());
		cvDao.save(cv);
		return new SuccessResult("Özgeçmiş eklendi.");
	}

	@Override
	public Result update(Cv cv) {
		cv = getById(cv.getId()).getData();
		cv.setCreationDate(LocalDateTime.now());
		cvDao.save(cv);
		return new SuccessResult("Özgeçmiş Güncellendi");
	}

	@Override
	public Result delete(int id) {
		cvDao.deleteById(id);
		return new SuccessResult("Özgeçmiş Silindi");
	}

	@Override
	public DataResult<List<Cv>> getAll() {
		Sort sort = Sort.by(Sort.Direction.DESC,"creationDate");
		return new SuccessDataResult<List<Cv>>(cvDao.findAll(sort));
	}

	@Override
	public DataResult<Cv> getById(int id) {
		return new SuccessDataResult<Cv>(cvDao.getById(id));
	}

	@Override
	public Result addConverLetterToCv(int cvId, int converLetterId) {
		Cv cv = getById(cvId).getData();
		cv.setConverLetter(coverLetterService.getById(converLetterId).getData());

		update(cv);
		return new SuccessResult("Ön yazı özgeçmişe eklendi.");
	}

	@Override
	public Result deleteCoverLetterFromCv(int cvId) {
		Cv cv = getById(cvId).getData();
		cv.setConverLetter(null);

		update(cv);
		return new SuccessResult("Ön yazı özgeçmişten kaldırıldı.");
	}

	@Override
	public DataResult<List<CvDto>> getAllCvDetailsByActivatedJobSeeker() {
	List<CvDto> cvs = new ArrayList<CvDto>();
	return null;
//		for(Cv cv : getAll().getData()) {
//			if(cv.getJobSeeker() == true) {
//				cvs.add(getCvDetailsByJobSeekerId(cv.getJobSeeker().getId()).getData());
			}
//		}
//	}

	@Override
	public DataResult<Cv> getByJobSeekerId(int jobSeekerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<CvDto> getCvDetailsByJobSeekerId(int jobSeekerId) {
		// TODO Auto-generated method stub
		return null;
	}
}

	