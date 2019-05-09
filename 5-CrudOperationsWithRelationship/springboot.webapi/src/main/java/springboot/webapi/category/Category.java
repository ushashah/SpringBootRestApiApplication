package springboot.webapi.category;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {

	@Id
	Integer categoryId;
	String categoryName;
	
	public Category() {
		// TODO Auto-generated constructor stub 
	}
	
	public Category(Integer categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}
