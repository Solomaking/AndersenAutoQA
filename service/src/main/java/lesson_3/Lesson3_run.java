package lesson_3;

public class Lesson3_run {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivan1", "Kozlov1", "Vasyl1", "Engineer1",
                "asd1@a", "+31231", 1231, 39);
        employees[1] = new Employee("Ivan2", "Kozlov2", "Vasyl2", "Engineer2",
                "asd2@a", "+31232", 1232, 40);
        employees[2] = new Employee("Ivan3", "Kozlov3", "Vasyl3", "Engineer3",
                "asd3@a", "+31233", 1233, 41);
        employees[3] = new Employee("Ivan4", "Kozlov4", "Vasyl4", "Engineer4",
                "asd4@a", "+31234", 1234, 42);
        employees[4] = new Employee("Ivan5", "Kozlov5", "Vasyl5", "Engineer5",
                "asd5@a", "+31235", 1235, 43);

        for (int i = 0; i < 5; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].tell(employees[i]);
            }
        }
    }
}