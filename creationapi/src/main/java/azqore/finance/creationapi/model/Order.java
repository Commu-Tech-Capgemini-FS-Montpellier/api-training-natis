package azqore.finance.creationapi.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name="ORDERS")
@Data
public class Order {
	

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order")
    private int idOrder;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;
    
    @ManyToOne
    @JoinColumn(name = "id_asset")
    private Asset asset;
    
    @ManyToOne
    @JoinColumn(name = "id_account")
    private Account account;

    @Column(name = "quantity_order")
    private int quantityOrder;

    @Column(name = "unit_price_order")
    private BigDecimal unitPriceOrder;

    @Column(name = "status_order")
    private String statusOrder;

    @Column(name = "date_order")
    private Timestamp dateOrder;

}
