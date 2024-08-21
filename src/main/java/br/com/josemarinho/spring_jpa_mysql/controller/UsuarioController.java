package br.com.josemarinho.spring_jpa_mysql.controller;

import br.com.josemarinho.spring_jpa_mysql.repository.UsuarioRepositorio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/usuarios")
public class UsuarioController {

    private UsuarioRepositorio usuarioRepositorio;

    public UsuarioController(UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    @GetMapping()
    public ResponseEntity getUsuarios() {
        return ResponseEntity.status(HttpStatus.OK).body(usuarioRepositorio.findAll());
    }
}
