public class Doctor implements Comparable<Doctor> {

  private String fullName;
  private String specialization;
  private int numberDoctorInList;
  private int numberShiftsInMonth;
  private boolean isAttested;

  public Doctor(String fullName, String specialization, int numberDoctorInList,
      int numberShiftsInMonth,
      boolean isAttested) {
    this.fullName = fullName;
    this.specialization = specialization;
    this.numberDoctorInList = numberDoctorInList;
    this.numberShiftsInMonth = numberShiftsInMonth;
    this.isAttested = isAttested;
  }

  public int getNumberDoctorInList() {
    return numberDoctorInList;
  }

  public void setNumberDoctorInList(int numberDoctorInList) {
    this.numberDoctorInList = numberDoctorInList;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getSpecialization() {
    return specialization;
  }

  public void setSpecialization(String specialization) {
    this.specialization = specialization;
  }

  public int getNumberShiftsInMonth() {
    return numberShiftsInMonth;
  }

  public void setNumberShiftsInMonth(int numberShiftsInMonth) {
    this.numberShiftsInMonth = numberShiftsInMonth;
  }

  public boolean isAttested() {
    return isAttested;
  }

  public void setAttested(boolean attested) {
    isAttested = attested;
  }

  @Override
  public int compareTo(Doctor o) {
    return fullName.compareTo(o.getFullName());
  }

  @Override
  public String toString() {
    return "Doctor{" +
        "fullName='" + fullName + '\'' +
        ", specialization='" + specialization + '\'' +
        ", numberDoctorInList=" + numberDoctorInList +
        ", numberShiftsInMonth=" + numberShiftsInMonth +
        ", isAttested=" + isAttested +
        '}';
  }
}
