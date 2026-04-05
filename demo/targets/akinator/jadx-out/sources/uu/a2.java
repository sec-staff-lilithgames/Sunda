package uu;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a2 extends g implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f88699b;

    /* renamed from: c, reason: collision with root package name */
    public final int f88700c;

    /* renamed from: e, reason: collision with root package name */
    public int f88701e;

    /* renamed from: f, reason: collision with root package name */
    public int f88702f;

    public a2(Object[] buffer, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(buffer, "buffer");
        this.f88699b = buffer;
        if (i10 < 0) {
            throw new IllegalArgumentException(a.b.e(i10, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i10 <= buffer.length) {
            this.f88700c = buffer.length;
            this.f88702f = i10;
        } else {
            StringBuilder sbT = o2.t(i10, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            sbT.append(buffer.length);
            throw new IllegalArgumentException(sbT.toString().toString());
        }
    }

    @Override // java.util.Collection, java.util.List
    public final void add(Object obj) {
        if (isFull()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.f88699b[(size() + this.f88701e) % this.f88700c] = obj;
        this.f88702f = size() + 1;
    }

    public final a2 expanded(int i10) {
        Object[] array;
        int i11 = this.f88700c;
        int iCoerceAtMost = qv.v.coerceAtMost(i11 + (i11 >> 1) + 1, i10);
        if (this.f88701e == 0) {
            array = Arrays.copyOf(this.f88699b, iCoerceAtMost);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(array, "copyOf(...)");
        } else {
            array = toArray(new Object[iCoerceAtMost]);
        }
        return new a2(array, size());
    }

    @Override // uu.g, java.util.List
    public Object get(int i10) {
        g.Companion.checkElementIndex$kotlin_stdlib(i10, size());
        return this.f88699b[(this.f88701e + i10) % this.f88700c];
    }

    @Override // uu.g, uu.a
    public int getSize() {
        return this.f88702f;
    }

    public final boolean isFull() {
        return size() == this.f88700c;
    }

    @Override // uu.g, uu.a, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return new z1(this);
    }

    public final void removeFirst(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(a.b.e(i10, "n shouldn't be negative but it is ").toString());
        }
        if (i10 > size()) {
            StringBuilder sbT = o2.t(i10, "n shouldn't be greater than the buffer size: n = ", ", size = ");
            sbT.append(size());
            throw new IllegalArgumentException(sbT.toString().toString());
        }
        if (i10 > 0) {
            int i11 = this.f88701e;
            int i12 = (i11 + i10) % this.f88700c;
            Object[] objArr = this.f88699b;
            if (i11 > i12) {
                f0.fill(objArr, (Object) null, i11, this.f88700c);
                f0.fill(objArr, (Object) null, 0, i12);
            } else {
                f0.fill(objArr, (Object) null, i11, i12);
            }
            this.f88701e = i12;
            this.f88702f = size() - i10;
        }
    }

    @Override // uu.a, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Object[] objArr;
        kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
        int length = array.length;
        Object[] objArr2 = array;
        if (length < size()) {
            Object[] objArr3 = (T[]) Arrays.copyOf(array, size());
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(objArr3, "copyOf(...)");
            objArr2 = objArr3;
        }
        int size = size();
        int i10 = this.f88701e;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            objArr = this.f88699b;
            if (i12 >= size || i10 >= this.f88700c) {
                break;
            }
            objArr2[i12] = objArr[i10];
            i12++;
            i10++;
        }
        while (i12 < size) {
            objArr2[i12] = objArr[i11];
            i12++;
            i11++;
        }
        return (T[]) o0.terminateCollectionToArray(size, objArr2);
    }

    @Override // uu.a, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    public a2(int i10) {
        this(new Object[i10], 0);
    }
}
