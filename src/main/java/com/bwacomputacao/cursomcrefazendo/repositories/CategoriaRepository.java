package com.bwacomputacao.cursomcrefazendo.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bwacomputacao.cursomcrefazendo.domain.Categoria;



@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
	

}


