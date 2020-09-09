package br.com.breno.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.breno.webservice.entities.Category;

/*
 * It is not necessary to put the annotation @Repository because the interface extends JpaRepository
 * */
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
