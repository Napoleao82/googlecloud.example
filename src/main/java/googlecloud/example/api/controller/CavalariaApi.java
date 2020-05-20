package googlecloud.example.api.controller;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@OpenAPIDefinition()
public interface CavalariaApi {
    @GetMapping("api/v1/cavalaria")
    ResponseEntity<?> getCirurgias();
}
