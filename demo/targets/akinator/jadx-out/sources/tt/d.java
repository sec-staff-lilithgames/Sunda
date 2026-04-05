package tt;

import java.util.concurrent.atomic.AtomicReference;
import ut.o0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d implements pt.c {

    /* renamed from: b, reason: collision with root package name */
    public static final d f87352b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d[] f87353c;

    static {
        d dVar = new d("DISPOSED", 0);
        f87352b = dVar;
        f87353c = new d[]{dVar};
    }

    public static boolean dispose(AtomicReference<pt.c> atomicReference) {
        pt.c andSet;
        pt.c cVar = atomicReference.get();
        d dVar = f87352b;
        if (cVar == dVar || (andSet = atomicReference.getAndSet(dVar)) == dVar) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    public static boolean isDisposed(pt.c cVar) {
        return cVar == f87352b;
    }

    public static boolean replace(AtomicReference<pt.c> atomicReference, pt.c cVar) {
        while (true) {
            pt.c cVar2 = atomicReference.get();
            if (cVar2 == f87352b) {
                if (cVar == null) {
                    return false;
                }
                cVar.dispose();
                return false;
            }
            while (!atomicReference.compareAndSet(cVar2, cVar)) {
                if (atomicReference.get() != cVar2) {
                    break;
                }
            }
            return true;
        }
    }

    public static void reportDisposableSet() {
        mu.a.onError(new qt.g("Disposable already set!"));
    }

    public static boolean set(AtomicReference<pt.c> atomicReference, pt.c cVar) {
        while (true) {
            pt.c cVar2 = atomicReference.get();
            if (cVar2 == f87352b) {
                if (cVar == null) {
                    return false;
                }
                cVar.dispose();
                return false;
            }
            while (!atomicReference.compareAndSet(cVar2, cVar)) {
                if (atomicReference.get() != cVar2) {
                    break;
                }
            }
            if (cVar2 == null) {
                return true;
            }
            cVar2.dispose();
            return true;
        }
    }

    public static boolean setOnce(AtomicReference<pt.c> atomicReference, pt.c cVar) {
        o0.requireNonNull(cVar, "d is null");
        while (!atomicReference.compareAndSet(null, cVar)) {
            if (atomicReference.get() != null) {
                cVar.dispose();
                if (atomicReference.get() == f87352b) {
                    return false;
                }
                reportDisposableSet();
                return false;
            }
        }
        return true;
    }

    public static boolean trySet(AtomicReference<pt.c> atomicReference, pt.c cVar) {
        while (!atomicReference.compareAndSet(null, cVar)) {
            if (atomicReference.get() != null) {
                if (atomicReference.get() != f87352b) {
                    return false;
                }
                cVar.dispose();
                return false;
            }
        }
        return true;
    }

    public static boolean validate(pt.c cVar, pt.c cVar2) {
        if (cVar2 == null) {
            mu.a.onError(new NullPointerException("next is null"));
            return false;
        }
        if (cVar == null) {
            return true;
        }
        cVar2.dispose();
        reportDisposableSet();
        return false;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f87353c.clone();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return true;
    }

    @Override // pt.c
    public void dispose() {
    }
}
