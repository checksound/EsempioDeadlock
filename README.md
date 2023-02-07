# Esempi Deadlock

Vedi parte teoria: https://checksound.gitbook.io/corsojava/i-thread-e-concorrenza/thread-interference#i-deadlock

Applicazione [Main](./src/Main.java) e i due thread [LockAThenB](./src/LockAThenB.java), 
[LockBThenA](./src/LockBThenA.java) che acquisiscono il lock a due risorse 
in modo incrociato.
                         ************************

Esempio di deadlock [io.checksound.concurrency.Deadlock](./src/io/checksound/concurrency/Deadlock.java)

ed esempio di utilizzo della classe `java.util.concurrent.locks.Lock` con l'utilizzo del 
lock esplicito per risolvere le problematiche del deadlock: [io.checksound.concurrency.Safelock](./src/io/checksound/concurrency/Safelock.java)
