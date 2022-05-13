package ProyectoHerencia;

public class SignoZodiacalChino extends SignoZodiacal{

    private int anioNacimiento;

    public SignoZodiacalChino(int anioNacimiento, int mesNacimiento, int diaNacimiento) {
        super(mesNacimiento, diaNacimiento);
        this.anioNacimiento = anioNacimiento;
        this.identificarSignoZodiacal();
    }

    @Override
    public void identificarSignoZodiacal() {
        if ((this.anioNacimiento == 1924) || (this.anioNacimiento == 1936) || (this.anioNacimiento == 1948) || (this.anioNacimiento == 1960) || (this.anioNacimiento == 1972) || (this.anioNacimiento == 1984) || (this.anioNacimiento == 1996) || (this.anioNacimiento == 2008) || (this.anioNacimiento == 2020)){
            this.signoZodiacal = "Rata";}
        else if ((this.anioNacimiento == 1925) || (this.anioNacimiento == 1937) || (this.anioNacimiento == 1949) || (this.anioNacimiento == 1961) || (this.anioNacimiento == 1973) || (this.anioNacimiento == 1985) || (this.anioNacimiento == 1997) || (this.anioNacimiento == 2009) || (this.anioNacimiento == 2021)){
            this.signoZodiacal = "Buey";}
        else if ((this.anioNacimiento == 1926) || (this.anioNacimiento == 1938) || (this.anioNacimiento == 1950) || (this.anioNacimiento == 1962) || (this.anioNacimiento == 1974) || (this.anioNacimiento == 1986) || (this.anioNacimiento == 1998) || (this.anioNacimiento == 2010) || (this.anioNacimiento == 2022)){
            this.signoZodiacal = "Tigre";}
        else if ((this.anioNacimiento == 1927) || (this.anioNacimiento == 1939) || (this.anioNacimiento == 1951) || (this.anioNacimiento == 1963) || (this.anioNacimiento == 1975) || (this.anioNacimiento == 1987) || (this.anioNacimiento == 1999) || (this.anioNacimiento == 2011) || (this.anioNacimiento == 2023)){
            this.signoZodiacal = "Conejo";}
        else if ((this.anioNacimiento == 1928) || (this.anioNacimiento == 1940) || (this.anioNacimiento == 1952) || (this.anioNacimiento == 1964) || (this.anioNacimiento == 1976) || (this.anioNacimiento == 1988) || (this.anioNacimiento == 2000) || (this.anioNacimiento == 2012) || (this.anioNacimiento == 2024)){
            this.signoZodiacal = "Dragon";}
        else if ((this.anioNacimiento == 1929) || (this.anioNacimiento == 1941) || (this.anioNacimiento == 1953) || (this.anioNacimiento == 1965) || (this.anioNacimiento == 1977) || (this.anioNacimiento == 1989) || (this.anioNacimiento == 2001) || (this.anioNacimiento == 2013) || (this.anioNacimiento == 2025)){
            this.signoZodiacal = "Serpiente";}
        else if ((this.anioNacimiento == 1930) || (this.anioNacimiento == 1942) || (this.anioNacimiento == 1954) || (this.anioNacimiento == 1966) || (this.anioNacimiento == 1978) || (this.anioNacimiento == 1990) || (this.anioNacimiento == 2002) || (this.anioNacimiento == 2014) || (this.anioNacimiento == 2026)){
            this.signoZodiacal = "Caballo";}
        else if ((this.anioNacimiento == 1931) || (this.anioNacimiento == 1943) || (this.anioNacimiento == 1955) || (this.anioNacimiento == 1967) || (this.anioNacimiento == 1979) || (this.anioNacimiento == 1991) || (this.anioNacimiento == 2003) || (this.anioNacimiento == 2015) || (this.anioNacimiento == 2027)){
            this.signoZodiacal = "Cabra";}
        else if ((this.anioNacimiento == 1932) || (this.anioNacimiento == 1944) || (this.anioNacimiento == 1956) || (this.anioNacimiento == 1968) || (this.anioNacimiento == 1980) || (this.anioNacimiento == 1992) || (this.anioNacimiento == 2004) || (this.anioNacimiento == 2016) || (this.anioNacimiento == 2028)){
            this.signoZodiacal = "Mono";}
        else if ((this.anioNacimiento == 1933) || (this.anioNacimiento == 1945) || (this.anioNacimiento == 1957) || (this.anioNacimiento == 1969) || (this.anioNacimiento == 1981) || (this.anioNacimiento == 1993) || (this.anioNacimiento == 2005) || (this.anioNacimiento == 2017) || (this.anioNacimiento == 2029)){
            this.signoZodiacal = "Gallo";}
        else if ((this.anioNacimiento == 1934) || (this.anioNacimiento == 1946) || (this.anioNacimiento == 1958) || (this.anioNacimiento == 1970) || (this.anioNacimiento == 1982) || (this.anioNacimiento == 1994) || (this.anioNacimiento == 2006) || (this.anioNacimiento == 2018) || (this.anioNacimiento == 2030)){
            this.signoZodiacal = "Perro";}
        else if ((this.anioNacimiento == 1935) || (this.anioNacimiento == 1947) || (this.anioNacimiento == 1959) || (this.anioNacimiento == 1971) || (this.anioNacimiento == 1983) || (this.anioNacimiento == 1995) || (this.anioNacimiento == 2007) || (this.anioNacimiento == 2019) || (this.anioNacimiento == 2031)){
            this.signoZodiacal = "Cerdo";}
    }

}
