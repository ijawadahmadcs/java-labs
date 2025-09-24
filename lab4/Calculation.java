class Calculation
{
void fact(int n)
{
 int fact=1; 
 for(int i=1;i<=n;i++)
   { 
 fact=fact*i; 
 } 
 System.out.println("factorial is "+fact); 
}
public static void main(String args[])
{ 
new Calculation().fact(7);
new Calculation().fact(6); 
Calculation c= new Calculation();
c.fact(5);
c.fact(4);
c.fact(6);
} } 
