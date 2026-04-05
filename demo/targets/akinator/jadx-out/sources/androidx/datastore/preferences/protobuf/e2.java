package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e2 extends d implements r1, RandomAccess, b3 {

    /* renamed from: f, reason: collision with root package name */
    public static final e2 f5862f = new e2(new long[0], 0, false);

    /* renamed from: c, reason: collision with root package name */
    public long[] f5863c;

    /* renamed from: e, reason: collision with root package name */
    public int f5864e;

    public e2() {
        this(new long[10], 0, true);
    }

    public static e2 emptyList() {
        return f5862f;
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        c();
        Charset charset = t1.f6006a;
        collection.getClass();
        if (!(collection instanceof e2)) {
            return super.addAll(collection);
        }
        e2 e2Var = (e2) collection;
        int i10 = e2Var.f5864e;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f5864e;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f5863c;
        if (i12 > jArr.length) {
            this.f5863c = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(e2Var.f5863c, 0, this.f5863c, this.f5864e, e2Var.f5864e);
        this.f5864e = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.r1
    public void addLong(long j10) {
        c();
        int i10 = this.f5864e;
        long[] jArr = this.f5863c;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[a.b.a(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f5863c = jArr2;
        }
        long[] jArr3 = this.f5863c;
        int i11 = this.f5864e;
        this.f5864e = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i10) {
        if (i10 < 0 || i10 >= this.f5864e) {
            StringBuilder sbT = p0.o2.t(i10, "Index:", ", Size:");
            sbT.append(this.f5864e);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2)) {
            return super.equals(obj);
        }
        e2 e2Var = (e2) obj;
        if (this.f5864e != e2Var.f5864e) {
            return false;
        }
        long[] jArr = e2Var.f5863c;
        for (int i10 = 0; i10 < this.f5864e; i10++) {
            if (this.f5863c[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.r1
    public long getLong(int i10) {
        d(i10);
        return this.f5863c[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashLong = 1;
        for (int i10 = 0; i10 < this.f5864e; i10++) {
            iHashLong = (iHashLong * 31) + t1.hashLong(this.f5863c[i10]);
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
            if (this.f5863c[i10] == jLongValue) {
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
        long[] jArr = this.f5863c;
        System.arraycopy(jArr, i11, jArr, i10, this.f5864e - i11);
        this.f5864e -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.r1
    public long setLong(int i10, long j10) {
        c();
        d(i10);
        long[] jArr = this.f5863c;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f5864e;
    }

    public e2(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f5863c = jArr;
        this.f5864e = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public Long get(int i10) {
        return Long.valueOf(getLong(i10));
    }

    @Override // androidx.datastore.preferences.protobuf.d, androidx.datastore.preferences.protobuf.s1, androidx.datastore.preferences.protobuf.p1
    public r1 mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f5864e) {
            return new e2(Arrays.copyOf(this.f5863c, i10), this.f5864e, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.List
    public Long remove(int i10) {
        c();
        d(i10);
        long[] jArr = this.f5863c;
        long j10 = jArr[i10];
        if (i10 < this.f5864e - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f5864e--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.List
    public Long set(int i10, Long l9) {
        return Long.valueOf(setLong(i10, l9.longValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Long l9) {
        addLong(l9.longValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.List
    public void add(int i10, Long l9) {
        int i11;
        long jLongValue = l9.longValue();
        c();
        if (i10 >= 0 && i10 <= (i11 = this.f5864e)) {
            long[] jArr = this.f5863c;
            if (i11 < jArr.length) {
                System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
            } else {
                long[] jArr2 = new long[a.b.a(i11, 3, 2, 1)];
                System.arraycopy(jArr, 0, jArr2, 0, i10);
                System.arraycopy(this.f5863c, i10, jArr2, i10 + 1, this.f5864e - i10);
                this.f5863c = jArr2;
            }
            this.f5863c[i10] = jLongValue;
            this.f5864e++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbT = p0.o2.t(i10, "Index:", ", Size:");
        sbT.append(this.f5864e);
        throw new IndexOutOfBoundsException(sbT.toString());
    }
}
