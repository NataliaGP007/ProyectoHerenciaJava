package ProyectoHerencia;

public class SignoZodiacalEgipcio extends SignoZodiacal{

    public SignoZodiacalEgipcio(int mesNacimiento, int diaNacimiento) {
        super(mesNacimiento, diaNacimiento);
        this.identificarSignoZodiacal();
    }

    @Override
    public void identificarSignoZodiacal() {
        if ((this.mesNacimiento == 12 && this.diaNacimiento >= 16) || (this.mesNacimiento == 1 && this.diaNacimiento <= 15)){
            this.signoZodiacal = "Hijo de Anubis";}
        else if ((this.mesNacimiento == 1) || (this.mesNacimiento == 2 && this.diaNacimiento <= 15)){
            this.signoZodiacal = "Hijo de Bastet";}
        else if ((this.mesNacimiento == 2) || (this.mesNacimiento == 3 && this.diaNacimiento <= 15)){
            this.signoZodiacal = "Hijo de Selket";}
        else if ((this.mesNacimiento == 3) || (this.mesNacimiento == 4 && this.diaNacimiento <= 15)){
            this.signoZodiacal = "Hijo de Apep";}
        else if ((this.mesNacimiento == 4) || (this.mesNacimiento == 5 && this.diaNacimiento <= 15)){
            this.signoZodiacal = "Hijo de Ptah";}
        else if ((this.mesNacimiento == 5) || (this.mesNacimiento == 6 && this.diaNacimiento <= 15)){
            this.signoZodiacal = "Hijo de Atum";}
        else if ((this.mesNacimiento == 6) || (this.mesNacimiento == 7 && this.diaNacimiento <= 15)){
            this.signoZodiacal = "Hijo de Isis";}
        else if ((this.mesNacimiento == 7) || (this.mesNacimiento == 8 && this.diaNacimiento <= 15)){
            this.signoZodiacal = "Hijo de Ra";}
        else if ((this.mesNacimiento == 8) || (this.mesNacimiento == 9 && this.diaNacimiento <= 15)){
            this.signoZodiacal = "Hijo de Horus";}
        else if ((this.mesNacimiento == 9) || (this.mesNacimiento == 10 && this.diaNacimiento <= 15)){
            this.signoZodiacal = "Hijo de Maat";}
        else if ((this.mesNacimiento == 10) || (this.mesNacimiento == 11 && this.diaNacimiento <= 15)){
            this.signoZodiacal = "Hijo de Osiris";}
        else {this.signoZodiacal = "Hijo de Hathor";}
    }

}
