package org.july_24.thread;

public class Mythread extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=60;i++){
            if(i%2!=0){
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Mythread thread=new Mythread();
        thread.start();
        thread.print();

        for(int i=1;i<=60;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        }

    }
    public void print(){
        System.out.println(Thread.currentThread().getName()+ "Hello");
    }
}
