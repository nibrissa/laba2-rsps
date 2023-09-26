import java.util.Scanner;

public class Main {
    public interface Test {
        void start();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Test TypeAccount = () -> {
            int id;
            String type;
            System.out.print("\nВведите ID типа: ");
            id = sc.nextInt();
            sc.nextLine();
            System.out.print("Введите тип счета: ");
            type = sc.nextLine();
            System.out.println("\nID: " + id + "\nТип счета:" + type);
        };
        Test Bank = () -> {
            int id;
            String namefull, nameshort, inn, bik, coracc, acc, city;
            System.out.print("\nВведите ID банка: ");
            id = sc.nextInt();
            sc.nextLine();
            System.out.print("Введите полное название банка: ");
            namefull = sc.nextLine();
            System.out.print("Введите короткое название банка: ");
            nameshort = sc.nextLine();
            System.out.print("Введите ИНН банка: ");
            inn = sc.nextLine();
            System.out.print("Введите БИК банка: ");
            bik = sc.nextLine();
            System.out.print("Введите номер корсчета: ");
            coracc = sc.nextLine();
            System.out.print("Введите номер банковского счета: ");
            acc = sc.nextLine();
            System.out.print("Введите город: ");
            city = sc.nextLine();
            System.out.println("\nID: " + id + "\nПолное название банка:" + namefull + "\nКороткое название банка:" + nameshort +
                    "\nИНН банка:" + inn + "\nБИК банка:" + bik + "\nНомер корсчета:" + coracc +
                    "\nНомер банковского счета:" + acc + "\nГород:" + city);
        };
        Test Aggrement = () -> {
            int id;
            String number, dataopen, dataclouse, note;
            System.out.print("\nВведите ID договора: ");
            id = sc.nextInt();
            sc.nextLine();
            System.out.print("Введите номер договора: ");
            number = sc.nextLine();
            System.out.print("Введите дату заключения договора: ");
            dataopen = sc.nextLine();
            System.out.print("Введите дату закрытия договора: ");
            dataclouse = sc.nextLine();
            System.out.print("Введите пояснения: ");
            note = sc.nextLine();
            System.out.println("\nID: " + id + "\nНомер договора: " +
                    number + "\nДата заключения договора:" + dataopen + "\nДата закрытия договора:" +
                    dataclouse + "\nПояснение:" + note);
        };
        Test Account = () -> {
            String number;
            int id, typeid, bankid, agrementid;
                System.out.print("\nВведите ID счета: ");
                id = sc.nextInt();
                System.out.print("Введите ID типа счета: ");
                typeid = sc.nextInt();
                System.out.print("Введите ID банка: ");
                bankid = sc.nextInt();
                System.out.print("Введите ID договора: ");
                agrementid = sc.nextInt();
                number = sc.nextLine();
                System.out.print("Введите номер инвестиционного счета: ");
                number = sc.nextLine();
                System.out.print("\nID: " +id + "\nID типа счата: " + typeid + "\nID банка: " + bankid + "\nID договора: " + agrementid + "\nНомер инвестиционного счета: " + number);
        };
        TypeAccount.start();
        Bank.start();
        Aggrement.start();
        Account.start();
    }
}