package ProyectoHerencia;

public class Main {
    public static void main(String[] args) {

        // Instancia de la clase hija SignoZodiacalOccidental
        SignoZodiacalOccidental signoO = new SignoZodiacalOccidental(7, 27);
        System.out.println(signoO.getSignoZodiacal());

        // Instancia de la clase hija SignoZodiacalChino
        SignoZodiacalChino signoC = new SignoZodiacalChino(2003, 7, 27);
        System.out.println(signoC.getSignoZodiacal());

        // Instancia de la clase hija SignoZodiacalMaya
        SignoZodiacalMaya signoM = new SignoZodiacalMaya(7, 27);
        System.out.println(signoM.getSignoZodiacal());

        // Instancia de la clase hija SignoZodiacalEgipcio
        SignoZodiacalEgipcio signoE = new SignoZodiacalEgipcio(7, 27);
        System.out.println(signoE.getSignoZodiacal());
    }
}
