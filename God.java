import java.io.*;
class God
{
public static void main(String arg[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a=Integer.parseInt(br.readLine());
int b=Integer.parseInt(br.readLine());
int c=a+b;
System.out.println(c);
}
}