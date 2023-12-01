/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject11;

/**
 *
 * @author fulco
 */
public class Credit_Card_Creation {
    public class Cliente {
    private CreadorDeTarjeta cdt;

    public Cliente() {
        this.cdt = new CreadorDeTarjeta();
    }

    public TarjetaBasica createTarjetaBasica() {
        return cdt.createTarjetaBasica();
    }

    public TarjetaPremium createTarjetaPremium() {
        return cdt.createTarjetaPremium();
    }

    public TarjetaVIP createTarjetaVIP() {
        return cdt.createTarjetaVIP();
    }
}

public class CreadorDeTarjeta {
    public TarjetaBasica createTarjetaBasica() {
        return new TarjetaBasica();
    }

    public TarjetaPremium createTarjetaPremium() {
        return new TarjetaPremium();
    }

    public TarjetaVIP createTarjetaVIP() {
        return new TarjetaVIP();
    }
}

public class TarjetaBasica {
    // Implementación de la clase TarjetaBasica
}

public class TarjetaPremium {
    // Implementación de la clase TarjetaPremium
}

public class TarjetaVIP {
    // Implementación de la clase TarjetaVIP
}
}
