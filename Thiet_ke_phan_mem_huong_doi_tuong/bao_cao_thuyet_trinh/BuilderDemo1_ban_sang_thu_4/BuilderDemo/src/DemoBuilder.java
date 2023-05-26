import builder.CarBuilder;
import com.sun.tools.javac.Main;
import director.Director;
import product.Car;

public class DemoBuilder {
    public static void main(String[] args){
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.buildBugatti(builder);
        builder.id(2299)
                .model("Chiron")
                .height(150)
                .color("White")
                .weight(2000);
        Car newcar = builder.build();
        System.out.println(newcar.toString());




    }
}
