/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serializationdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements  Serializable{
    private int id;
    private String name;
    public Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
}
public class SerializationDemo {


    public static void main(String[] args) throws  Exception{
//        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("employee.txt"));
//        oos.writeObject(new Employee(1, "laxman"));
//        oos.close();
          
          ObjectInputStream ois=new ObjectInputStream(new FileInputStream("Employee.txt"));
          Employee emp=(Employee)ois.readObject();
          System.out.println(emp.getName()+","+emp.getId());
          ois.close();
    }
    
}
