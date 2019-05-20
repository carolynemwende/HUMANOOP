import com.example.humanoop.Human;

public class Anna extends Human {
    private int height;



    public Anna(String name, int age, int weight, int hour) {
        super(name, age, weight, hour);



    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

}
