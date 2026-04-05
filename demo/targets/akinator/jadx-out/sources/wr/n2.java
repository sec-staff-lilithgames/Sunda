package wr;

import ao.kwoC.zAQQWzBxnS;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n2 {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicLong f91062d = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final String f91063a;

    /* renamed from: b, reason: collision with root package name */
    public final String f91064b;

    /* renamed from: c, reason: collision with root package name */
    public final long f91065c;

    public n2(String str, String str2, long j10) {
        mh.p1.checkNotNull(str, "typeName");
        mh.p1.checkArgument(!str.isEmpty(), "empty type");
        this.f91063a = str;
        this.f91064b = str2;
        this.f91065c = j10;
    }

    public static n2 allocate(String str, String str2) {
        return new n2(str, str2, f91062d.incrementAndGet());
    }

    public String getDetails() {
        return this.f91064b;
    }

    public long getId() {
        return this.f91065c;
    }

    public String getTypeName() {
        return this.f91063a;
    }

    public String shortName() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f91063a);
        sb2.append("<");
        return a.b.g(this.f91065c, ">", sb2);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(shortName());
        String str = this.f91064b;
        if (str != null) {
            sb2.append(": (");
            sb2.append(str);
            sb2.append(')');
        }
        return sb2.toString();
    }

    public static n2 allocate(Class<?> cls, String str) {
        String simpleName = ((Class) mh.p1.checkNotNull(cls, zAQQWzBxnS.JXHpzRidNcylp)).getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return allocate(simpleName, str);
    }
}
