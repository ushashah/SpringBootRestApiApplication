package springboot.webapi.expense;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ExpenseRepository extends CrudRepository<Expense, Integer>{

	public List<Expense> findByCategoryCategoryId(Integer categoryId);
}
