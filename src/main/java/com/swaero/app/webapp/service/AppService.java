package com.swaero.app.webapp.service;

import com.swaero.app.webapp.model.Swaero;
import com.swaero.app.webapp.repository.SwearoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class AppService {
    @Autowired
    private SwearoRepository swearoRepository;

    public List<Swaero> findAll() {
        return swearoRepository.findAll();
    }

    public Swaero save(Swaero swaero ) {
        return swearoRepository.save(swaero);
    }

}
