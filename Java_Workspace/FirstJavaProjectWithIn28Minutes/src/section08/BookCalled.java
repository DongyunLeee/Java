package section08;

public class BookCalled {
	public static void main(String[] args) {
		Book artOfComputerProgramingBook = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();
		
		artOfComputerProgramingBook.callBook();
		artOfComputerProgramingBook.noOfCopies = 100;
		
		effectiveJava.callBook();
		effectiveJava.noOfCopies = 200;
		
		cleanCode.callBook();
		cleanCode.noOfCopies = 300;
	}

}
