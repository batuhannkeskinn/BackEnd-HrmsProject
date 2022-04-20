package kodlama.io.Hrmss.business.abstracts;

import java.util.List;

import kodlama.io.Hrmss.core.utilities.result.DataResult;
import kodlama.io.Hrmss.core.utilities.result.Result;

public interface BaseEntityService<T>{
	Result add(T entity);
	
	Result update(T entity);
	
	Result delete(int id);
	
	DataResult<List<T>> getAll();
	
	DataResult<T> getById(int id);

	
}
