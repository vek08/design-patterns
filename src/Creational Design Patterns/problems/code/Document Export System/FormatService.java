package Creational Design Patterns.problems.code.Document Export System;

public class FormatService {
    public void sendData(String type){
        Formate format = FormatFactory.getFormat(type);
        format.exportData();
    }
}
