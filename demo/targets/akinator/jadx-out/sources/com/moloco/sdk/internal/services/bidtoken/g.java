package com.moloco.sdk.internal.services.bidtoken;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f46838a;

    public g(boolean z10) {
        this.f46838a = z10;
    }

    public final boolean a() {
        return this.f46838a;
    }

    public final boolean b() {
        return this.f46838a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f46838a == ((g) obj).f46838a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f46838a);
    }

    public String toString() {
        return a.b.p(new StringBuilder("BidTokenConfig(dbtEnabled="), this.f46838a, ')');
    }

    public final g a(boolean z10) {
        return new g(z10);
    }

    public static /* synthetic */ g a(g gVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = gVar.f46838a;
        }
        return gVar.a(z10);
    }
}
