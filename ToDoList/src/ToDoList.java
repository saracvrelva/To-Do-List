
import java.util.PriorityQueue;

public class ToDoList {

    //where it's gonna be saved my to do items
    private PriorityQueue<ToDoItem> toDoList;

    public ToDoList(){
        this.toDoList = new PriorityQueue<>();

    }

    //add to do item to toDoList
    //my priority queue todoList has an add method, so the toDoList instantiated on the main can call this add method created
    public void add(Importance importance, int priority, String description) {
        toDoList.add(new ToDoItem(importance, priority, description));
    }

    //elements while entering into the priority queue are not sorted but while taking out elements from the priority queue the elements are always sorted
    public ToDoItem remove(){
        return toDoList.remove();

    }

    public boolean isEmpty(){
        return toDoList.size() == 0;
    }
    private class ToDoItem implements Comparable<ToDoItem>{

        private Importance importance;

        //if I wanted to limitate the range of priorities
        private int priority;

        private String description;

        public ToDoItem(Importance importance, int priority, String description){
            this.importance = importance;
            this.priority = priority;
            this.description = description;

        }

        //used by the framework; we dont need to call this method
        @Override
        public int compareTo(ToDoItem toDoItem) {

            //compare the toDoItem with all the others left in the queue
            //first compare the importance of the parameter with te others, then, compares the priorities of all the todoitems with the same importance
            //I used a ternary operator but we could use the compare to

            return importance.ordinal() > toDoItem.importance.ordinal() ? 1 : importance.ordinal() < toDoItem.importance.ordinal() ? -1 : priority > toDoItem.priority ? 1: priority < toDoItem.priority ? -1 : 0;

            /*
            ** this .compareTo below is an Enum method and not the compareTo we are creating
            *
            if(importance.compareTo(toDoItem.importance) == 0) {
                    return priority- toDoItem.priority;

            }
            return importance.compareTo(toDoItem.importance);

             */
        }

        @Override
        public String toString() {
            return "\n Importance: " + importance + "; Priority: " + priority + "; Description:  " + description + ".";
        }
    }
    @Override
    public String toString() {
        return "TodoList{" + toDoList + " .}";
    }


}
