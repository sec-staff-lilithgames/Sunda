package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f47983a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f47984b;

    /* renamed from: c, reason: collision with root package name */
    public final double f47985c;

    /* renamed from: d, reason: collision with root package name */
    public final int f47986d;

    public j(int i10, boolean z10, double d10, int i11) {
        this.f47983a = i10;
        this.f47984b = z10;
        this.f47985c = d10;
        this.f47986d = i11;
    }

    public final int a() {
        return this.f47983a;
    }

    public final boolean b() {
        return this.f47984b;
    }

    public final double c() {
        return this.f47985c;
    }

    public final int d() {
        return this.f47986d;
    }

    public final int e() {
        return this.f47983a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f47983a == jVar.f47983a && this.f47984b == jVar.f47984b && Double.compare(this.f47985c, jVar.f47985c) == 0 && this.f47986d == jVar.f47986d;
    }

    public final int f() {
        return this.f47986d;
    }

    public final double g() {
        return this.f47985c;
    }

    public final boolean h() {
        return this.f47984b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f47986d) + ((Double.hashCode(this.f47985c) + com.google.android.gms.internal.play_billing.a.c(Integer.hashCode(this.f47983a) * 31, 31, this.f47984b)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MediaConfig(chunkSize=");
        sb2.append(this.f47983a);
        sb2.append(", isStreamingEnabled=");
        sb2.append(this.f47984b);
        sb2.append(", minStreamingPlayableDurationOnTimeoutSecs=");
        sb2.append(this.f47985c);
        sb2.append(", mediaCacheDiskCleanUpLimit=");
        return e3.g.m(sb2, this.f47986d, ')');
    }

    public final j a(int i10, boolean z10, double d10, int i11) {
        return new j(i10, z10, d10, i11);
    }

    public static /* synthetic */ j a(j jVar, int i10, boolean z10, double d10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = jVar.f47983a;
        }
        if ((i12 & 2) != 0) {
            z10 = jVar.f47984b;
        }
        if ((i12 & 4) != 0) {
            d10 = jVar.f47985c;
        }
        if ((i12 & 8) != 0) {
            i11 = jVar.f47986d;
        }
        int i13 = i11;
        return jVar.a(i10, z10, d10, i13);
    }
}
