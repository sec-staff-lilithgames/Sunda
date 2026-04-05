package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class T6 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f32298a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32299b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f32300c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f32301d;

    public T6(boolean z10, String landingScheme, boolean z11, boolean z12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(landingScheme, "landingScheme");
        this.f32298a = z10;
        this.f32299b = landingScheme;
        this.f32300c = z11;
        this.f32301d = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T6)) {
            return false;
        }
        T6 t62 = (T6) obj;
        return this.f32298a == t62.f32298a && kotlin.jvm.internal.e0.areEqual(this.f32299b, t62.f32299b) && this.f32300c == t62.f32300c && this.f32301d == t62.f32301d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
    public final int hashCode() {
        boolean z10 = this.f32298a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int iE = p0.o2.e(r02 * 31, 31, this.f32299b);
        ?? r32 = this.f32300c;
        int i10 = r32;
        if (r32 != 0) {
            i10 = 1;
        }
        int i11 = (iE + i10) * 31;
        boolean z11 = this.f32301d;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LandingPageState(isInAppBrowser=");
        sb2.append(this.f32298a);
        sb2.append(", landingScheme=");
        sb2.append(this.f32299b);
        sb2.append(", isCCTEnabled=");
        sb2.append(this.f32300c);
        sb2.append(", isPartialTabsEnabled=");
        return a.b.p(sb2, this.f32301d, ')');
    }
}
