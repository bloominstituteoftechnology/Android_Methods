# Android_Methods

### Requirements
1. Write a guessing game where the user has to guess a secret number you will hard code as another data member (there is a challenge at the end to make this random). After every guess the program tells the user whether their number was too large or too small.  
2. Must include these methods  
   a. `int checkGuess(int guess)`  
      i. check to see if the number is correct and return the result as an integer value
      
   b. `void updateUI(int result)`  
      i. this will perform all the tasks necessary to update the display once the result has been determined  
      ii. use a switch statement inside of this method to determine what to display to the user based on the provided result.
      
### Create an Android Studio Project

1. Create a new Android Studio project
2. Name the project "Guessing Game"
3. Make sure that the target API level is below that of your testing environment.

### Add Views to the App

1. Open the app's activity_main.xml file.
2. Change the parent viewgroup to a linear layout
> Set the `orientation` attribute to `vertical` to best utilize the screen real estate
3. Add `TextViews` as desired to communicate necessary information to the user
4. Add an `EditText` view to get input from the user
5. Add a `Button` so the user can submit their guess
6. Add IDs to all the views that will need to be accessed in the code

### Create a Listener for the Button

1. Create a listener and event handler for the submit button in MainActivity.java
2. In the click event method, retreive the number guessed by the user
> int guess = Integer.parseInt(editEntry.getText().toString());
      
### Process the User's Guess

1. Create the methods above to process the user's guess and show them the result  
2. Call the `checkGuess` method and pass it's return value into the `updateUI` method.  
> Use the following constant values to communicate the results between methods  
> `static final int CORRECT    = 0;`  
> `static final int LOW        = 1;`  
> `static final int HIGH       = 2;`  
> `static final int RESET      = 3;`  

### Submit
Send your completed app to your Project Manager.

### Challenge
Randomly generate a secret number.

> You'll have to create a new Random object using  
> `Random generator = new Random();`  
> `generator.nextInt(MAX_VALUE); // where MAX_VALUE < the highest number you want to generate`  
> Documentation located [here](https://developer.android.com/reference/java/util/Random.html#nextInt(int))  

When the user has correctly guessed the number, allow them to reset and allow the user to try again.

Again, experiment with attributes of your textViews and other GUI components to improve the look of your app.
