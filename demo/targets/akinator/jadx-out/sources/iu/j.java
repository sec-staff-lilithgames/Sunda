package iu;

import java.util.concurrent.atomic.AtomicReference;
import ut.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class j {
    public static String composeMessage(String str) {
        return e3.g.l("It is not allowed to subscribe with a(n) ", str, " multiple times. Please create a fresh instance of ", str, " and subscribe that to the target source instead.");
    }

    public static void reportDoubleSubscription(Class<?> cls) {
        mu.a.onError(new qt.g(composeMessage(cls.getName())));
    }

    public static boolean setOnce(AtomicReference<pt.c> atomicReference, pt.c cVar, Class<?> cls) {
        o0.requireNonNull(cVar, "next is null");
        while (!atomicReference.compareAndSet(null, cVar)) {
            if (atomicReference.get() != null) {
                cVar.dispose();
                if (atomicReference.get() == tt.d.f87352b) {
                    return false;
                }
                reportDoubleSubscription(cls);
                return false;
            }
        }
        return true;
    }

    public static boolean validate(pt.c cVar, pt.c cVar2, Class<?> cls) {
        o0.requireNonNull(cVar2, "next is null");
        if (cVar == null) {
            return true;
        }
        cVar2.dispose();
        if (cVar == tt.d.f87352b) {
            return false;
        }
        reportDoubleSubscription(cls);
        return false;
    }

    public static boolean validate(tw.d dVar, tw.d dVar2, Class<?> cls) {
        o0.requireNonNull(dVar2, "next is null");
        if (dVar == null) {
            return true;
        }
        dVar2.cancel();
        if (dVar == hu.g.f59176b) {
            return false;
        }
        reportDoubleSubscription(cls);
        return false;
    }

    public static boolean setOnce(AtomicReference<tw.d> atomicReference, tw.d dVar, Class<?> cls) {
        o0.requireNonNull(dVar, "next is null");
        while (!atomicReference.compareAndSet(null, dVar)) {
            if (atomicReference.get() != null) {
                dVar.cancel();
                if (atomicReference.get() == hu.g.f59176b) {
                    return false;
                }
                reportDoubleSubscription(cls);
                return false;
            }
        }
        return true;
    }
}
