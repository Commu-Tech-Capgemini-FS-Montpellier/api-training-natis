package azqore.finance.creationapi.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import azqore.finance.creationapi.model.Order;
import azqore.finance.creationapi.repository.OrdersRepository;

	
@Service
public class OrdersService {
	
	@Autowired
	private OrdersRepository ordersRepository;
	
    public List<Order> getOrdersByClientId(int clientId) {
    	System.out.println("called");
        return ordersRepository.findByClientId(clientId);
	} 

    public List<Order> findByClientAndStatus(int clientId, String status){
    	return ordersRepository.findByClientAndStatus(clientId, status);
    }

    public List<Object[]> findByClientAssetsQuantities(int clientId, String status){
    	return ordersRepository.findByClientAssetsQuantities(clientId, status);
    }
    
    
    public List<Order> insertOrders(List<Order> order) {
    	return ordersRepository.saveAll(order);}
}
