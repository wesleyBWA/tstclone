package com.bwacomputacao.cursomcrefazendo.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bwacomputacao.cursomcrefazendo.domain.Pedido;



@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
	

}


