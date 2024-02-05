package BookLoan;

public class Book {
    public int loanCode;
    public String loanDate;
    public String bookTitle;
    public int userCode;
    public int loanDays;
    public int loanStatus;

    public void checkLoanStatus() {
        if (loanStatus == 1) {
            System.out.println("The book is currently on loan.");
        } else {
            System.out.println("The book is available for loan.");
        }
    }

    public void checkLoanDetails() {
        System.out.println("Loan Code: " + loanCode);
        System.out.println("Loan Date: " + loanDate);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("User Code: " + userCode);
        System.out.println("Loan Days: " + loanDays);
        System.out.println("Loan Status: " + (loanStatus == 1 ? "On Loan" : "Available for Loan"));
    }
}

