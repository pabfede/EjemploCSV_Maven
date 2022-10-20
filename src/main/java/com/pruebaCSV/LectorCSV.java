package com.pruebaCSV;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LectorCSV
{
    /**
     * @author Pablo Federico Martín Luna
     */
    public void leeCSV(String archiveName)
    {
        try
        {
            CSVReader csvReader = new CSVReader(new FileReader(archiveName));
            String[] line;
            while ((line = csvReader.readNext()) != null )
            {
                System.out.println(" | " + line[0] + " | " + line[1] + " | " + line[2] + " | ");
            }
            csvReader.close();
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        catch (CsvValidationException e)
        {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
