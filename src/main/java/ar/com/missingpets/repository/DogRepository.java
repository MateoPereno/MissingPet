package ar.com.missingpets.repository;

import ar.com.missingpets.entity.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends JpaRepository<Dog, String>{
    
}
