package googlecloud.example.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CavalariaController implements CavalariaApi{
    @Override
    public ResponseEntity<?> getCirurgias() {
        return ResponseEntity.ok("Cavalaria");
    }
}
