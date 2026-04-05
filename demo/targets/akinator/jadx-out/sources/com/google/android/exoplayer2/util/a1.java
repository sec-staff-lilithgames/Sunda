package com.google.android.exoplayer2.util;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a1 {

    /* renamed from: c, reason: collision with root package name */
    public static final a1 f28409c = new a1(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f28410a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28411b;

    static {
        new a1(0, 0);
    }

    public a1(int i10, int i11) {
        a.checkArgument((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.f28410a = i10;
        this.f28411b = i11;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof a1) {
            a1 a1Var = (a1) obj;
            if (this.f28410a == a1Var.f28410a && this.f28411b == a1Var.f28411b) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.f28411b;
    }

    public int getWidth() {
        return this.f28410a;
    }

    public int hashCode() {
        int i10 = this.f28410a;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f28411b;
    }

    public String toString() {
        return this.f28410a + "x" + this.f28411b;
    }
}
