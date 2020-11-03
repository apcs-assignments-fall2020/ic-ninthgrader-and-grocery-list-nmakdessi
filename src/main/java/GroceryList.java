public class GroceryList {
    private String[] arr;

    public GroceryList() {
        // our grocery list will have a max size of 10
        this.arr = new String[10]; 
    }

    public void add(String item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = item;
                break;
            }
        }
    }

    public void remove(String item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                arr[i] = null;
                break;
            }
        }
    }

    public String toString() {
        String str = "Grocery List : ";
        for (String item: arr) {
            str += (item + "");
        }
        return str;
    }
}   