/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_1;

/**
 *
 * @author HP
 */
public class Animals {
    
    String name;
    String color;
    String food;
    int age;
    int hour;
    
    public Animals()
    {
        name=null;
        color=null;
        age=0;
    }
    
    public void eat(){};
    public void sleep(){};
   // public void display(){};
   // public void sound(){};
    public String eat(String food)
    {return food;};
    public int sleep(int hour)
    {return hour;};
    public void display()
    {
        System.out.println("the animal is a : "+name);
        System.out.println(name+"`s age   : "+age);
        System.out.println(name+"`s color : "+color);
        System.out.println(name+" eat "+eat(food));
        System.out.println(name+" eat "+sleep(hour));
        
    };
    
}
