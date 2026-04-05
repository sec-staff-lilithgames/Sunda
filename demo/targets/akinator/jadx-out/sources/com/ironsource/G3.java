package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class G3 {

    /* renamed from: a, reason: collision with root package name */
    private String f34409a;

    /* renamed from: b, reason: collision with root package name */
    private String f34410b;

    /* renamed from: c, reason: collision with root package name */
    private String f34411c;

    public G3(String cachedAppKey, String cachedUserId, String cachedSettings) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cachedAppKey, "cachedAppKey");
        kotlin.jvm.internal.e0.checkNotNullParameter(cachedUserId, "cachedUserId");
        kotlin.jvm.internal.e0.checkNotNullParameter(cachedSettings, "cachedSettings");
        this.f34409a = cachedAppKey;
        this.f34410b = cachedUserId;
        this.f34411c = cachedSettings;
    }

    public final String a() {
        return this.f34409a;
    }

    public final String b() {
        return this.f34410b;
    }

    public final String c() {
        return this.f34411c;
    }

    public final String d() {
        return this.f34409a;
    }

    public final String e() {
        return this.f34411c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G3)) {
            return false;
        }
        G3 g32 = (G3) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f34409a, g32.f34409a) && kotlin.jvm.internal.e0.areEqual(this.f34410b, g32.f34410b) && kotlin.jvm.internal.e0.areEqual(this.f34411c, g32.f34411c);
    }

    public final String f() {
        return this.f34410b;
    }

    public int hashCode() {
        return this.f34411c.hashCode() + p0.o2.e(this.f34409a.hashCode() * 31, 31, this.f34410b);
    }

    public String toString() {
        String str = this.f34409a;
        String str2 = this.f34410b;
        return j1.o2.o(b3.h.b("CachedResponse(cachedAppKey=", str, ", cachedUserId=", str2, ", cachedSettings="), this.f34411c, ")");
    }

    public final G3 a(String cachedAppKey, String cachedUserId, String cachedSettings) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cachedAppKey, "cachedAppKey");
        kotlin.jvm.internal.e0.checkNotNullParameter(cachedUserId, "cachedUserId");
        kotlin.jvm.internal.e0.checkNotNullParameter(cachedSettings, "cachedSettings");
        return new G3(cachedAppKey, cachedUserId, cachedSettings);
    }

    public final void b(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<set-?>");
        this.f34411c = str;
    }

    public final void c(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<set-?>");
        this.f34410b = str;
    }

    public static /* synthetic */ G3 a(G3 g32, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = g32.f34409a;
        }
        if ((i10 & 2) != 0) {
            str2 = g32.f34410b;
        }
        if ((i10 & 4) != 0) {
            str3 = g32.f34411c;
        }
        return g32.a(str, str2, str3);
    }

    public final void a(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<set-?>");
        this.f34409a = str;
    }
}
