package com.moloco.sdk.internal.services.bidtoken;

import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f46857a;

    /* renamed from: b, reason: collision with root package name */
    public final String f46858b;

    /* renamed from: c, reason: collision with root package name */
    public final g f46859c;

    public l(String bidToken, String publicKey, g bidTokenConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bidToken, "bidToken");
        kotlin.jvm.internal.e0.checkNotNullParameter(publicKey, "publicKey");
        kotlin.jvm.internal.e0.checkNotNullParameter(bidTokenConfig, "bidTokenConfig");
        this.f46857a = bidToken;
        this.f46858b = publicKey;
        this.f46859c = bidTokenConfig;
    }

    public final String a() {
        return this.f46857a;
    }

    public final String b() {
        return this.f46858b;
    }

    public final g c() {
        return this.f46859c;
    }

    public final String d() {
        return this.f46857a;
    }

    public final g e() {
        return this.f46859c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f46857a, lVar.f46857a) && kotlin.jvm.internal.e0.areEqual(this.f46858b, lVar.f46858b) && kotlin.jvm.internal.e0.areEqual(this.f46859c, lVar.f46859c);
    }

    public final String f() {
        return this.f46858b;
    }

    public int hashCode() {
        return this.f46859c.hashCode() + o2.e(this.f46857a.hashCode() * 31, 31, this.f46858b);
    }

    public String toString() {
        return "BidTokenResponseComponents(bidToken=" + this.f46857a + ", publicKey=" + this.f46858b + ", bidTokenConfig=" + this.f46859c + ')';
    }

    public final l a(String bidToken, String publicKey, g bidTokenConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bidToken, "bidToken");
        kotlin.jvm.internal.e0.checkNotNullParameter(publicKey, "publicKey");
        kotlin.jvm.internal.e0.checkNotNullParameter(bidTokenConfig, "bidTokenConfig");
        return new l(bidToken, publicKey, bidTokenConfig);
    }

    public static /* synthetic */ l a(l lVar, String str, String str2, g gVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = lVar.f46857a;
        }
        if ((i10 & 2) != 0) {
            str2 = lVar.f46858b;
        }
        if ((i10 & 4) != 0) {
            gVar = lVar.f46859c;
        }
        return lVar.a(str, str2, gVar);
    }
}
