package college_management_system;
import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable {
    
    Thread t;
    Splash () {
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        t = new Thread(this);
        t.start();
        //start()method run method ko internally call karta hai
        setVisible(true);
        
        int x = 1;
        for (int i = 2; i <= 600; i+=4, x+=1) {
            setLocation(600 - ((i + x)/2), 350 - (i/2));
            setSize(i + 3*x, i + x/2);
            
            try {
                Thread.sleep(10);
            } catch (Exception e) {}
        }        
    }
    
    public void run() {
        try {
            Thread.sleep(7000);
            setVisible(false);
            
            // Next Frame
            new Login();
        } catch (Exception e) {
            
        }
    }
    
    public static void main(String[] args) {
        new Splash();
    }
}


//Splash is the name of the class and the class name should always start with the Capital letter
// package college_management_system;-> a class is run by the JVM ,if the class would have been in the source packages 
//then jvm would directly acces it but since it is in the College_mangement_System folder we need  to mention the address 
// where the class is present actually.
// Any class which we want to run should have the static function: psvm
// splash s= new splash();->here we are creating the object of the class
//  we can also do it as new splash only new splash is the actual object the splash s is just the vairable
//when we run the class->first main method is called and there we have written the object as it instantiates it calls the constructor
// so as we run the program frame khol dekhti so we need to write that frame code in constructor
//by default frame visibility is hidden 
// setSize(length,breath)=>size sathi
// frame by default top left corner me khulti hai=>top left is also called as origin
// setlocation(x,y) yaha se top
// imageicon class
//ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
//This line of code creates an instance of the ImageIcon class in Java and assigns it to the variable i1. Let's go through it step by step:
//
//ImageIcon Class:
//ImageIcon is a class in Java that is part of the Swing framework, which is used for creating graphical user interfaces (GUIs). It is specifically designed to work with images.
//Class Loading:
//ClassLoader.getSystemResource("icons/first.jpg") is used to load a resource. In this case, it's attempting to load an image file named "first.jpg" from a directory named "icons."
//getResource Method:
//The getSystemResource method is a static method of the ClassLoader class. It is used to locate and load resources on the classpath. In this case, it's looking for the resource (image file) with the path "icons/first.jpg."
//Resource Path:
//The resource path "icons/first.jpg" is a relative path. It suggests that there is a directory named "icons" at the root of the classpath, and within that directory, there is an image file named "first.jpg."
//ImageIcon Initialization:
//The ImageIcon constructor is then called with the result of ClassLoader.getSystemResource("icons/first.jpg") as an argument. This constructor creates an ImageIcon object representing the image specified by the given resource path.
//Variable Assignment:
//Finally, the ImageIcon object is assigned to the variable i1. This variable can be used to display the image in a GUI component, such as a JLabel or an Image component.
//In summary, this line of code loads an image named "first.jpg" from the "icons" directory in the classpath and creates an ImageIcon object (i1) representing that image. The loaded image can be used in a Swing application to display the image in a graphical user interface.