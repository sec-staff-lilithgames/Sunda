package uu;

import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e0 extends g implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ char[] f88714b;

    public e0(char[] cArr) {
        this.f88714b = cArr;
    }

    @Override // uu.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Character) {
            return contains(((Character) obj).charValue());
        }
        return false;
    }

    @Override // uu.g, uu.a
    public int getSize() {
        return this.f88714b.length;
    }

    @Override // uu.g, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Character) {
            return indexOf(((Character) obj).charValue());
        }
        return -1;
    }

    @Override // uu.a, java.util.Collection
    public boolean isEmpty() {
        return this.f88714b.length == 0;
    }

    @Override // uu.g, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Character) {
            return lastIndexOf(((Character) obj).charValue());
        }
        return -1;
    }

    public boolean contains(char c10) {
        return k0.contains(this.f88714b, c10);
    }

    @Override // uu.g, java.util.List
    public Character get(int i10) {
        return Character.valueOf(this.f88714b[i10]);
    }

    public int indexOf(char c10) {
        return k0.indexOf(this.f88714b, c10);
    }

    public int lastIndexOf(char c10) {
        return k0.lastIndexOf(this.f88714b, c10);
    }
}
