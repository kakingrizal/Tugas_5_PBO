package PBOSesi5;

public class Person {
    
    String name;
    String address;

    Person(String name,String address){
        this.name = name;
        this.address = address;
    }
    
    public String getname(){
        return name;
    }
    
    public String getaddress(){
        return address;
    }
    
    public void setaddress(String address){
        this.address=address;
    }
    
    @Override
    public String toString(){
      return name + "(" + address + ")";
    }
}
