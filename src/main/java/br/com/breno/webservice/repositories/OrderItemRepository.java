package br.com.breno.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.breno.webservice.entities.OrderItem;

/*
 * It is not necessary to put the annotation @Repository because the interface extends JpaRepository
 * */
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
