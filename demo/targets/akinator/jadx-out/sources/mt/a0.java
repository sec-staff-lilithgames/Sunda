package mt;

import com.ironsource.C3191e4;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f74909b = new a0(null);

    /* renamed from: a, reason: collision with root package name */
    public final Object f74910a;

    public a0(Object obj) {
        this.f74910a = obj;
    }

    public static <T> a0 createOnComplete() {
        return f74909b;
    }

    public static <T> a0 createOnError(Throwable th2) {
        ut.o0.requireNonNull(th2, "error is null");
        return new a0(iu.u.error(th2));
    }

    public static <T> a0 createOnNext(T t10) {
        ut.o0.requireNonNull(t10, "value is null");
        return new a0(t10);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a0) {
            return ut.o0.equals(this.f74910a, ((a0) obj).f74910a);
        }
        return false;
    }

    public Throwable getError() {
        Object obj = this.f74910a;
        if (iu.u.isError(obj)) {
            return iu.u.getError(obj);
        }
        return null;
    }

    public Object getValue() {
        Object obj = this.f74910a;
        if (obj == null || iu.u.isError(obj)) {
            return null;
        }
        return obj;
    }

    public int hashCode() {
        Object obj = this.f74910a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean isOnComplete() {
        return this.f74910a == null;
    }

    public boolean isOnError() {
        return iu.u.isError(this.f74910a);
    }

    public boolean isOnNext() {
        Object obj = this.f74910a;
        return (obj == null || iu.u.isError(obj)) ? false : true;
    }

    public String toString() {
        Object obj = this.f74910a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (!iu.u.isError(obj)) {
            return o2.k(obj, "OnNextNotification[", C3191e4.i.f36531e);
        }
        return "OnErrorNotification[" + iu.u.getError(obj) + C3191e4.i.f36531e;
    }
}
