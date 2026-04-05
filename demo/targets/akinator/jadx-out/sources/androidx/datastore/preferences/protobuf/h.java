package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h extends d implements k1, RandomAccess, b3 {

    /* renamed from: f, reason: collision with root package name */
    public static final h f5886f = new h(new boolean[0], 0, false);

    /* renamed from: c, reason: collision with root package name */
    public boolean[] f5887c;

    /* renamed from: e, reason: collision with root package name */
    public int f5888e;

    public h(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.f5887c = zArr;
        this.f5888e = i10;
    }

    public static h emptyList() {
        return f5886f;
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        c();
        Charset charset = t1.f6006a;
        collection.getClass();
        if (!(collection instanceof h)) {
            return super.addAll(collection);
        }
        h hVar = (h) collection;
        int i10 = hVar.f5888e;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f5888e;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f5887c;
        if (i12 > zArr.length) {
            this.f5887c = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(hVar.f5887c, 0, this.f5887c, this.f5888e, hVar.f5888e);
        this.f5888e = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.k1
    public void addBoolean(boolean z10) {
        c();
        int i10 = this.f5888e;
        boolean[] zArr = this.f5887c;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[a.b.a(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f5887c = zArr2;
        }
        boolean[] zArr3 = this.f5887c;
        int i11 = this.f5888e;
        this.f5888e = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i10) {
        if (i10 < 0 || i10 >= this.f5888e) {
            StringBuilder sbT = p0.o2.t(i10, "Index:", ", Size:");
            sbT.append(this.f5888e);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return super.equals(obj);
        }
        h hVar = (h) obj;
        if (this.f5888e != hVar.f5888e) {
            return false;
        }
        boolean[] zArr = hVar.f5887c;
        for (int i10 = 0; i10 < this.f5888e; i10++) {
            if (this.f5887c[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.k1
    public boolean getBoolean(int i10) {
        d(i10);
        return this.f5887c[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashBoolean = 1;
        for (int i10 = 0; i10 < this.f5888e; i10++) {
            iHashBoolean = (iHashBoolean * 31) + t1.hashBoolean(this.f5887c[i10]);
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
            if (this.f5887c[i10] == zBooleanValue) {
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
        boolean[] zArr = this.f5887c;
        System.arraycopy(zArr, i11, zArr, i10, this.f5888e - i11);
        this.f5888e -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.k1
    public boolean setBoolean(int i10, boolean z10) {
        c();
        d(i10);
        boolean[] zArr = this.f5887c;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f5888e;
    }

    @Override // java.util.AbstractList, java.util.List
    public Boolean get(int i10) {
        return Boolean.valueOf(getBoolean(i10));
    }

    @Override // androidx.datastore.preferences.protobuf.d, androidx.datastore.preferences.protobuf.s1, androidx.datastore.preferences.protobuf.p1
    public k1 mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f5888e) {
            return new h(Arrays.copyOf(this.f5887c, i10), this.f5888e, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.List
    public Boolean remove(int i10) {
        c();
        d(i10);
        boolean[] zArr = this.f5887c;
        boolean z10 = zArr[i10];
        if (i10 < this.f5888e - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.f5888e--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.List
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(setBoolean(i10, bool.booleanValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Boolean bool) {
        addBoolean(bool.booleanValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.List
    public void add(int i10, Boolean bool) {
        int i11;
        boolean zBooleanValue = bool.booleanValue();
        c();
        if (i10 >= 0 && i10 <= (i11 = this.f5888e)) {
            boolean[] zArr = this.f5887c;
            if (i11 < zArr.length) {
                System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
            } else {
                boolean[] zArr2 = new boolean[a.b.a(i11, 3, 2, 1)];
                System.arraycopy(zArr, 0, zArr2, 0, i10);
                System.arraycopy(this.f5887c, i10, zArr2, i10 + 1, this.f5888e - i10);
                this.f5887c = zArr2;
            }
            this.f5887c[i10] = zBooleanValue;
            this.f5888e++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbT = p0.o2.t(i10, "Index:", ", Size:");
        sbT.append(this.f5888e);
        throw new IndexOutOfBoundsException(sbT.toString());
    }
}
