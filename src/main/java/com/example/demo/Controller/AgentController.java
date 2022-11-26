package com.example.demo.Controller;

import com.example.demo.Entities.Agent;
import com.example.demo.Service.IAgentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class AgentController {
    @Autowired
    IAgentService agentService;

    @GetMapping("/agents")
    @ResponseBody
    public List<Agent> getAgents(){
        return agentService.retrieveAllAgents();
    }

    @PostMapping("/agent")
    public Agent addAgent(@RequestBody Agent agent){
        return  agentService.addAgent(agent);
    }

   // @PutMapping("/update/{id}")
  /*  public Agent updateAgent(@RequestBody Agent agent){
        return  agentService.addAgent(agent);
    public void updateAgent(@PathVariable("id") Integer id, @RequestBody Agent E){

        E.setId(id);
        agentService.updateAgent(E);*/

   /* @PutMapping("/update/{id}")
    Agent updateAgent(@PathVariable("id") Integer id,@RequestBody Agent agent) throws Exception {
        return agentService.updateAgent(id,agent);*/

  @PutMapping("/update/{name}")
    Agent update(@PathVariable("name") String name,@RequestBody Agent agent) throws Exception {
        return agentService.update(name,agent);


    }

    @GetMapping("/get/{id-Agent}")
    public Agent getById(@PathVariable("id-Agent") Integer id){
        return agentService.retrieveAgent(id);
    }


    @DeleteMapping("/remove/{id-Agent}")
    public void removeAgent(@PathVariable("id-Agent") Integer id){
        agentService.removeAgent(id);
    }

}
