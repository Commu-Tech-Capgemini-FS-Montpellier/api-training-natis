package azqore.finance.creationapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import azqore.finance.creationapi.model.Asset;
import azqore.finance.creationapi.service.AssetService;

@RestController
public class AssetController {
	
	@Autowired
	private AssetService assetService;
	
	@GetMapping("/assets")
	public List<Asset> getAllAssets(){return assetService.getAllAssets();}
	
	@GetMapping("/assets/{id}")
	public ResponseEntity<Asset> getAssetById(@PathVariable int id){
		if (assetService.geAssetById(id) != null) {
			return new ResponseEntity<>(assetService.geAssetById(id), HttpStatus.OK);
		}else {
		    return new ResponseEntity<>(assetService.geAssetById(id), HttpStatus.NOT_FOUND);
	}
	}
}
