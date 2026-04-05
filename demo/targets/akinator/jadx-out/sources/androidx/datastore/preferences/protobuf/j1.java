package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j1 extends d implements q1, RandomAccess, b3 {

    /* renamed from: f, reason: collision with root package name */
    public static final j1 f5914f = new j1(new int[0], 0, false);

    /* renamed from: c, reason: collision with root package name */
    public int[] f5915c;

    /* renamed from: e, reason: collision with root package name */
    public int f5916e;

    public j1() {
        this(new int[10], 0, true);
    }

    public static j1 emptyList() {
        return f5914f;
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        c();
        Charset charset = t1.f6006a;
        collection.getClass();
        if (!(collection instanceof j1)) {
            return super.addAll(collection);
        }
        j1 j1Var = (j1) collection;
        int i10 = j1Var.f5916e;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f5916e;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f5915c;
        if (i12 > iArr.length) {
            this.f5915c = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(j1Var.f5915c, 0, this.f5915c, this.f5916e, j1Var.f5916e);
        this.f5916e = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public void addInt(int i10) {
        c();
        int i11 = this.f5916e;
        int[] iArr = this.f5915c;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[a.b.a(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f5915c = iArr2;
        }
        int[] iArr3 = this.f5915c;
        int i12 = this.f5916e;
        this.f5916e = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i10) {
        if (i10 < 0 || i10 >= this.f5916e) {
            StringBuilder sbT = p0.o2.t(i10, "Index:", ", Size:");
            sbT.append(this.f5916e);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return super.equals(obj);
        }
        j1 j1Var = (j1) obj;
        if (this.f5916e != j1Var.f5916e) {
            return false;
        }
        int[] iArr = j1Var.f5915c;
        for (int i10 = 0; i10 < this.f5916e; i10++) {
            if (this.f5915c[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public int getInt(int i10) {
        d(i10);
        return this.f5915c[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f5916e; i11++) {
            i10 = (i10 * 31) + this.f5915c[i11];
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
            if (this.f5915c[i10] == iIntValue) {
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
        int[] iArr = this.f5915c;
        System.arraycopy(iArr, i11, iArr, i10, this.f5916e - i11);
        this.f5916e -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public int setInt(int i10, int i11) {
        c();
        d(i10);
        int[] iArr = this.f5915c;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f5916e;
    }

    public j1(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f5915c = iArr;
        this.f5916e = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer get(int i10) {
        return Integer.valueOf(getInt(i10));
    }

    @Override // androidx.datastore.preferences.protobuf.d, androidx.datastore.preferences.protobuf.s1, androidx.datastore.preferences.protobuf.p1
    public q1 mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f5916e) {
            return new j1(Arrays.copyOf(this.f5915c, i10), this.f5916e, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.List
    public Integer remove(int i10) {
        c();
        d(i10);
        int[] iArr = this.f5915c;
        int i11 = iArr[i10];
        if (i10 < this.f5916e - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f5916e--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.List
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(setInt(i10, num.intValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Integer num) {
        addInt(num.intValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.List
    public void add(int i10, Integer num) {
        int i11;
        int iIntValue = num.intValue();
        c();
        if (i10 >= 0 && i10 <= (i11 = this.f5916e)) {
            int[] iArr = this.f5915c;
            if (i11 < iArr.length) {
                System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
            } else {
                int[] iArr2 = new int[a.b.a(i11, 3, 2, 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i10);
                System.arraycopy(this.f5915c, i10, iArr2, i10 + 1, this.f5916e - i10);
                this.f5915c = iArr2;
            }
            this.f5915c[i10] = iIntValue;
            this.f5916e++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbT = p0.o2.t(i10, "Index:", ", Size:");
        sbT.append(this.f5916e);
        throw new IndexOutOfBoundsException(sbT.toString());
    }
}
