package springboot.webapi.expense;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ExpenseService {
	
	List<Expense> expenseList=new ArrayList<>(
	Arrays.asList(
	new Expense(1,10.5f,"12/02/2019 23:12:12","milk",1),
	new Expense(2,1000,"12/03/2019 21:10:12","mall",03),
	new Expense(3,20,"15/02/2019 12:12:12","milk",01)
	));
	
	public List<Expense> getAllExpense() {
		return expenseList;
	}
	
	public Expense getExpense(int id) {
		return expenseList.stream().filter(e -> e.getExpenseId()==id).findFirst().get();
	}
	
	public void addExpense(Expense expense) {
		expenseList.add(expense);
	}
	
	public void updateExpense(int id,Expense expense) {
		for(int i=0;i<expenseList.size();i++) {
			if(expenseList.get(i).getExpenseId()==id) {
				expenseList.set(i, expense);
			}
		}
	}

	public void deleteExpense(int id) {
		expenseList.removeIf(e -> e.getExpenseId()==id);
	}
}
