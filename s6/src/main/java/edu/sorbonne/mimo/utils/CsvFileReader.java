package edu.sorbonne.mimo.utils;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

public class CsvFileReader {
    
    static final CSVFormat FORMAT_AUTO_HEADER = CSVFormat.Builder.create(CSVFormat.RFC4180)
        .setSkipHeaderRecord(true)
        .setHeader()
        .build();

    public static List<List<String>> parse(String filePath) {
        List<List<String>> records = new ArrayList<>();
        try{
            Reader in = new FileReader(filePath);
            Iterable<CSVRecord> csvRecords = FORMAT_AUTO_HEADER.parse(in);
            for (CSVRecord csvRecord : csvRecords) {
                List<String> record = new ArrayList<>();
                int size = csvRecord.size();
                for (int i = 0; i < size; i++) {
                    String value = csvRecord.get(i);
                    record.add(value);
                }
                records.add(record);
            }
        } catch(Exception e) {
            System.out.println("Error parsing csv file: " + filePath);
            e.printStackTrace();
        }
        return records;
    }

    public static void append(String filePath, List<String> record) {

        try{
            System.out.println("saving to file: " + filePath);
            BufferedWriter writer = Files.newBufferedWriter(
                            Paths.get(filePath), 
                            StandardOpenOption.APPEND, 
                            StandardOpenOption.CREATE);
            CSVPrinter printer = new CSVPrinter(writer, FORMAT_AUTO_HEADER);
            printer.printRecord(record);
            
            printer.close();
        } catch(Exception e) {
            System.out.println("Error writing to csv file: " + filePath);
            e.printStackTrace();
        }
        
    }
}
