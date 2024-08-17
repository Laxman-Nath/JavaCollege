import java.io.*;
import java.util.*;
class Student implements Serializable{
private static final long serialVersionUID =  -5572678474192115457L;;
private int id;
private String name;
public Student(int id,String name){
this.id=id;
this.name=name;
}
public int getId()
{
return this.id;
}
public String getName()
{
return this.name;
}
}

public class Main{
public static void main(String [] args){
 Student st1=new Student(1,"Laxman");
 Student st2=new Student(2,"Ram");
List<Student> Students=new ArrayList<>();
try{
/*
 FileOutputStream fos=new FileOutputStream("Student.txt");
 ObjectOutputStream oos=new ObjectOutputStream(fos);
 oos.writeObject(st1);
oos.writeObject(st2);
*/

FileInputStream fis=new FileInputStream("Student.txt");

ObjectInputStream ois=new ObjectInputStream(fis);
Student s;
int i;
while(fis.available()>0)
{
 s=(Student)ois.readObject();
if(s != null)
{
Students.add(s);
}
else{
break;
}
}



}
catch(Exception e){
System.out.println(e);
}

for(Student st:Students)
{
  System.out.println("Id="+st.getId());
  System.out.println("Name="+st.getName());
}
}
}