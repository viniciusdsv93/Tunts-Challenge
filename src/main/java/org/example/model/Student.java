package org.example.model;

public class Student {

  private Double register;
  private String name;
  private Double absences;
  private Double p1;
  private Double p2;
  private Double p3;
  private String situation;
  private Integer gradeNeeded;

  public Student(Double register, String name, Double absences, Double p1, Double p2, Double p3, String situation, Integer gradeNeeded) {
    this.register = register;
    this.name = name;
    this.absences = absences;
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;
    this.situation = situation;
    this.gradeNeeded = gradeNeeded;
  }

  public Student() {

  }

  public Double getRegister() {
    return register;
  }

  public void setRegister(Double register) {
    this.register = register;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getAbsences() {
    return absences;
  }

  public void setAbsences(Double absences) {
    this.absences = absences;
  }

  public Double getP1() {
    return p1;
  }

  public void setP1(Double p1) {
    this.p1 = p1;
  }

  public Double getP2() {
    return p2;
  }

  public void setP2(Double p2) {
    this.p2 = p2;
  }

  public Double getP3() {
    return p3;
  }

  public void setP3(Double p3) {
    this.p3 = p3;
  }

  public String getSituation() {
    return situation;
  }

  public void setSituation(String situation) {
    this.situation = situation;
  }

  public Integer getGradeNeeded() {
    return gradeNeeded;
  }

  public void setGradeNeeded(Integer gradeNeeded) {
    this.gradeNeeded = gradeNeeded;
  }

  @Override
  public String toString() {
    return "Student{" +
            "register='" + register + '\'' +
            ", name='" + name + '\'' +
            ", absences=" + absences +
            ", p1=" + p1 +
            ", p2=" + p2 +
            ", p3=" + p3 +
            ", situation='" + situation + '\'' +
            ", gradeNeeded=" + gradeNeeded +
            '}';
  }
}
