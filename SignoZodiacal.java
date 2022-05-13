package ProyectoHerencia;

public abstract class SignoZodiacal {

    protected String signoZodiacal;
    protected int mesNacimiento;
    protected int diaNacimiento;

    public SignoZodiacal(int mesNacimiento, int diaNacimiento) {
        this.mesNacimiento = mesNacimiento;
        this.diaNacimiento = diaNacimiento;

    }

    public abstract void identificarSignoZodiacal();

    public String getSignoZodiacal(){
        return this.signoZodiacal;
    }

}
