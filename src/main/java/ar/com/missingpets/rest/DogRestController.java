
package ar.com.missingpets.rest;

import org.slf4j.*;
import ar.com.missingpets.entity.Dog;
import ar.com.missingpets.rest.dto.DogDTO;
import ar.com.missingpets.service.DogService;
import ar.com.missingpets.service.DogServiceImp;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class DogRestController {

    private static  Logger log = LoggerFactory.getLogger(DogRestController.class);
    
    @Autowired
    private DogService dogService;
    
    @GetMapping("/dogs")
    public List<DogDTO> dogList() {
        List<Dog> dogs = dogService.dogList();
        List<DogDTO> dogsDTO = new ArrayList<DogDTO>();
        for (Dog aux : dogs) {
            dogsDTO.add(new DogDTO(aux));
        }
        return dogsDTO;
    }

    @GetMapping("/dogs/{id}")
    public ResponseEntity<DogDTO> getDogById(@PathVariable String id) {
        Dog dog = dogService.findById(id);
        DogDTO dogDTO = new DogDTO(dog);
        return ResponseEntity.ok(dogDTO);
    }
}
/*ID DE MASCOTA PARA PROBAR LA API: 39b674c4-6f38-4495-a0a4-eb852c8d4ebb*/