package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class L2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f31983a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31984b;

    public L2(String url, String accountId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(accountId, "accountId");
        this.f31983a = url;
        this.f31984b = accountId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L2)) {
            return false;
        }
        L2 l22 = (L2) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f31983a, l22.f31983a) && kotlin.jvm.internal.e0.areEqual(this.f31984b, l22.f31984b);
    }

    public final int hashCode() {
        return this.f31984b.hashCode() + (this.f31983a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConfigIdentifier(url=");
        sb2.append(this.f31983a);
        sb2.append(", accountId=");
        return AbstractC2962r0.a(sb2, this.f31984b, ')');
    }
}
