package azqore.finance.creationapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import azqore.finance.creationapi.model.Asset;

public interface AssetRepository  extends JpaRepository<Asset, Integer> {

}
