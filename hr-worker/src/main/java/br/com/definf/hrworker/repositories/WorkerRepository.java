package br.com.definf.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.definf.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
 