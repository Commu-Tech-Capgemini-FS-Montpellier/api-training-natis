package azqore.finance.creationapi.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import azqore.finance.creationapi.model.Client;
import azqore.finance.creationapi.service.ClientService;

@RestController
public class ClientController {
	
	@Autowired
    private ClientService clientService;

    @GetMapping("/clients")
    public List<Client> getAllClients() { return clientService.findAllClients(); }
    
    @GetMapping("/clients/{offset}/{pageSize}")
    public Page<Client> clientPagination(@PathVariable int offset, @PathVariable int pageSize){
    	return clientService.findClientWithPagination(offset, pageSize);
    }
    
    
}
