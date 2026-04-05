package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c1 extends d implements p1, RandomAccess, b3 {

    /* renamed from: f, reason: collision with root package name */
    public static final c1 f5830f = new c1(new float[0], 0, false);

    /* renamed from: c, reason: collision with root package name */
    public float[] f5831c;

    /* renamed from: e, reason: collision with root package name */
    public int f5832e;

    public c1(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.f5831c = fArr;
        this.f5832e = i10;
    }

    public static c1 emptyList() {
        return f5830f;
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        c();
        Charset charset = t1.f6006a;
        collection.getClass();
        if (!(collection instanceof c1)) {
            return super.addAll(collection);
        }
        c1 c1Var = (c1) collection;
        int i10 = c1Var.f5832e;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f5832e;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f5831c;
        if (i12 > fArr.length) {
            this.f5831c = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(c1Var.f5831c, 0, this.f5831c, this.f5832e, c1Var.f5832e);
        this.f5832e = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public void addFloat(float f10) {
        c();
        int i10 = this.f5832e;
        float[] fArr = this.f5831c;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[a.b.a(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f5831c = fArr2;
        }
        float[] fArr3 = this.f5831c;
        int i11 = this.f5832e;
        this.f5832e = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i10) {
        if (i10 < 0 || i10 >= this.f5832e) {
            StringBuilder sbT = p0.o2.t(i10, "Index:", ", Size:");
            sbT.append(this.f5832e);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return super.equals(obj);
        }
        c1 c1Var = (c1) obj;
        if (this.f5832e != c1Var.f5832e) {
            return false;
        }
        float[] fArr = c1Var.f5831c;
        for (int i10 = 0; i10 < this.f5832e; i10++) {
            if (Float.floatToIntBits(this.f5831c[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public float getFloat(int i10) {
        d(i10);
        return this.f5831c[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f5832e; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f5831c[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f5831c[i10] == fFloatValue) {
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
        float[] fArr = this.f5831c;
        System.arraycopy(fArr, i11, fArr, i10, this.f5832e - i11);
        this.f5832e -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public float setFloat(int i10, float f10) {
        c();
        d(i10);
        float[] fArr = this.f5831c;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f5832e;
    }

    @Override // java.util.AbstractList, java.util.List
    public Float get(int i10) {
        return Float.valueOf(getFloat(i10));
    }

    @Override // androidx.datastore.preferences.protobuf.d, androidx.datastore.preferences.protobuf.s1, androidx.datastore.preferences.protobuf.p1
    public p1 mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f5832e) {
            return new c1(Arrays.copyOf(this.f5831c, i10), this.f5832e, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.List
    public Float remove(int i10) {
        c();
        d(i10);
        float[] fArr = this.f5831c;
        float f10 = fArr[i10];
        if (i10 < this.f5832e - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f5832e--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.List
    public Float set(int i10, Float f10) {
        return Float.valueOf(setFloat(i10, f10.floatValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Float f10) {
        addFloat(f10.floatValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.d, java.util.AbstractList, java.util.List
    public void add(int i10, Float f10) {
        int i11;
        float fFloatValue = f10.floatValue();
        c();
        if (i10 >= 0 && i10 <= (i11 = this.f5832e)) {
            float[] fArr = this.f5831c;
            if (i11 < fArr.length) {
                System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
            } else {
                float[] fArr2 = new float[a.b.a(i11, 3, 2, 1)];
                System.arraycopy(fArr, 0, fArr2, 0, i10);
                System.arraycopy(this.f5831c, i10, fArr2, i10 + 1, this.f5832e - i10);
                this.f5831c = fArr2;
            }
            this.f5831c[i10] = fFloatValue;
            this.f5832e++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbT = p0.o2.t(i10, "Index:", ", Size:");
        sbT.append(this.f5832e);
        throw new IndexOutOfBoundsException(sbT.toString());
    }
}
