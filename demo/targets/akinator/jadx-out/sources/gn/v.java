package gn;

import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f58199a;

    public v(SparseBooleanArray sparseBooleanArray) {
        this.f58199a = sparseBooleanArray;
    }

    public boolean contains(int i10) {
        return this.f58199a.get(i10);
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
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (io.bidmachine.media3.common.util.a1.f60679a >= 24) {
            return this.f58199a.equals(vVar.f58199a);
        }
        if (size() != vVar.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size(); i10++) {
            if (get(i10) != vVar.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public int get(int i10) {
        io.bidmachine.media3.common.util.a.checkIndex(i10, 0, size());
        return this.f58199a.keyAt(i10);
    }

    public int hashCode() {
        if (io.bidmachine.media3.common.util.a1.f60679a >= 24) {
            return this.f58199a.hashCode();
        }
        int size = size();
        for (int i10 = 0; i10 < size(); i10++) {
            size = (size * 31) + get(i10);
        }
        return size;
    }

    public int size() {
        return this.f58199a.size();
    }
}
