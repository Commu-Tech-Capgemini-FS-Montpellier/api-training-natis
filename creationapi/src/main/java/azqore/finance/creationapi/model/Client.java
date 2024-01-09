package azqore.finance.creationapi.model;




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

@Entity
@Table(name="CLIENT")
@Data
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_client")
	private int id;
	
    @Column(name = "firstname_client")
    private String firstNameClient;


	@Column(name = "lastname_client")
    private String lastNameClient;

    @Column(name = "zip_code_client")
    private String zipCodeClient;
    
    @JsonIgnore
    @OneToMany(mappedBy = "client")
    private List<Account> accounts;
    
    @JsonIgnore
    @OneToMany(mappedBy = "client")
    private List<Order> orders;
    
}
