public class Author {
    private String firstName = "Default_fist_name";
    private String lastName = "Default_last_name";

    public static boolean checkString(String nameForCheck, String errorMessage) {
        if (nameForCheck != null && !nameForCheck.isBlank())
            return true;
        else {
            Main.printRedLN(errorMessage);
//            System.out.println(errorMessage);
            return false;
        }
    }

    public Author(String firstName, String lastName) {
        if (checkString(firstName, "Некорректное Фамилия Автора"))
            this.firstName = firstName.trim();

        if (checkString(lastName, "Некорректное Имя Автора"))
            this.lastName = lastName.trim();
    }

    public Author(String name) {
        if (!checkString(name, "Неверное полное имя "))
            return;
        name = name.trim().replaceAll("\\s+", " ");
        String[] names = name.split(" ");
        if (names.length != 2) {
            System.out.println("Некорректное полное имя автора");
            return;
        }
        this.firstName = names[0];
        this.lastName = names[1];
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
    public String toString() {
        return this.getFullName();
    }
}