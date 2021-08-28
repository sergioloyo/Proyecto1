package proyecto1;

public class Vehiculo {
    private String numeroPlaca;
    private int tarifa;

    public Vehiculo() {
    }

    public Vehiculo(String numeroPlaca, int tarifa) {
        this.numeroPlaca = numeroPlaca;
        this.tarifa = tarifa;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }
}
