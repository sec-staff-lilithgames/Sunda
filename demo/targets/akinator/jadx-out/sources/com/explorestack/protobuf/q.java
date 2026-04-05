package com.explorestack.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q extends e implements m7, RandomAccess, ga {

    /* renamed from: f, reason: collision with root package name */
    public static final q f22502f;

    /* renamed from: c, reason: collision with root package name */
    public boolean[] f22503c;

    /* renamed from: e, reason: collision with root package name */
    public int f22504e;

    static {
        q qVar = new q(new boolean[0], 0);
        f22502f = qVar;
        qVar.makeImmutable();
    }

    public q(boolean[] zArr, int i10) {
        this.f22503c = zArr;
        this.f22504e = i10;
    }

    public static q emptyList() {
        return f22502f;
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        c();
        Charset charset = x7.f22881a;
        collection.getClass();
        if (!(collection instanceof q)) {
            return super.addAll(collection);
        }
        q qVar = (q) collection;
        int i10 = qVar.f22504e;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f22504e;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f22503c;
        if (i12 > zArr.length) {
            this.f22503c = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(qVar.f22503c, 0, this.f22503c, this.f22504e, qVar.f22504e);
        this.f22504e = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.explorestack.protobuf.m7
    public void addBoolean(boolean z10) {
        c();
        int i10 = this.f22504e;
        boolean[] zArr = this.f22503c;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[a.b.a(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f22503c = zArr2;
        }
        boolean[] zArr3 = this.f22503c;
        int i11 = this.f22504e;
        this.f22504e = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i10) {
        if (i10 < 0 || i10 >= this.f22504e) {
            StringBuilder sbT = p0.o2.t(i10, "Index:", ", Size:");
            sbT.append(this.f22504e);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return super.equals(obj);
        }
        q qVar = (q) obj;
        if (this.f22504e != qVar.f22504e) {
            return false;
        }
        boolean[] zArr = qVar.f22503c;
        for (int i10 = 0; i10 < this.f22504e; i10++) {
            if (this.f22503c[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.explorestack.protobuf.m7
    public boolean getBoolean(int i10) {
        d(i10);
        return this.f22503c[i10];
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashBoolean = 1;
        for (int i10 = 0; i10 < this.f22504e; i10++) {
            iHashBoolean = (iHashBoolean * 31) + x7.hashBoolean(this.f22503c[i10]);
        }
        return iHashBoolean;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f22503c[i10] == zBooleanValue) {
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
        boolean[] zArr = this.f22503c;
        System.arraycopy(zArr, i11, zArr, i10, this.f22504e - i11);
        this.f22504e -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.explorestack.protobuf.m7
    public boolean setBoolean(int i10, boolean z10) {
        c();
        d(i10);
        boolean[] zArr = this.f22503c;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f22504e;
    }

    @Override // java.util.AbstractList, java.util.List
    public Boolean get(int i10) {
        return Boolean.valueOf(getBoolean(i10));
    }

    @Override // com.explorestack.protobuf.e, com.explorestack.protobuf.w7, com.explorestack.protobuf.r7
    public m7 mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f22504e) {
            return new q(Arrays.copyOf(this.f22503c, i10), this.f22504e);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.List
    public Boolean remove(int i10) {
        c();
        d(i10);
        boolean[] zArr = this.f22503c;
        boolean z10 = zArr[i10];
        if (i10 < this.f22504e - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.f22504e--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.List
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(setBoolean(i10, bool.booleanValue()));
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Boolean bool) {
        addBoolean(bool.booleanValue());
        return true;
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.List
    public void add(int i10, Boolean bool) {
        int i11;
        boolean zBooleanValue = bool.booleanValue();
        c();
        if (i10 >= 0 && i10 <= (i11 = this.f22504e)) {
            boolean[] zArr = this.f22503c;
            if (i11 < zArr.length) {
                System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
            } else {
                boolean[] zArr2 = new boolean[a.b.a(i11, 3, 2, 1)];
                System.arraycopy(zArr, 0, zArr2, 0, i10);
                System.arraycopy(this.f22503c, i10, zArr2, i10 + 1, this.f22504e - i10);
                this.f22503c = zArr2;
            }
            this.f22503c[i10] = zBooleanValue;
            this.f22504e++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbT = p0.o2.t(i10, "Index:", ", Size:");
        sbT.append(this.f22504e);
        throw new IndexOutOfBoundsException(sbT.toString());
    }
}
