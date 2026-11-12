package lab5;

public class ex3 {
    
    private String title;
    private String author;
    private double price;

  
    public ex3() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public ex3(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }


    public void display() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : $" + price);
    }

    public static void main(String[] args) {
        ex3 b1 = new ex3();
        ex3 b2 = new ex3("Clean Code", "Robert C. Martin", 35.50);

        System.out.println("Book 1 (default values):");
        b1.display();

        System.out.println("\nBook 2 (with info):");
        b2.display();
    }
}