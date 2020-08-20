package br.com.breno.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.breno.webservice.entities.Order;

/*
 * It is not necessary to put the annotation @Repository because the interface extends JpaRepository
 * */
public interface OrderRepository extends JpaRepository<Order, Long> {

}
