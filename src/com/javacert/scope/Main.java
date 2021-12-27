package com.javacert.scope;

public class Main {
    public static void main(String[] args){
        String var4 = "this is private to main()";
        ScopeCheck scopeCheck = new ScopeCheck();
        scopeCheck.useInner();

        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
        /*
        won't work because var3 is private visibility

        private int var3 = 3;

        System.out.println("var3 is not accessible here " + innerClass.var3);
    */
//        System.out.println("scopeCheck var1 is " + scopeCheck.getVar1());
//        System.out.println(var4);
//
//        scopeCheck.timesTwo();
//        System.out.println("****************************************");
//        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
//        innerClass.timesTwo();
    }
}
