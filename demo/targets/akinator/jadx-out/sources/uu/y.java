package uu;

import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y extends g implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ short[] f88797b;

    public y(short[] sArr) {
        this.f88797b = sArr;
    }

    @Override // uu.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Short) {
            return contains(((Number) obj).shortValue());
        }
        return false;
    }

    @Override // uu.g, uu.a
    public int getSize() {
        return this.f88797b.length;
    }

    @Override // uu.g, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Short) {
            return indexOf(((Number) obj).shortValue());
        }
        return -1;
    }

    @Override // uu.a, java.util.Collection
    public boolean isEmpty() {
        return this.f88797b.length == 0;
    }

    @Override // uu.g, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Short) {
            return lastIndexOf(((Number) obj).shortValue());
        }
        return -1;
    }

    public boolean contains(short s10) {
        return k0.contains(this.f88797b, s10);
    }

    @Override // uu.g, java.util.List
    public Short get(int i10) {
        return Short.valueOf(this.f88797b[i10]);
    }

    public int indexOf(short s10) {
        return k0.indexOf(this.f88797b, s10);
    }

    public int lastIndexOf(short s10) {
        return k0.lastIndexOf(this.f88797b, s10);
    }
}
