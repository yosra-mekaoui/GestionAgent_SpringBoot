package com.example.demo.Service;

import com.example.demo.Entities.Agent;
import com.example.demo.Repository.IAgentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AgentService")
@RequiredArgsConstructor
public class AgentService implements  IAgentService {
    @Autowired
    IAgentRepository agentRepository;
    @Override
    public Agent addAgent(Agent e) {
        return agentRepository.save(e);

    }

    @Override
    public void removeAgent(Integer idAgent) {
        agentRepository.deleteById(idAgent);
    }

    @Override
    public List<Agent> retrieveAllAgents() {

        return (List<Agent>) agentRepository.findAll();
    }


   /* public Agent updateAgent(Agent e) {
        return agentRepository.save(e);
    }*/
    @Override
    public Agent updateAgent(Integer id, Agent agent) {
        if(agentRepository.findById(id).isPresent()){
            Agent toUpdateAgent = agentRepository.findById(id).get();
            toUpdateAgent.setName(agent.getName());
            toUpdateAgent.setDateAdd(agent.getDateAdd());
            toUpdateAgent.setIp(agent.getIp());
            toUpdateAgent.setVersion(agent.getVersion());
            toUpdateAgent.setLastKeepAlive(agent.getLastKeepAlive());
            toUpdateAgent.setStatus(agent.getStatus());
            toUpdateAgent.setOs(agent.getOs());

            return agentRepository.save(toUpdateAgent);
        }
        return null;
    }
    @Override
    public Agent update(String name, Agent agent) {
            agentRepository.findByName(name);
            Agent toUpdateAgent = agentRepository.findByName(name);
            toUpdateAgent.setName(agent.getName());
            toUpdateAgent.setDateAdd(agent.getDateAdd());
            toUpdateAgent.setIp(agent.getIp());
            toUpdateAgent.setVersion(agent.getVersion());
            toUpdateAgent.setLastKeepAlive(agent.getLastKeepAlive());
            toUpdateAgent.setStatus(agent.getStatus());
            toUpdateAgent.setOs(agent.getOs());

            return agentRepository.save(toUpdateAgent);
        }


    @Override
    public Agent retrieveAgent(Integer idAgent) {
        return agentRepository.findById(idAgent).orElse(null);
    }

}
