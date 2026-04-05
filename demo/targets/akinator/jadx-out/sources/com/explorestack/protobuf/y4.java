package com.explorestack.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y4 extends e implements n7, RandomAccess, ga {

    /* renamed from: f, reason: collision with root package name */
    public static final y4 f22910f;

    /* renamed from: c, reason: collision with root package name */
    public double[] f22911c;

    /* renamed from: e, reason: collision with root package name */
    public int f22912e;

    static {
        y4 y4Var = new y4(new double[0], 0);
        f22910f = y4Var;
        y4Var.makeImmutable();
    }

    public y4(double[] dArr, int i10) {
        this.f22911c = dArr;
        this.f22912e = i10;
    }

    public static y4 emptyList() {
        return f22910f;
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        c();
        Charset charset = x7.f22881a;
        collection.getClass();
        if (!(collection instanceof y4)) {
            return super.addAll(collection);
        }
        y4 y4Var = (y4) collection;
        int i10 = y4Var.f22912e;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f22912e;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f22911c;
        if (i12 > dArr.length) {
            this.f22911c = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(y4Var.f22911c, 0, this.f22911c, this.f22912e, y4Var.f22912e);
        this.f22912e = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.explorestack.protobuf.n7
    public void addDouble(double d10) {
        c();
        int i10 = this.f22912e;
        double[] dArr = this.f22911c;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[a.b.a(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f22911c = dArr2;
        }
        double[] dArr3 = this.f22911c;
        int i11 = this.f22912e;
        this.f22912e = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i10) {
        if (i10 < 0 || i10 >= this.f22912e) {
            StringBuilder sbT = p0.o2.t(i10, "Index:", ", Size:");
            sbT.append(this.f22912e);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4)) {
            return super.equals(obj);
        }
        y4 y4Var = (y4) obj;
        if (this.f22912e != y4Var.f22912e) {
            return false;
        }
        double[] dArr = y4Var.f22911c;
        for (int i10 = 0; i10 < this.f22912e; i10++) {
            if (Double.doubleToLongBits(this.f22911c[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.explorestack.protobuf.n7
    public double getDouble(int i10) {
        d(i10);
        return this.f22911c[i10];
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashLong = 1;
        for (int i10 = 0; i10 < this.f22912e; i10++) {
            iHashLong = (iHashLong * 31) + x7.hashLong(Double.doubleToLongBits(this.f22911c[i10]));
        }
        return iHashLong;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f22911c[i10] == dDoubleValue) {
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
        double[] dArr = this.f22911c;
        System.arraycopy(dArr, i11, dArr, i10, this.f22912e - i11);
        this.f22912e -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.explorestack.protobuf.n7
    public double setDouble(int i10, double d10) {
        c();
        d(i10);
        double[] dArr = this.f22911c;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f22912e;
    }

    @Override // java.util.AbstractList, java.util.List
    public Double get(int i10) {
        return Double.valueOf(getDouble(i10));
    }

    @Override // com.explorestack.protobuf.e, com.explorestack.protobuf.w7, com.explorestack.protobuf.r7
    public n7 mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f22912e) {
            return new y4(Arrays.copyOf(this.f22911c, i10), this.f22912e);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.List
    public Double remove(int i10) {
        c();
        d(i10);
        double[] dArr = this.f22911c;
        double d10 = dArr[i10];
        if (i10 < this.f22912e - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.f22912e--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.List
    public Double set(int i10, Double d10) {
        return Double.valueOf(setDouble(i10, d10.doubleValue()));
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Double d10) {
        addDouble(d10.doubleValue());
        return true;
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.List
    public void add(int i10, Double d10) {
        int i11;
        double dDoubleValue = d10.doubleValue();
        c();
        if (i10 >= 0 && i10 <= (i11 = this.f22912e)) {
            double[] dArr = this.f22911c;
            if (i11 < dArr.length) {
                System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
            } else {
                double[] dArr2 = new double[a.b.a(i11, 3, 2, 1)];
                System.arraycopy(dArr, 0, dArr2, 0, i10);
                System.arraycopy(this.f22911c, i10, dArr2, i10 + 1, this.f22912e - i10);
                this.f22911c = dArr2;
            }
            this.f22911c[i10] = dDoubleValue;
            this.f22912e++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbT = p0.o2.t(i10, "Index:", ", Size:");
        sbT.append(this.f22912e);
        throw new IndexOutOfBoundsException(sbT.toString());
    }
}
