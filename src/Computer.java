/**
 * Created by Bartłomiej Skorowski on 21.01.2020.
 */
public class Computer {
    String processor;
    int ramMemory;


    void printInfo() {
        System.out.println(processor + " " + ramMemory);

    }

    String getInfo() {

        String decription = processor + " " + ramMemory;
        return decription;



    }
}
