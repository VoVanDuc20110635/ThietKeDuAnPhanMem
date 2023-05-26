import Singleton.Version;
import Singleton.VersionSingleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println("Version: ");
//        Version version = new Singleton.Version
//                ("3.5",
//              "Android Inc.",
//              "2019");
//        version.print();
//
//        System.out.println("\nSingleton Version Main2: ");
//
//        Main2 main2 = new Main2();
//        main2.main();
//
//        System.out.println("\nSingleton Version Main3: ");
//        Main3 main3 = new Main3();
//        main3.main();

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(() -> {
            VersionSingleton versionSingleton
                    = VersionSingleton
                    .getInstance("3.5",
                            "Android Inc.",
                            "2019");
            System.out.println("Phien ban 1: " + versionSingleton.getPhienBan());
        });
        executorService.submit(() -> {
            VersionSingleton versionSingleton
                    = VersionSingleton
                    .getInstance("4.0",
                            "Android Inc.",
                            "2020");
            System.out.println("Phien ban 2: " + versionSingleton.getPhienBan());
        });
        executorService.shutdown();
    }
}