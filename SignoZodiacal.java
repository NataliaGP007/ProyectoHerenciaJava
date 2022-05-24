package ProyectoHerencia;

// Superclase.
public abstract class SignoZodiacal {

    protected String signoZodiacal;
    protected int mesNacimiento;
    protected int diaNacimiento;

    // Constructor.
    public SignoZodiacal(int mesNacimiento, int diaNacimiento) {
        this.mesNacimiento = mesNacimiento;
        this.diaNacimiento = diaNacimiento;

    }

    // Metodo abstracto.
    public abstract void identificarSignoZodiacal();

    public String getSignoZodiacal(){
        return this.signoZodiacal;
    }

}
