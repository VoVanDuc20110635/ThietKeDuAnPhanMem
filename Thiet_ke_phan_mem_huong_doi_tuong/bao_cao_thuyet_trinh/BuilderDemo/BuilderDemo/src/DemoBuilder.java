import builder.CarBuilder;
import com.sun.tools.javac.Main;
import director.Director;
import product.Car;

public class DemoBuilder {
    public static void main(String[] args){

        Car newcar2 = new CarBuilder().setId(1123)
                .setModel("Chiron")
                .setHeight(120)
                .build();
        System.out.println(newcar2.toString());

        Car newcar1 = new Car(1,"VFast", "1A",
                "Do", 4, "Infotainment screen",
                1000, 1.5);
        System.out.println(newcar1.toString());




    }
}
