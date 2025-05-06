package com.mascotasAdopcion.mascotas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mascotasAdopcion.mascotas.model.Mascota;
import com.mascotasAdopcion.mascotas.repository.MascotaRepository;

@Service
public class MascotaService {

    private final MascotaRepository mascotaRepository;

    public MascotaService(MascotaRepository mascotaRepository) {
        this.mascotaRepository = mascotaRepository;
    }

    public List<Mascota> listAll() { return mascotaRepository.findAll(); }
    public Optional<Mascota> verMascota(Long id) { return mascotaRepository.findById(id); }
    public Mascota save(Mascota mascota) { return mascotaRepository.save(mascota); }
    public void delete(Long id) { mascotaRepository.deleteById(id); }
    public Mascota update(Mascota mascota, Long id) {
        mascota.setId(id);
        return mascotaRepository.save(mascota);
    }

}
