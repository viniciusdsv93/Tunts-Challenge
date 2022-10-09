package org.example;

import org.example.calculateAverageGrade.impl.CalculateAverageGrade;
import org.example.model.Student;
import org.example.readSheet.ReadSheet;
import org.example.writeSheet.WriteSheet;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    ReadSheet rs = new ReadSheet(new CalculateAverageGrade());
    WriteSheet ws = new WriteSheet();

    List<Student> students = rs.readFile("Engenharia de Software - Desafio [Vinícius dos Santos Verissimo].xlsx");
    ws.createFile("Engenharia de Software - Desafio [Vinícius dos Santos Verissimo].xlsx", students);
  }
}