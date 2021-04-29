package com.example.takeblip;

import com.example.takeblip.model.Repository;
import com.example.takeblip.service.RepositoryService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/takeBlip")
@CrossOrigin(origins = "*")
public class GithubController {

    @Autowired
    private RepositoryService repositoryService;

    //Endpoint que retorna uma lista de repositórios
    @ApiOperation(value = "Lista de repositórios pelo owner")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Repositórios recuperados com sucesso",
                    response = String.class),
            @ApiResponse(code = 400, message = "Não foi possível recuperar os repositorios"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),

    })
    @ApiImplicitParam(name = "owner", required = true, paramType = "header", value = "Owner do repositório")
    @GetMapping("/{owner}/repos")
    public ResponseEntity<Repository> getRepos(@PathVariable String owner) {
        Repository repository = repositoryService.listRepositories(owner);

        return repository != null ? ResponseEntity.ok().body(repository) : ResponseEntity.notFound().build();
    }

}
