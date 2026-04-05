package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class L3 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f31985a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31986b;

    public L3(String str, boolean z10) {
        this.f31985a = z10;
        this.f31986b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L3)) {
            return false;
        }
        L3 l32 = (L3) obj;
        return this.f31985a == l32.f31985a && kotlin.jvm.internal.e0.areEqual(this.f31986b, l32.f31986b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z10 = this.f31985a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        String str = this.f31986b;
        return i10 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlayStoreSnapshot(disabled=");
        sb2.append(this.f31985a);
        sb2.append(", version=");
        return AbstractC2962r0.a(sb2, this.f31986b, ')');
    }
}
