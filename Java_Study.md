The Topic We got in the Syllabus Explicitly{
  // OOP's Concept an Introduction to JAVA
  // An overview of Java
  // Datatypes - Variables and Arrays
  // Operators,
  // Control Statements
  // Classes and Objects, 
  // Inheritence, 
  // String And StringBuffer,
  Packages, 
  Interfaces, 
  Except Handling, 
  Multithread Programming, 
  Applets, 
  Event Handling
  Abstract Window Toolkit
}


Last Time> 3:37:28
1.Introduction to JAVA{
    #1.1> Introduction to Java{
        Java is a computer programming language that enforces an Object-Oriented programming model.
        Java is a programming language and computing platform first released by Sun Microsystems in 1995.
        Java was created by a team lead by James Gosling.
        Java is a platform independent programming language that follows the logic of "Write once, Run Anywhere".
        Jave can be used to create complete applications that may run on a single computer can be distributed among servers and clients in a network.
        #1.1.1.> Features of Java{
            1. Java is Simple, It is easy to learn, and its syntax is quite simple, clean and easy to understand.The confusing and ambigous concepts of C++ are either left out in java or they have been re-implemented in a cleaner way.
            2. Although Java is an interpreted language, it was designed to support "just-in-time" compilers, which dynamically compile bytecodes into machine codes.
            3. Java can be  used to develop virus-free  systems. Java is secured because:
              Java programs runs inside virtual machine sandbox to prevent any activity from untrusted sources
              no use of explicit pointers.
            4. It is Robust Beacause:
              Java Checks the code during the compilation time and runtime
              Java completely takes care of memory allocation and releasing , which makes Java more Robust
            5. It is Portable Beacuse:
               Applications written on one platform of Java can be easily ported to another platform as it is platform independent.
            6. It is a Dynamic Language Because:
               Many Objects are evaluated at run time and executions are carried out. For example: Runtime polymorphism.
            7. It can be Distributed:
               RMI(Remote Method Invocation).EJB(Enterprise Java Beans)etc. are used for creating distributed applications using java
               Using this a program can call a method of another program running in some other computers in the network.
            8. It is Multi-Threaded:
               Thread is a task in a process or program.
               Multi-Threading is multiple tasks running or executing at the same time.
               This facility is provided by Java so that many tasks can be executed at the same time.
            9. It is Object-Oriented Programming Language Because:
               Everything is performed using "objects".
               Java can be extended since it is based on the Object Model.
         }
    }
    
    1.2> Java Installation{
         Installed it, Simple, Just watch tutorial on youtube.
    }
    1.3> Java Internals {
       JVM:{
          Java Virtual Machine(JVM) is the virtual machine that runs the Java bytecode.
          The JVM does not understand Java Source Code, that is why you compile your *.java files to obtain *.class files that contain the bytecodes
          understood by the JVM
          The same bytecode give the same results makes the Java a Platform Independent Language(Write Once, Run Anywhere)
       }
       JRE:{
          Java Runtime Environment(JRE) provides the libraries, the Java Virtual Machine,and other components to run applets and applications written in the Java programming language.
               JRE =JVM + set of libraries + Other Application files
          The JRE does  not contain tools and utilities  such as compiler and debugger for developping applets and applications.    
       }
       JDK:{
          Java Development Kit is a superset of JRE, and contains everything is the JRE, plus tools such as the compilers and debuggers necessary for developing applets and applications
               JDK = JRE + Development Tools 
               or
               JDK = (JVM + set of libraries + Other Application files) + Development Tools
       }
    }
    1.4> Modifiers and Variables In Java{
         a>Modifier is a word or phrase or clause that describes, changes, or modifies the meaning of another word or phrase in some way.Modifiers are keywords that programmer add to those definitions to change, modify or specify their meanings.
         There are two major types of modifiers in Java:
         (i) Access
         (ii)Non-Access
         a.i> Access Modifiers>{
            Java Provides a number of access control modifiers to set access levels for classes, variables, methods and constructor.
            The four access levels are - 
             i.  Default - Visible to the package
             ii. Private - Visible to the class only
             iii.Public -  Visible to the world
             iv. Protected-Visible to  the package and all subclasses
         }
         a.ii> Non-Access Modifiers>{
            Java Provides a number of non-access modifiers to provide functionalities to a class, variable,method or constructor, They Are - 
            i.Static - The Static Modifier for calling methods and variables without an object to which it belongs.
            ii. Final - The Final Modifiers for finalizing the implementation of the classes, methods and variables.
            iii.Abstract - The Abstract Modifiers for creating abstract class and methods
            iv. Synchronized and Volatile-The Synchronized and Volatile modifiers, which are used for threads.
         }
         b>Variables are memory locations which are reserved to store values and this impiles while declaring a variable you reserve some memory.
         there are 3 types of variables:
         (i)Local
         (ii)Instance
         (iii)Static/Class
         b.i>Local Variables{
            Local Variables are declared in methods, constructors or blocks.
            Local Variables are created when execution enters a method, constructor or a block.
            Access Modifiers Cannot be used for local variables
            Local Variables are visible only within the declared method,constructor
            or block
            Local variables are implemented at stack level internally
            There is no default value for local variables,so local variables should be declared and an initial value should be assigned before the first use
         }
         b.ii> Instance Variables{
            Instances variables are declared in a class
            When a space is allocated for an object in the heap, a slot for each instance variable value is created 
            Instance variables are created when an object is created with the use of keyword 'new' and destroyed when the object is destroyed
            Access Modifiers can be given for instance variables
            The Instance Variables are visible for all methods, constructors, and block in the class
            Istance Variables have default values. For numbers. the defaul value is 0 , for boolean it is false, and for object references it is null
            Values can be assigned during the declaration or within the constructor
            Instances variables can be accessed directly by calling the variable name inside the class. However, within static methods, they should be calling using the fully qualified name ObjectReference.VariableName
         }
         b.iii> Static Variables{
            Class Variables are declared with static keyword inside a class, but it is created outside a method, constructor or a block
            Class variables are declared as constants, variables never change from their initial value
            Static variables are sorted in the static memory
            It is rare to use static variables other than declared final and used as either public or private constants
            Static vraiables are created when the program starts and destroyed when the program stops
            Static variables are declared public since they must be available for users of the class
            Static variables can be accessed by calling the class name -> ClassName. VariableName
         }
      }
    1.5> Java Data Types{
       Each Variable in Java has a specific type, Which determines the size of the memory, the range of values that can be stored and the set of operations that can be applied to the variables
       Datatypes can be categorized into two major types:
         a.Primitive{
          The datatypes which predefined by the language and named as a keyword.
          There are 8 major primitive datatypes:
          byte,
          short,
          int,
          float,
          double,
          char,
          boolean

          syntax => int num = 50
         }
         b.Non-Primitve/Reference{
            Reference variables are created using defined constructors of the class
            These variables are declared to be a specific type that cannot be changed
            Objects of various classes Strings and arrays come under refrence datatype
            Reference type does not have size or any bit range


            syntax=> Student s1 = new Student();
         }
    }
    1.6> Data Types Conversion In Java{
            A datatype of a particular variable can be converted to other datatypes
            There are 2 ways in which we can perform Datatype Conversion:
            (i) Implicit Conversion{
               An Implicit Conversion means that a value of one type is changed to a value of another type without any specail directive from the programmer.
               Example: A char can be implicitly converted to an int, a long, a float or a double.
               Syntax:
               char c = 'a'
               int k = c
               the value of 'k' is now 97, which is the ASCII value of 'a'.
            }
            (ii) Explicit Conversion{
               Explicit Conversion are done by Type Casting.
               The type to which you want a value converted is given in parentheses, in front of the current value of that
               Casting can be used to convert among any of the primitive types except boolean
               Example: The Following Code casts a value of type double to a value of type int
               double d = 45
               d ==> 45.0
               int i  = (int) d
               i ==> 45
               explicit conversion will execute and convert double to int without an error.
            }
            Note:
            1. int can be converted inplicitly to float, double,long.
            2. For vice versa, they have to be converted explicitly.
            Methods:{
               1.String to int: 
               Integer.parseInt()
               String s = "23"
               s ==> "23"
               int i = Integer.parseInt(s)
               i ==> 23
               or 
               Integer.valueOf()
               int i = Inerger.valueOf(s)
               i ==>23
               2. int to String:
               integer.to String()
               int i =23
               i ==> 23
               String s = integer.StringOf(i)
               s ==> "23"
               or 
               String.valueOf()
               String s = String.valueOf(i)
               s ==> "23"
            }

         }
    1.7> Java Operators{
       Check out The Internet
       https://www.tutorialspoint.com/java/java_basic_operators.htm
    }
    1.8> Control Statements In Java{
       There are 3 Types of Control Statement
       1.Selection/Decision Making Statements[
          a.if-else
          b.switch
       ]
       2.Iteration Statements[
          a.for{
             There are three type of "for" loop in Java
             a. Simple
             b. Labeled
             c. Enhanced
          }
          b.while{
             There are two of it in Java
             a. Simple 
             b. Do_While loop

          }
       ]
       3.Jump Statement[
          a.break[
             Example:
             for(int i =0;i>5; i--){
                if(i==7){
                   break;
                }
                System.out.println(i);
             }
             Output:
             10
             9
             8
          ]
          b.continue[
             for(int i =0;i>1; i--){
                if(i==7){
                   continue;
                }
                System.out.println(i);
             }
             Output:
             10
             9
             8
             6
             5
             4
             3
             2
           ]     
          c.return[
             The return statement is a control flow satement that terminates the execution of methhod and return control to its caller.
             When return of of any method is void, then the method does not anything.
             Example:
            a. Return type is void() as work is not returning anything
            public static void work(){
               System.out.println("Hello World");
            }
            public static void main(String[] args) {
               work();
            }
            b.Return type is int, as hello() return i, which is of type integer
            public class Demovalue{
               public int hello(int a , int b){
                  int i = 0;
                  for(i = a; i<b;i++){
                     System.out.println(i);
                  }
                  return i;
               }
               public static void main(String[] args){
                  Demovalue dv = new Demoavlue();
                  int num = dv.hello(2,5);
                  System.out.print(num);
               }
            } 

          ]
       ]
    }
    1.9> Methods:{
       A method is a group of statements and it has re-usability a block of code minimizes redundancy. A class may have multiple methods and a methods returns a null or a value using the "return" statement.
       Syntax:
       public int methods(int a , int b)
       {
          System.out.println(a+ " " +b);
       }
       return a;

      Here, Public is a Modifier, first int is the return type, methods is name of the method, the method body is in the curly braces, and int a,int b is the parameter list.
      The Steps Of the Method Execution :
      1. As we start executing Java code,main() function is executed first.Object of main() is created. 
      2. Statements within main() are getting executed.
      3.The Statesment within the method function get executed and at the end control again goes to the main() function
      4. Remaining Statements wihtin the main() get executed.
      
      * Ways of calling a Method 
      1. (Call By Value): In the Call by Value method of passing arguments to a function copies the actual value of an argument into the formal parameter of a function.
      2.(Method Overloading): A class may define multiple methods with the same name and return type. but different number of arguments or arguments of different datatypes.This is called Method Overloading .
    }

      1.10> Arrays:{
         Arrays are used to sove the problem of sorting multiple elements of the same Data Types.
         An Array is a group of liked-typed variables, that are referred to by a common name.
         Specific element in an array is accessed by its index
         Array size is fixed and can not be be changed.
         ###Array Declaration:{
         Arrays are created either using the 'new' operator or by array initializer.
         (1)'new' operator: // It does not requires the elements pre-defined
         //it just allocate the memory location
         int [] a = new int[5]; or int a[] = new int[5];
         (2) array initializer : // It allows the programmer to give the elements
         int []a = {2,4,6,8,10}; or int a[] = new int [] {1,2,3,4,5}
         }
         ### Types of Array:{
            1.Sngle Dimensional Array:
            int a[] = {2,4,6,8,10}
            Value ->  2    4     6     8     10
            Index ->a[0] a[1]  a[2]  a[3]  a[4]
            2.Mutlt Dimensional Array:
            int a [] [] = new int [5][6];
            [5] is the X value indicates Row number
            [6] is the Y value indicates Column number
            Just imagine a 2d array.
         }
      }
      1.11> Strings:{
         Java Strings is a sequence of characters. They are objects of type String Class. Once a String object is created, it can not be changed. Strings are Immutable.
         
         ##Different Ways to Declaring a String
         i) Using 'new' keyword 
         String str = new String();
         ii) Using literals
         String str1 = "edureka";
         
         ** Immutability of Strings:
         i) Security: Strings are used for network connection and for database connection.To avoid the access these connections from external users, Strings are immutable.
         ii) Sychronization: Immutibility of Strings automatically makes system thread safe to solve the sunchronization problem.
         iii)Caching: If two of the Strings objects are having the same value, and you need only one string, then the two objects will point to the same memory location pointing same String Object.

         Strings - Memory Allocation 2:33:42
         Follow - String_Operations.java
      }
}

