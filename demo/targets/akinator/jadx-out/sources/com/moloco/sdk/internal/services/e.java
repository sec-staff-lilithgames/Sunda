package com.moloco.sdk.internal.services;

import b0.e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f46993a;

    /* renamed from: b, reason: collision with root package name */
    public final float f46994b;

    /* renamed from: c, reason: collision with root package name */
    public final int f46995c;

    /* renamed from: d, reason: collision with root package name */
    public final float f46996d;

    /* renamed from: e, reason: collision with root package name */
    public final float f46997e;

    /* renamed from: f, reason: collision with root package name */
    public final int f46998f;

    /* renamed from: g, reason: collision with root package name */
    public final float f46999g;

    /* renamed from: h, reason: collision with root package name */
    public final float f47000h;

    public e(int i10, float f10, int i11, float f11, float f12, int i12, float f13, float f14) {
        this.f46993a = i10;
        this.f46994b = f10;
        this.f46995c = i11;
        this.f46996d = f11;
        this.f46997e = f12;
        this.f46998f = i12;
        this.f46999g = f13;
        this.f47000h = f14;
    }

    public final int a() {
        return this.f46993a;
    }

    public final float b() {
        return this.f46994b;
    }

    public final int c() {
        return this.f46995c;
    }

    public final float d() {
        return this.f46996d;
    }

    public final float e() {
        return this.f46997e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f46993a == eVar.f46993a && Float.compare(this.f46994b, eVar.f46994b) == 0 && this.f46995c == eVar.f46995c && Float.compare(this.f46996d, eVar.f46996d) == 0 && Float.compare(this.f46997e, eVar.f46997e) == 0 && this.f46998f == eVar.f46998f && Float.compare(this.f46999g, eVar.f46999g) == 0 && Float.compare(this.f47000h, eVar.f47000h) == 0;
    }

    public final int f() {
        return this.f46998f;
    }

    public final float g() {
        return this.f46999g;
    }

    public final float h() {
        return this.f47000h;
    }

    public int hashCode() {
        return Float.hashCode(this.f47000h) + e2.b(this.f46999g, e3.g.d(this.f46998f, e2.b(this.f46997e, e2.b(this.f46996d, e3.g.d(this.f46995c, e2.b(this.f46994b, Integer.hashCode(this.f46993a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final float i() {
        return this.f46997e;
    }

    public final int j() {
        return this.f46998f;
    }

    public final float k() {
        return this.f46996d;
    }

    public final int l() {
        return this.f46995c;
    }

    public final float m() {
        return this.f46994b;
    }

    public final int n() {
        return this.f46993a;
    }

    public final float o() {
        return this.f46999g;
    }

    public final float p() {
        return this.f47000h;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ScreenInfo(screenWidthPx=");
        sb2.append(this.f46993a);
        sb2.append(", screenWidthDp=");
        sb2.append(this.f46994b);
        sb2.append(", screenHeightPx=");
        sb2.append(this.f46995c);
        sb2.append(", screenHeightDp=");
        sb2.append(this.f46996d);
        sb2.append(", density=");
        sb2.append(this.f46997e);
        sb2.append(", dpi=");
        sb2.append(this.f46998f);
        sb2.append(", xdpi=");
        sb2.append(this.f46999g);
        sb2.append(", ydpi=");
        return a.b.n(sb2, this.f47000h, ')');
    }

    public final e a(int i10, float f10, int i11, float f11, float f12, int i12, float f13, float f14) {
        return new e(i10, f10, i11, f11, f12, i12, f13, f14);
    }

    public static /* synthetic */ e a(e eVar, int i10, float f10, int i11, float f11, float f12, int i12, float f13, float f14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = eVar.f46993a;
        }
        if ((i13 & 2) != 0) {
            f10 = eVar.f46994b;
        }
        if ((i13 & 4) != 0) {
            i11 = eVar.f46995c;
        }
        if ((i13 & 8) != 0) {
            f11 = eVar.f46996d;
        }
        if ((i13 & 16) != 0) {
            f12 = eVar.f46997e;
        }
        if ((i13 & 32) != 0) {
            i12 = eVar.f46998f;
        }
        if ((i13 & 64) != 0) {
            f13 = eVar.f46999g;
        }
        if ((i13 & 128) != 0) {
            f14 = eVar.f47000h;
        }
        float f15 = f13;
        float f16 = f14;
        float f17 = f12;
        int i14 = i12;
        return eVar.a(i10, f10, i11, f11, f17, i14, f15, f16);
    }
}
