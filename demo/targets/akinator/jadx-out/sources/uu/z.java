package uu;

import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z extends g implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int[] f88802b;

    public z(int[] iArr) {
        this.f88802b = iArr;
    }

    @Override // uu.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Integer) {
            return contains(((Number) obj).intValue());
        }
        return false;
    }

    @Override // uu.g, uu.a
    public int getSize() {
        return this.f88802b.length;
    }

    @Override // uu.g, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Integer) {
            return indexOf(((Number) obj).intValue());
        }
        return -1;
    }

    @Override // uu.a, java.util.Collection
    public boolean isEmpty() {
        return this.f88802b.length == 0;
    }

    @Override // uu.g, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            return lastIndexOf(((Number) obj).intValue());
        }
        return -1;
    }

    public boolean contains(int i10) {
        return k0.contains(this.f88802b, i10);
    }

    @Override // uu.g, java.util.List
    public Integer get(int i10) {
        return Integer.valueOf(this.f88802b[i10]);
    }

    public int indexOf(int i10) {
        return k0.indexOf(this.f88802b, i10);
    }

    public int lastIndexOf(int i10) {
        return k0.lastIndexOf(this.f88802b, i10);
    }
}
