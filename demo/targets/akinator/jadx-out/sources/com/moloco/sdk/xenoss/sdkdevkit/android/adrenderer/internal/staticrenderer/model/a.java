package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model;

import e3.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f48303a;

    /* renamed from: b, reason: collision with root package name */
    public final int f48304b;

    /* renamed from: c, reason: collision with root package name */
    public final int f48305c;

    /* renamed from: d, reason: collision with root package name */
    public final int f48306d;

    /* renamed from: e, reason: collision with root package name */
    public final int f48307e;

    /* renamed from: f, reason: collision with root package name */
    public final int f48308f;

    public a(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f48303a = i10;
        this.f48304b = i11;
        this.f48305c = i12;
        this.f48306d = i13;
        this.f48307e = i14;
        this.f48308f = i15;
    }

    public final int a() {
        return this.f48303a;
    }

    public final int b() {
        return this.f48304b;
    }

    public final int c() {
        return this.f48305c;
    }

    public final int d() {
        return this.f48306d;
    }

    public final int e() {
        return this.f48307e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f48303a == aVar.f48303a && this.f48304b == aVar.f48304b && this.f48305c == aVar.f48305c && this.f48306d == aVar.f48306d && this.f48307e == aVar.f48307e && this.f48308f == aVar.f48308f;
    }

    public final int f() {
        return this.f48308f;
    }

    public final int g() {
        return this.f48307e;
    }

    public final int h() {
        return this.f48308f;
    }

    public int hashCode() {
        return Integer.hashCode(this.f48308f) + g.d(this.f48307e, g.d(this.f48306d, g.d(this.f48305c, g.d(this.f48304b, Integer.hashCode(this.f48303a) * 31, 31), 31), 31), 31);
    }

    public final int i() {
        return this.f48303a;
    }

    public final int j() {
        return this.f48304b;
    }

    public final int k() {
        return this.f48305c;
    }

    public final int l() {
        return this.f48306d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdTouch(viewPositionX=");
        sb2.append(this.f48303a);
        sb2.append(", viewPositionY=");
        sb2.append(this.f48304b);
        sb2.append(", viewSizeHeight=");
        sb2.append(this.f48305c);
        sb2.append(", viewSizeWidth=");
        sb2.append(this.f48306d);
        sb2.append(", touchX=");
        sb2.append(this.f48307e);
        sb2.append(", touchY=");
        return g.m(sb2, this.f48308f, ')');
    }

    public final a a(int i10, int i11, int i12, int i13, int i14, int i15) {
        return new a(i10, i11, i12, i13, i14, i15);
    }

    public static /* synthetic */ a a(a aVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i10 = aVar.f48303a;
        }
        if ((i16 & 2) != 0) {
            i11 = aVar.f48304b;
        }
        if ((i16 & 4) != 0) {
            i12 = aVar.f48305c;
        }
        if ((i16 & 8) != 0) {
            i13 = aVar.f48306d;
        }
        if ((i16 & 16) != 0) {
            i14 = aVar.f48307e;
        }
        if ((i16 & 32) != 0) {
            i15 = aVar.f48308f;
        }
        int i17 = i14;
        int i18 = i15;
        return aVar.a(i10, i11, i12, i13, i17, i18);
    }
}
