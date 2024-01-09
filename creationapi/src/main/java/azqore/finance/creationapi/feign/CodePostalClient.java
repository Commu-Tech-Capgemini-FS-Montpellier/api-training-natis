//package azqore.finance.creationapi.feign;
//
//import java.util.List;
//
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import feign.Param;
//
//
//@FeignClient(value = "carto-codes-postaux", url = "https://apicarto.ign.fr/api")
//public interface CodePostalClient {
//	
//	@GetMapping("/codes-postaux/communes/{codePostal}")
//    ResponseEntity<List<Commune>> getCommuneByCodePostal(@PathVariable("codePostal") String codePostal);
//
//	
//}
