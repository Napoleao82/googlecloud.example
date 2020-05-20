package googlecloud.example.api.controller;

import org.springframework.http.ResponseEntity;

public class CavalariaController implements CavalariaApi{
    @Override
    public ResponseEntity<?> getCirurgias() {
        return ResponseEntity.ok("Cavalaria");
    }
}
