package pl.sdacademy.list;

public class Main {
    public static void main(String[] args) {
        IntList myIntList = new IntList();
        myIntList.add(234);
        myIntList.add(234);
        myIntList.add(5);
        myIntList.add(234);
        System.out.println(myIntList);
        myIntList.removeAll(234);

	myIntList.removeAll(233);

        System.out.println(myIntList);
    }
}
