public class exe3{
int rollno;
String name;
void insertRecord(int r, String n)
{
rollno=r;
name=n;
}
void displayInformation()
{
System.out.println("View Your Record..!!");
System.out.println(rollno+" "+name);
}
public static void main(String args[])
{
exe3 s1=new exe3();
exe3 s2=new exe3();
s1.insertRecord(050,"Sufiyah");
s2.insertRecord(051,"Khan");
s1.displayInformation();
s2.displayInformation();
}
}
