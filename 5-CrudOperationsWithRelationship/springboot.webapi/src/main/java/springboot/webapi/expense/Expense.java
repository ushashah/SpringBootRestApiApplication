package springboot.webapi.expense;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import springboot.webapi.category.Category;

@Entity
public class Expense {

	@Id
	Integer expenseId;
	float expenseAmount;
	String dateAndTime;
	String description;
	//Integer categoryId;
	
	@ManyToOne
	Category category;

	public Expense() {}
	
	public Expense(int expenseId, float expenseAmount, String dateAndTime, String description,int categoryId) {
		super();
		this.expenseId = expenseId;
		this.expenseAmount = expenseAmount;
		this.dateAndTime = dateAndTime;
		this.description = description;
		this.category=new Category(categoryId, "");
	//	this.categoryId = categoryId;
	}

	public int getExpenseId() {
		return expenseId;
	}
	
	public void setExpenseId(int expenseId) {
		this.expenseId = expenseId;
	}
	
	public float getExpenseAmount() {
		return expenseAmount;
	}
	
	public void setExpenseAmount(float expenseAmount) {
		this.expenseAmount = expenseAmount;
	}
	
	public String getDateAndTime() {
		return dateAndTime;
	}
	
	public void setDateAndTime(String dateAndTime) {
		this.dateAndTime = dateAndTime;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}
