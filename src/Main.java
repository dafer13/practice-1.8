import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    CheckField checkField = new CheckField();
    Scanner scanner = new Scanner(System.in);
    List<Doctor> doctors = new ArrayList<>();

    addDoctors(doctors);
    printMenu();

    int inputOne = scanner.nextInt();
    scanner.nextLine();
    switch (inputOne){
      case 1:
        case1(scanner, checkField, doctors);
        break;
      case 2:
        case2(checkField, doctors);
        break;
      default:
        System.out.println("Команда введена не правильно, введите 1 или 2.");
    }
  }

  private static void case2(CheckField checkField, List<Doctor> doctors) {
    checkField.findDoctor(doctors);
  }

  private static void printMenu() {
    System.out.println("Если вы хотите добавить нового врача нажмите - 1");
    System.out.println(
        "Если вы хотите изменить сведенья о прохождении аттестации врача нажмите - 2");

  }

  public static void case1(Scanner scanner, CheckField checkField, List<Doctor> doctors) {
    System.out.println("Введите ФИО.");
    String fullName = scanner.nextLine();
    System.out.println("Введите специальность");
    String specialization = scanner.nextLine();

    int numberDoctorInList = checkField.checkFieldDoctorInList(doctors);
    int numberShiftsInMonth = checkField.checkNumberShiftsInMonth();
    boolean isAttested = checkField.checkIsAttested();

    Doctor newDoctor = new Doctor(
        fullName, specialization, numberDoctorInList, numberShiftsInMonth, isAttested);
    doctors.add(newDoctor);
    System.out.println("Врач " + fullName + " успешно добавлен!");
    Collections.sort(doctors);
    System.out.println(doctors);
  }

  public static void addDoctors(List<Doctor> doctors) {
    Doctor doctor1 = new Doctor("Антонов Антон Антонович", "терапевт",
        345, 15, true);
    Doctor doctor2 = new Doctor("Иванов Иван Иванович", "хирург",
        5, 20, true);
    Doctor doctor3 = new Doctor("Юрьев Юрий Аристархович", "офтальмолог",
        65, 10, true);
    doctors.add(doctor1);
    doctors.add(doctor2);
    doctors.add(doctor3);
  }
}




