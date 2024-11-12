import java.util.Scanner;

/**
     Data Fun Project
     Name: Kevin Lin
     Date Due: November 15th, 2024
     */
public class DataFun
{
    public int favoriteNumber;
    public String favoriteKeyboardCharacter;
    
    public void IterateThroughStuffPartOne()
    {
        
    }
    public void IterateThroughStuffPartTwo()
    {

    }
    public static void main(String[] args)
    {
        DataFun noDataFun = new DataFun();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("What's your favorite number lah>\n");
        favoriteNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        noDataFun.IterateThroughStuffPartOne();
        
        System.out.println("What's your favorite keyboard character lah>\n");
        favoriteKeyboardCharacter = scanner.nextLine();
        noDataFun.IterateThroughStuffPartTwo();
    }
}
