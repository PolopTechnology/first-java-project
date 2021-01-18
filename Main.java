/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// "static void main" must be defined in a public class.
import java.util.Random; 

public class Main {
    public static void main(String[] args) {
        String youChoose = "Bird";
        Animal am = new Animal();
        switch(youChoose){
            case "Cat":
                System.out.println(am.Cat());
                break;
            case "Dog":
                System.out.println(am.Dog());
                break;
            case "Bird":
                System.out.println(am.Bird());
                break;
        }
        Random butt = new Random();
        int hell = butt.nextInt(3);
        switch(hell){
            case 1:
                System.out.println(am.Cat());
                break;
            case 2:
                System.out.println(am.Dog());
                break;
            case 3:
                System.out.println(am.Bird());
                break;
        }
        
    }
}

class Animal {
    
    int myHealth = 200;
    public static int botHealth = 200;
    
    public static int Dog(){
        for(int b = 0; b < 40; b++){
            botHealth -= 1;
        }
        return botHealth;
    }
    public static int Cat(){
        for(int s = 0; s < 17; s++){
            botHealth -= 1;
        }
        return botHealth;
    }
    public static int Bird(){
        Random squak = new Random(); 
        int iffy = squak.nextInt(2);
        if(iffy == 1){
            for(int l = 0; l < 60; l++){
                botHealth -= 1;
            }
        } else if (iffy == 2){
            System.out.println("Squaks is inresponsive.");
        }
        return botHealth;
    }
}