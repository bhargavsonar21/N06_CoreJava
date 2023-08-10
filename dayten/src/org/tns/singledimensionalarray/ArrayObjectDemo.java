
package org.tns.singledimensionalarray;

public class ArrayObjectDemo {

	public static void main(String[] args) {
		Employees arr[] = new Employees[3];
		arr[0] = new Employees(101,"Bhargav",67000.15);
		arr[1] = new Employees(102,"Sandeep Zalte",78000.15);
		arr[2] = new Employees(103,"Abhishek More",74000.14);
		
		for(int i = 0; i< 3 ; i++)
		{
			System.out.println(arr[i].getId()+" "+arr[i].getName()+" "+
		arr[i].getSalary());
		}
		

	}

}
