package br.com.diegogalindo.clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.diegogalindo.clientes.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
    
}
