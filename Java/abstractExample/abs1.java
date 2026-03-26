package abstractExample;

class temp extends abs1{
     public void sleep() {

     }
}

public  class abs1 implements inter1 {

    

    public static void main(String[] args) {
        abs1 a=new temp();

 
        a.sleep();
    }

    @Override
    public void sleep() {
        throw new UnsupportedOperationException("Unimplemented method 'sleep'");
    }
    
}
