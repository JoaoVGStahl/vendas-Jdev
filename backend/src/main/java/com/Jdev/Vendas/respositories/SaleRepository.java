package com.Jdev.Vendas.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Jdev.Vendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
}
