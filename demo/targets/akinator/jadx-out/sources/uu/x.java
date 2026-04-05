package uu;

import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x extends g implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f88794b;

    public x(byte[] bArr) {
        this.f88794b = bArr;
    }

    @Override // uu.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Byte) {
            return contains(((Number) obj).byteValue());
        }
        return false;
    }

    @Override // uu.g, uu.a
    public int getSize() {
        return this.f88794b.length;
    }

    @Override // uu.g, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Byte) {
            return indexOf(((Number) obj).byteValue());
        }
        return -1;
    }

    @Override // uu.a, java.util.Collection
    public boolean isEmpty() {
        return this.f88794b.length == 0;
    }

    @Override // uu.g, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Byte) {
            return lastIndexOf(((Number) obj).byteValue());
        }
        return -1;
    }

    public boolean contains(byte b10) {
        return k0.contains(this.f88794b, b10);
    }

    @Override // uu.g, java.util.List
    public Byte get(int i10) {
        return Byte.valueOf(this.f88794b[i10]);
    }

    public int indexOf(byte b10) {
        return k0.indexOf(this.f88794b, b10);
    }

    public int lastIndexOf(byte b10) {
        return k0.lastIndexOf(this.f88794b, b10);
    }
}
