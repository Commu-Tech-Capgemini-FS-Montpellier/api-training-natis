package azqore.finance.creationapi.dto;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;

@Data
public class AccountDTO {
	
    private String idAccount;
    private ClientDTO client;
    private BigDecimal soldAccount;
    private List<OrderDTO> orders;
}
