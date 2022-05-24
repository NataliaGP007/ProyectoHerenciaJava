package ProyectoHerencia;

// Subclase.
public class SignoZodiacalMaya extends SignoZodiacal{

    // Constructor.
    public SignoZodiacalMaya(int mesNacimiento, int diaNacimiento) {
        super(mesNacimiento, diaNacimiento);
        this.identificarSignoZodiacal();
    }

    @Override // Metodo sobreescrito.
    public void identificarSignoZodiacal() {
        if ((this.mesNacimiento == 12 && this.diaNacimiento >= 13) || (this.mesNacimiento == 1 && this.diaNacimiento <= 9)){
            this.signoZodiacal = "Lagarto";}
        else if ((this.mesNacimiento == 1) || (this.mesNacimiento == 2 && this.diaNacimiento <= 6)){
            this.signoZodiacal = "Mono";}
        else if ((this.mesNacimiento == 2) || (this.mesNacimiento == 3 && this.diaNacimiento <= 6)){
            this.signoZodiacal = "Halcón";}
        else if ((this.mesNacimiento == 3) || (this.mesNacimiento == 4 && this.diaNacimiento <= 3)){
            this.signoZodiacal = "Jaguar";}
        else if ((this.mesNacimiento == 4) || (this.mesNacimiento == 5 && this.diaNacimiento <= 1)){
            this.signoZodiacal = "Perro/zorro";}
        else if ((this.mesNacimiento == 5) && (this.diaNacimiento <= 29)){
            this.signoZodiacal = "Serpiente";}
        else if ((this.mesNacimiento == 5) || (this.mesNacimiento == 6 && this.diaNacimiento <= 26)){
            this.signoZodiacal = "Conejo/Ardilla";}
        else if ((this.mesNacimiento == 6) || (this.mesNacimiento == 7 && this.diaNacimiento <= 25)){
            this.signoZodiacal = "Tortuga";}
        else if ((this.mesNacimiento == 7) || (this.mesNacimiento == 8 && this.diaNacimiento <= 22)){
            this.signoZodiacal = "Murciélago";}
        else if ((this.mesNacimiento == 8) || (this.mesNacimiento == 9 && this.diaNacimiento <= 19)){
            this.signoZodiacal = "Escorpión";}
        else if ((this.mesNacimiento == 9) || (this.mesNacimiento == 10 && this.diaNacimiento <= 17)){
            this.signoZodiacal = "Venado";}
        else if ((this.mesNacimiento == 10) || (this.mesNacimiento == 11 && this.diaNacimiento <= 14)){
            this.signoZodiacal = "Búho/Lechuza";}
        else {this.signoZodiacal = "Pavo real";}
    }

}
