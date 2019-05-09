package springboot.webapi.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/category/{id}")
	public Category getCategory(@PathVariable int id) {
		return categoryService.getCategory(id);
	}
	
	@RequestMapping("/category")
	public List<Category> getAllCategory() {
		return categoryService.getAllCategory();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/category")
	public void addCategory(@RequestBody Category category) {
		categoryService.addCategory(category);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/category")
	public void updateCategory(@RequestBody Category category) {
		categoryService.updateCategory(category);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/category/{id}")
	public void deleteCategory(@PathVariable int id) {
		categoryService.deleteCategory(id);
	}
}
 	