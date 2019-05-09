package springboot.webapi.expense;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springboot.webapi.category.Category;

@RestController
public class ExpenseController {

	@Autowired
	private ExpenseService expenseService;
	
	@RequestMapping("/expense/{id}")
	public Expense getExpense(@PathVariable int id) {
		return expenseService.getExpense(id);
	}
	
	@RequestMapping("/expense")
	public List<Expense> getAllExpenses() {
		return expenseService.getAllExpense();		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/expense")
	public void addExpense(@RequestBody Expense expense) {
		expenseService.addExpense(expense);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/expense")
	public void updateExpense(@RequestBody Expense expense) {
		expenseService.updateExpense(expense);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/expense/{id}")
	public void deleteExpense(@PathVariable int id) {
		expenseService.deleteExpense(id);
	}
	
	@RequestMapping("/category/{categoryId}/expense")
	public List<Expense> getAllExpenses(@PathVariable int categoryId) {
		return expenseService.getAllExpense(categoryId);
	}

	@RequestMapping(method=RequestMethod.POST, value="/category/{categoryId}/expense")
	public void addExpenseiInCategory(@RequestBody Expense expense,@PathVariable int categoryId) {
		expense.setCategory(new Category(categoryId, ""));
		expenseService.addExpense(expense);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/category/{categoryId}/expense/{id}")
	public void updateExpenseInCategory(@RequestBody Expense expense,@PathVariable int categoryId) {
		expense.setCategory(new Category(categoryId, ""));
		expenseService.updateExpense(expense);
	}
}