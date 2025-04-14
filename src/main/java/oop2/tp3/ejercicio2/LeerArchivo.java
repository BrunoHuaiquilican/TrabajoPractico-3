package oop2.tp3.ejercicio2;

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class LeerArchivo {

    public CSVReader reader;

    public LeerArchivo(String nombreArchivo) throws FileNotFoundException {
        this.reader = new CSVReader(new FileReader(nombreArchivo));
    }






}
