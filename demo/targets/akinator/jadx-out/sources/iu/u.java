package iu;

import mt.i0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public static final u f68424b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ u[] f68425c;

    static {
        u uVar = new u("COMPLETE", 0);
        f68424b = uVar;
        f68425c = new u[]{uVar};
    }

    public static <T> boolean accept(Object obj, tw.c cVar) {
        if (obj == f68424b) {
            cVar.onComplete();
            return true;
        }
        if (obj instanceof s) {
            cVar.onError(((s) obj).f68422b);
            return true;
        }
        cVar.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, tw.c cVar) {
        if (obj == f68424b) {
            cVar.onComplete();
            return true;
        }
        if (obj instanceof s) {
            cVar.onError(((s) obj).f68422b);
            return true;
        }
        if (obj instanceof t) {
            cVar.onSubscribe(((t) obj).f68423b);
            return false;
        }
        cVar.onNext(obj);
        return false;
    }

    public static Object complete() {
        return f68424b;
    }

    public static Object disposable(pt.c cVar) {
        return new r(cVar);
    }

    public static Object error(Throwable th2) {
        return new s(th2);
    }

    public static pt.c getDisposable(Object obj) {
        return ((r) obj).f68421b;
    }

    public static Throwable getError(Object obj) {
        return ((s) obj).f68422b;
    }

    public static tw.d getSubscription(Object obj) {
        return ((t) obj).f68423b;
    }

    public static boolean isComplete(Object obj) {
        return obj == f68424b;
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof r;
    }

    public static boolean isError(Object obj) {
        return obj instanceof s;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof t;
    }

    public static Object subscription(tw.d dVar) {
        return new t(dVar);
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f68425c.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }

    public static <T> boolean accept(Object obj, i0 i0Var) {
        if (obj == f68424b) {
            i0Var.onComplete();
            return true;
        }
        if (obj instanceof s) {
            i0Var.onError(((s) obj).f68422b);
            return true;
        }
        i0Var.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, i0 i0Var) {
        if (obj == f68424b) {
            i0Var.onComplete();
            return true;
        }
        if (obj instanceof s) {
            i0Var.onError(((s) obj).f68422b);
            return true;
        }
        if (obj instanceof r) {
            i0Var.onSubscribe(((r) obj).f68421b);
            return false;
        }
        i0Var.onNext(obj);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static <T> Object next(T t10) {
        return t10;
    }
}
