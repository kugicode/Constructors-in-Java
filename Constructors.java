/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructors;

/**
 *
 * @author anzoh
 */
public class Constructors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Characters char1 = new Characters("dai", 12, "dqdai");
        
        char1.displayInfo();
        
        
        display("anas");
        System.out.println("-----------------");
        
        System.out.println(add(5,4));
        
        System.out.println(createMessage("Hello", "World"));
    }
    
    public static void display(String name){
        System.out.println("..." + name);
    }
    
    public static int add(int num1, int num2){
        return num1 + num2;
    }
    
    public static String createMessage(String word1, String word2){
        return word1 + " " + word2;
    }
    
}
