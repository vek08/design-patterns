package Creational Design Patterns.problems.code.Document Export System;

public class CSVFormat implements Format {
    @Override 
    public void exportData(){
        System.out.println("Exporting report as CSV...");
    }
}
