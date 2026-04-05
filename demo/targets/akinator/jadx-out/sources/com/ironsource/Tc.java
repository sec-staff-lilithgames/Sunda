package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Tc {

    /* renamed from: a, reason: collision with root package name */
    private final String f35499a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35500b;

    public Tc(String url, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        this.f35499a = url;
        this.f35500b = str;
    }

    public final String a() {
        return this.f35499a;
    }

    public final String b() {
        return this.f35500b;
    }

    public final String c() {
        return this.f35500b;
    }

    public final String d() {
        return this.f35499a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tc)) {
            return false;
        }
        Tc tc2 = (Tc) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f35499a, tc2.f35499a) && kotlin.jvm.internal.e0.areEqual(this.f35500b, tc2.f35500b);
    }

    public int hashCode() {
        int iHashCode = this.f35499a.hashCode() * 31;
        String str = this.f35500b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return e3.g.l("OpenUrl(url=", this.f35499a, ", packageName=", this.f35500b, ")");
    }

    public /* synthetic */ Tc(String str, String str2, int i10, kotlin.jvm.internal.u uVar) {
        this(str, (i10 & 2) != 0 ? "" : str2);
    }

    public final Tc a(String url, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        return new Tc(url, str);
    }

    public static /* synthetic */ Tc a(Tc tc2, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = tc2.f35499a;
        }
        if ((i10 & 2) != 0) {
            str2 = tc2.f35500b;
        }
        return tc2.a(str, str2);
    }
}
