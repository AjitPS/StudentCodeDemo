package pkgStud;

/** PersonalRecord class */
public class PersonalRecord {

 private String addr;
 private String county= "";

 PersonalRecord(String ad) {
  this.addr= ad;
 }
 public String getAddress() {
  return this.addr;
 }

 public void setAddress(String newAddr) {
  this.addr= newAddr;
 }

 public String getCounty() {
  return this.county;
 }
}
