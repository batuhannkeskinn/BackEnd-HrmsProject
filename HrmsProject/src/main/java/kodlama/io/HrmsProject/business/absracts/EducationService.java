package kodlama.io.HrmsProject.business.absracts;

import java.util.List;

import kodlama.io.HrmsProject.core.utilities.result.DataResult;
import kodlama.io.HrmsProject.entities.concretes.Education;

public interface EducationService extends BaseEntityService<Education>{
	 DataResult<List<Education>> getAllByCvId(int cvId);
	 DataResult<List<Education>> getAllByCvIdSortedByGraduationDate(int cvId);
	}

