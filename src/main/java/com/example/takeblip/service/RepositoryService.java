package com.example.takeblip.service;

import com.example.takeblip.model.Repository;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://api.github.com/users", name = "github")
public interface RepositoryService {

    @GetMapping("{owner}/repos")
    Repository listRepositories(@PathVariable("owner") String owner);
}
