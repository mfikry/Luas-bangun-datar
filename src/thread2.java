public class thread2 {
    public static void main(String args[]){
        System.out.println("Main Thread Starting");
        thread mt1 = new thread("Child #1");
        thread mt2 = new thread("Child #2");
        thread mt3 = new thread("Child #3");
        
        do{
//            System.out.print(".");
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                System.out.println("Main thread interrupted");
            }
        }while(mt1.count != 10 ||mt2.count != 10 ||mt3.count != 10);
        System.out.println("Main Thread Ending");
    }
}








