# Esempi Deadlock

Vedi parte teoria: https://checksound.gitbook.io/corsojava/i-thread-e-concorrenza/thread-interference#i-deadlock

Applicazione [Main](./src/Main.java) e i due thread [LockAThenB](./src/LockAThenB.java), 
[LockBThenA](./src/LockBThenA.java) che acquisiscono il lock a due risorse 
in modo incrociato.

L'output di due esecuzioni:

```
threadLockBThenA - PRESO LOCK B
threadLockAThenB - PRESO LOCK A
```
```
threadLockAThenB - PRESO LOCK A
threadLockBThenA - PRESO LOCK B
```

In tutte e due i casi si arriva a una situazione di deadlock (stallo) 
ed è necessario terminare il programma dall'esterno.

************************

Esempio di deadlock [concurrency.Deadlock](./src/concurrency/Deadlock.java)

ed esempio di utilizzo della classe `java.util.concurrent.locks.Lock` con l'utilizzo del 
lock esplicito per risolvere le problematiche del deadlock: 
[concurrency.Safelock](./src/concurrency/Safelock.java)
