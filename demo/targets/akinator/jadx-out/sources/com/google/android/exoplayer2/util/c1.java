package com.google.android.exoplayer2.util;

import android.view.Surface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final Surface f28432a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28433b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28434c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28435d;

    public c1(Surface surface, int i10, int i11) {
        this(surface, i10, i11, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return this.f28433b == c1Var.f28433b && this.f28434c == c1Var.f28434c && this.f28435d == c1Var.f28435d && this.f28432a.equals(c1Var.f28432a);
    }

    public int hashCode() {
        return (((((this.f28432a.hashCode() * 31) + this.f28433b) * 31) + this.f28434c) * 31) + this.f28435d;
    }

    public c1(Surface surface, int i10, int i11, int i12) {
        a.checkArgument(i12 == 0 || i12 == 90 || i12 == 180 || i12 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.f28432a = surface;
        this.f28433b = i10;
        this.f28434c = i11;
        this.f28435d = i12;
    }
}
