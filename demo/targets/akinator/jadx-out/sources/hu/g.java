package hu;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p0.o2;
import ut.o0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g implements tw.d {

    /* renamed from: b, reason: collision with root package name */
    public static final g f59176b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ g[] f59177c;

    static {
        g gVar = new g("CANCELLED", 0);
        f59176b = gVar;
        f59177c = new g[]{gVar};
    }

    public static void deferredRequest(AtomicReference<tw.d> atomicReference, AtomicLong atomicLong, long j10) {
        tw.d dVar = atomicReference.get();
        if (dVar != null) {
            dVar.request(j10);
            return;
        }
        if (validate(j10)) {
            iu.e.add(atomicLong, j10);
            tw.d dVar2 = atomicReference.get();
            if (dVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    dVar2.request(andSet);
                }
            }
        }
    }

    public static boolean deferredSetOnce(AtomicReference<tw.d> atomicReference, AtomicLong atomicLong, tw.d dVar) {
        if (!setOnce(atomicReference, dVar)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet == 0) {
            return true;
        }
        dVar.request(andSet);
        return true;
    }

    public static boolean replace(AtomicReference<tw.d> atomicReference, tw.d dVar) {
        while (true) {
            tw.d dVar2 = atomicReference.get();
            if (dVar2 == f59176b) {
                if (dVar == null) {
                    return false;
                }
                dVar.cancel();
                return false;
            }
            while (!atomicReference.compareAndSet(dVar2, dVar)) {
                if (atomicReference.get() != dVar2) {
                    break;
                }
            }
            return true;
        }
    }

    public static void reportMoreProduced(long j10) {
        mu.a.onError(new qt.g(o2.m(j10, "More produced than requested: ")));
    }

    public static void reportSubscriptionSet() {
        mu.a.onError(new qt.g("Subscription already set!"));
    }

    public static boolean set(AtomicReference<tw.d> atomicReference, tw.d dVar) {
        while (true) {
            tw.d dVar2 = atomicReference.get();
            if (dVar2 == f59176b) {
                if (dVar == null) {
                    return false;
                }
                dVar.cancel();
                return false;
            }
            while (!atomicReference.compareAndSet(dVar2, dVar)) {
                if (atomicReference.get() != dVar2) {
                    break;
                }
            }
            if (dVar2 == null) {
                return true;
            }
            dVar2.cancel();
            return true;
        }
    }

    public static boolean setOnce(AtomicReference<tw.d> atomicReference, tw.d dVar) {
        o0.requireNonNull(dVar, "s is null");
        while (!atomicReference.compareAndSet(null, dVar)) {
            if (atomicReference.get() != null) {
                dVar.cancel();
                if (atomicReference.get() == f59176b) {
                    return false;
                }
                reportSubscriptionSet();
                return false;
            }
        }
        return true;
    }

    public static boolean validate(tw.d dVar, tw.d dVar2) {
        if (dVar2 == null) {
            mu.a.onError(new NullPointerException("next is null"));
            return false;
        }
        if (dVar == null) {
            return true;
        }
        dVar2.cancel();
        reportSubscriptionSet();
        return false;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f59177c.clone();
    }

    @Override // tw.d
    public void cancel() {
    }

    public static boolean cancel(AtomicReference<tw.d> atomicReference) {
        tw.d andSet;
        tw.d dVar = atomicReference.get();
        g gVar = f59176b;
        if (dVar == gVar || (andSet = atomicReference.getAndSet(gVar)) == gVar) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static boolean validate(long j10) {
        if (j10 > 0) {
            return true;
        }
        mu.a.onError(new IllegalArgumentException(o2.m(j10, "n > 0 required but it was ")));
        return false;
    }

    public static boolean setOnce(AtomicReference<tw.d> atomicReference, tw.d dVar, long j10) {
        if (!setOnce(atomicReference, dVar)) {
            return false;
        }
        dVar.request(j10);
        return true;
    }

    @Override // tw.d
    public void request(long j10) {
    }
}
