package com.explorestack.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d6 extends e implements r7, RandomAccess, ga {

    /* renamed from: f, reason: collision with root package name */
    public static final d6 f22052f;

    /* renamed from: c, reason: collision with root package name */
    public float[] f22053c;

    /* renamed from: e, reason: collision with root package name */
    public int f22054e;

    static {
        d6 d6Var = new d6(new float[0], 0);
        f22052f = d6Var;
        d6Var.makeImmutable();
    }

    public d6(float[] fArr, int i10) {
        this.f22053c = fArr;
        this.f22054e = i10;
    }

    public static d6 emptyList() {
        return f22052f;
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        c();
        Charset charset = x7.f22881a;
        collection.getClass();
        if (!(collection instanceof d6)) {
            return super.addAll(collection);
        }
        d6 d6Var = (d6) collection;
        int i10 = d6Var.f22054e;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f22054e;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f22053c;
        if (i12 > fArr.length) {
            this.f22053c = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(d6Var.f22053c, 0, this.f22053c, this.f22054e, d6Var.f22054e);
        this.f22054e = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.explorestack.protobuf.r7
    public void addFloat(float f10) {
        c();
        int i10 = this.f22054e;
        float[] fArr = this.f22053c;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[a.b.a(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f22053c = fArr2;
        }
        float[] fArr3 = this.f22053c;
        int i11 = this.f22054e;
        this.f22054e = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i10) {
        if (i10 < 0 || i10 >= this.f22054e) {
            StringBuilder sbT = p0.o2.t(i10, "Index:", ", Size:");
            sbT.append(this.f22054e);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6)) {
            return super.equals(obj);
        }
        d6 d6Var = (d6) obj;
        if (this.f22054e != d6Var.f22054e) {
            return false;
        }
        float[] fArr = d6Var.f22053c;
        for (int i10 = 0; i10 < this.f22054e; i10++) {
            if (Float.floatToIntBits(this.f22053c[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.explorestack.protobuf.r7
    public float getFloat(int i10) {
        d(i10);
        return this.f22053c[i10];
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f22054e; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f22053c[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f22053c[i10] == fFloatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f22053c;
        System.arraycopy(fArr, i11, fArr, i10, this.f22054e - i11);
        this.f22054e -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.explorestack.protobuf.r7
    public float setFloat(int i10, float f10) {
        c();
        d(i10);
        float[] fArr = this.f22053c;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f22054e;
    }

    @Override // java.util.AbstractList, java.util.List
    public Float get(int i10) {
        return Float.valueOf(getFloat(i10));
    }

    @Override // com.explorestack.protobuf.e, com.explorestack.protobuf.w7, com.explorestack.protobuf.r7
    public r7 mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f22054e) {
            return new d6(Arrays.copyOf(this.f22053c, i10), this.f22054e);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.List
    public Float remove(int i10) {
        c();
        d(i10);
        float[] fArr = this.f22053c;
        float f10 = fArr[i10];
        if (i10 < this.f22054e - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f22054e--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.List
    public Float set(int i10, Float f10) {
        return Float.valueOf(setFloat(i10, f10.floatValue()));
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Float f10) {
        addFloat(f10.floatValue());
        return true;
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.List
    public void add(int i10, Float f10) {
        int i11;
        float fFloatValue = f10.floatValue();
        c();
        if (i10 >= 0 && i10 <= (i11 = this.f22054e)) {
            float[] fArr = this.f22053c;
            if (i11 < fArr.length) {
                System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
            } else {
                float[] fArr2 = new float[a.b.a(i11, 3, 2, 1)];
                System.arraycopy(fArr, 0, fArr2, 0, i10);
                System.arraycopy(this.f22053c, i10, fArr2, i10 + 1, this.f22054e - i10);
                this.f22053c = fArr2;
            }
            this.f22053c[i10] = fFloatValue;
            this.f22054e++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbT = p0.o2.t(i10, "Index:", ", Size:");
        sbT.append(this.f22054e);
        throw new IndexOutOfBoundsException(sbT.toString());
    }
}
