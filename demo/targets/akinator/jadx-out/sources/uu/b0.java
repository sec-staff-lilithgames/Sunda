package uu;

import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b0 extends g implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float[] f88705b;

    public b0(float[] fArr) {
        this.f88705b = fArr;
    }

    @Override // uu.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Float) {
            return contains(((Number) obj).floatValue());
        }
        return false;
    }

    @Override // uu.g, uu.a
    public int getSize() {
        return this.f88705b.length;
    }

    @Override // uu.g, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Float) {
            return indexOf(((Number) obj).floatValue());
        }
        return -1;
    }

    @Override // uu.a, java.util.Collection
    public boolean isEmpty() {
        return this.f88705b.length == 0;
    }

    @Override // uu.g, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Float) {
            return lastIndexOf(((Number) obj).floatValue());
        }
        return -1;
    }

    public boolean contains(float f10) {
        for (float f11 : this.f88705b) {
            if (Float.floatToIntBits(f11) == Float.floatToIntBits(f10)) {
                return true;
            }
        }
        return false;
    }

    @Override // uu.g, java.util.List
    public Float get(int i10) {
        return Float.valueOf(this.f88705b[i10]);
    }

    public int indexOf(float f10) {
        float[] fArr = this.f88705b;
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (Float.floatToIntBits(fArr[i10]) == Float.floatToIntBits(f10)) {
                return i10;
            }
        }
        return -1;
    }

    public int lastIndexOf(float f10) {
        float[] fArr = this.f88705b;
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (Float.floatToIntBits(fArr[length]) == Float.floatToIntBits(f10)) {
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
