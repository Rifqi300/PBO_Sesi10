/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractinterface;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class Smartphones {
  static boolean isClosed = false;
  static String answer;
  static Phone phoneOfChoice;

  public static void main(String[] args) {
    Phone SamsungZFlip3 = new Samsung();
    Phone XiaomiRedmiNote10Pro = new Xiaomi();

    Scanner input = new Scanner(System.in);
    System.out.println("==============Tugas PBO Sesi 10=============");
    System.out.println("=============Abstract & Interface===========");
    System.out.println("");

    System.out.println("----------------- Pilih HP -----------------");
    System.out.println("1. Xiaomi Redmi Note 10 Pro" );
    System.out.println("2. Samsung Z Flip 3");
    System.out.println("--------------------------------------------");

    System.out.print("Pilih Menu : ");
    answer = input.next();

    switch(answer) {
      case "1":
        phoneOfChoice = XiaomiRedmiNote10Pro;
        break;
      case "2":
        phoneOfChoice = SamsungZFlip3;
        break;
      default:
        System.out.println("Inputtan Salah!");
    }

    PhoneUser sam = new PhoneUser(phoneOfChoice);

    while(!isClosed) {
      System.out.println("----------------- Main Menu ----------------");
      System.out.println("1. Nyalakan Handphone");
      System.out.println("2. Matikan Handphone");
      System.out.println("3. Perbesar Volume");
      System.out.println("4. Perkecil Volume");
      System.out.println("5. Keluar Program");
      System.out.println("--------------------------------------------");

      System.out.print("Pilih Menu : ");
      answer = input.next();

      switch(answer) {
        case "1":
          sam.turnOn();
          break;
        case "2":
          sam.turnOff();
          break;
        case "3":
          sam.makeFullVolume();
          break;
        case "4":
          sam.makeSilentVolume();
          break;
        case "5":
          isClosed = true;
          break;
        default:
          System.out.println("Inputtan Salah!");
      }
    }
            System.out.println("");
        System.out.println("===========Muhammad Rifqi Darmawan=========");
        System.out.println("================Reguler TI20A==============");
        System.out.println("");
  }
}


interface Phone {
  int MAX_VOLUME = 100;
  int MIN_VOLUME = 0;

  void powerOn();
  void powerOff();
  void volumeUp();
  void volumeDown();
}

class PhoneUser {
  Phone phone;

  public PhoneUser(Phone phone) {
    this.phone = phone;
  }

  void turnOn() {
    phone.powerOn();
  }

  void turnOff() {
    phone.powerOff();
  }

  void makeFullVolume() {
    phone.volumeUp();
  }

  void makeSilentVolume() {
    phone.volumeDown();
  }
}


class Xiaomi implements Phone {
  int volume;
  boolean isPower;

  public Xiaomi() {
    volume = 50;
  }

  public String getString() {
    return "Xiaomi";
  }

  @Override
  public void powerOn() {
    isPower = true;
    System.out.println("HP Xiaomi Menyala");
    System.out.println("Selamat Datang di Xiaomi Si Mengayomi");
  }

  @Override
  public void powerOff() {
    isPower = false;
    System.out.println("HP Dalam Keadaan Mati");
  }

  @Override
  public void volumeUp() {
    if (isPower) {
      if (volume == MAX_VOLUME) {
        System.out.println("Volume is 100%");
      }

      else {
        volume += 5;
        System.out.println("Volume is now " + getVolume() + "%");
      }

    } else {
      System.out.println("Silahkan Nyalakan Hpnya Terlebih Dahulu");
    }
  }

  @Override
  public void volumeDown() {
    if (isPower) {
      if (volume == MIN_VOLUME) {
        System.out.println("Volume is 0%");
      }

      else {
        volume -= 5;
        System.out.println("Volume is now " + getVolume() + "%");
      }

    } else {
      System.out.println("Silahkan Nyalakan Hpnya Terlebih Dahulu");
    }
  }

  public int getVolume() {
    return volume;
  }
}

class Samsung implements Phone {
  int volume;
  boolean isPower;

  public Samsung() {
    volume = 50;
  }

  public String getString() {
    return "Samsung";
  }

  @Override
  public void powerOn() {
    isPower = true;
    System.out.println("HP Samsung Menyala");
    System.out.println("Selamat Datang di Samsung Sumsang");
  }

  @Override
  public void powerOff() {
    isPower = false;
    System.out.println("HP Mati");
  }

  @Override
  public void volumeUp() {
    if (isPower) {
      if (volume == MAX_VOLUME) {
        System.out.println("Volume is 100%");
      }

      else {
        volume += 5;
        System.out.println("Volume is now " + getVolume() + "%");
      }

    } else {
      System.out.println("Silahkan Nyalakan Hpnya Terlebih Dahulu");
    }
  }

  @Override
  public void volumeDown() {
    if (isPower) {
      if (volume == MIN_VOLUME) {
        System.out.println("Volume is 0%");
      }

      else {
        volume -= 5;
        System.out.println("Volume is now " + getVolume() + "%");
      }

    } else {
      System.out.println("Silahkan Nyalakan Hpnya Terlebih Dahulu");
    }
  }

  public int getVolume() {
    return volume;
  }
}

