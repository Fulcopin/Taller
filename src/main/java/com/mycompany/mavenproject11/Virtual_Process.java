/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject11;

/**
 *
 * @author fulco
 */
public class Virtual_Process {
    public class Cliente {
    CanalVirtual cv;

    public Cliente(CanalVirtual cv) {
        this.cv = cv;
    }

    public void solicitarServicio(String sistema) {
        cv.ofrecerServicio(sistema);
    }
}

public interface CanalVirtual {
    void ofrecerServicio(String sistema);
}

public class SistemaWeb implements CanalVirtual {
    public void ofrecerServicio(String sistema) {
        // Implementación del servicio web
    }
}

public class SistemaMovil implements CanalVirtual {
    public void ofrecerServicio(String sistema) {
        // Implementación del servicio móvil
    }
}

public class SistemaTelefonico implements CanalVirtual {
    public void ofrecerServicio(String sistema) {
        // Implementación del servicio telefónico
    }
}
}
