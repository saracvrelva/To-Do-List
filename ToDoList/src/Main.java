public class Main {
    public static void main(String[] args) {

        ToDoList toDoList = new ToDoList();

        toDoList.add(Importance.MEDIUM, 1, "cook");
        toDoList.add(Importance.LOW, 3, "eat");
        toDoList.add(Importance.HIGH, 2, "study");
        toDoList.add(Importance.LOW, 1, "clean bedroom");
        toDoList.add(Importance.HIGH, 2, "read a book");
        toDoList.add(Importance.HIGH, 1, "it's game time");
        toDoList.add(Importance.HIGH, 2, "study");
        toDoList.add(Importance.LOW, 1, "clean bedroom");
        toDoList.add(Importance.HIGH, 2, "read a book");
        toDoList.add(Importance.HIGH, 3, "it's game time");

        while(!toDoList.isEmpty()){
            System.out.println(toDoList.remove());
        }




    }
}
