package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class R9 {

    /* renamed from: a, reason: collision with root package name */
    private final String f35397a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35398b;

    public R9(String advId, String advIdType) {
        kotlin.jvm.internal.e0.checkNotNullParameter(advId, "advId");
        kotlin.jvm.internal.e0.checkNotNullParameter(advIdType, "advIdType");
        this.f35397a = advId;
        this.f35398b = advIdType;
    }

    public final String a() {
        return this.f35397a;
    }

    public final String b() {
        return this.f35398b;
    }

    public final String c() {
        return this.f35397a;
    }

    public final String d() {
        return this.f35398b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R9)) {
            return false;
        }
        R9 r92 = (R9) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f35397a, r92.f35397a) && kotlin.jvm.internal.e0.areEqual(this.f35398b, r92.f35398b);
    }

    public int hashCode() {
        return this.f35398b.hashCode() + (this.f35397a.hashCode() * 31);
    }

    public String toString() {
        return e3.g.l("IronSourceAdvId(advId=", this.f35397a, ", advIdType=", this.f35398b, ")");
    }

    public final R9 a(String advId, String advIdType) {
        kotlin.jvm.internal.e0.checkNotNullParameter(advId, "advId");
        kotlin.jvm.internal.e0.checkNotNullParameter(advIdType, "advIdType");
        return new R9(advId, advIdType);
    }

    public static /* synthetic */ R9 a(R9 r92, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = r92.f35397a;
        }
        if ((i10 & 2) != 0) {
            str2 = r92.f35398b;
        }
        return r92.a(str, str2);
    }
}
