package PBOSesi5;

public class Dosen extends Person{
    
   private int numCourses;  
   private String[] courses;
   private static final int MAX_COURSES=10;

   public Dosen(String name, String address)
   {
      super(name, address);
      courses = new String[MAX_COURSES];
   }
  
   @Override
   public String toString() {
      return "Dosen: " + super.toString();
   }
   
   public boolean addCourse(String course)
   {
      for(int i=0;i<numCourses;i++)
      {
         if (courses[i].equals(course))
         {
            System.out.println("Kursus sudah ada!");
            return false;  
         } 
      }
      courses[numCourses]=course;
      numCourses++;
      System.out.println("Kursus ditambahkan");
      return true;
   }
   
   public boolean removeCourse(String course)
   {
      boolean found=false;
      int index=-1;  
      for(int i=0;i<numCourses;i++)
      {
         if(courses[i].equals(course))
         {
            index = i;
            found = true;
            break;
         }
      }
      if(found)
      {
         for(int i=index;i<numCourses-1;i++) {
            courses[i]=courses[i+1];
         }
         numCourses--;
         System.out.println("Kursus dihapus");
         return true;
      }
      else 
      {
         System.out.println("Kursus tidak ada!");
         return false;
      }
   }
}
