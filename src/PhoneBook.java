import java.util.*;

public class PhoneBook {
    public static Scanner scanner = new Scanner(System.in);
    Map<Group, Contact> map = new HashMap<>();
    public static List<Contact> list = new ArrayList<>();
    public static List<Group> groups = new ArrayList<>();

    public static void start() {
        while (true) {
            functions();
            perebor();
        }
    }

    public static void perebor() {
        System.out.println("Выберите функцию");
        String func = scanner.nextLine();
        switch (Integer.parseInt(func)) {
            case 0:
                functions();
                break;
            case 1:
                addContact();
                break;
            case 2:
                addGroup();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                listOutput();
                break;
            case 7:
                groupOutput();
                break;
            case 8:
                break;
        }
    }

    public static void addGroup() {
        System.out.println("Введите название группы");
        String groupName = scanner.nextLine();
        groups.add(new Group<>(groupName));
    }

    public static void addContact() {
        System.out.println("Введите имя и номер контакта");
        String input = scanner.nextLine();
        String[] divide = input.split(" ");
        String name = divide[0];
        String number = divide[1];

        list.add(new Contact<>(name, number));
    }

    public static void functions() {
        System.out.println(
            "1. Добавить контакт\n" +
            "2. Добавить группу\n" +
            "3. Добавить контакт в группы\n" +
            "4. Поиск контакта в группе\n" +
            "5. Поиск контакта по номеру\n" +
            "6. Вывод списка контактов\n" +
            "7. Вывод списка групп\n" +
            "8. Вывод списка");
    }

    public static void listOutput() {
        System.out.println(list);
    }

    public static void groupOutput() {
        System.out.println(groups);
    }

//    TODO
//    public static void addContactInGroup() {
//        System.out.println("Введите название группы и какой контакт добавить");
//        String maps = scanner.nextLine();
//        String[] divide = maps.split(" ");
//        String name = divide[0];
//        String contact = divide[1];
//        map.put(new Group<>(name), new Contact<>())
//
//    }

    public static void searchContactsGroup() {

    }

    public static void searchContactsByNumber() {

    }
}
