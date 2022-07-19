package ca.ciccc.wmad202.lecturer.nestedClass;

import ca.ciccc.wmad202.lecturer.nestedClass.anonymous.HelloWorldAnonymousClasses;
import ca.ciccc.wmad202.lecturer.nestedClass.inner.DataStructure;
import ca.ciccc.wmad202.lecturer.nestedClass.local.LocalClassExample;
import ca.ciccc.wmad202.lecturer.nestedClass.shadow.ShadowTest;

public class NestedCodeDriver {
    public static void run(){
        //inner class
        DataStructure ds=new DataStructure();
        ds.printEven();

        // local class
        LocalClassExample lcs=new LocalClassExample();
        lcs.validatePhoneNumber("123-456-7890", "456-7890");

        //anonymous class
        HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
        myApp.sayHello();

        //Shadowing
        ShadowTest st = new ShadowTest();
        ShadowTest.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);

    }
}
