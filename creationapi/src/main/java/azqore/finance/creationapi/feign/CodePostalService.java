//package azqore.finance.creationapi.feign;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CodePostalService {
//
//	    private final CodePostalClient feignClient;
//
//	    @Autowired
//	    public CodePostalService(CodePostalClient feignClient) {
//	        this.feignClient = feignClient;
//	    }
//
//	    public String getVilleByCodePostal(String codePostal) {
//	        ResponseEntity<List<Commune>> response = feignClient.getCommuneByCodePostal(codePostal);
//	        
//	        if (response.getStatusCode() == HttpStatus.OK && response.getBody() != null) {
//	            List<Commune> communes = response.getBody();
//	            
//	            if (!communes.isEmpty()) {
//	                return communes.stream()
//	                        .map(Commune::getNomCommune)
//	                        .collect(Collectors.joining(", "));
//	            }
//	        }
//	        return "Aucune information sur la ville disponible";
//	    }
//	}
//
