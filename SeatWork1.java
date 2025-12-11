package act.M2_Activity1;

public class SeatWork1 {

	public static void main(String[] args) {
		House house = new House();
		Book book = new Book();
		Tree tree = new Tree();
		
		System.out.println("==== House Information ====");
		house.name = "Town house";
		house.color = "White"; 
		house.houseNum = 53;
		house.type();
		
		System.out.println("==== Book Information ====");
		book.title = "Java Basic";
		book.numPages = 100;
		book.getBookInfo();
		
		System.out.println("==== Tree Information ====");
		tree.name = "Narra";
		tree.height = 170;
		tree.age = 20;
		tree.getTreeInfo();
		

	}

}
