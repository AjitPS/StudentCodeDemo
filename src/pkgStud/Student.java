package pkgStud;

/** Student class */
public class Student extends PersonalRecord {

 private String name; // name
 private int age; // age
 private double marks; // marks
 
 Student(String studName, int studAge, double studMarks, String studAddr) {

  // pass Address to Personal Record class.
  super(studAddr);

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
