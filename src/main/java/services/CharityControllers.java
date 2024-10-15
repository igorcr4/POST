package services;

import controllers.CharityServices;
import models.Volunteers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/volunteer")
public class CharityControllers {

    @Autowired
    private CharityServices services;

    @PostMapping
    public ResponseEntity<Volunteers> addVolunteer(@RequestBody Volunteers voluntar){
        return ResponseEntity.ok(services.addVolunteer(voluntar));
    }
}
