interface OS{
    public void spec();
}

class Android implements OS{
    @Override
    public void spec(){
        System.out.println("Most poweful OS.");
    }
}

class IOS implements OS{
    @Override
    public void spec(){
        System.out.println("Most secured OS.");
    }
}


class Windows implements OS{
    @Override
    public void spec(){
        System.out.println("Its about to die.");
    }
}

class OSFactory{
    public OS getInstanceOs(String type){
        if(type.equals("Open")){
            return new Android();
        }
        else if(type.equals("Closed")){
            return new IOS();
        }
        else{
            return new Windows();
        }
    }
}

public class Main{
    public static void main(String[] args){
        OSFactory osf = new OSFactory();
        OS obj1 = osf.getInstanceOs("Open");
        obj1.spec();
        OS obj2 = osf.getInstanceOs("Closed");
        obj2.spec();
        OS obj3 = osf.getInstanceOs("");
        obj3.spec();
    }
}