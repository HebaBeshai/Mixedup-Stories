/**********************************************************************************************************8*********
 * @file MyMixedUpStories.java
 * @brief This program uses Scanner and userinput to create an interesting story about the user
 * @author Heba Beshai
 * @date January 20, 2016
 ********************************************************************************************************************/
import java.util.Scanner;
public class MyMixedUpStories {
    public static void main(String[] args) {
        Scanner story=new Scanner(System.in);
        String name;
        System.out.println("Mixed Up Stories - By Heba Beshai");
        System.out.println();
        System.out.print("What's your name: ");
        name = story.next();
        String born;
        System.out.print("Where were you born: ");
        born = story.next();
        String live;
        System.out.print("Where do you live now: ");
        live = story.next();
        String time;
        System.out.print("What time do you eat dinner: ");
        time = story.next();
        String feeling;
        System.out.print("How are you feeling: ");
        feeling = story.next();
        String food;
        System.out.print("What is your favorite food: ");
        food = story.next();
        System.out.println();

        System.out.println("First Story: ");
        System.out.println( "Welcome! " +name+ " was born in " +born+ " but loves living in " +live+ ".");
        System.out.println( "Today " +name+ " is feeling " +feeling+ " because he had dinner at " +time + ",");
        System.out.println(name+ " wants to go running but is feeling too tired to run today.");
        System.out.println( food+ " is the favorite food of " +name+ " which he will eat after running ");
        System.out.println( "If " +name+ " does not exercise " +name+ " will not eat his favorite food,");
        System.out.println("Instead, " +name+ " will have to eat celery which does not taste good.");


        System.out.println();
        System.out.println("Second Story:");
        System.out.println("Today's horoscope reading for " +name+ " is," );
        System.out.println( name+ " likes the color blue because he was born in " +born);
        System.out.println( name+ " will have 3 kids because he lives in " +live);
        System.out.println("Although " +name+"'s favorite food is pizza, it will become " +food);
        System.out.println("The horoscope also tells us that " +name+ " feels " +feeling+ " when eating " +food);
        System.out.println("Tonight " +name+ " will not eat dinner at " +time+ " but one hour earlier!");



    }
}
