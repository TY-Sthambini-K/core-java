package com.tyss.variableone.instance;

public class TestInstance {
public static void main(String[] args) {
InstanceVariable i= new InstanceVariable();
InstanceVariable j=i;
i.name="sthambs";
System.out.println(i.name);
System.out.println(i.s);
System.out.println(i.a);
System.out.println("--------------------");
InstanceVariable in= new InstanceVariable();
in.name="sthambini";
in.a=25;
System.out.println(in.name);
System.out.println(in.s);
System.out.println(in.a);
}
}
