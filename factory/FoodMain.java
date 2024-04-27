interface Food{
    public void descp();
    public int price();
}

class Pizza implements Food{
    @Override
    public void descp(){
        System.out.println("Pizza comes in Italian cuisine");
    }
    @Override
    public int price(){
        return 250;
    }
}

class Manchurian implements Food{
    @Override
    public void descp(){
        System.out.println("Manchurian is a spicy chineese food item.");
    }
    @Override
    public int price(){
        return 160;
    }
}

class Momos implements Food{
    @Override
    public void descp(){
        System.out.println("Momos is a Nepali dish, but very famous in Delhi.");
    }
    @Override
    public int price(){
        return 90;
    }
}

class FoodFactory{
    public Food createFood(String type){
        if(type.equals("Italian")){
            return new Pizza();
        }
        else if(type.equals("Chineese")){
            return new Manchurian();
        }
        else{
            return new Momos();
        }
    }
}

public class FoodMain{
    public static void main(String[] args){
        FoodFactory ff = new FoodFactory();
        Food f1 = ff.createFood("Italian");
        f1.descp();
        System.out.println("Price: "+f1.price());
        System.out.println("----------------------------------------");
        Food f2 = ff.createFood("Chineese");
        f2.descp();
        System.out.println("Price: "+f2.price());
        System.out.println("----------------------------------------");
        Food f3 = ff.createFood("");
        f3.descp();;
        System.out.println("Price: "+f3.price());
    }
}