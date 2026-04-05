package uu;

import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c0 extends g implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double[] f88707b;

    public c0(double[] dArr) {
        this.f88707b = dArr;
    }

    @Override // uu.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Double) {
            return contains(((Number) obj).doubleValue());
        }
        return false;
    }

    @Override // uu.g, uu.a
    public int getSize() {
        return this.f88707b.length;
    }

    @Override // uu.g, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Double) {
            return indexOf(((Number) obj).doubleValue());
        }
        return -1;
    }

    @Override // uu.a, java.util.Collection
    public boolean isEmpty() {
        return this.f88707b.length == 0;
    }

    @Override // uu.g, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Double) {
            return lastIndexOf(((Number) obj).doubleValue());
        }
        return -1;
    }

    public boolean contains(double d10) {
        for (double d11 : this.f88707b) {
            if (Double.doubleToLongBits(d11) == Double.doubleToLongBits(d10)) {
                return true;
            }
        }
        return false;
    }

    @Override // uu.g, java.util.List
    public Double get(int i10) {
        return Double.valueOf(this.f88707b[i10]);
    }

    public int indexOf(double d10) {
        double[] dArr = this.f88707b;
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (Double.doubleToLongBits(dArr[i10]) == Double.doubleToLongBits(d10)) {
                return i10;
            }
        }
        return -1;
    }

    public int lastIndexOf(double d10) {
        double[] dArr = this.f88707b;
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (Double.doubleToLongBits(dArr[length]) == Double.doubleToLongBits(d10)) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }
}
