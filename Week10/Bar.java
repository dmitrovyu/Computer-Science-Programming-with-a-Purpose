
public class Bar implements Comparable<Bar> {

    private final String name;
    private final int value;
    private final String category;


    //creates new bar
    public Bar(String name, int value, String category){
        if (name == null) throw new IllegalArgumentException("You must enter the name");
        if (value < 0) throw new IllegalArgumentException("You must enter the value above 0");
        if ( category == null) throw new IllegalArgumentException("You must enter the category");
        this.name = name;
        this.value = value;
        this.category = category;

    }
    public String getName() {

        return this.name;

    } 
    public int getValue() {
        return this.value;
    }

    public String getCategory() {
        return this.category;
    }

    public int compareTo (Bar that) {
        if (that == null) throw new NullPointerException("Argument must not be null");
        return Integer.compare(this.value,that.getValue());


    }
    //Test
    public static void main(String[] args) {
        
        //Testing 
    }
}

