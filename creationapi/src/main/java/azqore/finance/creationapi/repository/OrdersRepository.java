package azqore.finance.creationapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import azqore.finance.creationapi.model.Order;
@Repository
public interface OrdersRepository extends JpaRepository<Order, Integer>{
	
    
    List<Order> findByClientId(int  clientId);
	
    @Query("SELECT COUNT(o) FROM Order o WHERE o.client.id = :clientId")
	int findByClientAssetQuantities(@Param("clientId") int clientId);
    
    
    @Query("SELECT o FROM Order o WHERE o.client.id = :clientId AND o.statusOrder = :status")
    List<Order> findByClientAndStatus(@Param("clientId") int clientId, @Param("status") String status);
    
    
    
    @Query("SELECT o.client.id, o.asset.id, SUM(CASE WHEN o.statusOrder = :status THEN o.quantityOrder ELSE 0 END) " +
            "FROM Order o " +
            "WHERE o.client.id = :clientId " +
            "GROUP BY o.client.id, o.asset.id")
    List<Object[]> findByClientAssetsQuantities(@Param("clientId") int clientId, @Param("status") String status);
    
}