Q. Why to use Object Oriented Concepts?
1. Classes and Objects:{
   Java is an Object Oriented and Class Bases programming language.
   A class is a blueprint which includes all the data. It describes the state and behaviour of specific object.
   An Object is an Instance of class which contains variables and method.
   
   >Example: Suppose "Phone" is a class, Then Rotary Phone, Touch Tone Phone and Cellular Phone are the Objects of the class.
}
2. Attributes:{
   " In Computing, an attribute is a specification that defines a property of an object,element, or file. It may also refer to or set the specific value for a given instance of such."

   There are two type of Attributes = * Built-in Class Attributes
                                      * Attributes defined by Users
   
  Built-in Class Attributes:{                
   Class=                                 
   Student                                     
   ID
   First-name
   Last-name
   Address
   Contact Number
   Grade
  }
   Attributes defined by Users:{
     Object = 
     Student s = new Student();
  }
}
3. Java Naming Conventions:{
   1> Class Name: It should Start with uppercase letter and it should be a noun.
   2> Interface Name: It should start with uppercase letter and it should be an adjective.
   3> Method Name: It should start with lowercase letter and it should be a verb.
   4> Variable Name:It should start with lowercase letter.
   5>Constant Name:It should start with uppercase letter.
}
4. Types of Variables:{
   1. Local Variables = Local Variables are declared within the method of a class.
   2. Instance Variables = Instance Variables are declared in a class but outside a method, costructor or any block.
   3. Class Variables = Class/Static Variables has only one copy that is shared by all the different objects of a class.
}
5. Contructor:{
   a. Contructor is used in the creation of an Object.
   b. It is the block of the code used to initialize an object
   c. Constructor Must have the same name as the class it is in and it does not have any return type
   d.Contructor gets executed when an object of a class is being created
   e.Constructors are of two types
   i) Default Constructor=[
      The Constructor which is created bt the compiler without any parameters.
   ]
   ii)Parameterized Constructor=[
      The constructor which has a specific number of parameters.
   ]
    
   >Difference Between Constructor and Method
   1. Constructor must not have any return type, where as Method must have any return type.
   2. Constructor ame must be same as the class name, where as Method name must not be same as the class name.
   3. Constructor is used to  initialize the state of an object, Method is used to expose the beahviour of an Object.
   4. Constructor is invoked implicitly and method is not invoked implicitly.
   
   > How Does Constructor Work?
   The Moment Object of a class is created, the constructor of the class is called which initializes the class attributes.

   Class---------------------->Object--------------------->Constructor
          ('new' Keyword)                    (default)  

  >Constructor Overloading[
     Constructor Overloading is just like Method Overloading Without any return type. Constructor Overloading in Java technique of having more than one constructor with different parameter list.
  ]
  >Constructor Chaining[
     
     1. Constructor Chaining is the process of calling one constructor from another constructor with respect to the current object.
     2. The real purpose of Constructor Chaining is to pass parameters through a bunch of different constructors, but the initializer should be done at single place.
     3. Constructor Chaining can be done in two ways: 1. Within same class, 2. from base class
     4. Constructor Chaining occurs through inheritence.

     N.B. For Constructor Chaining we basically use two keywords in JAVA.
     1. "this" keyword for 'within the same class'.
     2. "super" keyword for 'from the base class'.
  ]
}

