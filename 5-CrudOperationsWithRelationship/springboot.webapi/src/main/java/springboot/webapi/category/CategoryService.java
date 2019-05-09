package springboot.webapi.category;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;
	
	public List<Category> getAllCategory() {
		ArrayList<Category> arrayList=new ArrayList<>();
		Iterable<Category> iterable= categoryRepository.findAll();
		iterable.forEach(arrayList::add);
		return arrayList;
	}
	
	public Category getCategory(int id) {
		return categoryRepository.findOne(id);
	}
	
	public void addCategory(Category category) {
		categoryRepository.save(category);
	}
	
	public void updateCategory(Category category) {
		categoryRepository.save(category);
	}

	public void deleteCategory(int id) {
		categoryRepository.delete(id);
	}
}