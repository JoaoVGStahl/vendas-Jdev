package com.Jdev.Vendas.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Jdev.Vendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{
	
}