6. "static" Keyword{

   The static Keyword is used for memory management. Static is a non-access modifier used in Java, applicable for blocks, methods, class variables. Static Keyword is used to refer the common properties of an object.
    When the static keyword is used to declare any parameter, then memory is allocated only once for that Parameter.
}
7. "final" keyword{
    It is a non-access modifier applied on a variable(actually when to create a constant), to a method(to avoid overloading and overriding), to a class(to avoid inheritence),
    also to the instance variable, class variables, local variables, Method parameters.
    
    A constructor cannot be declared as "final", A blank final vaiable should be initialized in the constructor. 
} 
8. "this" keyword{
    The this keyword is used as reference variable to the current object.
    > this can be passed as an argument in the constructor call.
    > this can be used to invoke current class method
    > this can be passed as an argument in the method call 
    > this() can be used to invoke current class constructor                                                                                                                                                                                                                                                                                      

  The this keyword in mainly used to refer current class instance variable and it can also be used to return the current
  class instance from the method.
}
9. "super" keyword{
    The super keyword in java is a reference variable that is used to refer parent class objects.
    >Used to refer immediate parent class instance variable.
    >Used to invoke parent class method
    >Used to invoke parent class constructor                                                                                                                         

    }
                                                                                                                       
#Object-Oriented Programming Concepts
1. Inheritance
2. Polymorphism 
3. Abstraction
4. Encapsulation

