class two{
public static void main(String a[]){
  Sys.out.println("Hello world ");
  two obj=new two();
    int x=10;
    int y=20;
    obj.Sum(x, y);
    obj.Sub(x, y);
    obj.Mul(x, y);

}

void Sum(int a,int b) {
  int c = a + b;
  System.out.println("the sum of a and b is " + c);
}

void Sub(int a,int b) {
  int c = a - b;
  System.out.println("the difference of a and b is " + c);
}
 void Mul(int a,int b) {
  int c = a * b;
 }
}
