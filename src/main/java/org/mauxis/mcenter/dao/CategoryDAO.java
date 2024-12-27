package org.mauxis.mcenter.dao;

import org.mauxis.mcenter.model.Category;
import org.mauxis.mcenter.vo.CategoryCreateRequestVO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryDAO extends JpaRepository<Category, Long> {
    public List<Category> findByName(String name);
}
