package backend.project.cookingapp.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CuisineRepository extends CrudRepository<Cuisine, Long> {
    List<Cuisine> findByType(String type);
    
} 
