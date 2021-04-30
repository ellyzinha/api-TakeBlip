package com.example.takeblip;

import com.example.takeblip.model.Repository;
import com.example.takeblip.service.RepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/takeblip")
public class GithubController {

    @Autowired
    private RepositoryService repositoryService;

    //Endpoint que retorna uma lista de repositórios

    @GetMapping()
    public List<Repository> getRepos(@RequestParam(required = false) String sort, @RequestParam(required = false) String direction) {
        return repositoryService.listRepositories(sort, direction);
    }

}
