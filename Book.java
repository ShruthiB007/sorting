package sort;

import java.util.LinkedList;

public class Book  implements Comparable{
	String title;
	double price;
	
	Book(String title,double price){
		this.title=title;
		this.price=price;
	}
	public String toString() {
		return "Book [Title :"+title+" "+"price :"+price+"]";
	}
	public int compareTo(Object o) {
		Book b=(Book)o;
		if(this.title.charAt(0) > b.title.charAt(0)) 
			return 1;
		if(this.title.charAt(0) < b.title.charAt(0))
			return -1;
		return 0;

	}
	public static void main(String[] args) {
		
		 Book[] books= { new Book("HP",500),new Book("ZXA",563),new Book("SH",800)};
		 LinkedList l=new LinkedList();
		 l.add(books[0]);
		 l.add(books[1]);
		 l.add(books[2]);
		 Arrays.sort(books);
		for(Book val:books) {
			System.out.println(val);
		}
		l.set(0, new Book("fg",500));
		l.remove(books[2]);
		System.out.println(l);
		
	}
}
