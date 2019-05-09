package springboot.webapi.expense;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {
	
	@Autowired
	ExpenseRepository expenseRepository;
	
	public List<Expense> getAllExpense() {
		ArrayList<Expense> arrayList=new ArrayList<>();
		Iterable<Expense> iterable= expenseRepository.findAll();
		iterable.forEach(arrayList::add);
		return arrayList;
	}

	// yet to look
	public List<Expense> getAllExpense(int categoryId) {
		ArrayList<Expense> arrayList=new ArrayList<>();
		Iterable<Expense> iterable= expenseRepository.findByCategoryCategoryId(categoryId);
		iterable.forEach(arrayList::add);
		return arrayList;
	}

	public Expense getExpense(int id) {
		return expenseRepository.findOne(id);
	}

	public void addExpense(Expense expense) {
		expenseRepository.save(expense);
	}
	
	public void updateExpense(Expense expense) {
		expenseRepository.save(expense);
	}

	public void deleteExpense(int id) {
		expenseRepository.delete(id);
	}
}