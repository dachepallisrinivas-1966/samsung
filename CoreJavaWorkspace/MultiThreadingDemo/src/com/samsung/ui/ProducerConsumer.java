package com.samsung.ui;
import java.util.Random;
import java.util.Stack;

public class ProducerConsumer {

    private Stack<Integer> stack = new Stack<>();

    private Object lock = new Object();

    private int MAX_SIZE = 5;

    /**
     * Push a random number on the stack. If the stack is full, then just wait.
     * @throws Exception
     */
    public void produce() throws InterruptedException{
        while(true) {
            synchronized (lock) {
                while(stack.size()==MAX_SIZE) {
                    System.out.println("Full, waiting..");
                    lock.wait();
                }
                int number = new Random().nextInt(100);
                stack.push(number);
                System.out.println("Producer pushed " + number);
                lock.notify();
            }
        }
    }

    /**
     * Consume or pop an item from the stack. If the stack is empty, then wait
     * @throws Exception
     */

    public void consume() throws InterruptedException{
        while(true){
            synchronized (lock) {
                while(stack.isEmpty()){
                    System.out.println("Empty, waiting..");
                    lock.wait();
                }
                System.out.println("Consumer pulled " + stack.pop());
                lock.notify();
            }
            Thread.sleep(500); //we add this so the producer can fill the stack
        }
    }

    public static void main(String[] args) throws Exception{

        ProducerConsumer producerConsumer = new ProducerConsumer();

        Thread producer = new Thread(()-> {try{producerConsumer.produce();}catch(Exception e){}});

        Thread consumer = new Thread(()-> {try{producerConsumer.consume();}catch(Exception e){}});

        producer.start();

        consumer.start();

    }

}