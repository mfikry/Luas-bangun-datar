public class thread implements Runnable {
    int count;
    Thread thrd;
    
    thread(String Name){
        thrd = new Thread(this,Name);
        count = 0;
        thrd.start();
    }
    
    public void run(){
        System.out.println(thrd.getName()+"starting");
        try{
            do{
                Thread.sleep(500);
                System.out.println("In "+thrd.getName()+"Count is "+count);
                count++;
            }
            while(count < 10);
        }
        catch(InterruptedException y)
        {
            System.out.println(thrd.getName()+" Interruped");
        }
            System.out.println(thrd.getName()+" Terminated");
    }
}







