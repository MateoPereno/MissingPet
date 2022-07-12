package ar.com.missingpets.service;

import ar.com.missingpets.entity.Dog;
import java.util.List;

public interface DogService {
    
    Dog findById(String id);
    List<Dog> dogList();
}
