package com.salesmanager.shop.store.controller.category.facade;

import com.salesmanager.core.model.catalog.category.Category;
import com.salesmanager.core.model.merchant.MerchantStore;
import com.salesmanager.core.model.reference.language.Language;
import com.salesmanager.shop.model.catalog.category.PersistableCategory;
import com.salesmanager.shop.model.catalog.category.ReadableCategory;

import java.util.List;

public interface CategoryFacade {

	/**
	 * Returns a list of ReadableCategory ordered and built according to a given depth
	 * @param store
	 * @param depth
	 * @param language
	 * @return
	 * @throws Exception
	 */
	List<ReadableCategory> getCategoryHierarchy(MerchantStore store, int depth, Language language, String filter);

	PersistableCategory saveCategory(MerchantStore store, PersistableCategory category);
	
	ReadableCategory getById(MerchantStore store, Long id, Language language);
	
	ReadableCategory getByCode(MerchantStore store, String code, Language language) throws Exception;

	void deleteCategory(Long categoryId);

	void deleteCategory(Category category);

}
