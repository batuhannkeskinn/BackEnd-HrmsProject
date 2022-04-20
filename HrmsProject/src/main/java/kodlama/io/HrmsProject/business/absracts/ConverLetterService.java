package kodlama.io.HrmsProject.business.absracts;


import java.util.List;

import kodlama.io.HrmsProject.core.utilities.result.DataResult;
import kodlama.io.HrmsProject.entities.concretes.ConverLetter;



public interface ConverLetterService extends BaseEntityService<ConverLetter> {
DataResult<List<ConverLetter>> getAllByJobSeekerId(int JobSeekerId);
}
