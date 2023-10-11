package com.springboot;

import java.util.List;

public interface CategoryService {

	public void save(Category c);

	public void update(Category c);

	public void delete(int category_id);

	public Category getById(int category_id);

	public List<Category> getAll();

	public List<Category> getAllPages(int page, int size, String field);
	
	public List<Category> findCategoriesByProductName(String product_name);
}
