package director;

import builder.Builder;
import builder.CarBuilder;

public class Director {
    public void buildBugatti(Builder builder){
        builder.brand("Bugatti")
                .color("Blue")
                .nbrDoors(2)
                .height(115);
    }
}