1. Inheritance{
    Inheritance is the powerful Feature of Object Oriented Programming, Through Which one
    object acquires some or all the properties and behaviour of Parent Object.
    
    >Inheritance represents IS-A relationship, Also known as Parent-Child Relationship.
    
     Inheritance is used in Java for
     1. Method Overriding (To Achieve run-time polymorphism)
     2. Code Reusability
     
     Syntax of Inheritance :   "class" SubClass_name "extends" SuperClass_name
                                 {
                                    //variables
                                    //Methods
                                 }                                                                                                                                                                
>>HAS-A Relationship
 
 If class has an entity referenc, it is known as Aggregation.It represents HAS-A relationship
 
[Example]- A "department" is a College has several "professors". Without existance of "departments"
there is good chance for the "professor" to exist. Hence "professors" and "departments" are loosly
associated and this loose association is known as Aggregation.
}
2.Polymorphism{
   When one task is performed by different ways,then it is called as Polymorphism.
   Poly means Multiple and Morphism means Forms.
   
   
i) Method Overloading : Compile-time Polymorphism{
    A class may define multiple methods with the same name and return type, but  different number
    of arguments or arguments od different data types. This is called Method Overloading.
  }
ii) Method Overriding : Run-time Polymorphism (also known as Dynamic binding){
    If child Class has The Same Method as declared in the Parent Class, It is known as Method Overriding.
    a. Method Overriding must be used in case of Inheritence. it has IS-A relationship.
    b.Method must have the same name as in parent class
    c.Method must have the same parameters as in parent class
   }
}
3. Abstraction{
     Abstraction is a mechanism of hiding the implementation details from the user and only
     providing the functionality to the user.
     
    #Abstraction lets you focus what object does instead of how it does it.
     There are two ways to achieve abstraction in java.
     . Abstract class (0% to 100% abstraction )
     . Interface (100% abstraction)
     
     #Rules:
     i) An abstract class is a class that is declared with abstract keyword.
     ii) An abstract method is a method that is declared without an implementation.
     iii) An abstract class may or may not have all abstract methods.
     iv) Any class that contains one or more abstract methods, must also be declared with 
     abstract keyword.
     v) Abstract class is mostly used for inheritence.
     
}
4. Encapsualtion{
    Encapsulation is the methodology of binding cod and data together into single unit.
    #To achieve encapsulation in JAVA:
    i) Declare the variable of a class as private
    ii) Provide public setter and getter method to modify and view the variables values.
    
    #Advantages of Encapsulation:
    i) Data Hiding: The user will have no idea about  the inner implementation of class.
    ii) Increased Flexibility: We can make variables and methods read-only or write-only as per 
    requirement
    iii) Testing is Easy.
    iv) reusability: Easy to reuse and easy to change with new requirements.

}

#Interface{
    An Interface contains variables and methods, but the methods declared inside Interface
    are by default abstract methods
    
    1.An Interface is used to achieve Abstraction.
    2.It is also used to achieve loose coupling.
    3.We can achieve multiple inheritence
    4.Java interface represents IS-A relationship
    
    #Difference Between Interface and Class
    Timeline - 4:32:49
    
    #Difference Between Interface and Abstract Class
    Timeline - 4:36:50
    
    Class-Interface Relationship
    Timeline - 4:38:15
    
    
     
}
































