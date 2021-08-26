package com.minticudea.proyecto1;

public class Autobus {

    private String nombreConductor;
    private int nPasajeros = 0;
    private double cantidadDinero = 0;
    private int nMaximoPasajeros;
    private double localizacionX = 0;
    private double localizacionY = 0;
    private boolean puertaAbierta;
    private boolean aireAcondicionadoActivado = false;
    private boolean motorEncendido = false;
    private boolean wifiEncendido = false;
    private boolean enMarcha = false;

    //          ·····  CONSTRUCTOR  ·····
    public Autobus(String nombreConductor, int nMaximoPasajeros, boolean puertaAbierta){
        this.nombreConductor = nombreConductor;
        this.nMaximoPasajeros = nMaximoPasajeros;
        this.puertaAbierta = puertaAbierta;
    }

    //         ······  GETTERS  ·······

    public String getNombreConductor() {
        return nombreConductor;
    }

    public int getnPasajeros() {
        return nPasajeros;
    }

    public double getCantidadDinero() {
        return cantidadDinero;
    }

    public int getnMaximoPasajeros() {
        return nMaximoPasajeros;
    }

    public double getLocalizacionX() {
        return localizacionX;
    }

    public double getLocalizacionY() {
        return localizacionY;
    }

    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }

    public boolean isAireAcondicionadoActivado() {
        return aireAcondicionadoActivado;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }

    public boolean isWifiEncendido() {
        return wifiEncendido;
    }

    public boolean isEnMarcha() {
        return enMarcha;
    }

    //          ·····  SETTERS  ·····

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    public void setCantidadDinero(double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    public void setnMaximoPasajeros(int nMaximoPasajeros) {
        this.nMaximoPasajeros = nMaximoPasajeros;
    }

    public void setLocalizacionX(double localizacionX) {
        this.localizacionX = localizacionX;
    }

    public void setLocalizacionY(double getLocalizacionY) {
        this.localizacionY = getLocalizacionY;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }

    public void setAireAcondicionadoActivado(boolean aireAcondicionadoActivado) {
        this.aireAcondicionadoActivado = aireAcondicionadoActivado;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }

    public void setWifiEncendido(boolean wifiEncendido) {
        this.wifiEncendido = wifiEncendido;
    }

    public void setEnMarcha(boolean enMarcha) {
        this.enMarcha = enMarcha;
    }

    //      ·····   METODOS    ······

    public void recogerPasajero(int estrato) {
        double costo = 0;
        if(puertaAbierta) {
           if (estrato <= 2) {
               costo = 1500;
           }
           else if (estrato <= 4) {
               costo = 2600;
           }
           else {
               costo = 3000;
           }
           cantidadDinero += costo;
           nPasajeros++;
       }

    }

    public void dejarPasajero() {
        if(puertaAbierta){
            nPasajeros--;
        }
    }

    public double calcularDistanciaAcopio(){
        double distancia;
        distancia = Math.sqrt((localizacionX * localizacionX) + (localizacionY * localizacionY));
        return  distancia;

    }

    public void gestionarPuerta() {
        if(!enMarcha){
            puertaAbierta = !puertaAbierta;
        }
        else puertaAbierta = false;
    }

    public void gestionarAireAcondiconado() {
        if(motorEncendido){
            aireAcondicionadoActivado = !aireAcondicionadoActivado;
        }
        else aireAcondicionadoActivado = false;
    }

    public void gestionarMotor(){
        motorEncendido = !motorEncendido;
        if(!motorEncendido) {
            aireAcondicionadoActivado = false;
            wifiEncendido = false;
        }
    }

    public void gestionarWifi(){
        if(motorEncendido){
            wifiEncendido = !wifiEncendido;
        }
        else wifiEncendido = false;
    }

    public void gestionarMarcha(){
        if(motorEncendido && !puertaAbierta) {
            enMarcha = !enMarcha;
        }
        else enMarcha = false;
    }

    public void moverDerecha(double d) {
        if(enMarcha) {
            localizacionX += d;
        }

    }

    public void moverIzquierda(double d) {
        if(enMarcha) {
            localizacionX -= d;
        }

    }

    public void moverArriba(double d) {
        if(enMarcha) {
            localizacionY += d;
        }
    }

    public void moverAbajo(double d) {
        if(enMarcha) {
            localizacionY -= d;
        }
    }
}

