package springboot.webapi.expense;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
 	