package springboot.webapi.expense;

public class Expense {

	int expenseId;
	float expenseAmount;
	String dateAndTime;
	String description;
	int categoryId;
	
	public Expense() {}
	
	public Expense(int expenseId, float expenseAmount, String dateAndTime, String description, int categoryId) {
		super();
		this.expenseId = expenseId;
		this.expenseAmount = expenseAmount;
		this.dateAndTime = dateAndTime;
		this.description = description;
		this.categoryId = categoryId;
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
	
	public int getCategoryId() {
		return categoryId;
	}
	
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
		
}
