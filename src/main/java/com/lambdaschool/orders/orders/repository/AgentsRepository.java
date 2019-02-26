package com.lambdaschool.orders.orders.repository;

import com.lambdaschool.orders.orders.models.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentsRepository extends JpaRepository<Agent, Long> {

}
