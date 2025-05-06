package com.mascotasAdopcion.mascotas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mascotasAdopcion.mascotas.model.Mascota;
import com.mascotasAdopcion.mascotas.service.MascotaService;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1/mascotas")
public class MascotaController {

    private final MascotaService mascotaService;

    public MascotaController(MascotaService mascotaService) {
        this.mascotaService = mascotaService;
    }

    @GetMapping
    public List<Mascota> getMascotas() { return mascotaService.listAll(); }

    @GetMapping("/{id}")
    public Optional<Mascota> getMascota(@PathVariable Long id) { return mascotaService.verMascota(id); }

    @PostMapping
    public Mascota create(@RequestBody Mascota mascota) { return mascotaService.save(mascota); }

    @PutMapping("/{id}")
    public Mascota setMascota(@RequestBody Mascota mascota, @PathVariable Long id) { return mascotaService.update(mascota, id); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { mascotaService.delete(id); }
}
