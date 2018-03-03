package mai.lesson_2;

import mai.lesson_2.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
        Student stud = new Student("Семенов", "Григорий");
        stud.passMath(4);
        stud.passPhys(4);
        stud.passProg(5);
    	System.out.println(stud);
    	
    	if (stud.isBad())
    	{
    		System.out.println("Студент учится плохо");
    	}
    	else
    	{
    		System.out.println("Студент учится хорошо");
    	}	
    }
}
