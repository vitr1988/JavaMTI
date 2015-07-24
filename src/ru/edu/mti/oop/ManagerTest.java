package ru.edu.mti.oop;

public class ManagerTest {

	public static void main(String[] args) {
		Manager salesManager = new SalesManager();
		Manager clientManager = new ClientManager();
//		Manager[] managers = new Manager[]{salesManager, clientManager};
//		for (Manager manager : managers){
//			manager.communicate();
//			manager.performTask();
//			System.out.println(manager.index);
//		}
		salesManager.communicate();
		salesManager.performTask();
		salesManager.print("1"); 
		clientManager.communicate();
		clientManager.performTask();
		clientManager.print("2");
	}

}
