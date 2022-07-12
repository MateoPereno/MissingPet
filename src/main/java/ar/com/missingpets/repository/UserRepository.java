package ar.com.missingpets.repository;

import java.util.List;
import ar.com.missingpets.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
    
   public User findByEmail(String email);
    
   List<User> findByName(String name);
}
