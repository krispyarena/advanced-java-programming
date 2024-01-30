Socket

    - It is an endpoint of a two way communication link between two programs running on the network.
    - It is bound to a port number so that the TCP layer can identify the application that data is destined to send

    - Java Socket Programming is used for communication between the application that is running on different JREs.
    - It can either be connection oriented or connection less.
    - Socket and ServerSocket classes are used for connection-oriented socket programming.
    - DatagramPacket and DatagramSocket classes are used for connection-less socket programming.
    - The client in socket programming must know two information:
        i. IP Address of the Server
        ii. Port Number 

Network Programming using TCP/IP

    In Server:

        1. Create an object of ServerSocket including port number.

            ServerSocket sSocket = new ServerSocket(2020);

        2. Accept the connection of client socket.

            Socket cSocket = sSocket.accept();

        3. Create an object each for DataInputStream and DataOutputStream.

            DataInputStream dis = new DataInputStream(cSocket.getInputStream());
            DataOutputStream dos = new DataOutputStream(cSocket.getOutputStream());

        4. Sending Data to Server

            Data can be sent into server by:

                dos.writeUTF(String message);

        5. Receiving Data from Server

            Data can be received from server by :

                String message = dis.readUTF();

        6. Closing Code

                dis.close();
                dos.close();
                cSocket.close();


    In Client:

        1. Create an object of socket including hostname and port number.

            Socket cSocket = new Socket("localhost", 8080);

        2. Create an object each for DataInputStream and DataOutputStream.

            DataInputStream dis = new DataInputStream(cSocket.getInputStream());
            DataOutputStream dos = new DataOutputStream(cSocket.getOutputStream());

        3. Sending Data to Server

            Data can be sent into server by:

                dos.writeUTF(String message);

        4. Receiving Data from Server

            Data can be received from server by :

                String message = dis.readUTF();

        5. Closing Code

                dis.close();
                dos.close();
                cSocket.close();