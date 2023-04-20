class Armstrongno
{ 
 public static void main(String args[] ){
   int i,n,sum=0,temp,r;
   n = Integer.parseInt( args[0] );
   temp = n;
  while(n>0){
   r = n%10;
  sum = sum+(r*r*r);
  n = n/10;}
if(temp == sum)
{System.out.println("Number Is Armstrong="+sum);}
else{ 
System.out.println("Number Is Not Armstrong="+sum); }
 }
  }