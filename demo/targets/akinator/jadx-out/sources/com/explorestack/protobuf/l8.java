package com.explorestack.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l8 extends e implements v7, RandomAccess, ga {

    /* renamed from: f, reason: collision with root package name */
    public static final l8 f22351f;

    /* renamed from: c, reason: collision with root package name */
    public long[] f22352c;

    /* renamed from: e, reason: collision with root package name */
    public int f22353e;

    static {
        l8 l8Var = new l8(new long[0], 0);
        f22351f = l8Var;
        l8Var.makeImmutable();
    }

    public l8(long[] jArr, int i10) {
        this.f22352c = jArr;
        this.f22353e = i10;
    }

    public static l8 emptyList() {
        return f22351f;
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        c();
        Charset charset = x7.f22881a;
        collection.getClass();
        if (!(collection instanceof l8)) {
            return super.addAll(collection);
        }
        l8 l8Var = (l8) collection;
        int i10 = l8Var.f22353e;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f22353e;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f22352c;
        if (i12 > jArr.length) {
            this.f22352c = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(l8Var.f22352c, 0, this.f22352c, this.f22353e, l8Var.f22353e);
        this.f22353e = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.explorestack.protobuf.v7
    public void addLong(long j10) {
        c();
        int i10 = this.f22353e;
        long[] jArr = this.f22352c;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[a.b.a(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f22352c = jArr2;
        }
        long[] jArr3 = this.f22352c;
        int i11 = this.f22353e;
        this.f22353e = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i10) {
        if (i10 < 0 || i10 >= this.f22353e) {
            StringBuilder sbT = p0.o2.t(i10, "Index:", ", Size:");
            sbT.append(this.f22353e);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8)) {
            return super.equals(obj);
        }
        l8 l8Var = (l8) obj;
        if (this.f22353e != l8Var.f22353e) {
            return false;
        }
        long[] jArr = l8Var.f22352c;
        for (int i10 = 0; i10 < this.f22353e; i10++) {
            if (this.f22352c[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.explorestack.protobuf.v7
    public long getLong(int i10) {
        d(i10);
        return this.f22352c[i10];
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashLong = 1;
        for (int i10 = 0; i10 < this.f22353e; i10++) {
            iHashLong = (iHashLong * 31) + x7.hashLong(this.f22352c[i10]);
        }
        return iHashLong;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f22352c[i10] == jLongValue) {
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
        long[] jArr = this.f22352c;
        System.arraycopy(jArr, i11, jArr, i10, this.f22353e - i11);
        this.f22353e -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.explorestack.protobuf.v7
    public long setLong(int i10, long j10) {
        c();
        d(i10);
        long[] jArr = this.f22352c;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f22353e;
    }

    @Override // java.util.AbstractList, java.util.List
    public Long get(int i10) {
        return Long.valueOf(getLong(i10));
    }

    @Override // com.explorestack.protobuf.e, com.explorestack.protobuf.w7, com.explorestack.protobuf.r7
    public v7 mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f22353e) {
            return new l8(Arrays.copyOf(this.f22352c, i10), this.f22353e);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.List
    public Long remove(int i10) {
        c();
        d(i10);
        long[] jArr = this.f22352c;
        long j10 = jArr[i10];
        if (i10 < this.f22353e - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f22353e--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.List
    public Long set(int i10, Long l9) {
        return Long.valueOf(setLong(i10, l9.longValue()));
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Long l9) {
        addLong(l9.longValue());
        return true;
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.List
    public void add(int i10, Long l9) {
        int i11;
        long jLongValue = l9.longValue();
        c();
        if (i10 >= 0 && i10 <= (i11 = this.f22353e)) {
            long[] jArr = this.f22352c;
            if (i11 < jArr.length) {
                System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
            } else {
                long[] jArr2 = new long[a.b.a(i11, 3, 2, 1)];
                System.arraycopy(jArr, 0, jArr2, 0, i10);
                System.arraycopy(this.f22352c, i10, jArr2, i10 + 1, this.f22353e - i10);
                this.f22352c = jArr2;
            }
            this.f22352c[i10] = jLongValue;
            this.f22353e++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbT = p0.o2.t(i10, "Index:", ", Size:");
        sbT.append(this.f22353e);
        throw new IndexOutOfBoundsException(sbT.toString());
    }
}
