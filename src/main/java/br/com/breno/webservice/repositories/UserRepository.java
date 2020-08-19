package br.com.breno.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.breno.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
