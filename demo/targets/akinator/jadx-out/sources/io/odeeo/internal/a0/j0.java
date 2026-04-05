package io.odeeo.internal.a0;

import android.util.SparseArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j0<V> {

    /* renamed from: a, reason: collision with root package name */
    public int f62391a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray<V> f62392b;

    /* renamed from: c, reason: collision with root package name */
    public final io.odeeo.internal.q0.h<V> f62393c;

    public j0() {
        this(new e6.h0(20));
    }

    public void appendSpan(int i10, V v10) {
        if (this.f62391a == -1) {
            io.odeeo.internal.q0.a.checkState(this.f62392b.size() == 0);
            this.f62391a = 0;
        }
        if (this.f62392b.size() > 0) {
            SparseArray<V> sparseArray = this.f62392b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            io.odeeo.internal.q0.a.checkArgument(i10 >= iKeyAt);
            if (iKeyAt == i10) {
                io.odeeo.internal.q0.h<V> hVar = this.f62393c;
                SparseArray<V> sparseArray2 = this.f62392b;
                hVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f62392b.append(i10, v10);
    }

    public void clear() {
        for (int i10 = 0; i10 < this.f62392b.size(); i10++) {
            this.f62393c.accept(this.f62392b.valueAt(i10));
        }
        this.f62391a = -1;
        this.f62392b.clear();
    }

    public void discardFrom(int i10) {
        for (int size = this.f62392b.size() - 1; size >= 0 && i10 < this.f62392b.keyAt(size); size--) {
            this.f62393c.accept(this.f62392b.valueAt(size));
            this.f62392b.removeAt(size);
        }
        this.f62391a = this.f62392b.size() > 0 ? Math.min(this.f62391a, this.f62392b.size() - 1) : -1;
    }

    public void discardTo(int i10) {
        int i11 = 0;
        while (i11 < this.f62392b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f62392b.keyAt(i12)) {
                return;
            }
            this.f62393c.accept(this.f62392b.valueAt(i11));
            this.f62392b.removeAt(i11);
            int i13 = this.f62391a;
            if (i13 > 0) {
                this.f62391a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public V get(int i10) {
        if (this.f62391a == -1) {
            this.f62391a = 0;
        }
        while (true) {
            int i11 = this.f62391a;
            if (i11 <= 0 || i10 >= this.f62392b.keyAt(i11)) {
                break;
            }
            this.f62391a--;
        }
        while (this.f62391a < this.f62392b.size() - 1 && i10 >= this.f62392b.keyAt(this.f62391a + 1)) {
            this.f62391a++;
        }
        return this.f62392b.valueAt(this.f62391a);
    }

    public V getEndValue() {
        return this.f62392b.valueAt(r0.size() - 1);
    }

    public boolean isEmpty() {
        return this.f62392b.size() == 0;
    }

    public j0(io.odeeo.internal.q0.h<V> hVar) {
        this.f62392b = new SparseArray<>();
        this.f62393c = hVar;
        this.f62391a = -1;
    }

    public static /* synthetic */ void a(Object obj) {
    }
}
