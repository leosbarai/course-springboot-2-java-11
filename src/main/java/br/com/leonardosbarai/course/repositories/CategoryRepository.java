package br.com.leonardosbarai.course.repositories;

import br.com.leonardosbarai.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
