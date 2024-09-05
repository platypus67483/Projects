# Zookeeper (Part 1) - In Progress
A zoo is a large, complex place with many animals that all need care. It is unrealistic for there to a staff member assigned to each animal to track their need and behavior at all times. One of the employees has suggested that we use cameras instead. She would like to be able to pull up a video feed of any animal in the zoo that also displays the animal type, the current time, and the current temperature in the habitat.

## Task 1 - Print animal information

First, we will practice printing output, including formatted output. Your output should look like the following. You can hardcode the animal type (for now) and current time. The habitat temperature should be a randomly generated double between 50.0 and 100.0 and you will use printf to round it to 2 decimal places. If you want to earn an A, you will need to do the following:
* Research how to get the current time using Java. I suggest the java.time or java.Date packages. 

Sample output
```
Animal type: Camel
Current time: 4:37PM
Habitat temperature: 59.66F
```

## Task 2 - Print animal image
Next, we need to print the animal's image. First, you will figure out how to print the gorilla and some information about it. Next, you will print the camel using the printCamel() method and info about it. Then, you will print two more animals of your choosing: one will be like the gorilla and the other will be like the camel.
In order to get an A, you will need to do the following: 
* Reuse the code from the hippoPrinter method to print another animal of your own choosing. You can find ASCII animals by using this Google search query and replacing "kangaroo" with the animal you want
```
site:http://www.ascii-art.de kangaroo
```

## Task 3 - User Input

