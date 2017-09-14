import java.util.Arrays;
import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
               return students;
               
	}

	@Override
	public void setStudents(Student[] students)  throws IllegalArgumentException
        {
            if(students==null)
                {
                    throw new IllegalArgumentException();
                }
		
	}

	@Override
	public Student getStudent(int index)  throws IllegalArgumentException
        {
		int length=students.length;
                if(index<0 || index==length || index>length || students==null)
                {
                     throw new IllegalArgumentException();
                }
		else
                {
                    return students[index];
                }
	}

	@Override
	public void setStudent(Student student, int index)  throws IllegalArgumentException
        {
		// Add your implementation here
            int length=students.length;
            if( students==null || index<0 || index==length || index>length )
                {
                     throw new IllegalArgumentException();
                }
            else
            {
                students[index]=student;
            }
            
	}

	@Override
	public void addFirst(Student student)  throws IllegalArgumentException
        {
		// Add your implementation here
                if(students==null)
                {
                     throw new IllegalArgumentException();
                }
                else
                {
                     Student students1[]=new Student[students.length+1];
                     for(int i=1;i<students1.length;i++)
                         {
                            students1[i]=students[i-1];
                          }
                        students1[0]=student;
                       Arrays.copyOf(students,students.length+1);
                        for(int i=0;i<students1.length;i++)
                    {
                        students[i]=students1[i];
                    } 
                }
                
                
	}

	@Override
	public void addLast(Student student)  throws IllegalArgumentException
        {
		// Add your implementation here
            
             if (students==null)
            {
                throw new IllegalArgumentException();
            }
                 Arrays.copyOf(students,students.length+1);
                 students[students.length-1]=student;
            
         
	}
        
        
        
        

	@Override
	public void add(Student student, int index)  throws IllegalArgumentException
        {
            int temp;
            int length=students.length;
	  if( students==null || index<0 || index==length || index>length )
             {
                 throw new IllegalArgumentException();
             }
             else
             {
                  Student students1[]=new Student[students.length+1];
                  for( temp=0;temp<index;temp++)
                    {
                        students1[temp]=students[temp];
                    }
                   students1[index]=student;
                   for(temp=index+1;temp<students1.length;temp++)
                    {
                        students1[temp]=students[temp-1];
                       }
  
                     Arrays.copyOf(students,students.length+1);
                    for( temp=0;temp<students1.length;temp++)
                    {
                         students[temp]=students1[temp];
                     }
             }
                
                
	}

	@Override
	public void remove(int index)  throws IllegalArgumentException
        {
		// Add your implementation here
                
                 int i=0;
                if(index<0 || index>students.length || students==null || index==students.length)
                  
                {
                     throw new IllegalArgumentException();
                }
                Student students1[]=new Student[students.length-1];
                students[index]=null;
                for(i=0;i<students.length;i++)
                {
                    if(students[i]!=null)
                        {
                            students1[i]=students[i];
                        }
                }
                Arrays.copyOf(students,students.length-1);
                for(i=0;i<students1.length;i++)
                {
                       students[i]=students1[i];
                }
            }

	@Override
	public void remove(Student student) throws IllegalArgumentException {
		// Add your implementation here
                 int i=0;
                 if(student==null)
                    {
                     throw new IllegalArgumentException();
                     }
                 for(i=0;i<students.length;i++)
                     {
                         if(students[i].equals(student))
                                 students[i]=null;
                     }
                 if(i==students.length)
                         throw new IllegalArgumentException();
  
                Student students1[]=new Student[students.length-1];
                for(i=0;i<students.length;i++)
                    {
                         if(students[i]!=null)
                             {
                              students1[i]=students[i];
                              }
                    }
                 Arrays.copyOf(students,students.length-1);
                for(i=0;i<students1.length;i++)
                    {
                         students[i]=students1[i];
                    }
                
               }

	@Override
	public void removeFromIndex(int index) throws IllegalArgumentException 
        {
		// Add your implementation here
                int length=students.length;
                if(index<0 || index>students.length || students==null || index==students.length)
                    {
                     throw new IllegalArgumentException();
                     }
                else
                {
                     int i,count=0;
                     for(i=index+1;i<students.length;i++)
                        {
                             students[i]=null;
                             count++;
                        }
                    Student students1[]=new Student[students.length-count];
                    for(i=0;i<students.length;i++)
                        {
                            if(students[i]!=null)
                                {
                                    students1[i]=students[i];
                                }
                        }
                    Arrays.copyOf(students,students.length-count);
                    for (i=0;i<students1.length;i++)
                        {
                            students[i]=students1[i];
                        }
                    
                }
                
                
	}

	@Override
	public void removeFromElement(Student student) throws IllegalArgumentException 
        {
		// Add your implementation here
            if(student==null)
            {
                  throw new IllegalArgumentException();
	    }
            else
            {
                  int i=0;
                    for( i=students.length-1;i>=0;i--)
                        {
                             if(students[i].equals(student))
                                 {
                                     break;
                                  }
                         }
                     Arrays.copyOf(students,students.length-i);
             }

        }

	@Override
	public void removeToIndex(int index) throws IllegalArgumentException
        {
		// Add your implementation here
            if(index<0 || index>students.length || students==null || index==students.length)
            {
                 throw new IllegalArgumentException();
            }
            else
            {
                   int i=0;
                Student students1[]=new Student[students.length-index];
                for(i=index;i<students.length;i++)
                    {
                         students[i]=students[i];
                    }
                Arrays.copyOf(students,students.length-index);
                for(i=0;i<students.length;i++)
                    {
                         students[i]=students[i];
                    }
            }
                
	}

	@Override
	public void removeToElement(Student student) throws IllegalArgumentException{
		// Add your implementation here
                
                if(student==null)
                {
                     throw new IllegalArgumentException();
                }
                else
                {
                 int i=0,x=0;
                 for(i=0;i<students.length;i++)
                     {
                        if(students.equals(student))
                            {
                                 x=i;
                                 break;
                            }
                    }
                Student students1[]=new Student[students.length-x];
                for(i=x;i<students.length;i++)
                    {
                        students1[i]=students[i];
                    }
                Arrays.copyOf(students,students.length-x);
                for(i=0;i<students.length;i++)
                    {
                        students[i]=students1[i];
                    }
                
                }
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
                  int i=0,j=0;
                for(i=0;i<students.length;i++)
                    {
                        for(j=i+1;j<students.length;j++)
                            {
                                 if(students[i].compareTo(students[j])>0)
                                        {
                                            Object obj1=students[j];
                                            students[i]=students[j];
                                            students[j]=(Student)obj1;
                                        }
                            }
                    }
                
                
	}

	@Override
	public Student[] getByBirthDate(Date date) throws IllegalArgumentException{
		// Add your implementation here
                
                
                int count=0;
                if(date==null)
                    {
                        throw new IllegalArgumentException();
                    }
                Student students1[]=new Student[students.length];
                for(int i=0;i<students.length;i++)
                    {
                         if((students[i].getBirthDate()).before(date))
                            {
                                students1[i]=students[i];
                            }
                        count++;
                    }
                Arrays.copyOf(students1,students1.length-count);
  
               return students1;
		//return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) throws IllegalArgumentException {
		// Add your implementation here
                 int count=0;
                if(firstDate==null || lastDate==null)
                    {
                         throw new IllegalArgumentException();
                    }
                Student students1[]=new Student[students.length];
                for(int j=0;j<students.length;j++)
                     {
                         if((students[j].getBirthDate()).before(lastDate) && (students[j].getBirthDate()).after(firstDate))
                             {
                                  students1[j]=students[j];
                             }
                         count++;
                    }
                Arrays.copyOf(students1,students1.length-count);
                return students1;
		//return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
                 int i=0,count=0;
                double maxi=0;
                for(i=0;i<students.length;i++)
                    {
                        if(students[i].getAvgMark()>maxi)
                        maxi=students[i].getAvgMark();
                    }
                Student students1[]=new Student[students.length];
                for(i=0;i<students.length;i++)
                    {
                        if(students[i].getAvgMark()==maxi)
                            {
                                students1[i]=students[i];
                                count++;
                            }
                    }
                Arrays.copyOf(students1,students1.length-count);
                return students1;
		//return null;
	}

	@Override
	public Student getNextStudent(Student student) throws IllegalArgumentException  {
		// Add your implementation here
		if(student==null)
                    {
                        throw new IllegalArgumentException();
                    }
                else
                {
                Student ob=null ;
                 for(int i=0;i<students.length;i++)
                    {
                         if(students[i].equals(student))
                          ob=students[i];
                     }
                 return ob;
                }
        }
	
}
