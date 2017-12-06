public class FuelGuage{
public double fuel;
public double getFuel(){
return fuel;
}
public void fillup(){
increment(40-fuel);
System.out.println("fuel tank is full");
}
public void display(){
System.out.println("amt of fuel currently is "+fuel);
}
public void increment(double x){
if ((fuel+x)>40){
fuel=40;
}
else{
fuel=fuel+x;
}
}
public void decrement(double x){
if ((fuel-x)<0){
fuel=0;
System.out.println("fuel tank is empty");
}
else{
fuel=fuel-x;
}
}
}
