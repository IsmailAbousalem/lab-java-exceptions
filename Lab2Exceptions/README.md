![logo_ironhack_blue 7](https://user-images.githubusercontent.com/23629340/40541063-a07a0a8a-601a-11e8-91b5-2f13e4e6b441.png)

# LAB Java | Exceptions



## Introduction

We have just learned how to throw, handle and test exceptions so let's practice a bit more.

<br>

## Requirements

1. Fork this repo.
2. Clone this repo.
3. Add your instructor and the class graders as collaborators to your repository. If you are unsure who your class graders are, ask your instructor or refer to the day 1 slide deck.
4. In the repository, create a Java project and add the code for the following prompts.

## Submission

Once you finish the assignment, submit a URL link to your repository or your pull request in the field below.

<br>

## Instructions

1. Create a `Person` class that has the following properties:

   - `id`: an integer
   - `name`: a string formatted as "firstName lastName"
   - `age`: an integer
   - `occupation`: a string

   The `Person` class should have the following methods:

   - A constructor that takes in an integer `id`, a string `name`, an integer `age` and a string `occupation` as arguments and sets their respective properties.
   - A `setAge` method that takes in an integer `age` and sets the `age` property, but throws an error if `age` is less than 0.
   - An `equals` method that takes in a `Person` object and returns `true` if their properties are the same, excluding the `id` property.

2. Create a `PersonsList` class that holds a list of `Person` objects.
   - Create a `findByName` method that takes in a string `name` and returns the `Person` object with a name that matches exactly. The `name` parameter should be formatted as "firstName lastName". This method should throw an exception if the `name` parameter is not properly formatted.
   - Create a `clone` method that takes in a `Person` object and returns a new `Person` object with the same properties, except with a new `id`.
   - Create a method that takes in a `Person` object as a parameter and uses the `toString` method to write the `Person` information to a file. This method should handle any errors as necessary.

<br>

## Test Cases

1. Test the `setAge` method to ensure that it throws an error if the age is less than 0.
2. Test the `findByName` method to ensure that it properly finds and returns the correct `Person` object when given a properly formatted name.
3. Test the `findByName` method to ensure that it throws an exception if the `name` parameter is not properly formatted.
4. Test the `clone` method to ensure that it creates a new `Person` object with the same properties as the original, except with a new `id`.

<br>

## FAQs

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">I am stuck and don't know how to solve the problem or where to start. What should I do?</summary>

  <br> <!-- ✅ -->

  If you are stuck in your code and don't know how to solve the problem or where to start, you should take a step back and try to form a clear, straight forward question about the specific issue you are facing. The process you will go through while trying to define this question, will help you narrow down the problem and come up with potential solutions.

  For example, are you facing a problem because you don't understand the concept or are you receiving an error message that you don't know how to fix? It is usually helpful to try to state the problem as clearly as possible, including any error messages you are receiving. This can help you communicate the issue to others and potentially get help from classmates or online resources.

  Once you have a clear understanding of the problem, you should be able to start working toward the solution.

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">How do I create a Maven project in IntelliJ?</summary>

  <br> <!-- ✅ -->

  To create a Maven project in IntelliJ, you can follow these steps:

  1. Open IntelliJ IDEA and click the "Create New Project" button.
  2. In the "New Project" dialog, select "Maven" as the build system.
  3. Specify the name of the project.
  4. In the "Project Location" section, specify a location where you want to save your project.
  5. Select the "Create Git repository" checkbox in order to initialize the git repository upon creation of the project.
  6. Click the "Create" button to create the Maven project.

  <br>

   

 </details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">What is the purpose of the "toString()" method and how can I override it in Java?</summary>

  <br> <!-- ✅ -->

  The `toString()` method in Java is a method that is automatically called when an object is passed as a string. The purpose of this method is to return a string representation of an object. By default, the `toString()` method returns the name of the object's class and its memory address.

  It is a good practice to override the `toString()` method in your own classes to provide a meaningful string representation of your objects. This can be useful for debugging and logging purposes.

  Here is an example of how to override the `toString()` method in Java:

  ```java
  class Circle {
      int x, y;
      int radius;

      public String toString() {
          return "Circle [x=" + x + ", y=" + y + ", radius=" + radius + "]";
      }
  }
  ```

  In this example, the `Circle` class overrides the `toString()` method to return a string representation of the `Circle` object. When an object of the `Circle` class is passed as a string, this custom implementation of `toString()` will be called and will return the desired string representation.

  It is important to note that the `toString()` method should return a concise, human-readable string representation of the object, as it is commonly used for debugging and logging purposes.

  <br>

   

 </details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">What is the purpose of using the "throws" keyword in Java and when should I use it?</summary>

  <br> <!-- ✅ -->

  The `throws` keyword in Java is used to declare that a method may throw an exception. The purpose of using the `throws` keyword is to indicate that an exception may be thrown and it requires the calling method to handle the exception. If a method declares that it throws an exception, the calling method must either handle the exception using a try-catch block or declare that it also throws the same exception.

  Here's an example of how you can use the `throws` keyword in a method:

  ```java
  public void readFile(String fileName) throws FileNotFoundException {
      File file = new File(fileName);
      Scanner scanner = new Scanner(file);
      // code to read the file
      scanner.close();
  }
  ```

  In this example, the `readFile()` method declares that it throws a `FileNotFoundException`. If the file specified in the `fileName` argument does not exist, a `FileNotFoundException` will be thrown and the calling method must handle it.

  You should use the `throws` keyword when a method can potentially throw an exception that it cannot handle itself. In such cases, it is the responsibility of the calling method to handle the exception. The use of the `throws` keyword allows for proper error handling and prevents the code from crashing due to unhandled exceptions.

  <br>

 

 </details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">What is the purpose of using "throw new" in Java and when should it be used?</summary>

  <br> <!-- ✅ -->

  The `throw new` keyword in Java is used to throw a custom exception. The purpose of using the `throw new` keyword is to raise an exception in the code and halt the execution of the program. This is useful in cases where the code encounters an exceptional condition that cannot be handled within the method and requires the calling method to handle the exception.

  Here's an example of how you can use the `throw new` keyword in a method:

  ```java
  public void divide(int a, int b) throws ArithmeticException {
      if (b == 0) {
          throw new ArithmeticException("Cannot divide by zero");
      }
      int result = a / b;
      System.out.println("Result: " + result);
  }
  ```

  In this example, the `divide()` method checks if the denominator `b` is equal to zero. If it is, the method throws a custom `ArithmeticException` with a message indicating that dividing by zero is not allowed. The calling method must handle the exception or declare that it also throws the same exception.

  You should use the `throw new` keyword when you encounter an exceptional condition in your code that cannot be handled within the method. This allows the calling method to handle the exception and prevent the program from crashing due to unhandled exceptions.

  <br>

   

 </details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">How can I use the "File" and "FileWriter" classes in Java to write to a file?</summary>

  <br> <!-- ✅ -->

  To write to a file in Java, you can use the `File` and `FileWriter` classes. The `File` class is used to create a file or directory in the file system, while the `FileWriter` class is used to write characters to the file.

  Here's an example of how you can use these classes to write to a file:

  ```java
  import java.io.File;
  import java.io.FileWriter;
  import java.io.IOException;

  public class FileExample {
      public static void main(String[] args) {
          try {
              // Create a new file object
              File file = new File("example.txt");

              // Create a new FileWriter object to write to the file
              FileWriter writer = new FileWriter(file);

              // Write some text to the file
              writer.write("This is an example of writing to a file in Java.");

              // Close the writer to save the changes
              writer.close();

              System.out.println("File written successfully");
          } catch (IOException e) {
              System.out.println("An error occurred while writing to the file: " + e.getMessage());
          }
      }
  }
  ```

  In this example, a new `File` object is created with the name `example.txt`. A `FileWriter` object is then created, passing the `File` object as a parameter. The `write()` method is used to write the text to the file and the `close()` method is called to save the changes.

  Note that when using `FileWriter`, the file is created if it doesn't already exist and any existing content in the file is overwritten. If you want to append to an existing file instead of overwriting it, you can use the `FileWriter` constructor that takes two parameters, the second being a `boolean` that indicates whether to append to the file or not.

  ```java
  FileWriter writer = new FileWriter(file, true);
  ```

  It's important to catch any `IOException` that may be thrown when writing to a file, as this indicates that an error occurred while performing the operation. In this example, the error message is printed to the console.

  <br>

   

 </details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">What is the use of "assertThrows" in JUnit and how can I use it to test exceptions in Java?</summary>

  <br> <!-- ✅ -->

  The `assertThrows` method in JUnit is used to test if a certain exception is thrown by a specific piece of code. It allows you to ensure that your code behaves correctly when an exception occurs.

  Here's an example of how you can use `assertThrows` in JUnit:

  ```java
  @Test
  public void testException() {
      Exception exception = assertThrows(IllegalArgumentException.class, () -> {
          // Code that should throw the exception
      });
      assertEquals("Exception message", exception.getMessage());
  }
  ```

  In the example above, we are testing if the code inside the lambda expression throws an `IllegalArgumentException`. If the code does throw the exception, it will be caught and stored in the `exception` variable. Then, we can use `assertEquals` to check that the exception message is correct.

  **Note**: The `assertThrows` method is available in JUnit 5 and later versions.

  <br>

   

 </details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">I am unable to push changes to my repository. What should I do?</summary>

  <br> <!-- ✅ -->

  If you are unable to push changes to your repository, here are a few steps that you can follow:

  1. Check your internet connection: Ensure that your internet connection is stable and working.
  1. Verify your repository URL: Make sure that you are using the correct repository URL to push your changes.
  2. Check Git credentials: Ensure that your Git credentials are up-to-date and correct. You can check your credentials using the following command:

  ```bash
  git config --list
  ```

  4. Update your local repository: Before pushing changes, make sure that your local repository is up-to-date with the remote repository. You can update your local repository using the following command:

  ```bash
  git fetch origin
  ```

  5. Check for conflicts: If there are any conflicts between your local repository and the remote repository, resolve them before pushing changes.
  6. Push changes: Once you have resolved any conflicts and updated your local repository, you can try pushing changes again using the following command:

  ```bash
  git push origin <branch_name>
  ```

</details>


