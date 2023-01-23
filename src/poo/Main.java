package poo;

public class Main {

    public static void main(String[] args) {

        SmartDevice smartDevice = new SmartDevice();

        SmartPhone iPhoneProMax = new SmartPhone("Apple", "negro", 14.75, 7.15, 0.78, 260, 6.7, "2796x1290", 128, 4323, 48, true, false);

        SmartWatch MiWatch = new SmartWatch("Xiaomi", "blanco", 41, 35, 11, 35, 1.4, "320x320", 32, 230, "Piel", false, true);

        System.out.println("Empresa: " + iPhoneProMax.getEmpresa() + "\nColor: " + iPhoneProMax.getColor() + "\nResolución pantalla: " + iPhoneProMax.getResolucionPantalla() + "\nCargador incluido? " + iPhoneProMax.tieneCargadorIncluido());

        System.out.println("");

        System.out.println("Empresa: " + MiWatch.getEmpresa() + "\nColor: " + MiWatch.getColor() + "\nResolución pantalla: " + MiWatch.getResolucionPantalla() + "\nMaterial de correa: " + MiWatch.getTipoMaterialDeCorrea());

    }
}
