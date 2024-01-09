package azqore.finance.creationapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import azqore.finance.creationapi.model.Client;
import azqore.finance.creationapi.repository.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;	
	
	public List<Client> findAllClients(){
		return repository.findAll();	
	}
	
	public Page<Client> findClientWithPagination(int offset,int pageSize){
		Pageable peageable = PageRequest.of(offset, pageSize);
		return repository.findAll(peageable);
		
	}

}
