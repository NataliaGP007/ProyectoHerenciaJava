package ProyectoHerencia;

public class SignoZodiacalOccidental extends SignoZodiacal{

    public SignoZodiacalOccidental(int mesNacimiento, int diaNacimiento) {
        super(mesNacimiento, diaNacimiento);
        this.identificarSignoZodiacal();
    }

    @Override
    public void identificarSignoZodiacal() {

        if ((this.mesNacimiento == 12 && this.diaNacimiento >= 22) || (this.mesNacimiento == 1 && this.diaNacimiento <= 20)){
            this.signoZodiacal = "Capricornio";}
        else if ((this.mesNacimiento == 1 && this.diaNacimiento >= 22) || (this.mesNacimiento == 2 && this.diaNacimiento <= 19)){
            this.signoZodiacal = "Acuario";}
        else if ((this.mesNacimiento == 2) || (this.mesNacimiento == 3 && this.diaNacimiento <= 20)){
            this.signoZodiacal = "Piscis";}
        else if ((this.mesNacimiento == 3) || (this.mesNacimiento == 4 && this.diaNacimiento <= 20)){
            this.signoZodiacal = "Aries";}
        else if ((this.mesNacimiento == 4) || (this.mesNacimiento == 5 && this.diaNacimiento <= 20)){
            this.signoZodiacal = "Tauro";}
        else if ((this.mesNacimiento == 5) || (this.mesNacimiento == 6 && this.diaNacimiento <= 21)){
            this.signoZodiacal = "Géminis";}
        else if ((this.mesNacimiento == 6) || (this.mesNacimiento == 7 && this.diaNacimiento <= 22)){
            this.signoZodiacal = "Cáncer";}
        else if ((this.mesNacimiento == 7) || (this.mesNacimiento == 8 && this.diaNacimiento <= 23)){
            this.signoZodiacal = "Leo";}
        else if ((this.mesNacimiento == 8) || (this.mesNacimiento == 9 && this.diaNacimiento <= 22)){
            this.signoZodiacal = "Virgo";}
        else if ((this.mesNacimiento == 9) || (this.mesNacimiento == 10 && this.diaNacimiento <= 22)){
            this.signoZodiacal = "Libra";}
        else if ((this.mesNacimiento == 10) || (this.mesNacimiento == 11 && this.diaNacimiento <= 22)){
            this.signoZodiacal = "Escorpio";}
        else {this.signoZodiacal = "Sagitario";}
    }

}
