
class Tester{
    

    public Car car;
    Tester(Car car){
        //here we are not hardcoding the object rather we are providing the object ourselves so it can be changed to the derived class also 
        this.car = car;
    }
    public static void main(String[] args) {
        //here we are hardcoding the object to the class which is tight coupling
        Car car2=new Car();
        car2.sound();
        Tester classObj = new Tester(new Car());
        classObj.car.sound();
    }
}


class Car{
    public void sound()
    {
        System.out.println("Amazing");
    }

    public void wheels()
    {
        System.out.println("total 4 wheels");
    }
}