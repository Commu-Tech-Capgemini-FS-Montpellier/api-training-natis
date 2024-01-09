package azqore.finance.creationapi.mapper;

import org.mapstruct.Mapping;

import azqore.finance.creationapi.dto.AccountDTO;
import azqore.finance.creationapi.model.Account;

public interface AccountMapper {
	
    @Mapping(source = "client", target = "client")
    @Mapping(source = "orders", target = "orders")
    AccountDTO accountToAccountDTO(Account account);
}
