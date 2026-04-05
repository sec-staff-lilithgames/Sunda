package com.explorestack.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l7 extends e implements s7, RandomAccess, ga {

    /* renamed from: f, reason: collision with root package name */
    public static final l7 f22348f;

    /* renamed from: c, reason: collision with root package name */
    public int[] f22349c;

    /* renamed from: e, reason: collision with root package name */
    public int f22350e;

    static {
        l7 l7Var = new l7(new int[0], 0);
        f22348f = l7Var;
        l7Var.makeImmutable();
    }

    public l7(int[] iArr, int i10) {
        this.f22349c = iArr;
        this.f22350e = i10;
    }

    public static l7 emptyList() {
        return f22348f;
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        c();
        Charset charset = x7.f22881a;
        collection.getClass();
        if (!(collection instanceof l7)) {
            return super.addAll(collection);
        }
        l7 l7Var = (l7) collection;
        int i10 = l7Var.f22350e;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f22350e;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f22349c;
        if (i12 > iArr.length) {
            this.f22349c = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(l7Var.f22349c, 0, this.f22349c, this.f22350e, l7Var.f22350e);
        this.f22350e = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.explorestack.protobuf.s7
    public void addInt(int i10) {
        c();
        int i11 = this.f22350e;
        int[] iArr = this.f22349c;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[a.b.a(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f22349c = iArr2;
        }
        int[] iArr3 = this.f22349c;
        int i12 = this.f22350e;
        this.f22350e = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i10) {
        if (i10 < 0 || i10 >= this.f22350e) {
            StringBuilder sbT = p0.o2.t(i10, "Index:", ", Size:");
            sbT.append(this.f22350e);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7)) {
            return super.equals(obj);
        }
        l7 l7Var = (l7) obj;
        if (this.f22350e != l7Var.f22350e) {
            return false;
        }
        int[] iArr = l7Var.f22349c;
        for (int i10 = 0; i10 < this.f22350e; i10++) {
            if (this.f22349c[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.explorestack.protobuf.s7
    public int getInt(int i10) {
        d(i10);
        return this.f22349c[i10];
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f22350e; i11++) {
            i10 = (i10 * 31) + this.f22349c[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f22349c[i10] == iIntValue) {
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
        int[] iArr = this.f22349c;
        System.arraycopy(iArr, i11, iArr, i10, this.f22350e - i11);
        this.f22350e -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.explorestack.protobuf.s7
    public int setInt(int i10, int i11) {
        c();
        d(i10);
        int[] iArr = this.f22349c;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f22350e;
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer get(int i10) {
        return Integer.valueOf(getInt(i10));
    }

    @Override // com.explorestack.protobuf.e, com.explorestack.protobuf.w7, com.explorestack.protobuf.r7
    public s7 mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f22350e) {
            return new l7(Arrays.copyOf(this.f22349c, i10), this.f22350e);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.List
    public Integer remove(int i10) {
        c();
        d(i10);
        int[] iArr = this.f22349c;
        int i11 = iArr[i10];
        if (i10 < this.f22350e - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f22350e--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.List
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(setInt(i10, num.intValue()));
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Integer num) {
        addInt(num.intValue());
        return true;
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.List
    public void add(int i10, Integer num) {
        int i11;
        int iIntValue = num.intValue();
        c();
        if (i10 >= 0 && i10 <= (i11 = this.f22350e)) {
            int[] iArr = this.f22349c;
            if (i11 < iArr.length) {
                System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
            } else {
                int[] iArr2 = new int[a.b.a(i11, 3, 2, 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i10);
                System.arraycopy(this.f22349c, i10, iArr2, i10 + 1, this.f22350e - i10);
                this.f22349c = iArr2;
            }
            this.f22349c[i10] = iIntValue;
            this.f22350e++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbT = p0.o2.t(i10, "Index:", ", Size:");
        sbT.append(this.f22350e);
        throw new IndexOutOfBoundsException(sbT.toString());
    }
}
