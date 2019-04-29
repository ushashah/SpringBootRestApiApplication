package springboot.webapi.expense;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseController {

	@RequestMapping("/expense")
	public List<Expense> getAllExpenses() {
		return Arrays.asList(
				new Expense(1,10.5f,"12/02/2019 23:12:12","milk",1),
				new Expense(2,1000,"12/03/2019 21:10:12","mall",03),
				new Expense(3,20,"15/02/2019 12:12:12","milk",01)
				);
	}
}
