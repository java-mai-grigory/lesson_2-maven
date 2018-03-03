package mai.lesson_2.entity;

import mai.lesson_2.algorithm.MyComparable;


public class Student implements MyComparable, Comparable{
    private String fname;
    private String sname;

    private int ratePhys, rateMath, rateProg;

    public Student(String fname, String sname) {
        this.fname = fname;
        this.sname = sname;

        ratePhys = rateMath = rateProg = -1;
    }

    
    /**
     * @param ratePhys сдал физику с оценкой
     */
    public void passPhys(int ratePhys) {
        if (ratePhys >=2 && ratePhys <= 5)
            this.ratePhys = ratePhys;
    }
    
    /**
     * @return Плохой или хороший студент 
     */
    public boolean isBad() {
       return (ratePhys <= 3) || (rateMath <= 3) || (rateProg <= 3);
    }

    
    /**
     * @param сдал математику с оценкой
     */
    public void passMath(int rateMath) {
    	if (rateMath >=2 && rateMath <= 5)
    		this.rateMath = rateMath;
    }

    
    
    /**
     * @param rateProg сдал программирование с оценкой
     */
    public void passProg(int rateProg) {
       	if (rateProg >=2 && rateProg <= 5)
        this.rateProg = rateProg;
    }

    
    
    /**
     * @return среднюю оценку
     */
    public double Avg()
    {
        return 1.0 * (rateMath + ratePhys + rateProg) / 3;
    }
    
    
@Override
	public String toString()
	{
		return String.format("%-20s M(%d)  Ф(%d) П(%d) Ср.(%.1f)", fname + " " + sname, rateMath, ratePhys, rateProg, this.Avg());
	}
    
@Override
    public int compareTo(Object obj)
    {
      Student stud = (Student)obj;
      if(this.Avg() < stud.Avg())
      {
        /* Текущий класс меньше (ср. оценка меньше) */
        return -1;
      }   
      else if(this.Avg() > stud.Avg())
      {
          /* Текущий класс больше (ср. оценка меньше) */
        return 1;
      }
      /* средние оценки равны */
      return 0;  
    }

}
