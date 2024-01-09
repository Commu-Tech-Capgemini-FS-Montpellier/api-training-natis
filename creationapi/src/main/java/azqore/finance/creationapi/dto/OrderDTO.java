package azqore.finance.creationapi.dto;

import java.math.BigDecimal;
import java.security.Timestamp;

import lombok.Data;

@Data
public class OrderDTO {
	
	
    private int idOrder;
    private ClientDTO client;
    private AssetDTO asset;
    private AccountDTO account;
    private int quantityOrder;
    private BigDecimal unitPriceOrder;
    private String statusOrder;
    private Timestamp dateOrder;
}
