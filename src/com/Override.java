package com;
class Overide01
{
    public void count()

    {
        System.out.println("Count the class");
    }
}
class Override02 extends Overide01{
    //@java.lang.Override
    @java.lang.Override
    public void count()
    {
        System.out.println("  class Overriden");
    }
}

public class Override
{
    public static void main(String[] args) {
        Override02 ov = new Override02();
        ov.count();
    }
}
