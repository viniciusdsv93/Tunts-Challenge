package org.example.calculateAverageGrade.impl;

import org.example.calculateAverageGrade.ICalculateAverageGrade;
import org.example.model.Student;

public class CalculateAverageGrade implements ICalculateAverageGrade {

  public void calculateAverageGrade(Student student) {
    if (student.getAbsences() > 15) {
      student.setSituation("Reprovado por Falta");
      student.setGradeNeeded(0);
    }
    else {
      Double averageGrade = Math.ceil((student.getP1() + student.getP2() + student.getP3()) / 3);
      if (averageGrade < 50) {
        student.setSituation("Reprovado por Nota");
        student.setGradeNeeded(0);
      }
      else if (averageGrade >= 50 && averageGrade < 70) {
        student.setSituation("Exame Final");
        Double naf = 100 - averageGrade;
        student.setGradeNeeded((int) Math.round(naf));
      }
      else {
        student.setSituation("Aprovado");
        student.setGradeNeeded(0);
      }
    }
  }
}
