package abs;

class emp {

int id;
String name;
int salary;

emp(int id, String name, int salary)
{

this.id = id;
this.name = name;
this.salary = salary;

}


void display()
{

System.out.println("ID: " + id + ", "
   + "Name: " + name + ", "
   + "Salary: $" + salary 
  );
}
}


class StaticVarible {


public static void main(String[] args)
{

emp Priya= new emp(1, "Priya",30000);

emp Lakshmi = new emp(2, "Lakshmi",50000);

emp Lakshmipriya = new emp(3, "Lakshmipriya",40000);


Priya.display();
Lakshmi.display();
Lakshmipriya.display();
}
}

