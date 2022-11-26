package com.example.demo.Repository;

import com.example.demo.Entities.Agent;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface IAgentRepository extends CrudRepository<Agent, Integer> {

   /* @Modifying
    @Transactional
    @Query(" update Agent set name = :name where idAgent = :idAgent")
    void updateEtudiantByOption(@Param("idEtudiant") Long idEtudiant, @Param("name") String name);*/
   Agent findByName(String name);
}
