package azqore.finance.creationapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;




@SpringBootApplication
@EnableCaching
public class CreationapiApplication {

//	@Autowired
//	private OrdersService ordersService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(CreationapiApplication.class, args);
		
	}
//	@PostConstruct
//	public void tests() {
//		
//	List<Order> order = ordersService.getOrdersForClient(1);
//	System.out.println(order);
//	int quantities = ordersService.getClientAssetQuantities(1);
//	System.out.println(quantities);
//	
//		}
//	
//	@PostConstruct
//	public void tests() {
//		List<AssetQuantity> quantities = ordersService.getClientAssetQuantities(1);
//		System.out.println(quantities);
//	}
	}
	
