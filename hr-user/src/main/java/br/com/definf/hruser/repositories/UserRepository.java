package br.com.definf.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.definf.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String Email);
}
