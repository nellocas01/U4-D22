package com.example.u4d22.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.u4d22.entities.Postazione;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, UUID> {

}
