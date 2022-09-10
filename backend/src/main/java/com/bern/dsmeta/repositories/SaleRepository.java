package com.bern.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bern.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
