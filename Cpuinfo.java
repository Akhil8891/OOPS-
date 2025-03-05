import java.util.scanner;
class Cpu{
int price;
class processor
{
string no_of_cores,manufacturer;
void display()
{
system.out.print("processor manufacture:"+manufacturer+"\n");
system.out.print("no of cores of processor:"+no_of_cores+"\n");
system.out.print("no of processor:"+no_of_cores+"\n");
}
}
static class Ram
{
int memory;
string manufacturer;
void display(){
system.out.println("RAM Manufacturer:"+manufacturer);
}
}
void display()
{
system.out.println("price:"+price);
}
}
public class cpuinfo {
public static void main(string args[])
{
cpu ncpu =new Cpu();
cpu.processor processor=ncpu.new processor();
cpu.Ram ram=new
cpu.Ram();
scanner sc=new
scanner(system.in);
system.out.println("enter the no of cores of processor:");
processor.no_of_cores=sc.next(); 
system.out.println("enter the ram memorie size:");
ram.manufacturer=sc.next(); 
system.out.println("enter the price:");
ncpu.price=sc.nextlnt();
system.out.println("\ninformation of processor and ram:");
processor.display();
ram.display();
ncpu.display();
}
} 
