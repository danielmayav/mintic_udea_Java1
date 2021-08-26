package com.minticudea.proyecto1;

public class Pruebas {
    public static void main(String[] args) {
        Autobus miBus = new Autobus("pedro", 30, false);
        miBus.gestionarMotor();
        miBus.gestionarWifi();
        miBus.gestionarAireAcondiconado();
        miBus.gestionarMarcha();
        miBus.moverDerecha(5);
        miBus.moverArriba(10);
        miBus.gestionarMarcha();
        miBus.gestionarPuerta();
        //miBus.recogerPasajero(2);
        miBus.recogerPasajero(1);
        miBus.recogerPasajero(4);
        miBus.recogerPasajero(6);
        miBus.gestionarMarcha();
        miBus.moverIzquierda(2);
        miBus.dejarPasajero();
        miBus.gestionarMotor();

        System.out.println(miBus.getNombreConductor());
        System.out.println(miBus.getnPasajeros());
        System.out.println(miBus.getCantidadDinero());
        System.out.println(miBus.getnMaximoPasajeros());
        System.out.println(miBus.getLocalizacionX());
        System.out.println(miBus.getLocalizacionY());
        System.out.println(miBus.isPuertaAbierta());
        System.out.println(miBus.isAireAcondicionadoActivado());
        System.out.println(miBus.isMotorEncendido());
        System.out.println(miBus.isWifiEncendido());
        System.out.println(miBus.isEnMarcha());
        System.out.println(miBus.calcularDistanciaAcopio());

    }
}
