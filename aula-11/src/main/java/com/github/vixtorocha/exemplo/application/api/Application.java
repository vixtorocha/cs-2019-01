/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.vixtorocha.exemplo.application.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public final class Application {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * Construtor privado para evitar a instanciação.
     */
    private Application() {

    }
}
