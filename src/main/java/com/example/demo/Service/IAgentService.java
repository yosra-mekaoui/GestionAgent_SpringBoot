package com.example.demo.Service;

import com.example.demo.Entities.Agent;

import java.util.List;

public interface IAgentService {
    Agent addAgent(Agent e);

    void removeAgent(Integer idAgent);

    List<Agent> retrieveAllAgents();

    Agent updateAgent(Integer id, Agent e);
  // Agent updateAgent(String name, Agent e);


    Agent update(String name, Agent agent);

    Agent retrieveAgent(Integer idAgent);
}
