package homeWork_4_Jeneric;

public class DataContainerMain{
    public static void main(String[] args) {
        DataContainer<Integer> container = new DataContainer(new Integer[10]);
        container.add(5);
        container.add(4);
        container.add(8);
        container.add(9);
        System.out.println(container.toString());
    }


}
