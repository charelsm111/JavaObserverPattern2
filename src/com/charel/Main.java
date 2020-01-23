package com.charel;

public class Main {

    public static void main(String[] args) {
	    System.out.println("***Modified Observer Pattern Demo");
	    Subject sub = new Subject();
	    Observer1 ob1 = new Observer1();
	    Observer2 ob2 = new Observer2();

	    sub.register(ob1);
	    sub.register(ob2);

	    sub.setMyValue(25);
	    System.out.println();

	    sub.setMyValue(5);
	    System.out.println();

	    //unregister ob1 only;
        sub.unregister(ob1);

        //Now only ob2 will observer the change
        sub.setMyValue(100);
    }
}
