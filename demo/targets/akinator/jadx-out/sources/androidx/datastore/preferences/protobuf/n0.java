package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n0 extends d implements l1, RandomAccess, b3 {

    /* renamed from: f, reason: collision with root package name */
    public static final n0 f5961f = new n0(new double[0], 0, false);

    /* renamed from: c, reason: collision with root package name */
    public double[] f5962c;

    /* renamed from: e, reason: collision with root package name */
    public int f5963e;

    public n0(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.f5962c = dArr;
        this.f5963e = i10;
    }

    public static n0 emptyList() {
        return f5961f;
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        c();
        Charset charset = t1.f6006a;
        collection.getClass();
        if (!(collection instanceof n0)) {
            return super.addAll(collection);
        }
        n0 n0Var = (n0) collection;
        int i10 = n0Var.f5963e;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f5963e;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f5962c;
        if (i12 > dArr.length) {
            this.f5962c = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(n0Var.f5962c, 0, this.f5962c, this.f5963e, n0Var.f5963e);
        this.f5963e = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void addDouble(double d10) {
        c();
        int i10 = this.f5963e;
        double[] dArr = this.f5962c;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[a.b.a(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f5962c = dArr2;
        }
        double[] dArr3 = this.f5962c;
        int i11 = this.f5963e;
        this.f5963e = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i10) {
        if (i10 < 0 || i10 >= this.f5963e) {
            StringBuilder sbT = p0.o2.t(i10, "Index:", ", Size:");
            sbT.append(this.f5963e);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return super.equals(obj);
        }
        n0 n0Var = (n0) obj;
        if (this.f5963e != n0Var.f5963e) {
            return false;
        }
        double[] dArr = n0Var.f5962c;
        for (int i10 = 0; i10 < this.f5963e; i10++) {
            if (Double.doubleToLongBits(this.f5962c[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public double getDouble(int i10) {
        d(i10);
        return this.f5962c[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashLong = 1;
        for (int i10 = 0; i10 < this.f5963e; i10++) {
            iHashLong = (iHashLong * 31) + t1.hashLong(Double.doubleToLongBits(this.f5962c[i10]));
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
            if (this.f5962c[i10] == dDoubleValue) {
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
        double[] dArr = this.f5962c;
        System.arraycopy(dArr, i11, dArr, i10, this.f5963e - i11);
        this.f5963e -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public double setDouble(int i10, double d10) {
        c();
        d(i10);
        double[] dArr = this.f5962c;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f5963e;
    }

    @Override // java.util.AbstractList, java.util.List
    public Double get(int i10) {
        return Double.valueOf(getDouble(i10));
    }

    @Override // androidx.datastore.preferences.protobuf.d, androidx.datastore.preferences.protobuf.s1, androidx.datastore.preferences.protobuf.p1
    public l1 mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f5963e) {
            return new n0(Arrays.copyOf(this.f5962c, i10), this.f5963e, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.List
    public Double remove(int i10) {
        c();
        d(i10);
        double[] dArr = this.f5962c;
        double d10 = dArr[i10];
        if (i10 < this.f5963e - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.f5963e--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.List
    public Double set(int i10, Double d10) {
        return Double.valueOf(setDouble(i10, d10.doubleValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Double d10) {
        addDouble(d10.doubleValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.List
    public void add(int i10, Double d10) {
        int i11;
        double dDoubleValue = d10.doubleValue();
        c();
        if (i10 >= 0 && i10 <= (i11 = this.f5963e)) {
            double[] dArr = this.f5962c;
            if (i11 < dArr.length) {
                System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
            } else {
                double[] dArr2 = new double[a.b.a(i11, 3, 2, 1)];
                System.arraycopy(dArr, 0, dArr2, 0, i10);
                System.arraycopy(this.f5962c, i10, dArr2, i10 + 1, this.f5963e - i10);
                this.f5962c = dArr2;
            }
            this.f5962c[i10] = dDoubleValue;
            this.f5963e++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbT = p0.o2.t(i10, "Index:", ", Size:");
        sbT.append(this.f5963e);
        throw new IndexOutOfBoundsException(sbT.toString());
    }
}
