package azqore.finance.creationapi.dto;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;

@Data
public class AssetDTO {
	
    private int idAsset;
    private String nameAsset;
    private String typeAsset;
    private BigDecimal price;
    private List<OrderDTO> orders;
}
