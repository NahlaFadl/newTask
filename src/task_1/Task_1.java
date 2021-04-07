/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Task_1 {
    
    boolean exit;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Task_1 task_1=new Task_1();
        task_1.runMneu();
    }
    
    public void printMneu()
    {
        System.out.println("Please enter your selection ");
        System.out.println("1) About cats ");
        System.out.println("2) About dogs ");
        System.out.println("3) new animal ");
        System.out.println("0) Exit");
    }
    
    public void runMneu()
    {
        while(!exit)
        {
            printMneu();
            int choice=getChoice();
            priformanceAction(choice);
        }
        
    }
    
    public int getChoice()
    {
        Scanner s=new Scanner(System.in);
        int choice=-1;
        while(choice<0 || choice>3)
        {
            System.out.println("Enter your choice");
            choice=s.nextInt();
        }
        return choice;
    }
    
    public void priformanceAction(int choice)
    {
        switch(choice)
        {
            case 0:
                exit=true;
                System.out.println("thanks ");
                break;
            case 1:
                Cat cat=new Cat();
                cat.display();
                break;
            case 2:
                Dog dog=new Dog();
                dog.display();
                break;
            case 3:
                enterAnimal();
                break;
        }
    }
    
    public void enterAnimal()
    {
        Animals animals=new Animals();
        String food,ani_color;
        int hour;
        Scanner s=new Scanner(System.in);
        System.out.println("enter animal`s name");
        animals.name=s.next();
        System.out.println("enter animal`s age");
        animals.age=s.nextInt();
        System.out.println("enter animal`s coler");
        animals.color=s.next();
        
        //display new animal
        
        System.out.println("what is food the "+animals.name+" eat ");
        animals.food=s.next();
        animals.eat(animals.food);
        System.out.println("what is hour the "+animals.name+" sleepe ");
        animals.hour=s.nextInt();
        animals.sleep(animals.hour);
        animals.display();
        
        
    }
    
}
