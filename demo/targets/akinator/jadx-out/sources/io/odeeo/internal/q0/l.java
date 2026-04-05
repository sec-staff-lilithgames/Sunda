package io.odeeo.internal.q0;

import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f65888a;

    public boolean contains(int i10) {
        return this.f65888a.get(i10);
    }

    public boolean containsAny(int... iArr) {
        for (int i10 : iArr) {
            if (contains(i10)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (g0.f65861a >= 24) {
            return this.f65888a.equals(lVar.f65888a);
        }
        if (size() != lVar.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size(); i10++) {
            if (get(i10) != lVar.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public int get(int i10) {
        io.odeeo.internal.q0.a.checkIndex(i10, 0, size());
        return this.f65888a.keyAt(i10);
    }

    public int hashCode() {
        if (g0.f65861a >= 24) {
            return this.f65888a.hashCode();
        }
        int size = size();
        for (int i10 = 0; i10 < size(); i10++) {
            size = (size * 31) + get(i10);
        }
        return size;
    }

    public int size() {
        return this.f65888a.size();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final SparseBooleanArray f65889a = new SparseBooleanArray();

        /* renamed from: b, reason: collision with root package name */
        public boolean f65890b;

        public b add(int i10) {
            io.odeeo.internal.q0.a.checkState(!this.f65890b);
            this.f65889a.append(i10, true);
            return this;
        }

        public b addAll(int... iArr) {
            for (int i10 : iArr) {
                add(i10);
            }
            return this;
        }

        public b addIf(int i10, boolean z10) {
            return z10 ? add(i10) : this;
        }

        public l build() {
            io.odeeo.internal.q0.a.checkState(!this.f65890b);
            this.f65890b = true;
            return new l(this.f65889a);
        }

        public b remove(int i10) {
            io.odeeo.internal.q0.a.checkState(!this.f65890b);
            this.f65889a.delete(i10);
            return this;
        }

        public b removeAll(int... iArr) {
            for (int i10 : iArr) {
                remove(i10);
            }
            return this;
        }

        public b removeIf(int i10, boolean z10) {
            return z10 ? remove(i10) : this;
        }

        public b addAll(l lVar) {
            for (int i10 = 0; i10 < lVar.size(); i10++) {
                add(lVar.get(i10));
            }
            return this;
        }
    }

    public l(SparseBooleanArray sparseBooleanArray) {
        this.f65888a = sparseBooleanArray;
    }
}
