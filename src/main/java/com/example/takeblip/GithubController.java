package com.example.takeblip;

import com.example.takeblip.model.Repository;
import com.example.takeblip.service.RepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/takeblip")
public class GithubController {

    @Autowired
    private RepositoryService repositoryService;

    //Endpoint que retorna uma lista de repositórios
    /*
    @ApiOperation(value = "Lista de repositórios pelo owner")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Repositórios recuperados com sucesso",
                    response = String.class),
            @ApiResponse(code = 400, message = "Não foi possível recuperar os repositorios"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),

    })
    @ApiImplicitParams({
            @ApiImplicitParam(name = "sort", required = true, paramType = "sort", value = "Parametros para busca dos repositórios"),
            @ApiImplicitParam(name = "direction", required = true, paramType = "direction", value = "Parametros para busca dos repositórios")
    })
     */

    @GetMapping()
    public List<Repository> getRepos() {
        return repositoryService.listRepositories();
    }

}
