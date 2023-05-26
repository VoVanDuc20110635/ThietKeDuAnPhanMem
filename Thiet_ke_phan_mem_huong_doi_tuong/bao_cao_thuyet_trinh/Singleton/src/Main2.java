import Singleton.*;

public class Main2 {
    public void main(){
        VersionSingleton versionSingleton = VersionSingleton
                .getInstance("3.5",
                "Android Inc.",
                "2019");
        versionSingleton.print();
    }


}
