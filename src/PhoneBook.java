import java.util.*;

public class PhoneBook {
    public static Scanner scanner = new Scanner(System.in);
    public static Map<Group, List<Contact>> map = new HashMap<>();

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
                addContactInGroup();
                break;
            case 2:
                searchContactByGroup();
                break;
            case 3:
                searchContactByNumber();
                break;
            case 4:
//                mapOutput();
                break;
            default:
                if (Integer.parseInt(func) > 4 || (Integer.parseInt(func) < 0)) {
                    System.out.println("Такой функции не существует");
                }
        }
    }

    public static void functions() {
        System.out.println(
                        "1. Добавить контакт в группу\n" +
                        "2. Поиск контакта в группе\n" +
                        "3. Поиск контакта по номеру\n" +
                        "4. Вывод списка");

    }

    public static void addContactInGroup() {
        System.out.println("Введите группу, имя и номер телефона (Данные через пробел)");
        String input = scanner.nextLine();
        String[] divide = input.split(" ");
        String group = divide[0];
        String name = divide[1];
        String number = divide[2];
        map.put(new Group<>(group), Arrays.asList(new Contact<>(name, number)));
    }

    public static void searchContactByGroup() {
        System.out.println("Введите имя контакта который хотите найти");
        String input = scanner.nextLine();
        for(Group group : map.keySet()){
            if (input.equals(group.getName())) {
                System.out.print(group + "");
                for (Contact contact : map.get(group)) {
                    System.out.println(" " + contact);
                }
            }
        }
    }

    public static void searchContactByNumber() {
        System.out.println("Введите номер телефона контакта который хотите найти");
        String input = scanner.nextLine();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.equals(input)) {
                System.out.println(entry);
            }
        }
    }

//    public static void mapOutput() {
//        for (Map.Entry<Group, Contact> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//    }
}
