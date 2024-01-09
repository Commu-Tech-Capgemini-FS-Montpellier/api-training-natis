package azqore.finance.creationapi.model;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "ASSET")
public class Asset {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asset")
	private int idAsset;
    
    @Column(name = "name_asset")
	private String nameAsset;
	
    @Column(name = "type_asset")
    private String typeAsset;
	
    @Column(name = "price")
    private BigDecimal price;
    
    @JsonIgnore
    @OneToMany(mappedBy = "asset")
    private List<Order> orders;

}
