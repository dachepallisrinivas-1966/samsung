package com.samsung.ui;

import java.util.PriorityQueue;
import java.util.Queue;

import com.samsung.model.CustomerOrder;
import com.samsung.service.CustomerOrderComparator;

public class PriorityQueueDemo2 {

	public static void main(String[] args) {
		CustomerOrder c1 = new CustomerOrder(1, 100000.0, "customer1");
		CustomerOrder c2 = new CustomerOrder(3, 50000.0, "customer3");
		CustomerOrder c3 = new CustomerOrder(2, 43000.0, "customer2");
		CustomerOrder c4 = new CustomerOrder(4, 221000.0, "customer4");
		CustomerOrder c5 = new CustomerOrder(5, 15000.0, "customer5");
		

		Queue<CustomerOrder> customerOrders = new PriorityQueue<>(new CustomerOrderComparator());
        customerOrders.add(c1);
        customerOrders.add(c2);
        customerOrders.add(c3);
        customerOrders.add(c4);
        customerOrders.add(c5);
        
        while (!customerOrders.isEmpty()) {
            System.out.println(customerOrders.poll());
        }
		System.out.println("----------------------------------------------------------------------");
		
		
		
		
		
		
        

	}

}
