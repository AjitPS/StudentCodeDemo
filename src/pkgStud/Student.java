package pkgStud;

/** Student class */
public class Student extends PersonalRecord {

 private String name;
 private int age;
 private double marks;
 
 Student(String studName, int studAge, double studMarks, String studAddr) {
  super(studAddr); // pass Address to Personal Record class.

  this.name= studName;
  this.age= studAge;
  this.marks= studMarks;
 }
 
 public String getName() {
  return this.name;
 }

 public int getAge() {
  return this.age;
 }

 public double getMarks() {
  return this.marks;
 }

 public void setName(String nm) {
  this.name= nm;
 }

 public void setAge(int a) {
  this.age= a;
 }

 public void setMarks(double mk) {
  this.marks= mk;
 }
}
