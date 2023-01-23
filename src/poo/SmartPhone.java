package poo;

public class SmartPhone extends SmartDevice {

    private int cameraEnMpx;

    private boolean isSupportESIM;
    private boolean tieneCargadorIncluido;

    public SmartPhone(){}

    public SmartPhone(String empresa, String color, double alto, double ancho, double grosor, double peso, double tamanoPantalla, String resolucionPantalla, int capacidadMemoria, int capacidadBateria, int cameraEnMpx, boolean isSupportESIM, boolean tieneCargadorIncluido) {
        super(empresa, color, alto, ancho, grosor, peso, tamanoPantalla, resolucionPantalla, capacidadMemoria, capacidadBateria);
        this.cameraEnMpx = cameraEnMpx;
        this.isSupportESIM = isSupportESIM;
        this.tieneCargadorIncluido = tieneCargadorIncluido;
    }

    public int getCameraEnMpx() {
        return cameraEnMpx;
    }

    public void setCameraEnMpx(int cameraEnMpx) {
        this.cameraEnMpx = cameraEnMpx;
    }

    public boolean isSupportESIM() {
        return isSupportESIM;
    }

    public void setSupportESIM(boolean supportESIM) {
        isSupportESIM = supportESIM;
    }

    public boolean tieneCargadorIncluido() {
        return tieneCargadorIncluido;
    }

    public void setTieneCargadorIncluido(boolean tieneCargadorIncluido) {
        this.tieneCargadorIncluido = tieneCargadorIncluido;
    }
}
