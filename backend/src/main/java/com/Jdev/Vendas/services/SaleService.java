package com.Jdev.Vendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Jdev.Vendas.dto.SaleDTO;
import com.Jdev.Vendas.dto.SaleSucessDTO;
import com.Jdev.Vendas.dto.SaleSumDTO;
import com.Jdev.Vendas.entities.Sale;
import com.Jdev.Vendas.respositories.SaleRepository;
import com.Jdev.Vendas.respositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly=true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> result =  repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	@Transactional(readOnly=true)
	public List<SaleSumDTO> amountGroupedBySeller(){
		return repository.amountGroupedBySeller();
	}
	
	public List<SaleSucessDTO> sucessGroupedBySeller(){
		return repository.sucessGroupedBySeller();
	}
}
