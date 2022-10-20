package com.pruebaCSV;

public class PruebaCSV
{
    // Ejemplo acceso .csv en java
    public static void main(String[] args)
    {
        /**
         * @author Pablo Federico Martín Luna
         */
        LectorCSV myReader = new LectorCSV();
        myReader.leeCSV("./src/main/resources/datos/pokemon.csv");
    }
}
