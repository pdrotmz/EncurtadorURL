package dev.pdrotmz.EncurtadorURL.Controller;

import dev.pdrotmz.EncurtadorURL.Model.Link;
import dev.pdrotmz.EncurtadorURL.Model.LinkResponse;
import dev.pdrotmz.EncurtadorURL.Service.LinkService;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Map;

@RestController
public class LinkController {


    private LinkService service;

    public LinkController(LinkService service, LinkService linkService) {
        this.service = service;
    }

    @PostMapping("encurtaUrl")
    public ResponseEntity<LinkResponse> gerarUrlEncurtada(@RequestBody Map<String, String> request){
        String urlOriginal = request.get("urlOriginal");
        Link link = service.encurtarUrl(urlOriginal);

        String gerarUrlDeRedirecionamentoDoUsuario = "http://localhost:8080/r/" + link.getUrlEncurtada();

        LinkResponse response = new LinkResponse(
                link.getId(),
                link.getUrlLonga(),
                gerarUrlDeRedirecionamentoDoUsuario,
                link.getUrlQrCode(),
                link.getUrlCriadaEm()
        );

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/r/{urlEncurtada}")
    public void redirecionarLink(@PathVariable String urlEncurtada, HttpServletResponse response) throws IOException{
        Link link = service.obterUrlOriginal(urlEncurtada);

        if(link != null) {
            response.sendRedirect(link.getUrlLonga());
        } else {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
    }
}
