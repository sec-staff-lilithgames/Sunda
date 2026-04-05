package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f91220a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f91221b;

    public z2(String str, Object obj) {
        this.f91220a = str;
        this.f91221b = obj;
    }

    public static <T> z2 create(String str) {
        mh.p1.checkNotNull(str, "debugString");
        return new z2(str, null);
    }

    public static <T> z2 createWithDefault(String str, T t10) {
        mh.p1.checkNotNull(str, "debugString");
        return new z2(str, t10);
    }

    public Object getDefault() {
        return this.f91221b;
    }

    public String toString() {
        return this.f91220a;
    }
}
