import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CheckField {

  Scanner scanner = new Scanner(System.in);

  public int checkFieldDoctorInList(List<Doctor> doctors) {
    System.out.println("Введите номер врача в списке.");
    int numberDoctorInList = scanner.nextInt();
    while (true) {
      if (numberDoctorInList < 0) {
        System.out.println("Введите положительное число.");
        numberDoctorInList = scanner.nextInt();
      } else {
        break;
      }
    }

    boolean doctorInList = true;
    while (doctorInList) {
      doctorInList = false;

      for (Doctor d : doctors) {
        if (numberDoctorInList == d.getNumberDoctorInList()) {
          System.out.println("Врач с таким номером уже существует введите другой");
          numberDoctorInList = scanner.nextInt();
          doctorInList = true;
        }
      }
    }
    return numberDoctorInList;
  }

  public int checkNumberShiftsInMonth() {
    System.out.println("Введите количество рабочих смен в месяц");
    int numberShiftsInMonth = scanner.nextInt();
    while (true) {
      if (numberShiftsInMonth < 0) {
        System.out.println("Введите положительное число");
        numberShiftsInMonth = scanner.nextInt();
      } else {
        break;
      }
    }
    return numberShiftsInMonth;
  }

  public boolean checkIsAttested() {
    System.out.println("Введите аттестацию врача\n1 - да\n 2 - нет");
    int doctorAttested = scanner.nextInt();
    return doctorAttested == 1;
  }

  public void findDoctor(List<Doctor> doctors) {
    System.out.println("Введите номер врача которому хотите изменить аттестацию");
    int changeAttestedDocNumber = scanner.nextInt();
    while (true) {
      if (changeAttestedDocNumber < 0) {
        System.out.println("Введите число больше 0");
        changeAttestedDocNumber = scanner.nextInt();
      } else
        break;
    }

    boolean docContains = containsDoctorInListByNumber(doctors,changeAttestedDocNumber);
    if(docContains) {
      System.out.println("Введите true - если хотите аттестовать врача"
          + "\nВведите false - если хотите убрать аттестацию");

      boolean isAttested = scanner.nextBoolean();

      for (Doctor d : doctors) {
        if (d.getNumberDoctorInList() == changeAttestedDocNumber) {
          d.setAttested(isAttested);
        }
      }
      Collections.sort(doctors);
      System.out.println(doctors);
    }
    else {
      System.out.println("Врача с таким номером в списке не существует");
    }
  }

  private boolean containsDoctorInListByNumber(List<Doctor> doctors, int changeAttestedDocNumber) {
    for (Doctor d : doctors) {
      if (d.getNumberDoctorInList() == changeAttestedDocNumber) {
        return true;
      }
    }
    return false;
  }
}


