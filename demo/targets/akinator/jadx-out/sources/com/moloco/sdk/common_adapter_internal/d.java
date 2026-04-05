package com.moloco.sdk.common_adapter_internal;

import b0.e2;
import e3.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f45701a;

    /* renamed from: b, reason: collision with root package name */
    public final int f45702b;

    /* renamed from: c, reason: collision with root package name */
    public final float f45703c;

    /* renamed from: d, reason: collision with root package name */
    public final float f45704d;

    /* renamed from: e, reason: collision with root package name */
    public final int f45705e;

    /* renamed from: f, reason: collision with root package name */
    public final float f45706f;

    public d(int i10, int i11, float f10, float f11, int i12, float f12) {
        this.f45701a = i10;
        this.f45702b = i11;
        this.f45703c = f10;
        this.f45704d = f11;
        this.f45705e = i12;
        this.f45706f = f12;
    }

    public static /* synthetic */ d copy$default(d dVar, int i10, int i11, float f10, float f11, int i12, float f12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = dVar.f45701a;
        }
        if ((i13 & 2) != 0) {
            i11 = dVar.f45702b;
        }
        if ((i13 & 4) != 0) {
            f10 = dVar.f45703c;
        }
        if ((i13 & 8) != 0) {
            f11 = dVar.f45704d;
        }
        if ((i13 & 16) != 0) {
            i12 = dVar.f45705e;
        }
        if ((i13 & 32) != 0) {
            f12 = dVar.f45706f;
        }
        int i14 = i12;
        float f13 = f12;
        return dVar.copy(i10, i11, f10, f11, i14, f13);
    }

    public final int component1() {
        return this.f45701a;
    }

    public final int component2() {
        return this.f45702b;
    }

    public final float component3() {
        return this.f45703c;
    }

    public final float component4() {
        return this.f45704d;
    }

    public final int component5() {
        return this.f45705e;
    }

    public final float component6() {
        return this.f45706f;
    }

    public final d copy(int i10, int i11, float f10, float f11, int i12, float f12) {
        return new d(i10, i11, f10, f11, i12, f12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f45701a == dVar.f45701a && this.f45702b == dVar.f45702b && Float.compare(this.f45703c, dVar.f45703c) == 0 && Float.compare(this.f45704d, dVar.f45704d) == 0 && this.f45705e == dVar.f45705e && Float.compare(this.f45706f, dVar.f45706f) == 0;
    }

    public final int getDpi() {
        return this.f45705e;
    }

    public final float getHeightDp() {
        return this.f45704d;
    }

    public final int getHeightPx() {
        return this.f45702b;
    }

    public final float getPxRatio() {
        return this.f45706f;
    }

    public final float getWidthDp() {
        return this.f45703c;
    }

    public final int getWidthPx() {
        return this.f45701a;
    }

    public int hashCode() {
        return Float.hashCode(this.f45706f) + g.d(this.f45705e, e2.b(this.f45704d, e2.b(this.f45703c, g.d(this.f45702b, Integer.hashCode(this.f45701a) * 31, 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ScreenData(widthPx=");
        sb2.append(this.f45701a);
        sb2.append(", heightPx=");
        sb2.append(this.f45702b);
        sb2.append(", widthDp=");
        sb2.append(this.f45703c);
        sb2.append(", heightDp=");
        sb2.append(this.f45704d);
        sb2.append(", dpi=");
        sb2.append(this.f45705e);
        sb2.append(", pxRatio=");
        return a.b.n(sb2, this.f45706f, ')');
    }
}
