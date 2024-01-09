package azqore.finance.creationapi.model;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="ACCOUNT")
@Data
public class Account {

	@Id
	@Column(name = "id_account")
	private String idAccount;
	
	@ManyToOne
	@JoinColumn(name = "id_client")
	private Client client;
	
	@Column(name = "sold_account")
	private BigDecimal soldAccount;
	
	@JsonIgnore
    @OneToMany(mappedBy = "account")
    private List<Order> orders;
}
