package azqore.finance.creationapi.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import azqore.finance.creationapi.dto.AssetDTO;
import azqore.finance.creationapi.model.Asset;

@Mapper(componentModel = "spring", uses = OrderMapper.class)
public interface AssetMapper {
	
    @Mapping(source = "orders", target = "orders")
    AssetDTO assetToAssetDTO(Asset asset);
}
