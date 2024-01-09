package azqore.finance.creationapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import azqore.finance.creationapi.model.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {
	
}
