package com.example.takeblip.service;

import com.example.takeblip.model.Repository;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "https://api.github.com/users/takenet", name = "github")
public interface RepositoryService {

    @GetMapping("/repos")
    List<Repository> listRepositories();
}
