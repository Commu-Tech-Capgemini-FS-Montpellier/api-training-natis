package azqore.finance.creationapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import azqore.finance.creationapi.model.Order;
import azqore.finance.creationapi.service.OrdersService;




@RestController
public class OrdersController {
	
	@Autowired
	private OrdersService ordersService;
	
    @GetMapping("/orders/{clientId}")
    @Cacheable(key="#clientId", value = "Order")
    public ResponseEntity<List<Order>> getOrdersForClient(@PathVariable(name = "clientId") int clientId) {
        List<Order> orders = ordersService.getOrdersByClientId(clientId);
        return ResponseEntity.ok(orders);	
	}
	
	@GetMapping("/orders/client-and-status")
    public ResponseEntity<List<Order>> getOrdersForClientAndStatus(@RequestParam(name = "client_id") int clientId,@RequestParam(name = "status") String status) {  
        return ResponseEntity.ok(ordersService.findByClientAndStatus(clientId,status));
    }
	
	
	@GetMapping("/orders/client-asset-quantities")
	public ResponseEntity<List<Object[]>> getClientAssetQuantities(@RequestParam(name = "client_id") int clientId,@RequestParam(name = "status") String status) {
		List<Object[]> quantities = ordersService.findByClientAssetsQuantities(clientId, status);
		return ResponseEntity.ok(quantities);
	
	}
    @PostMapping("/orders")
    public ResponseEntity<List<Order>> insertOrders(@RequestBody List<Order> orders) {
        List<Order> savedOrders = ordersService.insertOrders(orders);
        return new ResponseEntity<>(savedOrders, HttpStatus.CREATED);
    }
}
