package iu;

import b0.e2;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final l f68415a = new l("No further exceptions");

    public static <T> boolean addThrowable(AtomicReference<Throwable> atomicReference, Throwable th2) {
        while (true) {
            Throwable th3 = atomicReference.get();
            if (th3 == f68415a) {
                return false;
            }
            Throwable cVar = th3 == null ? th2 : new qt.c(th3, th2);
            while (!atomicReference.compareAndSet(th3, cVar)) {
                if (atomicReference.get() != th3) {
                    break;
                }
            }
            return true;
        }
    }

    public static List<Throwable> flatten(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.offer(th2);
        while (!arrayDeque.isEmpty()) {
            Throwable th3 = (Throwable) arrayDeque.removeFirst();
            if (th3 instanceof qt.c) {
                List<Throwable> exceptions = ((qt.c) th3).getExceptions();
                for (int size = exceptions.size() - 1; size >= 0; size--) {
                    arrayDeque.offerFirst(exceptions.get(size));
                }
            } else {
                arrayList.add(th3);
            }
        }
        return arrayList;
    }

    public static <T> Throwable terminate(AtomicReference<Throwable> atomicReference) {
        Throwable th2 = atomicReference.get();
        l lVar = f68415a;
        return th2 != lVar ? atomicReference.getAndSet(lVar) : th2;
    }

    public static <E extends Throwable> Exception throwIfThrowable(Throwable th2) throws Throwable {
        if (th2 instanceof Exception) {
            return (Exception) th2;
        }
        throw th2;
    }

    public static String timeoutMessage(long j10, TimeUnit timeUnit) {
        StringBuilder sbR = e2.r(j10, "The source did not signal an event for ", " ");
        sbR.append(timeUnit.toString().toLowerCase());
        sbR.append(" and has been terminated.");
        return sbR.toString();
    }

    public static RuntimeException wrapOrThrow(Throwable th2) {
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
        return th2 instanceof RuntimeException ? (RuntimeException) th2 : new RuntimeException(th2);
    }
}
