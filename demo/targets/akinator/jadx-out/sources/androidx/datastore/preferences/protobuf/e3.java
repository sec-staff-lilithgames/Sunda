package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e3 extends d implements RandomAccess {

    /* renamed from: f, reason: collision with root package name */
    public static final e3 f5865f = new e3(new Object[0], 0, false);

    /* renamed from: c, reason: collision with root package name */
    public Object[] f5866c;

    /* renamed from: e, reason: collision with root package name */
    public int f5867e;

    public e3(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f5866c = objArr;
        this.f5867e = i10;
    }

    public static <E> e3 emptyList() {
        return f5865f;
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        c();
        int i10 = this.f5867e;
        Object[] objArr = this.f5866c;
        if (i10 == objArr.length) {
            this.f5866c = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f5866c;
        int i11 = this.f5867e;
        this.f5867e = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void d(int i10) {
        if (i10 < 0 || i10 >= this.f5867e) {
            StringBuilder sbT = p0.o2.t(i10, "Index:", ", Size:");
            sbT.append(this.f5867e);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        d(i10);
        return this.f5866c[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        c();
        d(i10);
        Object[] objArr = this.f5866c;
        Object obj = objArr[i10];
        if (i10 < this.f5867e - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f5867e--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        c();
        d(i10);
        Object[] objArr = this.f5866c;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f5867e;
    }

    @Override // androidx.datastore.preferences.protobuf.d, androidx.datastore.preferences.protobuf.s1, androidx.datastore.preferences.protobuf.p1
    public e3 mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f5867e) {
            return new e3(Arrays.copyOf(this.f5866c, i10), this.f5867e, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        int i11;
        c();
        if (i10 >= 0 && i10 <= (i11 = this.f5867e)) {
            Object[] objArr = this.f5866c;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArr2 = new Object[a.b.a(i11, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(this.f5866c, i10, objArr2, i10 + 1, this.f5867e - i10);
                this.f5866c = objArr2;
            }
            this.f5866c[i10] = obj;
            this.f5867e++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbT = p0.o2.t(i10, "Index:", ", Size:");
        sbT.append(this.f5867e);
        throw new IndexOutOfBoundsException(sbT.toString());
    }
}
