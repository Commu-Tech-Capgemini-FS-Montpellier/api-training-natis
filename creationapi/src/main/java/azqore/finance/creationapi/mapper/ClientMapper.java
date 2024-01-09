package azqore.finance.creationapi.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import azqore.finance.creationapi.dto.ClientDTO;
import azqore.finance.creationapi.model.Client;

@Mapper(componentModel = "spring")
public interface ClientMapper {

	
    @Mappings({
        @Mapping(source = "accounts", target = "accounts"),
        @Mapping(source = "orders", target = "orders")
    })
    ClientDTO clientToClientDTO(Client client);


}
