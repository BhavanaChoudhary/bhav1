package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public int add(int a,int b){
       return a+b;
    }
    public static void main( String[] args )
    {
          App app=new App();
          int res=app.add(2,3);
           System.out.println( "2+3="+res+"\nApplication Executed succesfully!!" );
    }
}
