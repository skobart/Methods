/**
 * Created by Bartłomiej Skorowski on 21.01.2020.
 */
public class ComputerStore {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();

        Computer comp1 = factory.create("Intel i5", 8192);
        Computer comp2 = factory.create("AMD Ryzen 1700", 16384);


//        System.out.println(comp1.processor + " " + comp1.ramMemory);
//        System.out.println(comp2.processor + " " + comp2.ramMemory);

        comp1.printInfo();
        comp2.printInfo();

        ComputerUpgrade computerUpgrade = new ComputerUpgrade();
        computerUpgrade.addMemory(comp1, 1024);
        comp1.printInfo();


//        System.out.println(comp1.getInfo());
//        String info2 = comp2.getInfo();
//        System.out.println(info2);



    }

}
