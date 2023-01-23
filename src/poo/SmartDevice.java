package poo;

public class SmartDevice {

    private String empresa;
    private String color;

    private double alto;
    private double ancho;
    private double grosor;
    private double peso;

    private double tamanoPantalla;
    private String resolucionPantalla;

    private int capacidadMemoria;
    private int capacidadBateria;

    public SmartDevice(){}

    public SmartDevice(String empresa, String color, double alto, double ancho, double grosor, double peso, double tamanoPantalla, String resolucionPantalla, int capacidadMemoria, int capacidadBateria) {
        this.empresa = empresa;
        this.color = color;
        this.alto = alto;
        this.ancho = ancho;
        this.grosor = grosor;
        this.peso = peso;
        this.tamanoPantalla = tamanoPantalla;
        this.resolucionPantalla = resolucionPantalla;
        this.capacidadMemoria = capacidadMemoria;
        this.capacidadBateria = capacidadBateria;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getGrosor() {
        return grosor;
    }

    public void setGrosor(double grosor) {
        this.grosor = grosor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public String getResolucionPantalla() {
        return resolucionPantalla;
    }

    public void setResolucionPantalla(String resolucionPantalla) {
        this.resolucionPantalla = resolucionPantalla;
    }

    public int getCapacidadMemoria() {
        return capacidadMemoria;
    }

    public void setCapacidadMemoria(int capacidadMemoria) {
        this.capacidadMemoria = capacidadMemoria;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }
}
