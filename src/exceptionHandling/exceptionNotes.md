Exception

    An event that disorder the normal flow of a program.
    It is an object thrown at runtime.

Exception Handling

    One of the powerful mechanism to handle runtime errors so that normal flow of the 
    application can be maintained.

    It is a mechanism to handle runtime errors such as ClassNotFoundException, IOException,
    SQLException, RemoteException, etc

Common Scenarios where Exception may occur:

    int a = 50/0;                               : Arithmetic Exception

    String s = null;
    System.out.println(s.length());             : NullPointerException

    int i = Integer.pareseInt(String a);        : NumberFormatException

    int [] a = new int [10];
    a[20] = 5;                                  : ArrayIndexOutOfBoundsException

Compile Time Exceptions

    extends Throwable class
     - CheckedException
     - IOException
     - SQLException

Run Time Exceptions

    extends RunTimeException
    - UncheckedException
    - ArithmeticException
    - NullPointerException
    - ArrayIndexOutOfBoundsException

Error

    It is irrecoverable
    - OutOfMemoryError
    - VirtualMachineError
    - AssertionError


            Object
               |
           Throwable
         ______|__________
        |                 |
    Exception           Error

Keywords
    try
    catch
    finally
    throw
    throws

Try Block

    - used to enclose the code that might throw an exception
    - Java try-block must be followed by either catch or finally block or both.

    Syntax:

        try{
            Code that may throw exception
        }
        catch(Exception_className obj){
            Statement(s);
        }
        finally{
            Closing code that always executes
        }

catch Block
    
    - used to handle exceptions
    - must be used after try block only
    - multiple catch block can be used after a single try block

Nested try

    - try-catch block within a try block
    - sometimes, a situation may arise where a part of block may cause one error and the
      entire block itself may cause another error. In such case, exception handlers have to be nested.

Finally Block

    - used to execute important code such as closing connection, stream, etc
    - this block is always executed whether exception is handled or not.
    - finally block must be followed by try or catch block.

    For each try block there can be zero or more catch block but only one finally block.

    Finally block won't execute if program exits either by calling System.exit() or by causing a fatal error that forces the process to abort.

Throws Keyword

    - if a method doesnot handle a checked exception by using try,catch,finally blocks then the method must declare
      exception using the throws keyword.
    - throws keyword helps to forward exception to method caller which can be again forwarded up in the heirarchy.
    - if all the calling methods are using throws and no more calling method is available to handle the exception
      JVM itself will handle the exception.
    - throws keyword appears at the end of the method's singnature.

        example:

        class ThrowsException{

            static void divide(int a, int b) throws ArithmeticException{
                int c = a/b;
            }

            public static void main(String[] args){
                try{
                    divide(12,0);
                }
                catch(ArithmeticException e){
                    e.printStackTrace();
                }
            }
        }

Throw Keyword

    - used to explicitly throw an exception
    - both checked/unchecked exception can be thrown.
    - used to throw custom exception

Java Exception Propagation

    An exception is first thrown from the top of the stack and if it is not caught then it
    drops down call stack to the previous method.

    This process continues until the exception is caught.

Throwing a Custom Exception

    - Inherit the custom class from Exception class
    - throw that custom exception
    - enclose the code which can throw exception in try block
    - catch that exception using catch block.