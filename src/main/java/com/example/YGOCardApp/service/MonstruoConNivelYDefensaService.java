package com.example.YGOCardApp.service;

import com.example.YGOCardApp.entities.Monstruo.MonstruoConNivelYDefensa;
import com.example.YGOCardApp.repository.MonstruoConNivelYDefensaRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@Service
public abstract class MonstruoConNivelYDefensaService<T , S extends MonstruoConNivelYDefensa>
        extends MonstruoService<T, S> {

    private final MonstruoConNivelYDefensaRepository<S> monstruoConNivelYDefensaRepository;

    @Autowired
    public MonstruoConNivelYDefensaService(MonstruoConNivelYDefensaRepository<S> monstruoConNivelYDefensaRepository) {
        super(monstruoConNivelYDefensaRepository);
        this.monstruoConNivelYDefensaRepository = monstruoConNivelYDefensaRepository;
    }

    public List<T> getMonstruosByNivel(Integer nivel) {
        List<S> monstruos = monstruoConNivelYDefensaRepository.findByNivel(nivel);
        return monstruos.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public List<T> getMonstruosByDefensa(Integer defensa) {
        List<S> monstruos = monstruoConNivelYDefensaRepository.findByDefensa(defensa);
        return monstruos.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public List<T> getMonstruosByEsCantante(Boolean esCantante) {
        List<S> monstruos = monstruoConNivelYDefensaRepository.findByEsCantante(esCantante);
        return monstruos.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }
}