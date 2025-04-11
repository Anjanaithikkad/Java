import java.util.Scanner;

class Publisher {
    String name;
    int year;

    Publisher(String name, int year) {
        this.name = name;
        this.year = year;
    }
}

class Book extends Publisher {
    String title;
    String author;

    Book(String name, int year, String title, String author) {
        super(name, year);
        this.title = title;
        this.author = author;
    }

    void show() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + name);
        System.out.println("Year : " + year);
    }
}

class Literature extends Book {
    Literature(String name, int year, String title, String author) {
        super(name, year, title, author);
    }
}

class Fiction extends Book {
    Fiction(String name, int year, String title, String author) {
        super(name, year, title, author);
    }
}

public class PubBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;

        while (true) {
            System.out.println("\n1. Literature\n2. Fiction\n3. Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();
            sc.nextLine(); // Clear buffer

            if (ch == 3) {
                System.out.println("Bye!");
                break;
            }

            System.out.print("Enter title: ");
            String t = sc.nextLine();
            System.out.print("Enter author: ");
            String a = sc.nextLine();
            System.out.print("Enter publisher: ");
            String p = sc.nextLine();
            System.out.print("Enter year: ");
            int y = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                Literature l = new Literature(p, y, t, a);
                System.out.println("\n-- Literature Book --");
                l.show();
            } else if (ch == 2) {
                Fiction f = new Fiction(p, y, t, a);
                System.out.println("\n-- Fiction Book --");
                f.show();
            } else {
                System.out.println("Invalid option.");
            }
        }

        sc.close();
    }
}











1. Literature
2. Fiction
3. Exit
Enter choice: 1
Enter title: Balarama
Enter author: Njan
Enter publisher: DC Books
Enter year: 2008

-- Literature Book --
Title : Balarama
Author: Njan
Publisher: DC Books
Year : 2008

1. Literature
2. Fiction
3. Exit
Enter choice: 2
Enter title: Kalikudukka
Enter author: Athum Njan
Enter publisher: Mathrubumi
Enter year: 2010

-- Fiction Book --
Title : Kalikudukka
Author: Athum Njan
Publisher: Mathrubumi
Year : 2010

1. Literature
2. Fiction
3. Exit
Enter choice: 3
Bye!
