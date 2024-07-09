package com.practica.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class FoliosController {

    private static final Logger LOGGER = LogManager.getLogger(FoliosController.class.getName());

    @GetMapping("/gethash")
    public Map<String, Integer> getHashFolio(@RequestParam String folio) {
        
        String fechaHora = new SimpleDateFormat("ddMMyyHHmmss").format(new Date());
        String cadenaConcatenada = folio + fechaHora;
        int hash = cadenaConcatenada.hashCode();

        Map<String, Integer> response = new HashMap<>();
        response.put("hash", hash);

        return response;
    }
}
