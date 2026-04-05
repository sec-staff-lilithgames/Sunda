package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f90946a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f90947b;

    public h(String str, Object obj) {
        this.f90946a = str;
        this.f90947b = obj;
    }

    public static <T> h create(String str) {
        mh.p1.checkNotNull(str, "debugString");
        return new h(str, null);
    }

    public static <T> h createWithDefault(String str, T t10) {
        mh.p1.checkNotNull(str, "debugString");
        return new h(str, t10);
    }

    @Deprecated
    public static <T> h of(String str, T t10) {
        mh.p1.checkNotNull(str, "debugString");
        return new h(str, t10);
    }

    public Object getDefault() {
        return this.f90947b;
    }

    public String toString() {
        return this.f90946a;
    }
}
