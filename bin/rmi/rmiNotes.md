Remote Method Invocation [RMI]

    It is a java mechanism that lets programs running on different computers (or even the same computer) remotely access and invoke methods on objects.

    It is used to build distributed applications.

    It enables communication between two Java Virtual Machines.

Benefits of RMI

    1. Modular Programming
        - Divides the code into independent units that can interact regardless of location.

    2. Scalability
        - Build distributed applications that can handle larger workloads and data-volumes.
    
    3. Resource Sharing
        - Access data and functionality from other applications or machines efficiently.

Steps to write a RMI program

    1. Create an interface and extend it with Remote interface.
            - Define methods in this interface.
    
    2. Create an IMPL class for the above interface.

    3. Create, define and run server application.

    4. Create, define and run client application.

    5. Server Program must be executed before Client Program.