/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructors;

/**
 *
 * @author anzoh
 */
public class Characters {
    //Attributes
    String name;
    int age;
    String series;
    
    public Characters(String nameparam, int ageparam, String seriesparam){
        this.name = nameparam;
        this.age = ageparam;
        this.series = seriesparam;
        System.out.println("Hello " + nameparam+"...");
    }
    
    //Display info method.
    public void displayInfo(){
        System.out.println("Character name: " + name);
        System.out.println("Character age: " + age);
        System.out.println("From: " + series);
        System.out.println("------------------");
    }
}
