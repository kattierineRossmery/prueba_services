package com.example.demo.rest;

import com.example.demo.model.Persona;
import com.example.demo.repository.IPersonaRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/personas")
public class RestDemoController {

  @Autowired
  private IPersonaRepository repo;

  @GetMapping
  // @RequestMapping("/personas")
  public List<Persona> listar() {
    return repo.findAll();

  }

  @PostMapping
  // @RequestMapping("/inserPersonas")
  public void insertar(@RequestBody Persona per) {
    repo.save(per);

  }

  @PutMapping
  // @RequestMapping("/modPersonas")
  public void modificar(@RequestBody Persona per) {
    repo.save(per);

  }

  @DeleteMapping(value = "/{id}")
  public void eliminar(@PathVariable("id") Integer id) {
    repo.deleteById(id);

  }
}
