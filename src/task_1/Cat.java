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
public class Cat extends Animals {
    
    public Cat()
    {
        name="cat";
        color="white";
        age=10;
    }
    
    @Override
    public void eat()
    {
        System.out.println(name+" eat fish");
    }
    @Override
    public void sleep()
    {
        System.out.println(name+" sleepe 15 hour");
    }
    @Override
    public void display()
    {
        System.out.println("the animal is a : "+name);
        System.out.println(name+"`s age   : "+age);
        System.out.println(name+"`s color : "+color);
        eat();
        sleep();
    }
    
}
