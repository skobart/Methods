/**
 * Created by Bartłomiej Skorowski on 21.01.2020.
 */
public class ComputerFactory {

    Computer create (String processor, int memory) {

        Computer computer = new Computer();
        computer.processor = processor;
        computer.ramMemory = memory;
        return computer;
    }
}
