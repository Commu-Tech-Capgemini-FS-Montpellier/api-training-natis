package azqore.finance.creationapi.mapper;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ClientMapper.class, AssetMapper.class, AccountMapper.class})
public interface OrderMapper {

}
