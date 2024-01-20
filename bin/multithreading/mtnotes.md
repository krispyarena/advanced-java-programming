Multithreading

    It allows computer to handle multiple tasks at once making it more responsive and efficient.

How It Works:

    1. Task Breakdown
        Program divides its work into smaller, self-contained tasks(threads).

    2. Thread Creation
        The program creates threads, each with its own set of instructions and resources.

    3. Thread Scheduling
        The operating system juggles multiple threads and decides which one gets to use the CPU at any given moment.

    4. Concurrent Execution
        Threads can run concurrently i.e. they can make progress even if they are not currently using the CPU.

    5. Task Completion
        Once a thread finishes its task, it signals completion and release its resources.


Benefits of Multithreading:

    1. Improved Responsiveness
        Programs can handle multiple tasks at once, making them feel more responsive to user input.

    2. Better Use of Resources
        Threads can take advantage of idle CPU time, maximising hardware utilisation.

    3. Enhanced Performance
        Parallel execution of tasks can speed up overall program execution.

    4. Smooth User Experiences
        Tasks like loading images or downloading files can run in background without freezing the main application.

Common Use Cases

    1. Responsive User Interfaces
        Updating GUI elements and handling user interactions without blocking other tasks.
    
    2. Network Applications
        Handling multiple client connections or performing I/O operations concurrently.

    3. Background Tasks
        Handling long-running operations like file processing or calculations in background without freezing the main application.

    4. Server-side Applications
        Handling multiple request from clients simultaneously.

Key Concepts

    1. Thread Safety
        Ensuring data integrity when multiple threads access shared resources, preventing conflicts and errors.

    2. Synchronisation
        Coordinating access to shared resources among threads to avoid race conditions and ensure predictable behavior.

    3. Deadlocks
        Situations where two or more threads are waiting for each other to release resources, causing a permanent standstill.

Note

    Multithreading is a powerful tool, but it requires careful planning and coordination to avoid potential pitfalls.
    
    It is essential to consider thread safety, synchronisation and deadlock prevention while designing multithreaded applications
