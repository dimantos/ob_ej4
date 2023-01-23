package poo;

public class SmartWatch extends SmartDevice {

    private String tipoMaterialDeCorrea;

    private boolean isSupportCalling;
    private boolean isSupportGPS;

    public SmartWatch(){}

    public SmartWatch(String empresa, String color, double alto, double ancho, double grosor, double peso, double tamanoPantalla, String resolucionPantalla, int capacidadMemoria, int capacidadBateria, String tipoMaterialDeCorrea, boolean isSupportCalling, boolean isSupportGPS) {
        super(empresa, color, alto, ancho, grosor, peso, tamanoPantalla, resolucionPantalla, capacidadMemoria, capacidadBateria);
        this.tipoMaterialDeCorrea = tipoMaterialDeCorrea;
        this.isSupportCalling = isSupportCalling;
        this.isSupportGPS = isSupportGPS;
    }

    public String getTipoMaterialDeCorrea() {
        return tipoMaterialDeCorrea;
    }

    public void setTipoMaterialDeCorrea(String tipoMaterialDeCorrea) {
        this.tipoMaterialDeCorrea = tipoMaterialDeCorrea;
    }

    public boolean isSupportCalling() {
        return isSupportCalling;
    }

    public void setSupportCalling(boolean supportCalling) {
        isSupportCalling = supportCalling;
    }

    public boolean isSupportGPS() {
        return isSupportGPS;
    }

    public void setSupportGPS(boolean supportGPS) {
        isSupportGPS = supportGPS;
    }
}
