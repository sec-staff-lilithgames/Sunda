package com.google.android.exoplayer2.util;

import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f28521a = new SparseBooleanArray();

    /* renamed from: b, reason: collision with root package name */
    public boolean f28522b;

    public o add(int i10) {
        a.checkState(!this.f28522b);
        this.f28521a.append(i10, true);
        return this;
    }

    public o addAll(int... iArr) {
        for (int i10 : iArr) {
            add(i10);
        }
        return this;
    }

    public o addIf(int i10, boolean z10) {
        return z10 ? add(i10) : this;
    }

    public p build() {
        a.checkState(!this.f28522b);
        this.f28522b = true;
        return new p(this.f28521a);
    }

    public o remove(int i10) {
        a.checkState(!this.f28522b);
        this.f28521a.delete(i10);
        return this;
    }

    public o removeAll(int... iArr) {
        for (int i10 : iArr) {
            remove(i10);
        }
        return this;
    }

    public o removeIf(int i10, boolean z10) {
        return z10 ? remove(i10) : this;
    }

    public o addAll(p pVar) {
        for (int i10 = 0; i10 < pVar.size(); i10++) {
            add(pVar.get(i10));
        }
        return this;
    }
}
