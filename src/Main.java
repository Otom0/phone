import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите номер телефона:");
        Scanner phone = new Scanner(System.in);
        String clearNumber = phone.nextLine().replaceAll("[^0-9]", "").replaceFirst("[8]", "7");
        String first = String.valueOf(clearNumber.charAt(0));
        if (clearNumber.length() == 11 && first.equals("7"))
        {
            System.out.println(clearNumber);
//            if (clearNumber.length() - 1 == 7 || clearNumber.length() - 1 == 8) {
//                System.out.println(clearNumber);
//            } else System.out.println("Неверный номер");
        }
        else  if (clearNumber.length() ==10 ) {
            System.out.println("7" + clearNumber);
        }
//        else if (clearNumber.length() < 10 || clearNumber.length() > 11)

           else  System.out.println("Неверный формат");
        }
    }

