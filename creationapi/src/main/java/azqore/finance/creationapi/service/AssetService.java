package azqore.finance.creationapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import azqore.finance.creationapi.model.Asset;
import azqore.finance.creationapi.repository.AssetRepository;

@Service
public class AssetService {
	
	@Autowired
	private AssetRepository assetRepository;
	
	public List<Asset> getAllAssets(){
		return assetRepository.findAll();
	}
					
	public Asset geAssetById(int id) {
		return assetRepository.findById(id).orElse(null);
	}
}
