package com.google.android.exoplayer2.util;

import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f28539a;

    public p(SparseBooleanArray sparseBooleanArray) {
        this.f28539a = sparseBooleanArray;
    }

    public boolean contains(int i10) {
        return this.f28539a.get(i10);
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
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (n1.f28506a >= 24) {
            return this.f28539a.equals(pVar.f28539a);
        }
        if (size() != pVar.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size(); i10++) {
            if (get(i10) != pVar.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public int get(int i10) {
        a.checkIndex(i10, 0, size());
        return this.f28539a.keyAt(i10);
    }

    public int hashCode() {
        if (n1.f28506a >= 24) {
            return this.f28539a.hashCode();
        }
        int size = size();
        for (int i10 = 0; i10 < size(); i10++) {
            size = (size * 31) + get(i10);
        }
        return size;
    }

    public int size() {
        return this.f28539a.size();
    }
}
