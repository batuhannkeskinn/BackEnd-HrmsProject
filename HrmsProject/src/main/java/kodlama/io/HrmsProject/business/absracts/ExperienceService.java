package kodlama.io.HrmsProject.business.absracts;

import java.util.List;

import kodlama.io.HrmsProject.core.utilities.result.DataResult;
import kodlama.io.HrmsProject.entities.concretes.Experience;

public interface ExperienceService extends BaseEntityService<Experience> {
	DataResult<List<Experience>> getAllByCvId(int cvId);
	DataResult<List<Experience>> getAllByCvIdSortedByFinishDate(int cvId);
}