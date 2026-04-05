package com.google.android.exoplayer2;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public final bf.d0 f28764a;

    /* renamed from: b, reason: collision with root package name */
    public final long f28765b;

    /* renamed from: c, reason: collision with root package name */
    public final long f28766c;

    /* renamed from: d, reason: collision with root package name */
    public final long f28767d;

    /* renamed from: e, reason: collision with root package name */
    public final long f28768e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f28769f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f28770g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f28771h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f28772i;

    public y1(bf.d0 d0Var, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = true;
        com.google.android.exoplayer2.util.a.checkArgument(!z13 || z11);
        com.google.android.exoplayer2.util.a.checkArgument(!z12 || z11);
        if (z10 && (z11 || z12 || z13)) {
            z14 = false;
        }
        com.google.android.exoplayer2.util.a.checkArgument(z14);
        this.f28764a = d0Var;
        this.f28765b = j10;
        this.f28766c = j11;
        this.f28767d = j12;
        this.f28768e = j13;
        this.f28769f = z10;
        this.f28770g = z11;
        this.f28771h = z12;
        this.f28772i = z13;
    }

    public y1 copyWithRequestedContentPositionUs(long j10) {
        if (j10 == this.f28766c) {
            return this;
        }
        return new y1(this.f28764a, this.f28765b, j10, this.f28767d, this.f28768e, this.f28769f, this.f28770g, this.f28771h, this.f28772i);
    }

    public y1 copyWithStartPositionUs(long j10) {
        if (j10 == this.f28765b) {
            return this;
        }
        return new y1(this.f28764a, j10, this.f28766c, this.f28767d, this.f28768e, this.f28769f, this.f28770g, this.f28771h, this.f28772i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y1.class == obj.getClass()) {
            y1 y1Var = (y1) obj;
            if (this.f28765b == y1Var.f28765b && this.f28766c == y1Var.f28766c && this.f28767d == y1Var.f28767d && this.f28768e == y1Var.f28768e && this.f28769f == y1Var.f28769f && this.f28770g == y1Var.f28770g && this.f28771h == y1Var.f28771h && this.f28772i == y1Var.f28772i && com.google.android.exoplayer2.util.n1.areEqual(this.f28764a, y1Var.f28764a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((this.f28764a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.f28765b)) * 31) + ((int) this.f28766c)) * 31) + ((int) this.f28767d)) * 31) + ((int) this.f28768e)) * 31) + (this.f28769f ? 1 : 0)) * 31) + (this.f28770g ? 1 : 0)) * 31) + (this.f28771h ? 1 : 0)) * 31) + (this.f28772i ? 1 : 0);
    }
}
