package com.example.takeblip.service;

import com.example.takeblip.model.Repository;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(url = "https://api.github.com/users/takenet", name = "github")
public interface RepositoryService {

    @GetMapping("/repos?sort={sort}&direction={direction}&per_page={per_page}")
    List<Repository> listRepositories(@RequestParam("sort") String sort, @RequestParam("direction") String direction, @RequestParam("per_page") String per_page);
}
