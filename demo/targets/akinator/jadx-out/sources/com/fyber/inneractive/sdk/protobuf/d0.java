package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d0 extends c implements c1, RandomAccess, n2 {

    /* renamed from: d, reason: collision with root package name */
    public static final d0 f26362d;

    /* renamed from: b, reason: collision with root package name */
    public double[] f26363b;

    /* renamed from: c, reason: collision with root package name */
    public int f26364c;

    static {
        d0 d0Var = new d0(new double[0], 0);
        f26362d = d0Var;
        d0Var.f26354a = false;
    }

    public d0() {
        this.f26363b = new double[10];
        this.f26364c = 0;
    }

    public final void a(double d10) {
        c();
        int i10 = this.f26364c;
        double[] dArr = this.f26363b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[a.b.a(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f26363b = dArr2;
        }
        double[] dArr3 = this.f26363b;
        int i11 = this.f26364c;
        this.f26364c = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f26364c)) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
            sbA.append(this.f26364c);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        double[] dArr = this.f26363b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[a.b.a(i11, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f26363b, i10, dArr2, i10 + 1, this.f26364c - i10);
            this.f26363b = dArr2;
        }
        this.f26363b[i10] = dDoubleValue;
        this.f26364c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = l1.f26429a;
        collection.getClass();
        if (!(collection instanceof d0)) {
            return super.addAll(collection);
        }
        d0 d0Var = (d0) collection;
        int i10 = d0Var.f26364c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f26364c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f26363b;
        if (i12 > dArr.length) {
            this.f26363b = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(d0Var.f26363b, 0, this.f26363b, this.f26364c, d0Var.f26364c);
        this.f26364c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final d0 b(int i10) {
        if (i10 >= this.f26364c) {
            return new d0(Arrays.copyOf(this.f26363b, i10), this.f26364c);
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
        if (!(obj instanceof d0)) {
            return super.equals(obj);
        }
        d0 d0Var = (d0) obj;
        if (this.f26364c != d0Var.f26364c) {
            return false;
        }
        double[] dArr = d0Var.f26363b;
        for (int i10 = 0; i10 < this.f26364c; i10++) {
            if (Double.doubleToLongBits(this.f26363b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        if (i10 >= 0 && i10 < this.f26364c) {
            return Double.valueOf(this.f26363b[i10]);
        }
        StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
        sbA.append(this.f26364c);
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f26364c; i11++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f26363b[i11]);
            Charset charset = l1.f26429a;
            i10 = (i10 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i10 = this.f26364c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f26363b[i11] == dDoubleValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        int i11;
        c();
        if (i10 < 0 || i10 >= (i11 = this.f26364c)) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
            sbA.append(this.f26364c);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        double[] dArr = this.f26363b;
        double d10 = dArr[i10];
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f26364c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f26363b;
        System.arraycopy(dArr, i11, dArr, i10, this.f26364c - i11);
        this.f26364c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        c();
        if (i10 < 0 || i10 >= this.f26364c) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
            sbA.append(this.f26364c);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        double[] dArr = this.f26363b;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26364c;
    }

    public d0(double[] dArr, int i10) {
        this.f26363b = dArr;
        this.f26364c = i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a(((Double) obj).doubleValue());
        return true;
    }
}
