package br.com.aluraflix.api.controller;

import br.com.aluraflix.api.videos.DadosCadastroVideo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Estamos comunicando o Spring que esta é uma classe Restcontroller que precisa ser carregada durante a inicialização do projeto.
//Desse modo, o Spring irá carregar a classe VideoController toda vez que o projeto for inicializado.
@RestController
//Ao chegar uma requisição para /videos o Spring vai detectar que deverá chamar o VideoController.
@RequestMapping("videos")
public class VideoController {
    //Estamos comunicando o Spring que ao chegar uma requisição do tipo post para a URL /videos,
    // ele deve chamar o método cadastrar da classe VideoController
    @PostMapping
    public void cadastrar(
            // Agora o Spring sabe que o parâmetro do método cadastrar é para ele puxar do corpo da requisição.
            @RequestBody DadosCadastroVideo video){
        System.out.println(video);
    }
}
