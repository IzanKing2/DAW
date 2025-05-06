package com.mascotasAdopcion.mascotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mascotasAdopcion.mascotas.model.Mascota;

public interface MascotaRepository extends JpaRepository<Mascota, Long> { }
