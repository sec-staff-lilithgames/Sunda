package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q0 extends c implements f1, RandomAccess, n2 {

    /* renamed from: d, reason: collision with root package name */
    public static final q0 f26457d;

    /* renamed from: b, reason: collision with root package name */
    public float[] f26458b;

    /* renamed from: c, reason: collision with root package name */
    public int f26459c;

    static {
        q0 q0Var = new q0(new float[0], 0);
        f26457d = q0Var;
        q0Var.f26354a = false;
    }

    public q0() {
        this.f26458b = new float[10];
        this.f26459c = 0;
    }

    public final void a(float f10) {
        c();
        int i10 = this.f26459c;
        float[] fArr = this.f26458b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[a.b.a(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f26458b = fArr2;
        }
        float[] fArr3 = this.f26458b;
        int i11 = this.f26459c;
        this.f26459c = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f26459c)) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
            sbA.append(this.f26459c);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        float[] fArr = this.f26458b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[a.b.a(i11, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f26458b, i10, fArr2, i10 + 1, this.f26459c - i10);
            this.f26458b = fArr2;
        }
        this.f26458b[i10] = fFloatValue;
        this.f26459c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = l1.f26429a;
        collection.getClass();
        if (!(collection instanceof q0)) {
            return super.addAll(collection);
        }
        q0 q0Var = (q0) collection;
        int i10 = q0Var.f26459c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f26459c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f26458b;
        if (i12 > fArr.length) {
            this.f26458b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(q0Var.f26458b, 0, this.f26458b, this.f26459c, q0Var.f26459c);
        this.f26459c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final q0 b(int i10) {
        if (i10 >= this.f26459c) {
            return new q0(Arrays.copyOf(this.f26458b, i10), this.f26459c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return super.equals(obj);
        }
        q0 q0Var = (q0) obj;
        if (this.f26459c != q0Var.f26459c) {
            return false;
        }
        float[] fArr = q0Var.f26458b;
        for (int i10 = 0; i10 < this.f26459c; i10++) {
            if (Float.floatToIntBits(this.f26458b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        if (i10 >= 0 && i10 < this.f26459c) {
            return Float.valueOf(this.f26458b[i10]);
        }
        StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
        sbA.append(this.f26459c);
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f26459c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f26458b[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i10 = this.f26459c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f26458b[i11] == fFloatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        int i11;
        c();
        if (i10 < 0 || i10 >= (i11 = this.f26459c)) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
            sbA.append(this.f26459c);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        float[] fArr = this.f26458b;
        float f10 = fArr[i10];
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f26459c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f26458b;
        System.arraycopy(fArr, i11, fArr, i10, this.f26459c - i11);
        this.f26459c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        c();
        if (i10 < 0 || i10 >= this.f26459c) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
            sbA.append(this.f26459c);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        float[] fArr = this.f26458b;
        float f10 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26459c;
    }

    public q0(float[] fArr, int i10) {
        this.f26458b = fArr;
        this.f26459c = i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a(((Float) obj).floatValue());
        return true;
    }
}
