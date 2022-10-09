package org.example.writeSheet;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.example.model.Student;

import java.io.*;
import java.util.List;

public class WriteSheet {

  public void createFile(String fileName, List<Student> students) {
    try (FileInputStream excelFile = new FileInputStream(fileName)) {
      var workbook = new XSSFWorkbook(excelFile);
      var firstSheet = workbook.getSheetAt(0);

      int studentCounter = 0;
      for (Row line : firstSheet) {
        if (line.getRowNum() > 2) {
          Student student = students.get(studentCounter);
          line.createCell(6).setCellValue(student.getSituation());
          line.createCell(7).setCellValue(student.getGradeNeeded());
          studentCounter++;
        }
      }

      FileOutputStream outputFile = new FileOutputStream(new File("Engenharia de Software - Desafio [Vinícius dos Santos Verissimo]2.xlsx"));
      workbook.write(outputFile);
      outputFile.close();
      System.out.println("File successfully generated");
    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
