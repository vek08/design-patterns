package Creational Design Patterns.problems.code.Document Export System;

public class FormatFactory {
    public static Format getFormat(String type){
        if(type.equalsIgnoreCase("PDF")){
            return new PDFFormat();
        }
        else if(type.equalsIgnoreCase("Excel")){
            return new ExcelFormat();
        }
        else if(type.equalsIgnoreCase("CSV")){
            return new CSVFormat();
        }

        throw new IllegalArgumentException("Unknown type");
    }
}
