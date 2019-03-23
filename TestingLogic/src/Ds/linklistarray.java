package Ds;

public class linklistarray {

	public static void main(String[] args) {

		linkds las = new linkds();
		las.insert(las, 5);
		las.insert(las, 565);
		las.insert(las, 555);
		las.printaall(las);
		System.out.println(las.count(las));

	}
}

class linkds {
	public static node n;

	public static linkds insert(linkds head, int d) {
		node hd = new node(d);
		hd.next = null;
		if (head.n == null) {
			head.n = hd;
		} else {
			node last = head.n;
			while (last.next != null) {
				last = last.next;
			}
			last.next = hd;
		}
		return head;
	}

	public void printaall(linkds list) {
		node currntnode = list.n;
		while (currntnode != null) {
			System.out.println(currntnode.data);
			currntnode = currntnode.next;
		}
	}

	public void printallrev(linkds list) {
		node currntnode = list.n;
		while (currntnode != null) {
			System.out.println(currntnode.data);
			currntnode = currntnode.next;
		}
	}

	public int count(linkds list) {
		int c = 0;
		node currntnode = list.n;
		while (currntnode != null) {
			c++;
			currntnode = currntnode.next;
		}
		return c;
	}

}

class node {
	int data;
	node next;

	node(int data) {
		this.data = data;
		next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public node getNext() {
		return next;
	}

	public void setNext(node next) {
		this.next = next;
	}
}
