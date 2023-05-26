import Singleton.*;
public class Main3 {
    public void main(){
        VersionSingleton versionSingleton2 =
                VersionSingleton.getInstance
                        ("4",
                                "Android Inc.",
                                "2020");
        versionSingleton2.print();

        Version version = new Version
                ("3.5",
                "Android Inc.",
                "2019");
        version.print();


        VersionSingleton versionSingleton =
                VersionSingleton.getInstance();
        versionSingleton.print();

//        System.out.println("\nSingleton Version 2 Main3: ");
//        VersionSingleton versionSingleton2 =
//                VersionSingleton.getInstance
//                        ("4",
//                      "Android Inc.",
//                      "2020");
//        versionSingleton2.print();
    }
}
