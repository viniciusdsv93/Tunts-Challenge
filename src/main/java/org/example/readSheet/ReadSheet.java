package org.example.readSheet;

import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.example.calculateAverageGrade.ICalculateAverageGrade;
import org.example.model.Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class ReadSheet {

  private ICalculateAverageGrade calculateAverageGrade;

  public ReadSheet(ICalculateAverageGrade calculateAverageGrade) {
    this.calculateAverageGrade = calculateAverageGrade;
  }

  public List<Student> readFile(String fileName) {
    List<Student> students = new ArrayList<>();
    Integer totalNumberOfClasses = 0;

    try (FileInputStream excelFile = new FileInputStream(fileName)) {
      var workbook = new XSSFWorkbook(excelFile);
      var firstSheet = workbook.getSheetAt(0);

      int rowCounter = 0;
      for (Row line : firstSheet) {
        var student = new Student();
        if (rowCounter == 1) {
          String classes = String.valueOf(line.getCell(0));
          totalNumberOfClasses = Integer.valueOf(classes.substring(28, 30));
        }
        if (rowCounter > 2) {
          student.setRegister(Double.valueOf(String.valueOf(line.getCell(0))));
          student.setName(String.valueOf(line.getCell(1)));
          student.setAbsences(Double.valueOf(String.valueOf(line.getCell(2))));
          student.setP1(Double.valueOf(String.valueOf(line.getCell(3))));
          student.setP2(Double.valueOf(String.valueOf(line.getCell(4))));
          student.setP3(Double.valueOf(String.valueOf(line.getCell(5))));
          calculateAverageGrade.calculateAverageGrade(student);
          log.info(String.valueOf(student));
          students.add(student);
        }
        rowCounter++;
      }
    }
    catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    }
    catch (IOException e) {
      System.out.println(e.getMessage());
    }
    return students;
  }
}
