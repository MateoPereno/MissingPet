package ar.com.missingpets.repository;

import ar.com.missingpets.entity.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PhotoRepository extends JpaRepository<Photo, String>{
    
}
