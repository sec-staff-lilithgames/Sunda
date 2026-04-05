package n8;

import j1.o2;
import java.security.MessageDigest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class u {

    /* renamed from: e, reason: collision with root package name */
    public static final s f75851e = new s();

    /* renamed from: a, reason: collision with root package name */
    public final Object f75852a;

    /* renamed from: b, reason: collision with root package name */
    public final t f75853b;

    /* renamed from: c, reason: collision with root package name */
    public final String f75854c;

    /* renamed from: d, reason: collision with root package name */
    public volatile byte[] f75855d;

    public u(String str, Object obj, t tVar) {
        this.f75854c = j9.q.checkNotEmpty(str);
        this.f75852a = obj;
        this.f75853b = (t) j9.q.checkNotNull(tVar);
    }

    public static <T> u disk(String str, t tVar) {
        return new u(str, null, tVar);
    }

    public static <T> u memory(String str) {
        return new u(str, null, f75851e);
    }

    public boolean equals(Object obj) {
        if (obj instanceof u) {
            return this.f75854c.equals(((u) obj).f75854c);
        }
        return false;
    }

    public Object getDefaultValue() {
        return this.f75852a;
    }

    public int hashCode() {
        return this.f75854c.hashCode();
    }

    public String toString() {
        return o2.o(new StringBuilder("Option{key='"), this.f75854c, "'}");
    }

    public void update(Object obj, MessageDigest messageDigest) {
        t tVar = this.f75853b;
        if (this.f75855d == null) {
            this.f75855d = this.f75854c.getBytes(q.f75849a);
        }
        tVar.update(this.f75855d, obj, messageDigest);
    }

    public static <T> u disk(String str, T t10, t tVar) {
        return new u(str, t10, tVar);
    }

    public static <T> u memory(String str, T t10) {
        return new u(str, t10, f75851e);
    }
}
