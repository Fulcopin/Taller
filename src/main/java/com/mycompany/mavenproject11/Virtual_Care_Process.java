/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject11;

/**
 *
 * @author fulco
 */
public class Virtual_Care_Process {
    public interface Decorador {
    void enviarNotificacion();
}

public class DecoradorWire implements Decorador {
    public void enviarNotificacion() {
        // Implementación de la notificación para Wire
    }
}

public class DecoradorSignal implements Decorador {
    public void enviarNotificacion() {
        // Implementación de la notificación para Signal
    }
}

public class DecoradorWhatsapp implements Decorador {
    public void enviarNotificacion() {
        // Implementación de la notificación para Whatsapp
    }
}

public class DecoradorTelegram implements Decorador {
    public void enviarNotificacion() {
        // Implementación de la notificación para Telegram
    }
}

public class Cliente {
    Decorador decorador;

    public Cliente(Decorador decorador) {
        this.decorador = decorador;
    }

    public void solicitarNotificacion() {
        decorador.enviarNotificacion();
    }
}
}
