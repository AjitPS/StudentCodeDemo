package pkgStud;

/** PersonalRecord class */
public class PersonalRecord {

 private String addr;

 PersonalRecord(String ad) {
  this.addr= ad;
 }
 public String getAddress() {
  return this.addr;
 }

 public void setAddress(String newAddr) {
  this.addr= newAddr;
 }

}
