package Task2;

import Task2.Chair;

public class Client {
    public Chair chair;

    public void sit(){
        System.out.println("я сижу на " + chair.getClass().toString().substring(6));
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
