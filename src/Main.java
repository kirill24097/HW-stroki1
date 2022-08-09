import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ///1
        String firstName = "Иван";
        String lastName = "Иванов";
        String middleName = "Иванович";
        String fullName = firstName+ " " + lastName+ " " + middleName+ " ";
        System.out.println(  "ФИО сотрудника -  " + fullName );
        ///2
        System.out.println("Данные ФИО сотрудника для заполнения отчета -  " + fullName.toUpperCase(Locale.ROOT) );
///3
        fullName = "Иванов Семён Семёнович";
        String replaceFullName = fullName.replace("ё" , "е");
        System.out.println("Данные ФИО ссотрудника - " + replaceFullName);

    }




}