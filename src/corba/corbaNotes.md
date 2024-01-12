Common Object Request Broker Architecture [CORBA]

    - Technology used to communicate two objects of heterogenous type.
    - Distributed object based system.

Benefits of CORBA:

    Platform and Language Independence
        Object can interact regardless of their environment or language.
    
    Standardised Communication
        IDL provides the common way to define interfaces.

    Maturity and Support
        CORBA has a long history and wide industry adoption.

Limitations of CORBA:

    Complexity
        Setting up and managing CORBA can be more difficult than simpler technologies like RMI

    Performance Overhead
        Communication overhead can impact performance for highly interactive applications.

Difference from RMI:

    Language Neutrality
        CORBA supports multiple language while RMI is JAVA-specific.

    Standardisation
        CORBA is an industry-wide standard, while RMI is JAVA-specific technology.


Working of a CORBA Program:

    1. Define interfaces in IDL:
        Describe the methods and data structures objects will expose, creating a common language.

    2. Generate stubs and skeletons:
        ORB creates code for client and server sides to translate calls and data.

    3. Implement object functionality:
        Write the actual code that performs tasks on the server side.

    4. Start the ORB:
        Activate the communication infrastructure.
    
    5. Client requests a service:
        It calls a method on the remote object as if it were local.

    6. ORB handles communication:
        It translates calls and data using stubs and skeletons.

    7. Server object executes the method:
        It performs the requested action.

    8. Result is returned to client:
        The client receives the processed data.

