package proyecto1;

public class Moto extends Vehiculo{
    public Moto(String numeroPlaca)
    {
        super(numeroPlaca);
    }

    @Override
    public String toString() {
        return "Moto{" + super.toString()+"}";
    }
}

