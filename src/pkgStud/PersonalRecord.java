package pkgStud;

import pkg2.ExtraClass;

/** PersonalRecord class */
public class PersonalRecord extends ExtraClass {
 private String addr;

 PersonalRecord(String ad) {
  super("demo msg from PersonalRecord class...");
  this.addr= ad;
 }
 public String getAddress() {
  return this.addr;
 }

 public void setAddress(String newAddr) {
  this.addr= newAddr;
 }
}
