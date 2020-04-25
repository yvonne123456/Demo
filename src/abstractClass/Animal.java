package abstractClass;

public abstract  class Animal {
    String str;

    public abstract  void run();
    public void breath()     {
        System.out.println("呼吸");
    }
    }
     class cat extends Animal{

         @Override
         public void run()    {
             System.out.println("猫步小跑");
     }
     }

    class dog extends Animal   {

         @Override
         public void run()     {
        System.out.println("狗跑");
    }
    }

